package chattcp;
import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ServidorChat extends JFrame implements ActionListener {

    //El ServerSocket lo usamos para escuchar
    private static ServerSocket servidor;
    static final int PUERTO = 44444;// puerto por el que escucho
    static int CONEXIONES = 0;
    static int ACTUALES = 0;
    static int MAXIMO = 4;//MAXIMO DE CONEXIONES PERMITIDAS

    static JTextField txtmensaje = new JTextField("");
    private static JTextField conexionesMaximas = new JTextField("");
    static JTextArea textarea;
    private JScrollPane scrollpane1;
    private JButton salir = new JButton("Salir");
    //Un scocket para cada cliente que se conecta
    static Socket tabla[] = new Socket[MAXIMO];//para controlar las conexiones

    // Constructor
    public ServidorChat() {
        super(" VENTANA DEL SERVIDOR DE CHAT ");
        setLayout(null);
        txtmensaje.setBounds(10, 10, 400, 30);
        add(txtmensaje);
        txtmensaje.setEditable(false);

        conexionesMaximas.setBounds(10, 348, 400, 30);
        add(conexionesMaximas);
        conexionesMaximas.setEditable(false);

        textarea = new JTextArea();
        scrollpane1 = new JScrollPane(textarea);

        scrollpane1.setBounds(10, 50, 400, 300);
        add(scrollpane1);
        salir.setBounds(420, 10, 100, 30);
        add(salir);

        textarea.setEditable(false);
        salir.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    // accion cuando pulsamos boton
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == salir) { // SE PULSA SALIR
            try {
                servidor.close(); // cierro
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            System.exit(0);//
        }
    } //

    public static void main(String args[]) throws IOException {
        //1-INICIAMOS EL SERVIDOR
        servidor = new ServerSocket(PUERTO);
        
        //INTERFAZ
        ServidorChat pantallaServidor = new ServidorChat();
        pantallaServidor.setBounds(0, 0, 540, 400);
        pantallaServidor.setVisible(true);
        txtmensaje.setText("NUMERO DE CONEXIONES ACTUALES: " + CONEXIONES);

        // SE ADMITEN HASTA 4 CONEXIONES
        while (CONEXIONES < MAXIMO) {
            //2-Creamos un socket
            Socket socket = new Socket();
            try {
                socket = servidor.accept();// esperando cliente
            } catch (SocketException ns) {
                //sale por aqui si pulsamos boton salir y no se ejecuta todo el bucle			 
                break;
            } 
            tabla[CONEXIONES] = socket;
            CONEXIONES++;
            ACTUALES++;
            HiloServidor hiloSer= new HiloServidor(socket);
            hiloSer.start();
        }
        //Cuando finaliza bucle cerrar servidor
        if (!servidor.isClosed()) {
            try {
                // sale cuando se llega al maximo de conexiones	
                conexionesMaximas.setForeground(Color.red);
                conexionesMaximas.setText("MAXIMO NUMERO DE CONEXIONES ESTABLECIDAS: " + CONEXIONES);
                servidor.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
        System.out.println("Servidor finalizado...");
    }
}

