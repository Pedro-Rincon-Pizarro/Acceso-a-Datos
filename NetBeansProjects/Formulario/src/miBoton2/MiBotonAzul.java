/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miBoton2;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;

/**
 *
 * @author pedro.rinpiz
 */
public class MiBotonAzul extends JButton implements MouseListener{
    
    public MiBotonAzul(){
        super();
        setFont(new Font("Nirmala IU", Font.BOLD, 18));
        setForeground(Color.white);
        setBackground(new Color(50,108,168));
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
        this.setBackground(new Color(65,153,242));
        this.setCursor(new Cursor(Cursor.HAND_CURSOR) {
        });
        
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.setBackground(new Color(50,108,168));
        this.setCursor(new Cursor(Cursor.HAND_CURSOR) {
        });
    }
}
