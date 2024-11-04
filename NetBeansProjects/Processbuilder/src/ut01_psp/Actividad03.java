/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut01_psp;

import java.io.IOException;

/**
 *
 * @author pedro.rinpiz
 */
public class Actividad03 
{
    Runtime r = Runtime.getRuntime();
    
    public static void main(String[] args) 
    {
        Actividad03 act03 = new Actividad03();
        act03.execute();
        System.out.println("Fin");
    }
    
    public void execute() 
    {
        String comando1 = "iexplore";
        String comando2 = "C:\\Users\\pedro.rinpiz\\Downloads\\AnyDesk.exe";
        
        Process proceso;
        
        try 
        {
            System.out.println("Lanzando notepad");
            proceso = r.exec(comando1);
            System.out.println("El notepad está corriendo pero sigue");
            
            System.out.println("Lanzando excel");
            proceso = r.exec(comando2);
            System.out.println("Esperando a que termine la ejecucion de excel");
            
            int resultado = proceso.waitFor();
            if(resultado == 0)
            {
                System.out.println("Excel ha finalizado correctamente");
            }
            else
            {
                System.out.println("Error al ejecutar excel");
            }
        } 
        catch (IOException ex) 
        {
            System.out.println("Error: " + ex.getMessage());
        }
        catch(InterruptedException ex)
        {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
