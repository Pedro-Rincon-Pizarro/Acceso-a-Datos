/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consolaUDP1;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
/**
 *
 * @author pedro.rinpiz
 */


public class ClienteUDP {

    public static void main(String args[]) {
        String strMensaje = "El cliente envia HOLA al servidor";
        DatagramSocket socketUDP;
        try {
            System.out.println("Cliente. Estableciendo conexion");
            //obtener la direccion del servidor
            InetAddress hostServidor = InetAddress.getByName("localhost");
            //obtener el puerto
            int puertoServidor = 49171;
            System.out.println("Cliente. Creando socket");
            //Creacion del socketUDP
            socketUDP = new DatagramSocket();
            System.out.println("Cliente. Enviando Datagrama");
            byte[] mensaje = strMensaje.getBytes();
            DatagramPacket peticion = new DatagramPacket(mensaje, mensaje.length, hostServidor, puertoServidor);
            socketUDP.send(peticion);
            System.out.println("Cliente. Recibiendo Datagrama");
            byte[] buffer = new byte[64];
            DatagramPacket respuesta = new DatagramPacket(buffer, buffer.length, hostServidor, puertoServidor);
            socketUDP.receive(respuesta);
            System.out.println("Cliente. Mensaje Recibido:" + new String(buffer));
            System.out.println("Cliente. Cerrando Socket");
            socketUDP.close();
            System.out.println("Cliente. Socket Cerrado");

        } catch (SocketException e) {
            e.printStackTrace();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
