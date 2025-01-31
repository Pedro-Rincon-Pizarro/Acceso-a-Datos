/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03casa;

import java.util.List;


/**
 *
 * @author Pedro
 */
public class Coche implements Runnable
{
    private String nombre;
    private List<String> plazas;

    public Coche(String nombre, List<String> plazas) 
    {
        this.nombre = nombre;
        this.plazas = plazas;
    }

    @Override
    public void run() {
        System.out.println("Empieza el hilo " + this.nombre);
        try 
        {
            Thread.sleep(1000);
            synchronized (plazas) 
            {
                if(plazas.size() == 50)
                {
                    System.out.println("No hay plazas en el garaje");
                    plazas.wait();
                }
                plazas.add(nombre);
                System.out.println(nombre + " ha aparcado.");
            }
            Thread.sleep(30000);
            synchronized (plazas) 
            {
                plazas.remove(plazas.size() - 1);
                System.out.println("El coche " + nombre + " sale");
                plazas.notify();
            }
            
        } catch (Exception e) 
        {
            
        }
    }
    
}
