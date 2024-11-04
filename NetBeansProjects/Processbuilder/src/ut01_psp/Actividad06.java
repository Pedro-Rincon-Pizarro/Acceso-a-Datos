/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut01_psp;

/**
 *
 * @author pedro.rinpiz
 */
public class Actividad06 
{
    Runtime r = Runtime.getRuntime();
    
    
    public static void main(String[] args) 
    {
        Actividad06 a6 = new Actividad06();
        a6.execute();
        System.out.println("Fin");
    }
    
    public void execute()
    {
        
        String comando2 = "C:\\Users\\pedro.rinpiz\\Downloads\\AnyDesk.exe";
        
        Process proceso;
        try 
        {
            proceso = r.exec("mspaint");
            System.out.println("El panel de control está corriendo pero sigue");
            
            System.out.println("Lanzando Panel de control");
            
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
        catch (Exception e) 
        {
            
        }
    }
}
