/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UT1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author pedro.rinpiz
 */
public class Ejercicio12 extends JFrame implements ChangeListener, ActionListener
{
    private final JLabel lbl1;
    private final JCheckBox cbx1;
    private final JButton btn1;
    
    public Ejercicio12()
    {
        super("Ejercicio 12");
        setLayout(null);
        setBounds(0, 0, 350, 200);
        
        lbl1 = new JLabel("Está de acuerdo con el servicio?");
        lbl1.setBounds(10, 10, 400, 30);
        add(lbl1);
        
        cbx1 = new JCheckBox("Acepto");
        cbx1.setBounds(10, 50, 100, 30);
        cbx1.addChangeListener(this);
        add(cbx1);
        
        btn1 = new JButton("Aceptar");
        btn1.setBounds(10, 90, 400, 30);
        btn1.addActionListener(this);
        add(btn1);
    }

    
    @Override
    public void stateChanged(ChangeEvent e) 
    {
       if(cbx1.isSelected())
       {
           btn1.setEnabled(true);
       }
       else
       {
           btn1.setEnabled(false);
       }
    }
    
    public static void main(String[] args) 
    {
     Ejercicio12 eje12 = new Ejercicio12();
     eje12.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn1)
        {
            System.exit(0);
        }
    }
}
