package ut01_psp;

import java.io.IOException;

/**
 *
 * @author unai.esggir
 */
public class Ej03Runtime {
    
    static Runtime r = Runtime.getRuntime();
    
    public void execute(){
        String comando1 = "notepad";
        // String comando1 = "calc"; // La calculadora
        String comando2 = "C:\\Program Files\\Microsoft Office\\root\\Office16\\EXCEL.EXE";
        // String comando2 = "C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe";
       
        Process proceso;
        try{
            System.out.println("Lanzando el NOTEPAD");
            proceso = r.exec(comando1);
            System.out.println("El NOTEPAD está corriendo pero el programa sigue");
            
            System.out.println("Lanzando el EXCEL");
            proceso = r.exec(comando2);
            System.out.println("Esperando a que termina la ejecución de EXCEL");
            int resultado = proceso.waitFor();
            
            if(resultado == 0){
                System.out.println("EXCEL a finalizado correctamente");
            }
            else{
                System.out.println("ERROR en la ejecución de EXCEL !!!");
            }
        }
        catch(IOException ex){
            System.out.println("Error: " + ex.getMessage());
        }
        catch(InterruptedException ex){
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    public static void main(String[] args){
        Ej03Runtime lp = new Ej03Runtime();
        lp.execute();
    }
}
