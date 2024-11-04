/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UT1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author pedro.rinpiz
 */
public class Ejercicio14 extends JFrame implements ChangeListener, ActionListener
{
    private ButtonGroup bg1;
    private JRadioButton jrb1, jrb2, jrb3;
    private JButton btn1;
    private JLabel lbl1;
    private String texto;
    
    
    public Ejercicio14()
    {
        setLayout(null);
        setBounds(0, 0, 800, 600);
        
        bg1 = new ButtonGroup();
        jrb1 = new JRadioButton("Rojo ");
        jrb1.setBounds(10, 20, 100, 30);
        jrb1.addChangeListener(this);
        add(jrb1);
        bg1.add(jrb1);
        
        jrb2 = new JRadioButton("Verde ");
        jrb2.setBounds(10, 70, 100, 30);
        jrb2.addChangeListener(this);
        add(jrb2);
        bg1.add(jrb2);
        
        jrb3 = new JRadioButton("Azul ");
        jrb3.setBounds(10, 120, 100, 30);
        jrb3.addChangeListener(this);
        add(jrb3);
        bg1.add(jrb3);
        
        btn1 = new JButton("Aceptar");
        btn1.setBounds(10, 170, 100, 30);
        btn1.addActionListener(this);
        add(btn1);
        
        lbl1 = new JLabel();
        lbl1.setBounds(10, 220, 200, 30);
        add(lbl1);
    }

    @Override
    public void stateChanged(ChangeEvent e) 
    {
       if(jrb1.isSelected())
       {
           texto = jrb1.getText();
       }
       if(jrb2.isSelected())
       {
           texto = jrb2.getText();
       }
       if(jrb3.isSelected())
       {
          texto = jrb3.getText();
       }
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == btn1)
        {
            lbl1.setText("Color seleccionado: " + texto);
        }
    }
    public static void main(String[] args)
    {
        Ejercicio14 eje14 = new Ejercicio14();
        eje14.setVisible(true);
    }
}
