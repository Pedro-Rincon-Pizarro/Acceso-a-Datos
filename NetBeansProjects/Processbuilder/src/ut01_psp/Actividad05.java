/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut01_psp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pedro.rinpiz
 */
public class Actividad05 
{
    ProcessBuilder pb = new ProcessBuilder();
    public void execute()
    {
        try 
        {
            List<String> lista = new ArrayList<String>();
            lista.add("cmd.exe");
            lista.add("/C");
            lista.add("start Firefox");
            
            pb.command(lista);
            pb.start();
            
        }
        catch (IOException e) 
        {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("FIN");
    }
    
    public static void main(String[] args) 
    {
        Actividad05 act5 = new Actividad05();
        act5.execute();
    }
}
