/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UT1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author pedro.rinpiz
 */
public class Ejercicio09 extends JFrame implements ActionListener
{
    //Atributos
    private JLabel lbl1, lbl2, lbl3;
    private JComboBox cmb1, cmb2, cmb3;
    private JButton btn1;
    
     
    public Ejercicio09()
    {
        super("Ejercicio 9");
        setLayout(null);
        setBounds(0, 0, 800, 600);

        lbl1 = new JLabel("Rojo");
        lbl1.setBounds(10, 10, 100, 30);
        add(lbl1);

        cmb1 = new JComboBox<String>();
        cmb1.setBounds(120, 10, 100, 30);
        for(int i = 0; i <= 255; i++)
        {
            cmb1.addItem(String.valueOf(i));
        }
        add(cmb1);
        
        lbl2 = new JLabel("Amarillo");
        lbl2.setBounds(10, 50, 100, 30);
        add(lbl2);
        
        cmb2 = new JComboBox<String>();
        cmb2.setBounds(120, 50, 100, 30);
        for(int i = 0; i <= 255; i++)
        {
            cmb2.addItem(String.valueOf(i));
        }
        add(cmb2);
        
        lbl3 = new JLabel("Azul");
        lbl3.setBounds(10, 90, 100, 30);
        add(lbl3);
        
        cmb3 = new JComboBox<String>();
        cmb3.setBounds(120, 90, 100, 30);
        for(int i = 0; i <= 255; i++)
        {
            cmb3.addItem(String.valueOf(i));
        }
        add(cmb3);
        
        btn1 = new JButton("Fijar Color");
        btn1.setBounds(10, 130, 100, 30);
        add(btn1);
    }
    
     public static void main(String[] args) 
    {
        Ejercicio09 eje9 = new Ejercicio09();
        eje9.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == btn1)
        {
            
            String cad1 = (String)cmb1.getSelectedItem();
            String cad2 = (String)cmb2.getSelectedItem();
            String cad3 = (String)cmb3.getSelectedItem();
            
            int rojo = Integer.parseInt(cad1);
            int amarillo = Integer.parseInt(cad2);
            int azul = Integer.parseInt(cad3);
            
            Color color1 = new Color(rojo, amarillo, azul);
            btn1.setBackground(color1);
        }
    }
    
    
   

    

    
}
