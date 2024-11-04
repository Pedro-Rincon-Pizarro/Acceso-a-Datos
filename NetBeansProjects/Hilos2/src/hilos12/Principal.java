/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilos12;

import hilos2Syncro.Hilo;

/**
 *
 * @author pedro.rinpiz
 */
public class Principal 
{
    public static void main(String[] ar) {
        
        Contador c = new Contador(5);
        Thread h1 = new Thread(new HiloIncremento(c, "Incrementar1"));
        Thread h2 = new Thread(new HiloDecremento(c, "decrementar1"));
        
        h1.start();
        h2.start();
        
         try {
             h1.join();
             h2.join();
         } catch(InterruptedException e) {
             System.out.println ("Hilo principal interrumpido");
         }
         System.out.println("Hilo principal terminado"); 
         System.out.println("Cuenta Total:"+c.getCuenta());
    }
}
