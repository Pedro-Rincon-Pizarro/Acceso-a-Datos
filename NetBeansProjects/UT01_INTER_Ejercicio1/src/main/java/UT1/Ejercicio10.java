/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UT1;

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
public class Ejercicio10 extends JFrame implements ActionListener
{
    private JLabel lbl1;
    private JComboBox cmb1, cmb2, cmb3;
    private JButton btn1;
    public Ejercicio10()
    {
        super("Ejercicio 10");
        setBounds(0, 0, 800, 600);
        
        cmb1 = new JComboBox<String>();
        cmb1.setBounds(120, 10, 100, 30);
        for(int i = 0; i <= 10; i++)
        {
            cmb1.addItem(String.valueOf(i));
        }
        
        add(cmb1);
        
        cmb2 = new JComboBox<String>();
        cmb2.setBounds(120, 50, 100, 30);
        for(int i = 0; i <= 10; i++)
        {
            cmb2.addItem(String.valueOf(i));
        }
        add(cmb2);
        
        cmb3 = new JComboBox<String>();
        cmb3.setBounds(120, 90, 100, 30);
        cmb3.addItem("Suma");
        cmb3.addItem("Resta");
        
        add(cmb3);
        
        btn1 = new JButton("Resultado");
        btn1.setBounds(10, 130, 100, 30);
        add(btn1);
        
        btn1.addActionListener(this);
        
        lbl1 = new JLabel("a");
        lbl1.setBounds(120, 170, 100, 30);
        add(lbl1);
    }
    
    public static void main(String[] args) 
    {
        Ejercicio10 eje10 = new Ejercicio10();
        eje10.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
       if(e.getSource() == btn1)
       {
          int num1, num2, resultado = 0;
          
          num1 = Integer.parseInt((String)cmb1.getSelectedItem());
          num2 = Integer.parseInt((String)cmb2.getSelectedItem());
          
          String operador;
          operador =(String)cmb3.getSelectedItem();
           switch (operador) 
           {
               case "Suma":
                   resultado = num1 + num2;
                   break;
               case "Resta":
                   resultado = num1 - num2;
                   break;
              
           }
          
          lbl1.setText("");
          lbl1.setText(Integer.toString(resultado));
       }
    }
}
