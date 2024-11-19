/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author pedro.rinpiz
 */
public class Main 
{
    private static ArrayList<Articulo> arrayArticulos = new ArrayList<>();
    
    public static void main(String[] args) {
        
        
        arrayArticulos.add(new Articulo("Patatas", 50, "perfecta para freir", "Tubèrculos"));
        arrayArticulos.add(new Articulo("Manzanas", 40, "De color rojo", "Fruta"));
        arrayArticulos.add(new Articulo("Peras", 60, "Muy dulces", "Fruta"));
        arrayArticulos.add(new Articulo("Platanos", 70, "De Canarias", "Fruta"));
        arrayArticulos.add(new Articulo("Mandarinas", 90, "gran sabor", "Fruta"));
        cargarFichero();
        leerFichero();
    }
    
    public static void cargarFichero()
    {
        
        try {
            File archivo = new File("c:/Examen/stock.ser");
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(archivo));
            
                
            
            
        } catch (Exception e) {
        }
    }
    
    public static void leerFichero()
    {
        
    }
    
}
