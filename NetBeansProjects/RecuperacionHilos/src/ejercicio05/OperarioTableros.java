/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio05;

/**
 *
 * @author pedro.rinpiz
 */
public class OperarioTableros extends Thread
{
    private String nombre;
    private ControlProduccion controlProduccion;

    public OperarioTableros(String nombre, ControlProduccion controlProduccion) {
        this.nombre = nombre;
        this.controlProduccion = controlProduccion;
    }

    @Override
    public void run() 
    {
        System.out.println("El operario " + this.nombre + " entra al taller de tableros");
        for(int i = 0; i < 100; i++)
        {
            
            controlProduccion.hacerTablero(nombre);
        }
        
    }
    
    
}
