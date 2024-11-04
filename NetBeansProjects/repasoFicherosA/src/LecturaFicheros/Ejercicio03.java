/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LecturaFicheros;

import java.io.File;
import java.util.List;

/**
 *
 * @author pedro.rinpiz
 */
public class Ejercicio03 
{
    public static void main(String[] args) 
    {
        
        metodo1();
        System.out.println("");
        metodo2();
        
        
    }
    
    public static void metodo1()
    {
        File directorioActual = new File(".");

        // Obtén la lista de archivos en el directorio actual
        File[] listaDeArchivos = directorioActual.listFiles();

        if (listaDeArchivos != null && listaDeArchivos.length > 0) 
        {
            System.out.println("Archivos en el directorio actual:");
            for (File archivo : listaDeArchivos) {
                if(archivo.isFile())
                {
                    System.out.println(archivo.getName());
                }
            }
        } 
        else 
        {
            System.out.println("No hay archivos en el directorio actual.");
        }
    }
    
    public static void metodo2()
    {
        File directorioActual = new File(".");

        // Obtén la lista de archivos en el directorio actual
        String[] lista = directorioActual.list();
        
        for(String fichero : lista)
        {
            System.out.println(fichero);
        }
    }
    
    
}
