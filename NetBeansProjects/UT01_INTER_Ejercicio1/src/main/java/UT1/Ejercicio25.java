/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UT1;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;


/**
 *
 * @author pedro.rinpiz
 */
public class Ejercicio25  extends JFrame 
{ 
    private CustomDesktopPane desktopPane;
    private Container contentPane;
    public Ejercicio25() {  
        setTitle("Ejemplo de JDesktopPane");  
        setSize(400, 400);
        
        desktopPane= new CustomDesktopPane();  
        contentPane= getContentPane();  
        
        contentPane.add(desktopPane, BorderLayout.CENTER);  
        desktopPane.mostrarVentanas(desktopPane);  

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }  

    public static void main(String args[]) 
    {  
        Ejercicio25 ej24=new Ejercicio25(); 
        ej24.setVisible(true);  
    }  
}  

// Clase que extiende JDesktopPane para manejar ventanas internas
class CustomDesktopPane extends JDesktopPane {  
    int numFrames = 3, x = 30, y = 30;  

    public void mostrarVentanas(CustomDesktopPane dp) {  
        for (int i = 0; i < numFrames; ++i) {  
            // Crear una JInternalFrame
            JInternalFrame jframe = new JInternalFrame("Ventana Interna " + (i + 1), true, true, true, true);  
            jframe.setBounds(x, y, 250, 85);  

            // Agregar contenido a la ventana interna
            Container c1 = jframe.getContentPane();  
            c1.add(new JLabel("Este es el contenido de la ventana " + (i + 1)));  

            // Añadir la ventana interna al JDesktopPane
            dp.add(jframe);  
            jframe.setVisible(true);  

            // Cambiar la posición para la siguiente ventana
            y += 100;  
        }  
    }  
}

