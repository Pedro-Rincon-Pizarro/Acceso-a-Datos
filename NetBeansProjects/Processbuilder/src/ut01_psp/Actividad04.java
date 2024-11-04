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
public class Actividad04
{

    Runtime r = Runtime.getRuntime();
    Process proceso;
    InputStream is;
    InputStreamReader isr;
    BufferedReader br;

    public void execute() 
    {
        String comando = "cmd /c dir";
        try {
            System.out.println("Lanzando el dIR");
            proceso = r.exec(comando);
            System.out.println("Esperando a que termine la ejecución de DIR");
            int resultado = proceso.waitFor();

            if (resultado == 0) 
            {
                System.out.println("DIR se lanzó con exito");
                is = proceso.getInputStream();
                isr = new InputStreamReader(is);
                br = new BufferedReader(isr);
            } else 
            {
                System.out.println("Error en la ejecución de DIR");
                is = proceso.getInputStream();
                isr = new InputStreamReader(is);
                br = new BufferedReader(isr);
            }

            String linea = br.readLine();
            while (linea != null) 
            {
                System.out.println(linea);
                linea = br.readLine();
            }
            br.close();
            isr.close();
            is.close();
        } catch (IOException | InterruptedException e) 
        {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) 
    {
        Actividad04 act4 = new Actividad04();
        act4.execute();
    }
}
