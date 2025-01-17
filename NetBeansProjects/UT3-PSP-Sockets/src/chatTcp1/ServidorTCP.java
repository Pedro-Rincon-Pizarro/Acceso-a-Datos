/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatTcp1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorTCP {
    private ServerSocket serverSocket;
    private Socket socket;
    private InputStream is;
    private OutputStream os;
    
    public ServidorTCP (int puerto) throws IOException{
        serverSocket=new ServerSocket(puerto);
    } 
    public void inicio() throws IOException{
        System.out.println ("Servidor esperando conexiones...");
        socket=serverSocket.accept();
        is=socket.getInputStream();
        os=socket.getOutputStream();
        System.out.println ("Servidor conexión establecida...");
    }
    public void stop() throws IOException{
        System.out.println ("Servidor cerrando conexiones...");
        is.close();
        os.close();
        socket.close();
        serverSocket.close();
        System.out.println ("Servidor conexiones cerradas...");
    }
    public static void main(String args[]) {
        try {
            ServidorTCP server=new ServidorTCP(49171);
            server.inicio();
            //mensaje para el cliente
            System.out.println ("Mensaje del cliente"+server.is.read());
            server.os.write(200);
            server.stop();
            
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
