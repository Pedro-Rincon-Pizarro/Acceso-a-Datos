/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ut01_psp;

import java.io.IOException;

/**
 *
 * @author pedro.rinpiz
 */
public class Actividad01 
{
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
