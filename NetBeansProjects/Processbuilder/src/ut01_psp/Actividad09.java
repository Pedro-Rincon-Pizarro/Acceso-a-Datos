/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut01_psp;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author pedro.rinpiz
 */
public class Actividad09 
{
    
    Runtime rt;
    Process proceso;
    InputStream is;
    InputStreamReader isr;
    BufferedReader br;
    Scanner sc = new Scanner(System.in);
    String txtBuscado;
    String comando;
    
    public void execute()
    {
        String comando = "";
        rt = Runtime.getRuntime();
        try 
        {
            
            
            
            System.out.println("Introduce una palabra existente en el archivo a buscar");
            txtBuscado = sc.nextLine().trim() ;
            comando = "cmd /C find /c\"" + txtBuscado + "\" C:\\Users\\pedro.rinpiz\\dam2.txt";
            proceso = rt.exec(comando);
            int resultado = proceso.waitFor();
            if(resultado == 0)
            {
                System.out.println("se lanzó con exito");
                is = proceso.getInputStream();
                isr = new InputStreamReader(is);
                br = new BufferedReader(isr);
            }
            else
            {
                System.out.println("Error al lanzar");
                is = proceso.getInputStream();
                isr = new InputStreamReader(is);
                br = new BufferedReader(isr);
            }
            
            String linea;
            do
            {
                linea = br.readLine();
                if(linea != null)
                {
                    System.out.println(linea);
                }
                
            }while(linea != null);
        } catch (Exception e) 
        {
            
        }
    }
    public static void main(String[] args) {
        Actividad09 a9 = new Actividad09();
        a9.execute();
    }
}
