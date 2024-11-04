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
public class Ejercicio06 
{
    public static void main(String[] args) 
    {
        
        File directorioUT1 = new File("./UT1");
        
        
        if (!directorioUT1.exists()) 
        {
            if (directorioUT1.mkdir()) 
            {
                System.out.println("Directorio 'UT1' creado exitosamente.");
                
                
                File subdirectorioEjercicios = new File(directorioUT1, "Ejercicios");
                if (!subdirectorioEjercicios.exists()) 
                {
                    if (subdirectorioEjercicios.mkdir()) 
                    {
                        System.out.println("Subdirectorio 'Ejercicios' creado dentro de 'UT1'.");
                    } 
                    else 
                    {
                        System.out.println("No se pudo crear el subdirectorio 'Ejercicios'.");
                    }
                }
            } 
            else 
            {
                System.out.println("No se pudo crear el directorio 'UT1'.");
            }
        } 
        else 
        {
            System.out.println("El directorio 'UT1' ya existe.");
        }
    }
}

