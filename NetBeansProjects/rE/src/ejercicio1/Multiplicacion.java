/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author Pedro
 */
public class Multiplicacion implements Runnable
{
    private String nombre;
    private int numero;

    public Multiplicacion(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
    }
    
    
    @Override
    public void run() 
    {
        try 
        {
            for(int i = 0; i <= 1000; i++)
            {
                System.out.println(nombre + ": " + numero + "*" + i);
            }
            System.out.println("---");
        } catch (Exception e) {
        }
    }
    
}
