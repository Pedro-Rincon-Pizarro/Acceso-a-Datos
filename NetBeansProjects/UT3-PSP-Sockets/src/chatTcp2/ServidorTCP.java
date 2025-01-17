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
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorTCP {
    private ServerSocket serverSocket;
    private Socket socket;
    private InputStream is;
    private OutputStream os;
    private InputStreamReader isr;
    private BufferedReader br;
    private PrintWriter pw;
    
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
    public void abrirCanalesDeTexto(){
        System.out.println ("Servidor abriendo canales de texto...");
        //CANAL DE LECTURA
        isr=new InputStreamReader(is);
        br=new BufferedReader (isr);
        //CANAL DE ESCRITURA
        pw=new PrintWriter(os, true);
        System.out.println ("Servidor canales de texto abiertos...");
    }
    public void cerrarCanalesDeTexto()throws IOException{
        System.out.println ("Servidor cerrando canales de texto...");
        br.close();
        isr.close();
        pw.close();
        System.out.println ("Servidor canales de texto cerrados...");
    }
    public void enviarMensajeTexto(String mensaje){
        System.out.println ("Servidor enviando mensaje...");
        pw.println(mensaje);
        System.out.println ("Servidor mensaje enviado...");
    }
    public String leerMensajeTexto() throws IOException{
        System.out.println ("Servidor leyendo mensaje...");
        String mensaje=br.readLine();
        System.out.println ("Servidor mensaje leido...");
        return mensaje;
    }
    public static void main(String args[]) {
        try {
            ServidorTCP servidor=new ServidorTCP(49171);
            servidor.inicio();
            servidor.abrirCanalesDeTexto();
            String mensajeRecibido=servidor.leerMensajeTexto();
            System.out.println ("Servidor mensaje recibido..."+mensajeRecibido);
            servidor.enviarMensajeTexto("hola, enviado de servidor a cliente");
            servidor.cerrarCanalesDeTexto();
            servidor.stop();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
