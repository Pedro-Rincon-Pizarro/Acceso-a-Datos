package UT1;
 
import javax.swing.JFrame;

import javax.swing.JLabel;

import java.awt.event.*;

import javax.swing.JButton;

import javax.swing.JTextField;
 


public class Ejercicio03 extends JFrame implements ActionListener{

    private JTextField txt1;

    private JButton btn1;

    private JLabel lbl1;

    // Le agregamos todo a la ventana mediante el constructor.

    public Ejercicio03(){

        super("EJERCICIO 4..."); // Le ponemos un titulo.

        this.setSize(600,400); // Le damos un tamaño a la ventana.

        this.setResizable(false); // Que no se pueda redimensionar.

        this.setLocationRelativeTo(null); // Pone la ventana en el centro de la pantalla.

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //  Hacemos que la ventana se cierre por default.

        // Añadir componentes al Frame.

        setLayout(null);

        lbl1 = new JLabel("Usuario:");

        lbl1.setBounds(10, 10, 100, 30);

        add(lbl1);

        txt1 = new JTextField();

        txt1.setBounds(120, 10, 150, 20);

        add(txt1);

        btn1 = new JButton("Aceptar");

        btn1.setBounds(10, 80, 100, 30);

        add(btn1);

        // Dar funciones al boton.

        btn1.addActionListener(this);
       

    }

    public static void main(String[] ARGS){

        Ejercicio03 MI_INTERFAZ = new Ejercicio03(); // Hacemos que se inicialice nuestra ventana JFrame.

        MI_INTERFAZ.setVisible(true); // Hace,ps qie nuestra ventana sea visible.

    }
 
    @Override

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btn1){

            String cad = "usuario: " + txt1.getText();

            this.setTitle(cad);

        }

    }

}
