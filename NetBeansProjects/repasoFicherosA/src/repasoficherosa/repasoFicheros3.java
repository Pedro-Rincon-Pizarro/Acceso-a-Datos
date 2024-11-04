/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasoficherosa;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author pedro.rinpiz
 */
public class repasoFicheros3 {

    public static void demoFile(String ruta) throws IOException {
        File fichero = new File(ruta);
        if (fichero.exists()) {
            String cadena;
            double suma = 0;
            double media = 0;
            int lineas = 0;
            FileReader f = new FileReader(fichero);
            try (BufferedReader b = new BufferedReader(f)) {
                while ((cadena = b.readLine()) != null) {
                    System.out.println(cadena);

                    suma += Integer.parseInt(cadena);
                    media += Integer.parseInt(cadena);
                    lineas++;
                }

                System.out.println("LA SUMA DE LOS NUMEROS ES " + suma);
                System.out.println("La media de los numeros es " + (media / lineas));
                b.close();
            }
        } else {
            throw new IOException("No se encuentra el fichero " + ruta);
        }
    }

    public static void main(String[] args) throws IOException {
        String ficheroBuscado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el nombre del fichero que deseas leer");
        ficheroBuscado = sc.next();

        demoFile(ficheroBuscado);
    }
}
