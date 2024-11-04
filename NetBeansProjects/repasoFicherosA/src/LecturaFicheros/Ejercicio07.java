/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LecturaFicheros;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author pedro.rinpiz
 */
public class Ejercicio07 
{
    public static void main(String[] args) 
    {
        // Crear un directorio llamado 'FICHEROS'
        File directorio = new File("./FICHEROS");
        
        if (directorio.mkdir()) 
        {
            System.out.println("Directorio 'FICHEROS' creado.");
        }
        else
        {
            System.out.println("El directorio 'FICHEROS' ya existe o no pudo ser creado.");
        }

        // Crear dos ficheros vacíos en el directorio 'FICHEROS'
        File archivo1 = new File(directorio, "archivo1.txt");
        File archivo2 = new File(directorio, "archivo2.txt");

        try 
        {
            if (archivo1.createNewFile()) 
            {
                System.out.println("archivo1.txt creado.");
            } 
            else 
            {
                System.out.println("archivo1.txt ya existe.");
            }
            
            if (archivo2.createNewFile()) 
            {
                System.out.println("archivo2.txt creado.");
            } 
            else 
            {
                System.out.println("archivo2.txt ya existe.");
            }
            
            File archivoRenombrado = new File(directorio, "archivo_renombrado.txt");
            if (archivo1.renameTo(archivoRenombrado)) 
            {
                System.out.println("archivo1.txt renombrado a archivo_renombrado.txt.");
            } 
            else 
            {
                System.out.println("No se pudo renombrar archivo1.txt.");
            }

            // Eliminar archivo2.txt
            if (archivo2.delete()) 
            {
                System.out.println("archivo2.txt eliminado.");
            } 
            else
            {
                System.out.println("No se pudo eliminar archivo2.txt.");
            }
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }

       
       
    }
}
