package chatudp;


import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

public class MultiChatUDP extends JFrame implements ActionListener, Runnable {

    private static MulticastSocket ms = null;
    private static byte[] buf = new byte[1000];
    private static InetAddress grupo = null;
    private static int Puerto = 12345;// Puerto multicast
    //Mandan a un grupo entero
    //Hay que unirse a un grupo multicast
   
    private boolean repetir = true;
    private String nombre;

    private JTextField txtmensaje = new JTextField();
    private JScrollPane scrollpane1;
    private JTextArea textarea1;
    private JButton btnEnviar = new JButton("Enviar");
    private JButton btnDesconectar = new JButton("Salir");
    

    // constructor
    public MultiChatUDP(String nom) {
        super(" VENTANA DE CHAT UDP - Nick: " + nom);
        setLayout(null);
        this.nombre = nom;
        txtmensaje.setBounds(10, 10, 400, 30);
        add(txtmensaje);
        textarea1 = new JTextArea();
        scrollpane1 = new JScrollPane(textarea1);
        scrollpane1.setBounds(10, 50, 400, 300);
        add(scrollpane1);
        btnEnviar.setBounds(420, 10, 100, 30);
        add(btnEnviar);
        btnDesconectar.setBounds(420, 50, 100, 30);
        add(btnDesconectar);

        textarea1.setEditable(false);
        btnEnviar.addActionListener(this);
        btnDesconectar.addActionListener(this);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

    }

    // accion cuando pulsamos botones
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnEnviar) { // SE PULSA EL ENVIAR
            String texto = nombre + ">> " + txtmensaje.getText();
            try {
                //ENVIANDO mensaje al grupo
                DatagramPacket paquete = new DatagramPacket(texto.getBytes(), texto.length(), grupo, Puerto);
                ms.send(paquete);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            txtmensaje.setText("");
        }
        if (e.getSource() == btnDesconectar) { // SE PULSA DESCONECTAR
            String texto = "*** Abandona el chat: " + nombre + " ***";
            try {
                //ENVIANDO DESPEDIDA AL GRUPO
                DatagramPacket paquete = new DatagramPacket(texto.getBytes(), texto.length(), grupo, Puerto);
                ms.send(paquete);
                ms.leaveGroup(grupo);
                ms.close();
                repetir = false;
                System.out.println("Abandona el chat: " + nombre);
                
                System.exit(0);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }

    // DESDE EL METODO RUN SE RECIBEN LOS MENSAJES Y SE PINTAN EN LA PANTALLA
    public void run() {
        while (repetir) {
            try {
                DatagramPacket p = new DatagramPacket(buf, buf.length);
                ms.receive(p);
                String texto = new String(p.getData(), 0, p.getLength());
                textarea1.append(texto + "\n");
            } catch (SocketException s) {
                System.out.println(s.getMessage());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }// run

    public static void main(String args[]) throws IOException {
        String nombre = JOptionPane.showInputDialog("Introduce tu nickname:");
        // Se crea el socket multicast
        ms = new MulticastSocket(Puerto);
        grupo = InetAddress.getByName("225.0.0.1");// Grupo
        // Nos unimos al grupo
        ms.joinGroup(grupo);
        if (!nombre.trim().equals("")) {
            MultiChatUDP server = new MultiChatUDP(nombre);
            server.setBounds(0, 0, 540, 400);
            server.setVisible(true);
            new Thread(server).start();
        } else {
            System.out.println("El nombre esta vacio....");
        }
    }// main
}//MultiChatUDP