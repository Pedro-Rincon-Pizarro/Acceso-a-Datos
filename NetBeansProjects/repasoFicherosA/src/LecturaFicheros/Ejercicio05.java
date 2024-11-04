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
public class Ejercicio05 
{
    public static void main(String[] args) 
    {
        File f = new File("libros.txt");
    
        if(f.exists())
        {
        System.out.println("Nombre del fichero: " + f.getName());
        System.out.println("Ruta del fichero: " + f.getPath());
        System.out.println("Ruta absoluta: " + f.getAbsolutePath());
        System.out.println("Nombre del directorio padre: " + f.getParent());
        System.out.println("¿Se puede escribir?: " + f.canWrite());
        System.out.println("¿Se puede leer?: " + f.canRead());
        System.out.println("Tamaño: " + f.length() + "bytes");
        System.out.println("Tamaño: " + f.length()/1024 + "KB");
        System.out.println("¿Es un directorio?: " + f.isDirectory());
        System.out.println("¿Es un ficero?: " + f.isFile());
        }
        
                
    }
    
    
    
    
}
