/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hilos16;

import java.util.List;

public class Productor implements Runnable
{

    private String nombre;
    private List<String> productos;

    public Productor(String nombre, List<String> productos)
    {
        this.nombre = nombre;
        this.productos = productos;
    }

    public void run() 
    {
        try
        {
            Thread.sleep(4000);
            synchronized (productos) 
            {
                if(productos.size() >= 2)
                {
                    System.out.println("La lista de productos está llena");
                    productos.wait();
                }
                productos.add("producto");
                //Se notifica a todos los hilos suspendidos
                productos.notify();
                System.out.println("Agregado un producto a la lista");
            }

        }
        catch (Exception ex) 
        {
            
        }
    }

}
