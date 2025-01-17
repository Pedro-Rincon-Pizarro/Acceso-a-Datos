package ut01_psp;

import java.io.IOException;

/**
 *
 * @author unai.esggir
 */
public class Ej07RuntimePaint {
    
    private Runtime r = Runtime.getRuntime();
    private Process proceso;
    
    public void execute(){
        try{
            System.out.println("Lanzando PAINT");
            
            // proceso = r.exec(System.getenv("windir") + "\\System32\\mspaint.exe");
            proceso = r.exec("mspaint.exe");
            System.out.println("PAINT está corriendo ");
            
            int ret = proceso.waitFor();
            
            if(ret == 0) System.out.println("OK");
            else System.out.println("Error");
        }
        catch(IOException | InterruptedException e){
            System.out.println("ERROR " + e.getMessage());
        }
        
        System.out.println("FIN ---------------------------------");
    }
    
    public static void main(String[] args){
        Ej07RuntimePaint lp = new Ej07RuntimePaint();
        lp.execute();
    }
    
}
