/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UT1;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

/**
 *
 * @author pedro.rinpiz
 */
public class Ejercicio27 extends JFrame
{
    private JPanel pan1, pan2;
    private JSplitPane spp;
    public Ejercicio27()
    {
        setBounds(0, 0, 800, 600);
        getContentPane().setLayout(new FlowLayout());
        
        String[] opciones1 = {"Bird", "Cat", "Dog", "Rabbit", "Pig"};
        JComboBox<String> combobox1 = new JComboBox<>(opciones1);
        
        String[] opciones2 = {"Car", "Motorcycle", "Airplane", "Boat"};
        JComboBox<String> combobox2 = new JComboBox<>(opciones2);
        
        pan1 = new JPanel();
        pan1.setBackground(Color.CYAN);
        pan1.add(combobox1);
        
        pan2 = new JPanel();
        pan2.setBackground(Color.YELLOW);
        pan2.add(combobox2);
        
        spp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, pan1, pan2);
        
        spp.setDividerSize(2);
        spp.setDividerLocation(0.5);
        getContentPane().add(spp);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) 
    {
        Ejercicio27 e27 = new Ejercicio27();
        e27.setVisible(true);
    }
}
