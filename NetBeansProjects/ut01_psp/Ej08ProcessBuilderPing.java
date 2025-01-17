package ut01_psp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author unai.esggir
 */
public class Ej08ProcessBuilderPing {
    
    ProcessBuilder pb = new ProcessBuilder();
    private Process proceso;
    private InputStream is;
    private InputStreamReader isr;
    private BufferedReader br;
    
    public void execute() throws InterruptedException{
        try{
            List <String> lista = new ArrayList<>();
            lista.add("cmd.exe");
            lista.add("/C");
            lista.add("ping");
            // lista.add("www.educa.jcyl.es");
            lista.add("google.es");
            
            pb.command(lista);
            // pb.command("cmd.exe", "/C", "ping", "www.educa.jcyl.es");
            
            proceso = pb.start();
            
            int exitCode = proceso.waitFor();
            
            if(exitCode == 0){
                System.out.println("PING se lanzó con éxito");
            }
            else{
                System.out.println("ERROR en la ejecución de PING !!!!");
            }
                
            is = proceso.getInputStream();
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);
            
            String linea;
            do{
                linea = br.readLine();
                System.out.println(linea);
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
        Ej08ProcessBuilderPing ej = new Ej08ProcessBuilderPing();
        ej.execute();
    }
    
}

