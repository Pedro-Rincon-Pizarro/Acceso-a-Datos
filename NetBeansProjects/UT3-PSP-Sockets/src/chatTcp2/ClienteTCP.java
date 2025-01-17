/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chatTcp2;

/**
 *
 * @author pedro.rinpiz
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;


public class ClienteTCP 
{
    private String serverIP;
    private int serverPort;
    private Socket socket;
    private InputStream is;
    private OutputStream os;
    private InputStreamReader isr;
    private BufferedReader br;
    private PrintWriter pw;
    
    public ClienteTCP(String serverIP,int serverPort)
    {
        this.serverIP=serverIP;
        this.serverPort=serverPort;
    }
    public void inicio() throws IOException
    {
        System.out.println ("Cliente estableciendo conexion...");
        socket=new Socket(serverIP, serverPort);
        os=socket.getOutputStream();
        is=socket.getInputStream();
        System.out.println ("Cliente conexión establecida...");
     
    }
    public void stop() throws IOException
    {
        System.out.println ("Cliente cerrando conexiones...");
        is.close();
        os.close();
        socket.close();
        System.out.println ("Cliente conexiones cerradas...");
    }
    public void AbrirCanalesTexto()
    {
        System.out.println ("Cliente abriendo canales de texto...");
        isr=new InputStreamReader(is);
        br=new BufferedReader(isr);
        pw=new PrintWriter(os,true);
        System.out.println ("Cliente canales de texto abiertos...");
    }
     public void CerrarCanalesDeTexto() throws IOException
     {
        System.out.println ("Cliente cerrando canales de texto...");
        br.close();
        isr.close();
        pw.close();
        System.out.println ("Cliente canales de texto cerrados...");
    }
    public void enviarMensajeTexto(String mensaje)
    {
        System.out.println ("Cliente enviando mensaje...");
        pw.println(mensaje);
        System.out.println ("Cliente mensaje enviado...");
    }
    public String leerMensajeTexto() throws IOException
    {
        System.out.println ("Cliente leyendo mensaje...");
        String mensaje=br.readLine();
        System.out.println ("Cliente mensaje leido...");
        return mensaje;
    } 
    public static void main(String args[]) 
    {
        try 
        {
            ClienteTCP cliente=new ClienteTCP("localhost",49171);
            cliente.inicio();   
            cliente.AbrirCanalesTexto();
            //ENVIO MENSAJE
            cliente.enviarMensajeTexto("Hola desde el cliente al servidor");
            String mensajeRecibido=cliente.leerMensajeTexto();
            System.out.println ("Servidor mensaje recibido..."+mensajeRecibido);
            cliente.CerrarCanalesDeTexto();
            cliente.stop();
        } 
        catch (UnknownHostException e)
        {
            e.printStackTrace();    
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }
}