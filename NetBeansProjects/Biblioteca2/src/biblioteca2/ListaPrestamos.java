/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class ListaPrestamos {

    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Prestamo> arrayPrestamos = new ArrayList<>();

    
    public void agregarPrestamo() throws IOException {
        
        
        Prestamo p = new Prestamo(id, idLib, idUsu, fecha);
        arrayPrestamos.add(l1);
        
        
    }

    public void listarPrestamo() 
    {

    }

    public void ListarRetrasados() 
    {

    }
    
    public void sobreescribirFicheroPrestamos() throws IOException
    {
        File fichero = new File("prestamos.txt");

        if (!fichero.exists()) {
            fichero.createNewFile();
            System.out.println("Archivo creado con exito " + fichero.getName());
        }
        FileReader fr = new FileReader(fichero);
        FileWriter fw = new FileWriter(fichero, false);
        BufferedWriter bw = new BufferedWriter(fw);
        for (Prestamo p : arrayPrestamos) {
            bw.write(p.getId()+ ";" + p.getIdLib()+ ";" + p.getIdUsu()+ ";" + p.getFecha()+ "\n");
        }
        bw.close();
    }

}
