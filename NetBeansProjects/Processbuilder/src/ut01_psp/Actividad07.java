/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut01_psp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pedro.rinpiz
 */
public class Actividad07 {

    ProcessBuilder pb = new ProcessBuilder();
    Process proceso;
    InputStream is;
    InputStreamReader isr;
    BufferedReader br;
    int exitCode = 0;

    public void execute() throws InterruptedException 
    {
        try 
        {
            List<String> lista = new ArrayList<String>();
            lista.add("cmd.exe");
            lista.add("/C");
            lista.add("ping");
            lista.add("8.8.8.8");

            pb.command(lista);
            proceso = pb.start();
            exitCode = proceso.waitFor();
            
            if(exitCode == 0)
            {
                System.out.println("PING se lanzó con exito");
            }
            else
            {
                System.out.println("Error en la ejecución de PING");
            }
            is = proceso.getInputStream();
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);
            
            String linea;
            do
            {
                linea = br.readLine();
                System.out.println(linea);
                
            }while(linea != null);
            is.close();
            isr.close();
            br.close();
            System.out.println("FIN, exitCode = " + exitCode);
        } 
        catch (IOException e) 
        {
            System.out.println("Error: " + e.getMessage());
        }
        
    }

    public static void main(String[] args) throws InterruptedException 
    {
        Actividad07 act7 = new Actividad07();
        act7.execute();
    }
}
