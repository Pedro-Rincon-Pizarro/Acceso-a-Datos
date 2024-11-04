/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UT1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author pedro.rinpiz
 */
public class Ejercicio16 extends JFrame implements ActionListener
{
     private JMenuBar mnb1;
    private JMenuItem mni1, mni2, mni3, mni4;
    private JMenu mnu1, mnu2;
    
    public Ejercicio16(){
        super("Ejercicio 16"); //Le ponemos titulo
        setBounds(10, 20, 800, 600);
        setLayout(null);

        mnb1 = new JMenuBar();
        setJMenuBar(mnb1);

        mnu1 = new JMenu("Archivo");
        mnb1.add(mnu1);
        
        mnu2 = new JMenu("Editar");
        mnb1.add(mnu2);

        mni1 = new JMenuItem("Abrir");
        mni1.addActionListener(this);
        mnu1.add(mni1);

        mni2 = new JMenuItem("Guardar");
        mni2.addActionListener(this);
        mnu1.add(mni2);

        mni3 = new JMenuItem("Cargar");
        mni3.addActionListener(this);
        mnu1.add(mni3);
        
        mni4 = new JMenuItem("Salir");
        mni4.addActionListener(this);
        mnu1.add(mni4);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }  
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
        public static void main(String[] args) {

       Ejercicio16 eje16 = new Ejercicio16();
       eje16.setVisible(true);
    }

    public void setJMenuBar(JMenuBar mnb1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setLayout(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setBounds(int i, int i0, int i1, int i2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
