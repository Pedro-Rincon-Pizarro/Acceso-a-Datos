/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UT1;

import javax.swing.*;


/**
 *
 * @author pedro.rinpiz
 */
public class Ejercicio08 extends JFrame
{
    private JTextField txt1 = new JTextField();
    private JScrollPane scp1 = new JScrollPane();
    private JTextArea txa1 = new JTextArea();
    
    public Ejercicio08()
    {
        super("Ejercico 8...");
        setLayout(null);
        setBounds(0, 0, 800, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        txt1.setBounds(10, 10, 200, 30);
        add(txt1);
        
        txa1.setBounds(10, 50, 400, 300);
        add(txa1);
        
        scp1.setBounds(10, 50, 400, 300);
        
        add(scp1);
        
    }
}
