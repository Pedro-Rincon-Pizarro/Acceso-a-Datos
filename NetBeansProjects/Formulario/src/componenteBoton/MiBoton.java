/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componenteBoton;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;

/**
 *
 * @author pedro.rinpiz
 */
public class MiBoton extends JButton implements MouseListener{
    
    public MiBoton(){
        super();
        setFont(new Font("Tahoma", 1, 12));
        setForeground(Color.white);
        setBackground(new Color(127,255,212));
        setBorder(null);
        addMouseListener(this);
    }
    
    
    @Override
    public void mouseClicked(MouseEvent e) {
        
        String eti = "";
        
        if(e.getButton() == MouseEvent.BUTTON1){
            eti = "Izquierdo";
            System.out.println("Ha pulsado el boton del raton " + eti);
        }else if( e.getButton() == MouseEvent.BUTTON3){
            eti = "Derecho";
            System.out.println("Ha pulsado el boton del raton " + eti);
        }
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        String et = "";
        if(e.getButton() == MouseEvent.BUTTON1)
        {
            et = "Izquierdo";
            System.out.println("Boton " + et + " presionado");
        }else if( e.getButton() == MouseEvent.BUTTON3)
        {
            et = "Derecho";
            System.out.println("Boton " + et + " presionado");
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        String et = "";
        if(e.getButton() == MouseEvent.BUTTON1){
            et = "Izquierdo";
            System.out.println("Boton " + et + " Soltado");
        }else if( e.getButton() == MouseEvent.BUTTON3){
            et = "Derecho";
            System.out.println("Boton " + et + " Soltado");
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        setBackground(Color.pink);
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        setBackground(new Color(127,255,212));
    }
}
