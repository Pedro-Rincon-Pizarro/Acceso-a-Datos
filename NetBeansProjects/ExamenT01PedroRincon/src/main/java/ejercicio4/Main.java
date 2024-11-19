/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author pedro.rinpiz
 */
public class Main
{
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String linea;
        File file = new File("pedidosEstado.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        int contPagados = 0;
        int contProcesado = 0;
        int contEnviados = 0;
        
        while((linea = br.readLine()) != null)
        {
            String [] datos = linea.split(";");
            if(datos[1].equals("pagado"))
            {
                System.out.println("Pedidos pagados:");
                System.out.println( datos[0] + ";" + datos[1] + ";" + datos[2] + ";" + datos[3] + ";" + datos[4] + ";" + datos[5] + ";" + datos[6]);
                contPagados++;
            }
            else if(datos[1].equals("enviado"))
            {
                contEnviados++;
            }
            else if(datos[1].equals("procesado"))
            {
                contProcesado++;
            }
        }
        
        System.out.println("Pedidos pagados: " + contPagados);
        System.out.println("Pedidos enviados: " + contEnviados);
        System.out.println("Pedidos en proceso: " + contProcesado);
    }
}
