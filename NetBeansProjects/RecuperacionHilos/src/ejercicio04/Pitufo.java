/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio04;

/**
 *
 * @author pedro.rinpiz
 */
public class Pitufo implements Runnable
{
    private String nombre;

    public Pitufo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        System.out.println("El pitufo " + this.nombre + " entra al bosque");
        
        for(int i = 0; i < 100; i++)
        {
            System.out.println("El pitufo " + this.nombre + " lleva " + i + " pasos");
            i++;
            System.out.println("El pitufo " + this.nombre + " da 1 paso");
        }
        
        System.out.println("El pitufo " + this.nombre + " ha sido atrapado por el gato Azrael");
    }
    
    
}
