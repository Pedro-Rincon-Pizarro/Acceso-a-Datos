/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatUdp2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 *
 * @author pedro.rinpiz
 */
public class Servidor 
{
    public static void main(String[] args) 
    {
        DatagramSocket socket;
        try 
        {
            System.out.println("Servidor creando socket");
            socket = new DatagramSocket(12345);
            System.out.println("Servidor. Recibiendo Datagrama");
            byte[] bufferLectura = new byte[1024];
            //creo que usas esto porque no debes poder cargar bytes en el socket, pero no lo se
            DatagramPacket datagramaEntrada=new DatagramPacket
                            (bufferLectura,bufferLectura.length);
            socket.receive(datagramaEntrada);
            System.out.println("Servidor. Mensaje recibido: " + new String(bufferLectura));
            System.out.println("Servidor. Enviando datagrama...");
            byte[] mensajeEnviado = new String("El servidor envia HOLA al CLIENTE").getBytes();
            DatagramPacket datagramSalida = new DatagramPacket(mensajeEnviado, mensajeEnviado.length,
                    datagramaEntrada.getAddress(), datagramaEntrada.getPort());
            socket.send(datagramSalida);
            System.out.println("Servidor cerrando socket");
            socket.close();
            System.out.println("Servidor cerrando Shoket");
        }
        catch (SocketException e) 
        {
            e.printStackTrace();
        }catch (IOException e)
        {
            e.printStackTrace();
        }    

    }
    
    
}
