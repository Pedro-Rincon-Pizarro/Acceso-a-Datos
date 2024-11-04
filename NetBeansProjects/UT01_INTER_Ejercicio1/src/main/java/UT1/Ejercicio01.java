package UT1;
 
import javax.swing.JFrame;

public class Ejercicio01 extends JFrame{
    // Le agregamos todo a la ventana mediante el constructor.
    public Ejercicio01(){
        super("MI INTERFAZ CON JFRAME..."); // Le ponemos un titulo.
        this.setSize(1024,800); // Le damos un tamaño a la ventana.
        this.setResizable(false); // Que no se pueda redimensionar.
        this.setLocationRelativeTo(null); // Pone la ventana en el centro de la pantalla.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //  Hacemos que la ventana se cierre por default.
    }
    public static void main(String[] ARGS){
        Ejercicio01 MI_INTERFAZ = new Ejercicio01(); // Hacemos que se inicialice nuestra ventana JFrame.
        MI_INTERFAZ.setVisible(true); // Hace,ps qie nuestra ventana sea visible.
    }
}

//tiene menú contextual