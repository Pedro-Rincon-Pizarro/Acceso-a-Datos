/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UT1;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

/**
 *
 * @author pedro.rinpiz
 */
public class Ejercicio17 extends JFrame implements ActionListener
{
    private JMenuBar mnb1;
    private JMenuItem mni1, mni2, mni3, mni4;
    private JMenu mnu1, mnsu2, mnsu3;
    
    public Ejercicio17(){
        super("Ejercicio 15"); //Le ponemos titulo
        setBounds(10, 20, 800, 600);
        setLayout(null);

        mnb1 = new JMenuBar();
        setJMenuBar(mnb1);

        mnu1 = new JMenu("Opciones");
        mnb1.add(mnu1);
        
        mnsu2 = new JMenu("TamaÃ±o de la ventana");
        mnu1.add(mnsu2);
        
        mnu1.addSeparator();
        
        mnsu3 = new JMenu("Color de fondo");
        mnu1.add(mnsu3);

        mni1 = new JMenuItem("640x480");
        mni1.setAccelerator(KeyStroke.getKeyStroke("ctrl"+" "+"A"));
        mni1.addActionListener(this);
        mnsu2.add(mni1);

        mni2 = new JMenuItem("1024x768");
        mni2.setAccelerator(KeyStroke.getKeyStroke("ctrl"+" "+"B"));
        mni2.addActionListener(this);
        mnsu2.add(mni2);
        
        mni3 = new JMenuItem("Verde");
        mni3.setAccelerator(KeyStroke.getKeyStroke("ctrl"+" "+"T"));
        mni3.addActionListener(this);
        mnsu3.add(mni3);
        
        mni4 = new JMenuItem("Rojo");
        mni4.setAccelerator(KeyStroke.getKeyStroke("ctrl"+" "+"Y"));
        mni4.addActionListener(this);
        mnsu3.add(mni4);
        
        
        

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }  
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Container f = this.getContentPane();
        
        if(e.getSource() == mni1){
            setSize(640, 480);
        }
        else if(e.getSource() == mni2){
            setSize(1024, 768);
        }

        if (e.getSource() == mni3) {
            f.setBackground(Color.GREEN);
        }

        else if (e.getSource() == mni4) {
            f.setBackground(Color.RED);
        }
    }
    
        public static void main(String[] args) {

       Ejercicio17 eje17 = new Ejercicio17();
       eje17.setVisible(true);
    }

    
}
