/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author pedro.rinpiz
 */
public class ListaLibros 
{

    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Libro> arrayLibros = new ArrayList<>();
    private static int idMax;
    private static String titulo, autor, editorial;

    

    

    public void agregarLibros() 
    {
        System.out.println("Introduce el titulo del libro");
        titulo = sc.nextLine().trim();
        System.out.println("Introduce el autor del libro");
        autor = sc.nextLine().trim();
        System.out.println("Introduce la editorial del libro");
        editorial = sc.nextLine().trim();

        Libro l1 = new Libro(idMax++, titulo, autor, editorial);

        arrayLibros.add(l1);

    }

    public void listarLibrosPorID() 
    {
        for (Libro l : arrayLibros) 
        {
            System.out.println("ID: " + l.getIdLibro() + "\n" + "Titulo: " + l.getTitulo() + "\n" + "Autor: " + l.getAutor()
                    + "\n" + "Editorial: " + l.getEditorial() + "\n");
        }
    }
    
    public void listarLibrosPorTitulo()
    {
        arrayLibros.sort(Comparator.comparing(Libro::getTitulo));
        for (Libro l : arrayLibros) 
        {
            System.out.println("Titulo: " + l.getTitulo() + "ID: " + l.getIdLibro() + "\n" + "Autor: " + l.getAutor()
                    + "\n" + "Editorial: " + l.getEditorial() + "\n");
        }
        
        arrayLibros.sort(Comparator.comparing(Libro::getIdLibro));
        
    }
    
    

    public void consultarLibroPorTitulo() throws IOException 
    {
        System.out.println("Introduce el nombre del libro");
        String nombre = sc.nextLine().trim();
        boolean encontrado = false;
        leerFicheroLibros();
        for (Libro l : arrayLibros) 
        {
            if (l.getTitulo().equalsIgnoreCase(nombre)) 
            {
                System.out.println("Libro encontrado");
                System.out.println("ID: " + l.getIdLibro() + "\n" + "Titulo: " + l.getTitulo() + "\n" + "Autor: " + l.getAutor()
                        + "\n" + "Editorial: " + l.getEditorial() + "\n");
                encontrado = true;
                break;

            }
        }
        if (encontrado == false) 
        {
            System.out.println("Libro " + nombre + " no encontrado");
        }

    }

    

    public void abrirLibrosTxt() 
    {
        try 
        {
            // Ruta relativa del archivo desde el directorio base del proyecto
            String filePath = "libros.txt";  // Cambia esto a la ruta relativa de tu archivo

            // Crear un objeto File usando la ruta relativa
            File file = new File(filePath);

            // Verificar si el archivo existe
            if (file.exists()) 
            {
                // Ejecutar comando para abrir el archivo usando Runtime y obtener el proceso
                Process process = Runtime.getRuntime().exec("notepad " + file.getCanonicalPath());

                // Imprimir salida del proceso (si es necesario)
                InputStream inputStream = process.getInputStream();
                int byteData;
                while ((byteData = inputStream.read()) != -1) 
                {
                    System.out.print((char) byteData); // Mostrar la salida del proceso (si hay alguna)
                }

                // Esperar a que el proceso termine
                int exitCode = process.waitFor();
                
            } else 
            {
                System.out.println("El archivo no existe en la ruta especificada.");
            }
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    
    public void mezclarVariosFicherosLibros(String ruta, String ruta2, String ruta3) throws FileNotFoundException, IOException 
    {

        File fichero = new File(ruta);
        if (fichero.exists())
        {
            String linea;
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            while ((linea = br.readLine()) != null)
            {
                String[] datos = linea.split(";");
                Libro l1 = new Libro(Integer.parseInt(datos[0].trim()), datos[1].trim(), datos[2].trim(), datos[3].trim());
                idMax = Integer.parseInt(datos[0].trim()) + 1;
                arrayLibros.add(l1);

            }
            fichero = new File(ruta2);
            if (fichero.exists())
            {

                fr = new FileReader(fichero);
                br = new BufferedReader(fr);

                while ((linea = br.readLine()) != null)
                {
                    String[] datos = linea.split(";");
                    Libro l1 = new Libro(Integer.parseInt(datos[0].trim()), datos[1].trim(), datos[2].trim(), datos[3].trim());
                    idMax = Integer.parseInt(datos[0].trim()) + 1;
                    arrayLibros.add(l1);

                }
                fichero = new File(ruta3);

                if (!fichero.exists()) 
                {
                    fichero.createNewFile();
                    System.out.println("Archivo creado con exito " + fichero.getName());
                }
                fr = new FileReader(fichero);
                FileWriter fw = new FileWriter(fichero, false);
                BufferedWriter bw = new BufferedWriter(fw);
                for (Libro l : arrayLibros) 
                {
                    bw.write(l.getIdLibro() + ";" + l.getTitulo() + ";" + l.getAutor() + ";" + l.getEditorial() + "\n");
                }
                bw.close();
            } 
            else 
            {
                throw new IOException("No se encuentra el fichero " + ruta);
            }

        } 
        else 
        {
            throw new IOException("No se encuentra el fichero " + ruta);
        }
    }
    
    public void leerFicheroLibros() throws FileNotFoundException, IOException 
    {
        String ruta = "libros.txt";
        File fichero = new File(ruta);
        if (fichero.exists()) 
        {
            String linea;
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            while ((linea = br.readLine()) != null) 
            {
                String[] datos = linea.split(";");
                Libro l1 = new Libro(Integer.parseInt(datos[0].trim()), datos[1].trim(), datos[2].trim(), datos[3].trim());
                idMax = Integer.parseInt(datos[0].trim()) + 1;
                arrayLibros.add(l1);

            }

        }
        else 
        {
            throw new IOException("No se encuentra el fichero " + ruta);
        }
    }
    
    public void sobreEscribirLibros() throws IOException 
    {
        String ruta = "libros.txt";
        File fichero = new File(ruta);
        String linea;
        FileReader fr = new FileReader(fichero);
        FileWriter fw = new FileWriter(fichero, false);
        BufferedWriter bw = new BufferedWriter(fw);

        for (Libro l : arrayLibros) 
        {
            bw.write(l.getIdLibro() + ";" + l.getTitulo() + ";" + l.getAutor()
                    + ";" + l.getEditorial() + "\n");

        }
        bw.close();

    }

}