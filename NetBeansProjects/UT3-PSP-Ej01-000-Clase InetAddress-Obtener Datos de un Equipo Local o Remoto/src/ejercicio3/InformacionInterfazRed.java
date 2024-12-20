/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author pedro.rinpiz
 */
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

/**
 * Ejercicio 211: Obtener la información de una interfaz de red con la clase
 * NetworkInterface.
 */
public class InformacionInterfazRed {

    public static void main(String[] args) {

        try {
            //devuelve todas las interfaces de red
            Enumeration<NetworkInterface> interfaces
                    = NetworkInterface.getNetworkInterfaces();

            //Recorro las interfaces de red
            while (interfaces.hasMoreElements()) {
                NetworkInterface interfaz = interfaces.nextElement();
                //metodo personalizado para mostrar la interfaz de red
                mostrarInformacionInterfaz(interfaz);
            }
            
        } catch (SocketException e) {
            System.err.println("Ocurrió un error: " + e.getMessage());
        }
    }

    private static void mostrarInformacionInterfaz(NetworkInterface interfaz) throws SocketException {
        
        System.out.println("Nombre: " + interfaz.getName());
        System.out.println("Nombre presentación: " + interfaz.getDisplayName());
        System.out.println("¿Está activa?: " + interfaz.isUp());
        System.out.println("¿Soporta multicast?: " + interfaz.supportsMulticast());
        System.out.println("¿Es local?: " + interfaz.isLoopback());
        System.out.println("¿Es virtual?: " + interfaz.isVirtual());
        System.out.println("Dirección hardware: " + interfaz.getHardwareAddress());
        System.out.println("¿Es punto a punto?: " + interfaz.isPointToPoint());
        System.out.println("MTU: " + interfaz.getMTU());
        
        System.out.println();
        
        System.out.println("Lista de direcciones:");
        
        List<InterfaceAddress> direcciones = interfaz.getInterfaceAddresses();
        Iterator<InterfaceAddress> it = direcciones.iterator();
        
        while(it.hasNext()){
            InterfaceAddress direccion = it.next();
            
            System.out.println("\tDirección: " + direccion.getAddress());
            System.out.println("\tBroadcast: " + direccion.getBroadcast());
            System.out.println("\tLongitud prefijo de red: " + direccion.getNetworkPrefixLength());
            
            System.out.println();
        }
    }
}
