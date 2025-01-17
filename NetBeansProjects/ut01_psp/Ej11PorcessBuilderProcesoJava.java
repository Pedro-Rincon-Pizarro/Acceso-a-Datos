package ut01_psp;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author unai.esggir
 */
public class Ej11PorcessBuilderProcesoJava {
    
    ProcessBuilder pb = new ProcessBuilder();
    ProcessBuilder pb2 = new ProcessBuilder();
    private Process proceso;
    private Process proceso2;
    private InputStream is;
    private InputStreamReader isr;
    private BufferedReader br;
    
    public void execute(){
        
        String linea;
        try{  
            String cad1 = "C:\\Program Files\\Microsoft\\jdk-11.0.22.7-hotspot\\bin\\javac.exe";
            String cad2 = "C:\\Users\\unai.esggir\\Saludo.java";
            pb.command(cad1, cad2);
            proceso = pb.start();
            
            System.out.println("Esperando a que ejecute el proceso java...");
            int exitCode = proceso.waitFor();
            
            if(exitCode == 0){
                System.out.println("El proceso java se lanzó con éxito");
            }
            else{
                System.out.println("ERROR en la ejecución del proceso java !!!!");
            }
                
            pb2.command("C:\\Program Files\\Microsoft\\jdk-11.0.22.7-hotspot\\bin\\java.exe", "Saludo");
            pb2.directory(new File("C:\\Users\\unai.esggir\\"));
            proceso2 = pb2.start();
            
            System.out.println("Esperando a que termine la ejecución del proceso java...");
            
            int exitCode2 = proceso2.waitFor();
            if(exitCode2 == 0){
                System.out.println("El proceso java se lanzó con éxito");
            }
            else{
                System.out.println("ERROR en la ejecución del proceso java !!!!");
            }

            
            is = proceso2.getInputStream();
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);
            
            do{
                linea = br.readLine();
                if(linea != null) System.out.println(linea);
            }while(linea != null);
            
            
            br.close();
            isr.close();
            is.close();
            
            System.out.println("FIN, Proceso Finalizado ------------- " + exitCode);
        }
        catch(IOException | InterruptedException e){
            System.out.println("ERROR " + e.getMessage());
        }
    }
    
    public static void main(String[] args) throws InterruptedException{
        Ej11PorcessBuilderProcesoJava ej = new Ej11PorcessBuilderProcesoJava();
        ej.execute();
    }
    
}