/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LecturaFicheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author pedro.rinpiz
 */
public class Ejercicio09 
{
     public static void main(String[] args) throws FileNotFoundException
     {
        File archivo = new File("quijote.txt");
        FileReader lector = new FileReader(archivo);
        try (BufferedReader bf = new BufferedReader(lector)) 
        {
            int caracter;
            while ((caracter = lector.read()) != -1) 
            {
                System.out.println((char) caracter);
            }
        } 
        catch(FileNotFoundException fne)
        {
            System.out.println("Error al leer el fichero: " + fne.getMessage());
        }
        catch (IOException ioe) 
        {
            System.out.println("Error al leer el buffer: " + ioe.getMessage());
        }
    }
}

