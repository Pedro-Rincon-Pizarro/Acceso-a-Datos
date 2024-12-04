/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author pedro.rinpiz
 */
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/**
 * Ejercicio 208: Obtener las direcciones IP de cada una de las interfaces 
 * de red del sistema.
 */
public class IpInterfacesRed {

    public static void main(String[] args) {

        try {
            Enumeration<NetworkInterface> interfaces = 
                    NetworkInterface.getNetworkInterfaces();
            
            while(interfaces.hasMoreElements()){
                
                NetworkInterface interfaz = interfaces.nextElement();
                Enumeration<InetAddress> direcciones = interfaz.getInetAddresses();
                
                while(direcciones.hasMoreElements()){
                    
                    InetAddress direccion = direcciones.nextElement();
                    
                    if (direccion instanceof Inet4Address
                            && !direccion.isLoopbackAddress()){
                        
                        System.out.println(direccion);
                    }
                }
            }
            
        } catch (SocketException e) {
            System.err.println("Error -> " + e.getMessage());
        }
    }
}
