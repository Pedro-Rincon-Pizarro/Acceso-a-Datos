/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LecturaFicheros;

import java.io.File;

/**
 *
 * @author pedro.rinpiz
 */
public class Ejercicio01 
{
    public static void main(String[] args) 
    {
        File f = new File("./fichero.txt");
        
        if(f.exists())
        {
            System.out.println("El fichero existe");
        }
        else
        {
            System.err.println("El fichero no existe");
        }  
    }
}
