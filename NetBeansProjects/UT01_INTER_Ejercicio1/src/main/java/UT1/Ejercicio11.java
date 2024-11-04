/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UT1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author pedro.rinpiz
 */
public class Ejercicio11 extends JFrame implements ChangeListener
{
    private JCheckBox cbx1, cbx2, cbx3;
    
    public Ejercicio11()
    {
        super("Ejercicio 11");
        setLayout(null);
        setBounds(0, 0, 800, 600);
        
        cbx1 = new JCheckBox("Inglés");
        cbx1.setBounds(10, 10, 150, 30);
        cbx1.addChangeListener(this);
        add(cbx1);
        
        cbx2 = new JCheckBox("Francés");
        cbx2.setBounds(10, 50, 150, 30);
        cbx2.addChangeListener(this);
        add(cbx2);
        
        cbx3 = new JCheckBox("Alemán");
        cbx3.setBounds(10, 90, 150, 30);
        cbx3.addChangeListener(this);
        add(cbx3);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) 
    {
        Ejercicio11 eje11 = new Ejercicio11();
        eje11.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        String cad = "";
        
        if(cbx1.isSelected())
        {
            cad += cbx1.getText();
        }
        if(cbx2.isSelected())
        {
            cad += cbx2.getText();
        }
        if(cbx3.isSelected())
        {
            cad += cbx3.getText();
        }
          
        setTitle("Seleccionado " + cad);
    }
}
