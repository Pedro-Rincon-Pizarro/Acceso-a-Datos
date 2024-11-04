/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UT1;

import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

/**
 *
 * @author pedro.rinpiz
 */
public class Ejercicio22 extends JFrame implements ActionListener
{
    
    private JTabbedPane tpn;
    private JButton btnTab, btnRemove;
    private JPanel pan, panNew;
    private int contador;
    private JTextArea txtA1;
    
    
    public Ejercicio22()
    {
        setLayout(null);
        setBounds(0, 0, 800, 600);
        
        tpn = new JTabbedPane();
        tpn.setBounds(70, 70, 500, 300);
        
        btnTab = new JButton("Añadir");
        btnTab.addActionListener(this);
        btnTab.setBounds(350, 30, 100, 30);
        add(btnTab);
        
        btnRemove = new JButton("Eliminar");
        btnRemove.addActionListener(this);
        btnRemove.setBounds(150, 30, 100, 30);
        add(btnRemove);
        
        pan = new JPanel();
        pan.setLayout(null);
        txtA1 = new JTextArea();
        txtA1.setBounds(0, 0, 500, 300);
        pan.add(txtA1);
        
        tpn.addTab("TAB 1", pan);
        
        
        contador = 1;
        add(tpn);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
     
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource() == btnTab)
        {
            panNew = new JPanel();
            contador++;
            tpn.add("TAB " + contador, panNew);
        }
        if(e.getSource() == btnRemove)
        {
            int selectedIndex = tpn.getSelectedIndex();
            if(selectedIndex != -1)
            {
                tpn.removeTabAt(selectedIndex);
                
                contador--;
            }
            
            
        }
    }
    
    public static void main(String[] args) 
    {
        Ejercicio22 eje22 = new Ejercicio22();
        eje22.setVisible(true);
    }
    
}
