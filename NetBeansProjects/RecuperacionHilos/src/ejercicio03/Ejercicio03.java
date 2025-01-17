/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio03;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author pedro.rinpiz
 */
public class Ejercicio03
{
    static Scanner sc = new Scanner(System.in);
    static int eleccion = -1;
    public static void main(String[] args) {
        
        do 
        {            
            menu();
            
            switch (eleccion) {
                case 1:
                    try {
                    Runtime r = Runtime.getRuntime();
                    Process proceso1;
                    proceso1 = r.exec("cmd /c tasklist");
                    System.out.println("Esperando a que termine la ejecución de DIR ...");
                    int resultado = proceso1.waitFor();
                    InputStream is;
            InputStreamReader isr;
            BufferedReader br;
            
            if(resultado == 0){
                System.out.println("DIR se lanzó con éxito");
                is = proceso1.getInputStream();
                isr = new InputStreamReader(is);
                br = new BufferedReader(isr);
            }
            else{
                System.out.println("ERROR en la ejecución de DIR !!!");
                is = proceso1.getErrorStream();
                isr = new InputStreamReader(is);
                br = new BufferedReader(isr);
            }
            
            String linea = br.readLine();
            while(linea != null){
                System.out.println(linea);
                linea = br.readLine();
            }
            
            br.close();
            isr.close();
            is.close();
                    } catch (Exception e) {
                    }
                    
                    break;
                    
                case 2:
                    ProcessBuilder pb = new ProcessBuilder();
                    Process proceso2;
                    break;
                    
                case 0:
                    
                    break;
                    
                default:
                    System.out.println("Introduce una opcion valida");
                    throw new AssertionError();
            }
        } while (eleccion != 0);
    }
    
    public static void menu()
    {
        System.out.println("/t****************************************");
        System.out.println("/t*1.-HELP comando************************");
        System.out.println("/t2.-Variables de entorno*****************");
        System.out.println("/t0.-TERMINAR*****************************");
        System.out.println("/t****************************************");
        System.out.println("");
        System.out.println("Introduce una opcion:");
        eleccion = sc.nextInt();
    }
}
