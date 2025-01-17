/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio6;

import java.io.IOException;
import java.net.InetAddress;

/**
 *
 * @author pedro.rinpiz
 */
public class PingHost {

    public static void main(String[] args) {
        
        final String HOST = "10.16.159.21";
        
        try {
            
            InetAddress direccion = InetAddress.getByName(HOST);
            
            boolean alcanzable = direccion.isReachable(10000);
            
            System.out.println("¿El host es alcanzable?: " + alcanzable);
            
        } catch (IOException e) {
            
            System.err.println("Ocurrió un error de entrada/salida: " + 
                    e.getMessage());
        }
    }
}