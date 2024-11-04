/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package milHilos;

import java.util.ArrayList;

/**
 *
 * @author pedro.rinpiz
 */
public class Principal 
{
    public static void main(String[] ar) 
    {
        final int CUENTATOTAL = 1000000;

        ArrayList<Thread> arrayHilos = new ArrayList<>();
        Contador c = new Contador();
        for (int i = 0; i < 1000; i++) 
        {
            arrayHilos.add(new Thread(new Hilo("hilo", i, c)));
        }
        for (Thread h : arrayHilos) 
        {
            h.start();
        }
        for (Thread h : arrayHilos) 
        {
            try 
            {
                h.join();
            } catch (Exception e) 
            {
                System.out.println("Hilo principal interrumpido");
            }

        }

        System.out.println("Hilo principal terminado");
        System.out.println("Cuenta Total:" + c.getCuenta());
    }
}
