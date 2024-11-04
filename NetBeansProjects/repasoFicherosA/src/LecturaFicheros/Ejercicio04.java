/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LecturaFicheros;

import java.io.File;
import java.util.Date;

/**
 *
 * @author pedro.rinpiz
 */
public class Ejercicio04 
{
    public static void main(String[] args) 
    {
        File f = new File("fichero.txt");
        
        Date fecha = new Date(f.lastModified());
        System.out.println(fecha);
    }
}
