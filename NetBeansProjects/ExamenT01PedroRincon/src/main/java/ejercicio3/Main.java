
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author pedro.rinpiz
 */
public class Main 
{
    private static File file = new File("notasTotales.txt");
    private static boolean progEsc, bdEsc = false;
    private static double total = 0;
    private static int contador = 0;
    private static double media = 0;
    public static void main(String[] args) throws IOException 
    {
        
        leerProg();
        mediaAsignatura("Programacion", "prog.txt");
        leerDb();
        mediaAsignatura("BD", "bd.txt");
    }
    
    public static void leerProg() throws IOException
    {
        String linea;
        FileReader fr = new FileReader("prog.txt");
        BufferedReader bf = new BufferedReader(fr);
        while((linea = bf.readLine()) != null)
        {
            String [] datos = linea.split(" ");
            total += Double.parseDouble(datos[datos.length - 1]);
            contador++;
            cargarDatos(datos, "prog");
            
        }
        bf.close();
    }
    
    public static void leerDb() throws FileNotFoundException, IOException
    {
        String linea;
        
        FileReader fr = new FileReader("bd.txt");
        BufferedReader bf = new BufferedReader(fr);
        while((linea = bf.readLine()) != null)
        {
            String [] datos = linea.split(" ");
            cargarDatos(datos, "bd");
            total += Double.parseDouble(datos[datos.length - 1]);
            contador++;
        }
        
        bf.close();
    }
    
    public static void mediaAsignatura(String asignatura, String fi) throws IOException
    {
        media = total / contador;
        
        FileWriter fw = new FileWriter(fi, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Media de " + asignatura + ": " + media);
        bw.newLine();
        bw.close();
        total = 0;
        contador = 0;
        media = 0;
    }
    
    public static void mediaAlumno()
    {
        
    }
    
    public static void cargarDatos(String[] datos, String archivo) throws IOException
    {
        if(!file.exists())
        {
            file.createNewFile();
        }
        FileWriter fw = new FileWriter(file, true);
        BufferedWriter bw = new BufferedWriter(fw);
        if(archivo.equals("prog") && progEsc == false)
        {
            bw.write("-----------------Notas Programación-----------------");
            bw.newLine();
            progEsc = true;
        }
        else if(archivo.equals("bd") && bdEsc == false)
        {
            bw.write("-----------------Notas BD-----------------");
            bw.newLine();
            bdEsc = true;
        }
        for(String dato : datos)
        {
            bw.write(dato.toString() + " ");
        }
        bw.newLine();
        bw.close();
        
        
    }
}
