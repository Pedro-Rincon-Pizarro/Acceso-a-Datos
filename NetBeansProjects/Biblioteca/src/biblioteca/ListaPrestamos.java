/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class ListaPrestamos 
{

    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Prestamo> arrayPrestamos = new ArrayList<>();
    private static Usuario u1;
    private static String busqueda, ruta;
    private static int cont, cont2, cont3;

    public static void archivoExists() throws IOException 
    {
        System.out.println("Escribe el nombre del archivo");
        ruta = sc.nextLine();
        File fichero = new File(ruta);
        if (fichero.exists())
        {
            String linea;
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);
            cont = 0;
            cont2 = 0;
            while ((linea = br.readLine()) != null) 
            {
                String[] datos = linea.split(";");
                u1 = new Usuario(cont++, datos[1], datos[2], datos[3], datos[4]);

                Libro l = new Libro(cont2++, datos[5], datos[6], datos[7]);
                Prestamo p = new Prestamo(datos[0], datos[8], u1, l);
                arrayPrestamos.add(p);
            }
            editorial(busqueda);
        } else 
        {
            throw new IOException("No se encuentra el fichero " + ruta);
        }
    }

    public static void editorial(String busqueda) 
    {
        System.out.println("que editorial deseas buscar");

        busqueda = sc.nextLine();
        boolean encontrado = false;
        for (Prestamo p : arrayPrestamos) 
        {
            if (busqueda.equals(p.getL().getEditorial())) 
            {
                System.out.println("Busqueda: " + busqueda);
                System.out.println("ID: " + p.getId());
                System.out.println("Nombre: " + p.getU().getNombre());
                System.out.println("Correo: " + p.getU().getCorreo());
                System.out.println("Telefono: " + p.getU().getTlf());
                System.out.println("Ciudad: " + p.getU().getCiudad());
                System.out.println("Titulo: " + p.getL().getTitulo());
                System.out.println("Escritor: " + p.getL().getAutor());
                System.out.println("Editorial: " + p.getL().getEditorial());
                System.out.println("Fecha: " + p.getFecha());
                encontrado = true;
            }
        }
        if (encontrado != true) 
        {
            System.out.println("Busqueda: " + busqueda);
            System.out.println("Esa editorial no existe en la base de datos");
        }

    }
}
