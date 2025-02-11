/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilos17;

import hilos16.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pedro.rinpiz
 */
public class Principal {
	public static void main(String[] args){
		List<String> productos = new ArrayList<String>();
		Productor p1=new Productor("P1",productos);
		Thread h1 = new Thread(new Consumidor("C1",productos));
		Thread h2 = new Thread(new Consumidor("C2",productos));
		Thread h3 = new Thread(new Consumidor("C3",productos));
		Thread h4 = new Thread(p1);
                Thread h5 = new Thread(p1);
                Thread h6 = new Thread(p1);
		
		h1.start();
		h2.start();
		h3.start();
		h4.start();
                h5.start();
                h6.start();
                        
                try {
                    h1.join();
                    h2.join();
                    h3.join();
                    h4.join();
                    h5.join();
                    h6.join();
                 } catch(InterruptedException e) {
                     System.out.println ("Hilo principal interrumpido");
                 }
		 System.out.println ("Hilo principal finaliza");
        }
}
