/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author pedro.rinpiz
 */
public class Principal {
    
    public static void main(String[] args){
        try{
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        System.out.println("********************");
        System.out.println("1. Comando nslookup");
        System.out.println("2. Programa python");
        System.out.println("********************");
        // Pedir opción por pantalla.
        System.out.println("Inserte una opción:");
        opcion = sc.nextInt();
        
        switch(opcion){
                case 1:
                    // Con Runtime.
                    Runtime r = Runtime.getRuntime();
                    Process proceso1;
                    proceso1 = r.exec("cmd /c nslookup www.google.es");
                    
                    int resultado = proceso1.waitFor();
            
                    InputStream is = proceso1.getInputStream();;
                    InputStreamReader isr = new InputStreamReader(is);;
                    BufferedReader br = new BufferedReader(isr);

                    String linea = br.readLine();
                    while(linea != null){
                        System.out.println(linea);
                        linea = br.readLine();
                    }

                    br.close();
                    isr.close();
                    is.close();
                    break;
                case 2:
                    // Con ProcessBuilder.
                    ProcessBuilder pb = new ProcessBuilder();
                    Process proceso2;
                    
                    // Las rutas varian dependiendo del ordenador. En clase lo hicimos con rutas absolutas también.
                    String cad1 = "C:\\Users\\pedro.rinpiz\\AppData\\Local\\Programs\\Python\\Python312\\python.exe";
                    String cad2 = "C:\\Users\\pedro.rinpiz\\OneDrive - Educacyl\\2º\\pc 2º\\Documentos\\NetBeansProjects\\rE\\src\\ejercicio3\\tablamultiplicar.py";
                    pb.command(cad1, cad2);
                    proceso2 = pb.start();

                    InputStream is2 = proceso2.getInputStream();
                    InputStreamReader isr2 = new InputStreamReader(is2);
                    BufferedReader br2 = new BufferedReader(isr2);

                    do{
                        linea = br2.readLine();
                        if(linea != null) System.out.println(linea);
                    }while(linea != null);


                    br2.close();
                    isr2.close();
                    is2.close();
                    break;
                default:
                    System.out.println("Opción no válida.");
        }
        }catch (IOException | InterruptedException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
                    
    }
}

