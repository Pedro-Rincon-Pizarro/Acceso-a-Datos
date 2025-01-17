/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChatTCP3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorTCP 
{

    public static void main(String[] args) throws IOException 
    {
        // El servidor escucha las conexiones de los clientes a través del puerto 6000
        ServerSocket servidor = new ServerSocket(6000);
        while (true) 
        {
            Socket socket = null;
            try 
            {
                for (int i = 1; i <= 3; i++) 
                {

                    socket = servidor.accept();  // esperando nuevo cliente
                    System.out.println("Un nuevo cliente se ha conectado...");

                    DataInputStream input = new DataInputStream(socket.getInputStream());
                    DataOutputStream output = new DataOutputStream(socket.getOutputStream());

                    HiloServidorTCP hilo = new HiloServidorTCP(socket, input, output, i);
                    hilo.start();
                }
            } 
            catch (Exception e) 
            {
                e.printStackTrace();
            }
        }
    }
}