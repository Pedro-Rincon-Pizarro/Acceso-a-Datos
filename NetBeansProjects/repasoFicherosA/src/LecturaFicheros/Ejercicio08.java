/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LecturaFicheros;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author pedro.rinpiz
 */
public class Ejercicio08 
{
    public static void main(String[] args) 
    {
       
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Introduce el nombre del directorio: ");
        String nombreDirectorio = sc.next();
        
        File directorio = new File(nombreDirectorio);

        if (directorio.exists() && directorio.isDirectory()) 
        {
            System.out.println("Contenido del directorio: " + nombreDirectorio);
            
           
            String[] ficheros = directorio.list();
            
            if (ficheros != null && ficheros.length > 0) 
            {
                for (String fichero : ficheros) 
                {
                    System.out.println(fichero);
                }
            } 
            else 
            {
                System.out.println("El directorio está vacío.");
            }
        }
        else
        {
            System.out.println("El directorio especificado no existe o no es un directorio.");
        }
        sc.close();
    }
}
