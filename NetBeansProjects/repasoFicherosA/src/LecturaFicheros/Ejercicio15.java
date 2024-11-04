/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LecturaFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author pedro.rinpiz
 */
public class Ejercicio15
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
            BufferedWriter bw = new BufferedWriter(fw);
            String temp = "";
            
            do
            {
                System.out.println("Introduce una cadena de texto");
                temp = sc.nextLine();
                if(!temp.equals("*"))
                {
                    bw.write(temp);
                    bw.newLine();
                }
                else
                {
                    System.out.println("Saliendo del modo escritura");
                }
            }while(!temp.equals("*"));
            bw.close();
           
            
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String txt;
            
            System.out.println("Quieres leer el fichero?");
            System.out.println("s para Si");
            System.out.println("n para No");
            String lectura = sc.next().toLowerCase();
            if(lectura.equals("s"))
            { 
                while((txt = br.readLine()) != null)
                {
                    System.out.println(txt);
                }
            }
            else if(lectura.equals("n"))
            {
                System.out.println("Saliendo del programa sin lectura del fichero");
            }
            
        
           
        } catch (Exception e) 
        {
            System.out.println("Error");
        }
    }

}
