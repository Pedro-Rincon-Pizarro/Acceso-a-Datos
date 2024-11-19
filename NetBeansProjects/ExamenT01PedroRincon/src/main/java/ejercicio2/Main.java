/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author pedro.rinpiz
 */
public class Main 
{
    public static void main(String[] args) {
        
    }
    
    public static void mostrarDatos() throws IOException
    {
       File file = new File("prog.txt");
       if(!file.exists())
       {
           file.createNewFile();
       }
       
        System.out.println("Nombre del archivo: " +file.getName());
        System.out.println("Ruta: " + file.getAbsolutePath());
        System.out.println("Se puede leer: " + file.canRead());
        System.out.println("Se puede escribir: " + file.canWrite());
        System.out.println("Tamaño: " + file.length());
        System.out.println("Ultima modificacion: " + file.lastModified());
       
    }
}
