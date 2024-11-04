/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LecturaFicheros;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author pedro.rinpiz
 */
public class Ejercicio14 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el nombre del archivo a crear");
        String nombreArchivo = sc.next();
    
    
        File file = new File(nombreArchivo);
        try 
        {
            if(file.createNewFile())
            {
                System.out.println("Archivo creado con exito " + file.getName());
            }
            else
            {
                System.out.println("El archivo ya existe");
            }
            
            FileWriter fw = new FileWriter(file, true);
            String temp = "";
            
            do
            {
                System.out.println("Introduce una cadena de texto");
                temp = sc.nextLine();
                if(!temp.equals("*"))
                {
                    fw.write(temp);
                }
                else
                {
                    System.out.println("Saliendo del modo escritura");
                }
            }while(!temp.equals("*"));
            fw.close();
            FileReader fr = new FileReader(file);
            
            int i = 1;
            int txt2;
            
            while((txt2 = fr.read()) != -1)
            {
                char caracter = (char)txt2;
                System.out.print(caracter);
                i++;
                if(i ==20)
                {
                    System.out.println("\n");
                    i= 0;
                }
            }
        }
        catch(Exception e)
        {
            System.err.println("Error");
        }
    }
}
