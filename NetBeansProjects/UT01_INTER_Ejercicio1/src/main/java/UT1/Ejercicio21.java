/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UT1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author pedro.rinpiz
 */
public class Ejercicio21 extends JFrame implements ActionListener
{
    private JTabbedPane tpn;
    private JPanel panPage1, panPage2, panPage3;
    
    
    
    public Ejercicio21()
    {
        setLayout(null);
        setBounds(0,0,800, 600);
        tpn = new JTabbedPane();
        tpn.setBounds(50,50,700, 500);
        
        panPage1 = new JPanel();
        panPage1.add(new JLabel("Tab 1"));
        
        panPage2 = new JPanel();
        panPage2.add(new JLabel("Tab 2"));
        
        panPage3 = new JPanel();
        panPage3.add(new JLabel("Tab 3"));
        
        tpn.addTab("Tab 1", panPage1);
        tpn.addTab("Tab 2", panPage2);
        tpn.addTab("Tab 3", panPage3);
        
        add(tpn);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public static void main(String[] args)
    {
        Ejercicio21 eje21 = new Ejercicio21();
        eje21.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
