/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilos2Syncro;

/**
 *
 * @author pedro.rinpiz
 */
public class Principal 
{
    public static void main(String[] ar) {
        final int CUENTATOTAL=60000000;
        Contador c=new Contador();
        Thread h1=new Thread(new Hilo("H1", CUENTATOTAL/3,c));
        Thread h2=new Thread(new Hilo("H2", CUENTATOTAL/3,c));
        Thread h3=new Thread(new Hilo("H3", CUENTATOTAL/3,c));
        h1.start();
        h2.start();
        h3.start();
         try {
             h1.join();
             h2.join();
             h3.join();
         } catch(InterruptedException e) {
             System.out.println ("Hilo principal interrumpido");
         }
         System.out.println("Hilo principal terminado"); 
         System.out.println("Cuenta Total:"+c.getCuenta());
    }
}
