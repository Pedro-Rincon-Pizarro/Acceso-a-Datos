package ut01_psp;

import java.io.IOException;

/**
 *
 * @author unai.esggir
 */
public class Ej06RuntimePanelControl {
    
    private Runtime r = Runtime.getRuntime();
    private Process proceso;
    
    public void execute(){
        try{
            System.out.println("Lanzando el PANEL DE CONTROL");
            
            proceso = r.exec("control appwiz.cpl");
            System.out.println("El PANEL DE CONTROL está corriendo ");
            
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
        Ej06RuntimePanelControl lp = new Ej06RuntimePanelControl();
        lp.execute();
    }
    
}
