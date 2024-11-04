/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UT1;
import java.awt.Color;
import javax.swing.*;
/**
 *
 * @author pedro.rinpiz
 */
public class Ejercicio05 extends JFrame
{
    private JPanel panel;
    private JButton btn1, btn2;
   
    public Ejercicio05()
    {
        super("Ejercicio 5...");
        setBounds(0, 0, 800, 600);
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);
                
        panel = new JPanel();
        panel.setBounds(40, 80, 200, 200);
        panel.setBackground(Color.LIGHT_GRAY);
        
        btn1 = new JButton();
        btn1.setBackground(Color.YELLOW);
        
        btn2 = new JButton();
        btn2.setBackground(Color.GREEN);
        
        panel.add(btn1);
        panel.add(btn2);
        
        add(panel);
        this.setLayout(null);
      
    }
    public static void main(String[] ARGS)
    {
        Ejercicio05 miInterfaz = new Ejercicio05();
        miInterfaz.setVisible(true);
    }
    
}
