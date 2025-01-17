/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChatTcp4;

import chatTcp2.ClienteTCP;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 *
 * @author pedro.rinpiz
 */
public class Cliente 
{

    private Socket socket;
    private InputStream is;
    private OutputStream os;
    private InputStreamReader isr;
    private BufferedReader br;
    private PrintWriter pw;

    
    public void inicio() throws IOException
    {
        try 
        {
            System.out.println("Cliente estableciendo conexion");
            socket = new Socket("localhost", 9000);
            os = socket.getOutputStream();
            is = socket.getInputStream();
        }
        catch (Exception e) 
        {
            
        }
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
    
    public void cerrarCanalesTexto() throws IOException
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
    
    public static void main(String[] args) 
    {
        try 
        {
            Cliente cliente=new Cliente();
            cliente.inicio();   
            cliente.AbrirCanalesTexto();
            //ENVIO MENSAJE
            cliente.enviarMensajeTexto("Hola servidor, soy el cliente");
            String mensajeRecibido=cliente.leerMensajeTexto();
            System.out.println ("Servidor mensaje recibido..."+mensajeRecibido);
            cliente.cerrarCanalesTexto();
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
