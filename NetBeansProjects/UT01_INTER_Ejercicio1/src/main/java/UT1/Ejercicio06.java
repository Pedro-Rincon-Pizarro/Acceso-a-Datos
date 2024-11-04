/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UT1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author pedro.rinpiz
 */
public class Ejercicio06 extends JFrame
{
    private JPanel panel = new JPanel();
    private JButton btn1 = new JButton();

    public Ejercicio06()
    {
        panel.setBounds(50, 50, 300, 300);
        panel.setBackground(Color.LIGHT_GRAY);
        
        btn1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                panel.setBackground(Color.ORANGE);
            }
        });
              
        panel.add(btn1);
        
        this.add(panel);
        this.setSize(400, 400);
                   
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
    }
    
    public static void main(String[] ARGS)
    {
        Ejercicio06 miInterfaz = new Ejercicio06();
        miInterfaz.setVisible(true);
    }
}
