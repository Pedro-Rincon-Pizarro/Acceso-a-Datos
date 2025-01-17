package chattcp;
import java.io.*;
import java.net.*;

public class HiloServidor extends Thread 
{
    private DataInputStream fentrada;
    private Socket socket = null;
    public HiloServidor(Socket s)
    {
        socket = s;
        try 
        {
            // CREO FLUJO DE entrada para leer los mensajes
            fentrada = new DataInputStream(socket.getInputStream());
        } 
        catch (IOException e) 
        {
            System.out.println("ERROR DE E/S");
            e.printStackTrace();
        }
    }

    public void run() 
    {
        ServidorChat.txtmensaje.setText("NUMERO DE CONEXIONES ACTUALES: "+ ServidorChat.ACTUALES);
        // NADA MAS CONECTARSE LE ENVIO TODOS LOS MENSAJES
        String texto = ServidorChat.textarea.getText();
        EnviarMensajes(texto);

        while (true) 
        {
            String cadena = "";
            try 
            {
                cadena = fentrada.readUTF();
                //EXAMEN-PEDIR COMNFIRMACION PARA SALIR AL CLIENTE
                //SI AL SERVIDOR LE LLEGA ASTERISCO
                //LE LLEGA INTENCION DE SALIR
                if (cadena.trim().contains("*")) 
                {
                    // CUANDO UN CLIENTE SE DESCONECTA RECIBO *
                    ServidorChat.ACTUALES--;
                    ServidorChat.txtmensaje.setText("NUMERO DE CONEXIONES ACTUALES: "+ ServidorChat.ACTUALES);// Datos.getConexiones());
                    break;
                }
                ServidorChat.textarea.append(cadena + "\n");
                texto = ServidorChat.textarea.getText();
                EnviarMensajes(texto);
            } 
            catch (Exception e) 
            {
                e.printStackTrace();
                break;
            }
        }
    }//run
    // ENVIA LOS MENSAJES DEL TEXTAREA A LOS CLIENTES DEL CHAT

    private void EnviarMensajes(String texto) 
    {
        int i;
        //recorremos tabla de sockets para enviarles los mensajes
        for (i = 0; i < ServidorChat.CONEXIONES; i++) 
        {
            Socket s1;
            s1 = ServidorChat.tabla[i];
            try 
            {
                DataOutputStream fsalida2 = new DataOutputStream(
                        s1.getOutputStream());
                fsalida2.writeUTF(texto);
            } 
            catch (SocketException se) 
            {//hay que dejarlo
                // puede ocurrir cuando finalizo cliente
                // sale cuando un cliente ha finalizado
                System.out.println(" SOCKET EXCEPTION 2 : " + se.getMessage());
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
                //System.out.println(" IO EXCEPTION  : " + e.getMessage());
            }
        }//for
    }//EnviarMensajes
}// ..HiloServidor
