/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasoficherosa;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author pedro.rinpiz
 */
public class repasoFicheros2 
{
    public static void demoFile(String ruta) throws IOException
    {
        File fichero = new File(ruta);
        if(fichero.exists())
        {
            System.out.println("Nombre del Archivo: " + fichero.getName());
            System.out.println("Ruta: " + fichero.getPath());
            System.out.println("Ruta absoluta: " + fichero.getAbsolutePath());
            System.out.println("Se Puede escribir: " + fichero.canWrite());
            System.out.println("Se puede leer: " + fichero.canRead());
            System.out.println("Peso en bits: " + fichero.getTotalSpace());
            System.out.println("Tamaño: " + fichero.length());
        }
        else
        {
            throw new IOException("No se encuentra el fichero " + ruta);
        }
    }
    public static void main(String[] args) throws Exception 
    {
        demoFile("C:\\Users\\pedro.rinpiz\\Desktop\\textos2.txt");
    }
}



