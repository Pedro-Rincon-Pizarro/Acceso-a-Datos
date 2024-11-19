/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miBoton2;

import componenteBoton.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.basic.BasicBorders;

public class MiCuadrodeTextoFrm extends JTextField implements FocusListener{

    public MiCuadrodeTextoFrm(){
        super();
        setBorder(new BordeRedondeado(true));
        setBackground(Color.WHITE);
        setForeground(Color.BLACK);
        setFont(new Font("Tahoma", Font.PLAIN, 14));

        
        addFocusListener(this);
    }
    
    @Override
    public void focusGained(FocusEvent e) {
        setBackground(Color.gray);
    }

    @Override
    public void focusLost(FocusEvent e) {
        setBackground(Color.WHITE);
    }
 
    
}
