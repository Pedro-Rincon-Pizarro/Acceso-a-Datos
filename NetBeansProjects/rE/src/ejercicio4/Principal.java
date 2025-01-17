/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author pedro.rinpiz
 */
public class Principal {
    
    public static void main(String[] args){
        System.out.println("Comienza el programa principal.");
        Thread hilo1 = new Thread(new Hilo(1, 1000, "Hilo 1"));
        Thread hilo2 = new Thread(new Hilo(1001, 2000, "Hilo 2"));
        
        hilo1.start();
        hilo2.start();
        
        try {
            hilo1.join();
            hilo2.join();
        } catch (InterruptedException e) {
            System.out.println("Hilo principal interrumpido");
        }
        System.out.println("Hilo principal terminado");
        System.out.println("Termina el programa principal.");
    }
}

