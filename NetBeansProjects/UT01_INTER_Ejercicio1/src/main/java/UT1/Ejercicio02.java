package UT1;
 
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejercicio02 extends JFrame{
    // Declaramos las Label.
    private JLabel lbl1;
    private JLabel lbl2;
    // Le agregamos todo a la ventana mediante el constructor.
    public Ejercicio02(){
        super("EJERCICIO 2..."); // Le ponemos un titulo.
        this.setSize(600,400); // Le damos un tamaño a la ventana.
        this.setResizable(false); // Que no se pueda redimensionar.
        this.setLocationRelativeTo(null); // Pone la ventana en el centro de la pantalla.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //  Hacemos que la ventana se cierre por default.
        // Agregamos.
        lbl1 = new JLabel("Alumnos de DAM2");
        lbl1.setBounds(10, 20, 300, 30);
        add(lbl1);
        lbl2 = new JLabel("Aula Ateca");
        lbl2.setBounds(10, 100, 100, 30);
        add(lbl2);
    }
    public static void main(String[] ARGS){
        Ejercicio02 MI_INTERFAZ = new Ejercicio02(); // Hacemos que se inicialice nuestra ventana JFrame.
        MI_INTERFAZ.setVisible(true); // Hace,ps qie nuestra ventana sea visible.
    }
}