package ut01_psp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author unai.esggir
 */
public class Ej04Runtime {
    
    Runtime r = Runtime.getRuntime();
    Process proceso;
    
    public void execute(){
        //String comando = "cmd /c dir";
        String comando = "cmd /c tasklist";
        try{
            System.out.println("Lanzando el DIR");
            proceso = r.exec(comando);
            System.out.println("Esperando a que termine la ejecución de DIR ...");
            int resultado = proceso.waitFor();
            
            InputStream is;
            InputStreamReader isr;
            BufferedReader br;
            
            if(resultado == 0){
                System.out.println("DIR se lanzó con éxito");
                is = proceso.getInputStream();
                isr = new InputStreamReader(is);
                br = new BufferedReader(isr);
            }
            else{
                System.out.println("ERROR en la ejecución de DIR !!!");
                is = proceso.getErrorStream();
                isr = new InputStreamReader(is);
                br = new BufferedReader(isr);
            }
            
            String linea = br.readLine();
            while(linea != null){
                System.out.println(linea);
                linea = br.readLine();
            }
            
            br.close();
            isr.close();
            is.close();
        }
        catch(IOException | InterruptedException e){
            System.out.println("ERROR " + e.getMessage());
        }
    }
    
    public static void main(String[] args){
        Ej04Runtime lp = new Ej04Runtime();
        lp.execute();
    }
}
