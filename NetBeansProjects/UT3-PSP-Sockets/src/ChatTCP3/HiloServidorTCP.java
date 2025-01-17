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

public class HiloServidorTCP extends Thread {

    DataOutputStream flujoSalida;
    DataInputStream flujoEntrada;
    Socket socket = null;
    int numCli;

    public HiloServidorTCP(Socket s, DataInputStream input, DataOutputStream output, int i) throws IOException {
        socket = s;
        numCli = i;
        flujoEntrada = input;
        flujoSalida = output;
    }

    public void run() {
        // Tarea a realizar con el cliente	
        try {
            flujoSalida.writeUTF("Bienvenido cliente número " + numCli);
            System.out.println(flujoEntrada.readUTF());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
