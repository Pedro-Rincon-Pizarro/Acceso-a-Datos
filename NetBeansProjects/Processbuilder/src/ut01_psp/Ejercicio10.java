/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut01_psp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author pedro.rinpiz
 */
public class Ejercicio10 
{
     ProcessBuilder pb = new ProcessBuilder();
    InputStream is;
    InputStreamReader isr;
    BufferedReader br;
    Process proceso;
    int exitCode = 0;

    public void execute() throws InterruptedException, IOException {
        try {

            //PROCESSBUILDER
            String cad1 = "C:\\Users\\pedro.rinpiz\\AppData\\Local\\Programs\\Python\\Python312\\python.exe";
            String cad2 = "C:\\Users\\pedro.rinpiz\\OneDrive - Educacyl\\2º\\pc 2º\\Documentos\\Visual\\PY01ACT001PedroRincon\\ejercicio01.py";

            pb.command(cad1, cad2);
            proceso = pb.start();
            exitCode = proceso.waitFor();

            if (exitCode == 0) {
                System.out.println("El programa se lanzo con Ã©xito");
            } else {
                System.out.println("Error al lanzar el programa");
            }
            is = proceso.getInputStream();
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            String linea;

            do {
                linea = br.readLine();
                if (linea != null) {
                    System.out.println(linea);
                }

            } while (linea != null);

            br.close();
            isr.close();
            is.close();

        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());
        }

        System.out.println("--------FIN--------");
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        Ejercicio10 ej10 = new Ejercicio10();
        ej10.execute();
    }

}
