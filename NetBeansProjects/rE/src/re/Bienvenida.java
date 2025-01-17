/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package re;

/**
 *
 * @author pedro.rinpiz
 */
public class Bienvenida 
{
    boolean claseIniciada;

    public Bienvenida() {
        this.claseIniciada = false;
    }
    
    
    synchronized void saludaElAlumno(String nombre)
    {
        
        try {
           if(!claseIniciada)
        {
             System.out.println("El alumno " + nombre + " saluda");
            wait();
        }
           else
           {
               System.out.println("El alumno " + nombre + " llama a la puerta");
           }
        } catch (Exception e) {
        }
    }
    
    synchronized void saludaElProfesor(String nombre)
    {
        claseIniciada = true;
        System.out.println("El profesor saluda");
        notifyAll();
        
        System.out.println("La clase comienza");
    }
}
