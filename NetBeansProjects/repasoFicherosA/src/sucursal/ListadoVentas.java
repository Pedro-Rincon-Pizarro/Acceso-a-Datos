/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sucursal;

import BibliotecaFinal.Cliente;
import BibliotecaFinal.Libro;
import BibliotecaFinal.Prestamo;
import BibliotecaFinal.Usuario;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author pedro.rinpiz
 */
public class ListadoVentas
{
    private static String linea;

    ArrayList<Ventas> lista = new ArrayList<>();
    ArrayList<Ventas> lista2 = new ArrayList<>();
    ArrayList<Ventas> listaFinal = new ArrayList<>();
    
    Map<String, Double> listaEmpresas = new HashMap<>();
    double i = 0;
    int count = 0;
    int count2 = 0;
    int numVentasSuc1 = 0;
    int numVentasSuc2 = 0;
    String[] datos;

    private static File file;

    public void leerSucursal1() throws FileNotFoundException, IOException 
    {
        file = new File("sucursal1.txt");

        BufferedReader br = cargarBuffered(file);
        cargarFichero(br, lista);
        
        numVentasSuc1 = numVentasSuc2;
        
        for(Ventas v : lista)
        {
            listaFinal.add(v);
        }
        
        ficherosIndiv(file.getName(), lista);
        promedioVentasEmpresa(lista);
        escribirFichero();

        file = new File("sucursal2.txt");
        br = cargarBuffered(file);
        cargarFichero(br, lista2);
        for(Ventas v : lista2)
        {
            listaFinal.add(v);
        }
        ficherosIndiv(file.getName(), lista2);
        promedioVentasEmpresa(lista2);
        escribirFichero();
        
        promedioVentasEmpresa(listaFinal);
        escribirFichero();
        
    }

    private BufferedReader cargarBuffered(File file) throws FileNotFoundException 
    {
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        return br;
    }

    private void cargarFichero(BufferedReader br, ArrayList<Ventas> temp) throws IOException 
    {
        numVentasSuc2 = 0;

        System.out.println(file.getName().substring(0, 9));
        while ((linea = br.readLine()) != null) 
        {
            datos = linea.split(";");
            Comprador comprador = new Comprador(datos[0]);
            Sucursal sucursal = new Sucursal(file.getName());
            Ventas ventas = new Ventas(comprador, datos[1], Double.parseDouble(datos[2]));
            numVentasSuc2 += Double.parseDouble(datos[2]);
            temp.add(ventas);
            count2++;
        }
        
        numVentasSuc2 = numVentasSuc2 / count2;
        
        count2 = 0;

    }

    public void promedioVentasEmpresa(ArrayList<Ventas> temp2) throws IOException 
    {

        for (Ventas venta : temp2) 
        {
            if (!listaEmpresas.containsKey(venta.getComprador().toString())) 
            {
                listaEmpresas.put(venta.getComprador().toString(), 0.0);
            }
        }

        for (String key : listaEmpresas.keySet()) 
        {
            for (Ventas venta2 : temp2) 
            {
                if (key.equals(venta2.getComprador().toString()))
                {
                    i += venta2.getPrecioVenta();
                    count++;
                }
            }
            listaEmpresas.replace(key, (i / count));
            i = 0;
            count = 0;
        }
         
    }

    public void escribirFichero() throws IOException 
    {
        String nombreArchivo = "ventasTotales.txt";
        file = new File(nombreArchivo);
        try {
            if (!file.exists()) 
            {
                file.createNewFile();
                System.out.println("Archivo creado con exito " + file.getName());
            } 

            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            String temp = "";
            
            bw.write("Ventas totales\n");

            for (Map.Entry<String, Double> venta : listaEmpresas.entrySet()) 
            {
                bw.write(venta.toString() + "\n");
            }
            bw.write(String.valueOf("Promedio de ventas de Sucursal 1: " + numVentasSuc1 + "\n"));
            bw.write(String.valueOf("Promedio de ventas de Sucursal 2: " + numVentasSuc2 + "\n"));
            bw.close();
        } catch (IOException e) {
            System.out.println("Error");
        }

    }
    
    public void ficherosIndiv(String nombArchIndiv, ArrayList<Ventas> listaCambiante)
            
    {
        
        String nombreArchivo = "ventasTotales.txt";
        file = new File(nombreArchivo);
        try 
        {
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);
            String temp = "";
            bw.write("------" + nombArchIndiv.substring(0, 9) + "------" + "\n");
            if (!file.exists()) 
            {
                file.createNewFile();
                System.out.println("Archivo creado con exito " + file.getName());
            }
            
            
            for (Ventas ven : listaCambiante)
            {
                
                bw.write(ven.getComprador() + " " + ven.getFecha() + " " + ven.getPrecioVenta() + "\n");
            }
            
            
            bw.close();
            
        } catch (Exception e) 
        {
        }
 
            
            
    }

}
