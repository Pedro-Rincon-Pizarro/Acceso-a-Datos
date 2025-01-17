package chattcp;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

public class ClienteChat extends JFrame implements ActionListener {
    //atributos
    Socket socket = null;
    // streams
    DataInputStream fentrada;
    DataOutputStream fsalida;
    String nickName;
    
    private static final long serialVersionUID = 1L;
    JTextField txtmensaje = new JTextField();
    JTextArea textarea1;
    JScrollPane scrollpane1;
    JButton boton = new JButton("Enviar");
    JButton desconectar = new JButton("Salir");
    boolean repetir = true;

    //constructor 
    public ClienteChat(Socket s, String nick) {
        super(" CONEXION DEL CLIENTE CHAT: " + nick);
        setLayout(null);

        txtmensaje.setBounds(10, 10, 400, 30);
        add(txtmensaje);

        textarea1 = new JTextArea();
        scrollpane1 = new JScrollPane(textarea1);
        scrollpane1.setBounds(10, 50, 400, 300);
        add(scrollpane1);
        boton.setBounds(420, 10, 100, 30);
        add(boton);
        desconectar.setBounds(420, 50, 100, 30);
        add(desconectar);

        textarea1.setEditable(false);
        boton.addActionListener(this);
        desconectar.addActionListener(this);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        socket = s;
        this.nickName = nick;
        try {
            fentrada = new DataInputStream(socket.getInputStream());
            // CREO FLUJO DE SALIDA AL socket de escritura
            fsalida = new DataOutputStream(socket.getOutputStream());
            String texto = nick + "> Entra en el Chat... ";
            fsalida.writeUTF(texto);
        } catch (IOException e) {
            System.out.println("ERROR DE E/S");
            e.printStackTrace();
            System.exit(0);
        }
    }
    
    public static void main(String args[]) {
        int puerto = 44444;
        String dirServidor = "localhost";
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre o nick:");
        Socket s = null;
        
        try {
             // Creacion del socket, y la conexion a la maquina remota con dir IP
             // Socket s = new Socket(dirServidor, Servidor.PUERTO);
            s = new Socket(dirServidor, puerto);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null,
                    "IMPOSIBLE CONECTAR CON EL SERVIDOR\n" + e.getMessage(),
                    "<<MENSAJE DE ERROR:1>>", JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        if (!nombre.trim().equals("")) {
            ClienteChat cliente = new ClienteChat(s, nombre);
            cliente.setBounds(0, 0, 540, 400);
            cliente.setVisible(true);
            cliente.ejecutar();
        } else {
            System.out.println("El nombre esta vacio....");
        }
    }
    
    

    // accion cuando pulsamos botones
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boton) { 
            // SE PULSA EL ENVIAR
            String texto = nickName + "> " + txtmensaje.getText();
            try {
                txtmensaje.setText("");
                fsalida.writeUTF(texto);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
        if (e.getSource() == desconectar) { 
            // SE PULSA DESCONECTAR
            String texto =  nickName+"-> Abandona el chat.";
            try {
                fsalida.writeUTF(texto);
                fsalida.writeUTF("*");
                repetir = false;
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }

    //
    public void ejecutar() {
        String texto = "";
        while (repetir) {
            try {
                //Leer en el socket
                texto = fentrada.readUTF();
                textarea1.setText(texto);
            } catch (IOException e) {
                // este error sale cuando el servidor se cierra
                JOptionPane.showMessageDialog(null, "IMPOSIBLE CONECTAR CON EL SERVIDOR\n" + e.getMessage(), "<<MENSAJE DE ERROR:2>>", JOptionPane.ERROR_MESSAGE);
                // System.exit(0);
                repetir = false;
            }
        }

        try {
            socket.close();
            System.exit(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
