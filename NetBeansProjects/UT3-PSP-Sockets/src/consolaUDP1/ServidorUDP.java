/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package consolaUDP1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 *
 * @author pedro.rinpiz
 */

public class ServidorUDP {

    public static void main(String args[]) {
        DatagramSocket socket;
        try {
            System.out.println("Servidor. Creando Socket");
            socket = new DatagramSocket(49171); //Crear el DataGramSocket(porque es UDP, sino seria dataInput etc
            System.out.println("Servidor. Recibiendo Datagrama");
            byte[] bufferLectura = new byte[64];//Creacion de un array de bytes que actua como buffer
            DatagramPacket datagramaEntrada = new DatagramPacket(bufferLectura, bufferLectura.length); //crear el datagrama con el buffer y su longitud
            
            //el servidor queda a la espera de mensajes del cliente
            socket.receive(datagramaEntrada);//recepcion del datagrama mediante el metodo recive del socket
            System.out.println("Servidor. Mensaje Recibido:" + new String(bufferLectura));
            System.out.println("Servidor. Enviando datagrama.....");
            byte[] mensajeEnviado = new String("El servidor envia HOLA al CLIENTE").getBytes();
            DatagramPacket datagramaSalida = new DatagramPacket(mensajeEnviado, mensajeEnviado.length, datagramaEntrada.getAddress(), datagramaEntrada.getPort());
            socket.send(datagramaSalida);
            System.out.println("Servidor. Cerrando Socket");
            socket.close();
            System.out.println("Servidor. Socket Cerrado");
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
