/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UT1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextPane;

/**
 *
 * @author pedro.rinpiz
 */
public class Ejercicio18 extends JFrame implements ActionListener
{
    //Menu de un hotel y le incluiremos un icono de un hotel(hotel.png) en la barra de menu
    //opciones: habitaciones, servicios y Extras
    //Habitaciones: individual, dobrel, suite
    //servicios: Alquiler bicis, parking
    //extras: salones, restaurante
    //a parte de JFrame vamos a incluir un JTextPane
    //al seleccionar una opcion tenemos que escribir en el JTextPane la opcion seleccionada
    
    JMenuBar mnb1 = new JMenuBar();
    JMenu mnu1, mnu2, mnu3, mnu4 ;
    JMenuItem mni1, mni2, mni3, mni4, mni5, mni6, mni7;
    JTextPane txtp1;
    
    public Ejercicio18()
    {
        super("Hotel");
        setBounds(10, 20, 800, 600);
        setLayout(null);
        setIconImage(new ImageIcon("./img/hotel.png").getImage());
        
        mnb1 = new JMenuBar();
        setJMenuBar(mnb1);
        
        mnu1 = new JMenu();
       
        mnb1.add(mnu1);
        
        mnu2 = new JMenu("Habitaciones");
        mnb1.add(mnu2);
        
        mni1 = new JMenuItem("Individual");
        mni1.addActionListener(this);
        mnu2.add(mni1);
        mni2 = new JMenuItem("Doble");
        mni2.addActionListener(this);
        mnu2.add(mni2);
        mni3 = new JMenuItem("Individual");
        mni3.addActionListener(this);
        mnu2.add(mni3);
        
        mnu3 = new JMenu("Servicios");
        mnb1.add(mnu3);
        
        mni4 = new JMenuItem("Alquiler Bicis");
        mni4.addActionListener(this);
        mnu3.add(mni4);
        mni5 = new JMenuItem("Parking");
        mni5.addActionListener(this);
        mnu3.add(mni5);
        
        mnu4 = new JMenu("Extras");
        mnb1.add(mnu4);
        
        mni6 = new JMenuItem("Salones");
        mni6.addActionListener(this);
        mnu4.add(mni6);
        mni7 = new JMenuItem("Restaurante");
        mni7.addActionListener(this);
        mnu4.add(mni7);
        
        txtp1 = new JTextPane();
        txtp1.setBounds(0, 0, 800, 600);
        add(txtp1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }

   
    @Override
    public void actionPerformed(ActionEvent e) 
    {
       if(e.getSource() == mni1)
       {
           txtp1.setText(mni1.getText());
       }
       else if(e.getSource() == mni2)
       {
           txtp1.setText(mni2.getText());
       }
       else if(e.getSource() == mni3)
       {
           txtp1.setText(mni3.getText());
       }
       else if(e.getSource() == mni4)
       {
           txtp1.setText(mni4.getText());
       }
       else if(e.getSource() == mni5)
       {
           txtp1.setText(mni5.getText());
       }
       else if(e.getSource() == mni6)
       {
           txtp1.setText(mni6.getText());
       }
       else if(e.getSource() == mni7)
       {
           txtp1.setText(mni7.getText());
       }
       
       
    }
    
     public static void main(String[] args) 
    {
        Ejercicio18 eje18 = new Ejercicio18();
        eje18.setVisible(true);
    }
    
    
    
}
