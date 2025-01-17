/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChatTCP3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClienteTCP {

    public static void main(String[] args) throws UnknownHostException, IOException {

        // Crear socket cliente
        Socket cliente = new Socket("localhost", 6000);

        // Crear flujo entrada
        DataInputStream input = new DataInputStream(cliente.getInputStream());
        String mensaje = input.readUTF();
        System.out.println(mensaje);

        // Crear flujo salida
        DataOutputStream output = new DataOutputStream(cliente.getOutputStream());
        output.writeUTF("Mensaje recibido y devuelto " + mensaje);

        // Cerrar streams y sockets
        input.close();
        output.close();
        cliente.close();
    }
}
