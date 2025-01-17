/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatTcp1;

/**
 *
 * @author pedro.rinpiz
 */
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClienteTCP {
    private String serverIP;
    private int serverPort;
    private Socket socket;
    private InputStream is;
    private OutputStream os;
    
    public ClienteTCP(String serverIP,int serverPort){
        this.serverIP=serverIP;
        this.serverPort=serverPort;
    }
    public void inicio() throws IOException{
        System.out.println ("Cliente estableciendo conexion...");
        socket=new Socket(serverIP, serverPort);
        os=socket.getOutputStream();
        is=socket.getInputStream();
        System.out.println ("Cliente conexión establecida...");
    }
    public void stop() throws IOException{
        System.out.println ("Cliente cerrando conexiones...");
        is.close();
        os.close();
        socket.close();
        System.out.println ("Cliente conexiones cerradas...");
    }
      public static void main(String args[]) {
        try {
            ClienteTCP cliente=new ClienteTCP("localhost",49171);
            cliente.inicio();            
            cliente.os.write(100);
            System.out.println ("Mensaje del servidor"+cliente.is.read());
            cliente.stop();
        } catch (UnknownHostException e){
            e.printStackTrace();    
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
