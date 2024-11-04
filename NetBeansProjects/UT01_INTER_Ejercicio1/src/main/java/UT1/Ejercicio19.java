/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UT1;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author pedro.rinpiz
 */
public class Ejercicio19 extends JFrame implements ChangeListener
{
    private JSlider jsl;
    private JTextField txtf;
    private JLabel lbl;
    
    public Ejercicio19()
        {
            super("Ejercicio 19");
            setLayout(null);
            setBounds(0, 0, 800, 600);
            
            txtf  = new JTextField();
            txtf.setBounds(40, 10, 200, 30);
            add(txtf);
            
           
            
            
            jsl  = new JSlider(0,200,100);
            jsl.setBounds(40, 90, 400, 300);
            add(jsl);
            
            jsl.setPaintTrack(true);
            jsl.setPaintTicks(true);
            jsl.setPaintLabels(true);
            
            jsl.setMajorTickSpacing(50);
            jsl.setMinorTickSpacing(10);
            
            jsl.addChangeListener(this);
            
            txtf.setText(Integer.toString(jsl.getValue()));
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
    
    
    public static void main(String[] args) 
    {
        Ejercicio19 eje19 = new Ejercicio19();
        eje19.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e)
    {
        if(e.getSource() == jsl)
        {
            txtf.setText(Integer.toString(jsl.getValue()));
        }
    }
    
}
