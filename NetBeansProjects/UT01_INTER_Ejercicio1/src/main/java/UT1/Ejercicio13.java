/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UT1;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author pedro.rinpiz
 */
public class Ejercicio13 extends JFrame implements ChangeListener
{
    private JRadioButton jrb1, jrb2, jrb3;
    private ButtonGroup btg1;
    
    public Ejercicio13()
    {
        setLayout(null);
        setBounds(0, 0, 350, 230);
        
        btg1 = new ButtonGroup();
        jrb1 = new JRadioButton("640*480");
        jrb1.setBounds(10, 20, 100, 30);
        jrb1.addChangeListener(this);
        add(jrb1);
        btg1.add(jrb1);
        
        jrb2 = new JRadioButton("800*600");
        jrb2.setBounds(10, 70, 100, 30);
        jrb2.addChangeListener(this);
        add(jrb2);
        btg1.add(jrb2);
        
        jrb3 = new JRadioButton("1024*768");
        jrb3.setBounds(10, 120, 100, 30);
        jrb3.addChangeListener(this);
        add(jrb3);
        btg1.add(jrb3);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void stateChanged(ChangeEvent e) 
    {
        if(jrb1.isSelected())
        {
            setSize(640, 480);
        }
        if(jrb2.isSelected())
        {
            setSize(640, 480);
        }
        if(jrb3.isSelected())
        {
            setSize(640, 480);
        }
    }
    
    public static void main(String[] args) 
    {
        Ejercicio13 eje13 = new Ejercicio13();
        eje13.setVisible(true);
    }
}
