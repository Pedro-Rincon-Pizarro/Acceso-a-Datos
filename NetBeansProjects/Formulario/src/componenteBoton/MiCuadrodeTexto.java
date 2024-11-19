/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package componenteBoton;

/**
 *
 * @author pedro.rinpiz
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MiCuadrodeTexto extends JTextField implements FocusListener{

    public MiCuadrodeTexto(){
        super();
        setBorder(null);
        setBackground(Color.WHITE);
        setForeground(Color.BLACK);
         setFont(new Font("Tahoma", 1, 12));
    }
    
    @Override
    public void focusGained(FocusEvent e) {
        setBackground(Color.orange);
    }

    @Override
    public void focusLost(FocusEvent e) {
        setBackground(Color.WHITE);
    }
 
    
}