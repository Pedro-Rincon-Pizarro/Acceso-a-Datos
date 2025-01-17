package ut01_psp;

import java.io.IOException;

/**
 *
 * @author unai.esggir
 */
public class Ej01Runtime {
    
    public static void main(String[] args) {
        String comando = "Notepad.exe C:\\notas.txt";
        //String comando = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
        try{
            Runtime p1= Runtime.getRuntime();
            p1.exec(comando);
        }
        catch(IOException e){
            System.out.println("Error en " + comando);
            e.printStackTrace();
        }
    }
    
}
