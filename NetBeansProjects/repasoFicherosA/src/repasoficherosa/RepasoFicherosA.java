/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repasoficherosa;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author pedro.rinpiz
 */
public class RepasoFicherosA 
{

    /**
     * @param archivo
     * @throws java.io.FileNotFoundException
     * @throws java.io.IOException
     */
   
    public static void holaMundo(String archivo) throws FileNotFoundException, IOException
    {
        String cadena;
        FileReader f = new FileReader(archivo);
        try (BufferedReader b = new BufferedReader(f)) 
        {
            while ((cadena = b.readLine()) != null)
            {
                System.out.println(cadena);
            }
            b.close();
        }
    }
    
     public static void main(String[] args) throws IOException 
    {
        holaMundo("C:\\Users\\pedro.rinpiz\\Desktop\\textos2.txt");
    }
     
     
     
    // String cadena;
      //  FileReader f = new FileReader(archivo);
        //BufferedReader b = new BufferedReader(f);
        //while ((cadena = b.readLine()) != null)
        //{
          //  System.out.println(cadena);
        //}
        //b.close();
     
    
}
