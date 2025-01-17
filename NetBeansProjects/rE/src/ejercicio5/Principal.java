/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

import java.util.ArrayList;

/**
 *
 * @author pedro.rinpiz
 */
public class Principal {
    
    public static void main(String[] args) throws InterruptedException{
        
        ArrayList<Thread> hilosPersona = new ArrayList<>();
        ControlSalaExposiciones sala = new ControlSalaExposiciones(20);
        
        int i;
        for(i = 0; i < 60; i++){
            if(i % 5 != 0){
                Thread hilo = new Thread(new Persona("Persona " + (i+1), sala));
                hilo.setPriority(Thread.MIN_PRIORITY);
                hilosPersona.add(hilo);
            }
            else{
                Thread hilo = new Thread(new Persona("Persona " + (i+1) + " (JUBILADO)", sala));
                hilo.setPriority(Thread.MAX_PRIORITY);
                hilosPersona.add(hilo);
            }
        }
        
        for(i = 0; i < 60; i++){
            Thread hilo = hilosPersona.get(i);
            hilo.start();
            Thread.sleep(300);
        }
        
        for(i = 0; i < 60; i++){
            hilosPersona.get(i).join();
        }
        
        System.out.println("Hilo principal ha terminado.");
    }
}
