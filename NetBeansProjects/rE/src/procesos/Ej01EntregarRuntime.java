package ut01_psp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author unai.esggir
 */
public class Ej01EntregarRuntime {
    
    Runtime rt;
    private Process proceso;
    private InputStream is;
    private InputStreamReader isr;
    private BufferedReader br;
    
    public void execute() throws InterruptedException{
        try{
            rt = Runtime.getRuntime();
            proceso = rt.exec("cmd /C nslookup www.educa.jcyl.es");
            // proceso = rt.exec("cmd /C nslookup educa.jcyl.es");
                    
            int exitCode = proceso.waitFor();
            
            if(exitCode == 0){
                System.out.println("El comando se lanzó con éxito");
            }
            else{
                System.out.println("ERROR en la ejecución del comando !!!!");
            }
            
            is = proceso.getInputStream();
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);
            
            String linea;
            do{
                linea = br.readLine();
                if(linea != null) System.out.println(linea);
            }while(linea != null);
            
            
            br.close();
            isr.close();
            is.close();
        }
        catch(IOException | InterruptedException e){
            System.out.println("ERROR " + e.getMessage());
        }
        
    }
    
    public static void main(String[] args) throws InterruptedException{
        Ej01EntregarRuntime ej = new Ej01EntregarRuntime();
        ej.execute();
        System.out.println("--- FIN ---");
    }
    
}
