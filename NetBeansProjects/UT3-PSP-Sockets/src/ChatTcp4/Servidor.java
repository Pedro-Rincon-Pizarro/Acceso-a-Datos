/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChatTcp4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author pedro.rinpiz
 */
public class Servidor 
{
    int puerto = 9000;
    ServerSocket server;
    Socket socket;
    DataInputStream entrada;
    DataOutputStream salida;
    
    
    public void inicio()
    {
        try {
            server = new ServerSocket(puerto);
            socket = server.accept();
            
            entrada = new DataInputStream(socket.getInputStream());
            System.out.println("Servidor recive " + entrada.readUTF());
            
            salida = new DataOutputStream(socket.getOutputStream());
            System.out.println("Hasta pronto cliente ");
            
            entrada.close();
            salida.close();
            
            server.close();
            socket.close();
            
        }
        catch (Exception e) 
        {
            
        }
    }
    
    public static void main(String[] args) {
        Servidor serv = new Servidor();
        serv.inicio();
    }
}
