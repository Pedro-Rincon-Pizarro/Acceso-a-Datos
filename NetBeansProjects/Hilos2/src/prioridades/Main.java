/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prioridades;

import java.util.ArrayList;

/**
 *
 * @author pedro.rinpiz
 */
public class Main {
    public static void main(String[] args) throws InterruptedException
    {
        try 
        {    
            int duracionSegundos=1;
            ArrayList<Integer> prioridades=new ArrayList<Integer>();
            ArrayList<HiloConPrioridad> hilos=new ArrayList<HiloConPrioridad>();
            
            for(int i=Thread.MIN_PRIORITY;i<=(Thread.MAX_PRIORITY);i++)
            {
                prioridades.add(i);
            }
            
            for(int prior : prioridades)
            {
                HiloConPrioridad hilo=new HiloConPrioridad(("h"+prior), 0);
                hilo.setPriority(prior);
                hilos.add(hilo);
            }
            
            for(Thread h : hilos)
            {
                h.start();
            }
            
            System.out.println("Se dejan correr los hilos durante " + duracionSegundos +" segundos");
            Thread.sleep(1000*duracionSegundos);
            
            for(HiloConPrioridad hilo: hilos)
            {
                hilo.interrupt();
                System.out.println("Hilo Nombre "+hilo.getNombre()+" Prioridad:"+hilo.getPriority());
            }
        }
        catch (InterruptedException ex)
        {
            System.out.println("Hilo principal interumpido");
        }
    }
}
