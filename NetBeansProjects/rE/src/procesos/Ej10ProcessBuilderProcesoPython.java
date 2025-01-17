package ut01_psp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author unai.esggir
 */
public class Ej10ProcessBuilderProcesoPython {
   
    ProcessBuilder pb = new ProcessBuilder();
    private Process proceso;
    private InputStream is;
    private InputStreamReader isr;
    private BufferedReader br;
    
    public void execute(){
        
        String linea;
        try{
            String cad1 = "C:\\Users\\unai.esggir\\AppData\\Local\\Programs\\Python\\Python312\\python.exe";
            String cad2 = "C:\\Users\\unai.esggir\\holamundo.py";
            pb.command(cad1, cad2);
            proceso = pb.start();
            
            System.out.println("Esperando a que ejecute el proceso python...");
            int exitCode = proceso.waitFor();
            
            if(exitCode == 0){
                System.out.println("El proceso python se lanzó con éxito");
            }
            else{
                System.out.println("ERROR en la ejecución del proceso python !!!!");
            }
                
            is = proceso.getInputStream();
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
        Ej10ProcessBuilderProcesoPython ej = new Ej10ProcessBuilderProcesoPython();
        ej.execute();
    }
    
}

