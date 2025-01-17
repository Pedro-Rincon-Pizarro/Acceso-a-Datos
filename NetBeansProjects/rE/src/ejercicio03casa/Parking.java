/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03casa;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pedro
 */
public class Parking
{
   
    static List<String> coches = new ArrayList<>();
    
    public static void main(String[] args) 
    {
        List<Thread> hilos = new ArrayList<>();
        Thread h1 = null;
        for(int i = 1; i < 126; i++)
        {
            if(i % 5 != 0)
            {
                h1 = new Thread(new Coche("C" + i, coches));
                hilos.add(h1);
                coches.add(h1.getName());
            }
            else
            {
                h1 = new Thread(new Monovolumen("M" + i, coches));
                hilos.add(h1);
                coches.add(h1.getName());

            }
            h1.start();
            
            try {
                
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        
        try
        {
            for(Thread hilo : hilos)
            {
                hilo.join();
            }
        } catch (Exception e) {
        }
    }
    
}