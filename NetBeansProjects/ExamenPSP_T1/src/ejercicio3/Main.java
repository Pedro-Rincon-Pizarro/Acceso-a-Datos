/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pedro.rinpiz
 */
public class Main 
{
    public static void main(String[] args) {
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        System.out.println("MENU");
        System.out.println("1.-Comando nsLookUp");
        System.out.println("2.-Programa Python");
        System.out.println("");
       
            System.out.println("Introduce el numero de una opicon");
            opcion = sc.nextInt();
        
        
        switch (opcion) {
            case 1:
                try {
                    Runtime r = Runtime.getRuntime();
                    String ruta = "C:/WINDOWS/system32>nslookup www.google.es";
                    Process p1 = r.exec(ruta);
                    System.out.println(r.exec(ruta));

                } catch (Exception e) {
                }
                
                break;
                
            case 2:
                
                break;
                
            default:
                throw new AssertionError();
        }

        
    }
}
