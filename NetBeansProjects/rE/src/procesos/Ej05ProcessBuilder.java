package ut01_psp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author unai.esggir
 */
public class Ej05ProcessBuilder {
    
    ProcessBuilder pb = new ProcessBuilder();
    
    public void execute(){
        try{
            List <String> lista = new ArrayList<>();
            lista.add("cmd.exe");
            lista.add("/C");
            lista.add("start Chrome ");
            
            pb.command(lista);
            pb.start();
        }
        catch(IOException e){
            System.out.println("ERROR " + e.getMessage());
        }
    }
    
    public static void main(String[] args){
        Ej05ProcessBuilder ej = new Ej05ProcessBuilder();
        ej.execute();
    }
    
}
