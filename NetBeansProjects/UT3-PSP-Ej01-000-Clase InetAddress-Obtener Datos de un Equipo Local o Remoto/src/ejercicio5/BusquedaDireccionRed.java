/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio5;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

/**
 *
 * @author pedro.rinpiz
 */
public class BusquedaDireccionRed {

    public static void main(String[] args) {
        
        try {
            
            //String host = "ortizol.blogspot.com";
            String host = "www.educa.jcyl.es";
            String numeroIp = "8.8.8.8";
            
            // Obtención de la dirección IP:
            System.out.printf("La dirección de %s es %s\n", host,
                    InetAddress.getByName(host).getHostAddress());
            
            System.out.println();
            
            // Encontrar el nombre del host a partir de la IP:
            System.out.printf("El nombre del host para la IP %s es %s\n", 
                    numeroIp, InetAddress.getByName(numeroIp).getHostName());
            
            System.out.println();
            
            // Dirección del host local:
            final InetAddress localhost = InetAddress.getLocalHost();
            System.out.printf("La dirección del localhost es %s\n", 
                    localhost);
            
            System.out.println();
            
            // Obtención de datos con un objeto Socket:
            host = "www.wikipedia.org";
            Socket socket = new Socket(host, 80);
            InetAddress ipWikipedia = socket.getInetAddress();
            System.out.printf("La IP de %s es %s\n", host, ipWikipedia);
            
        } catch (IOException e) {
            System.err.println("Error -> " + e.getMessage());
        }
    }
}