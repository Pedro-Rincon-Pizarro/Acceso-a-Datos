/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sucursal;

import LecturaFicheros.VentasSucursal;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author pedro.rinpiz
 */
public class Main 
{
    public static void main(String[] args) throws IOException 
    {
        ListadoVentas vs = new ListadoVentas();
        vs.leerSucursal1();
        
    }
    
    
}
