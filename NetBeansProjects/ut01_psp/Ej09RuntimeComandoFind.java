package ut01_psp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author unai.esggir
 */
public class Ej09RuntimeComandoFind {
    
    Runtime rt;
    private Process proceso;
    private InputStream is;
    private InputStreamReader isr;
    private BufferedReader br;
    
    public void execute() throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        try{
            rt = Runtime.getRuntime();
            System.out.println("¿Que deseas buscar?");
            String textoBuscar = sc.next();
            String comando = "cmd /C find /c \"" + textoBuscar + "\" C:\\Users\\unai.esggir\\dam2.txt";
            proceso = rt.exec(comando);
                    
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
        Ej09RuntimeComandoFind ej = new Ej09RuntimeComandoFind();
        ej.execute();
        System.out.println("--- FIN ---");
    }
    
}
