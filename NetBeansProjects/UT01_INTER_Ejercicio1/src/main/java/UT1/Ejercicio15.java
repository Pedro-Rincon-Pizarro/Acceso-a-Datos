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

/**
 *
 * @author pedro.rinpiz
 */
public class Ejercicio15 extends JFrame implements ActionListener 
{
    private JMenuBar mnb1;
    private JMenuItem mni1, mni2, mni3;
    private JMenu mnu1;

    //Constructor
    public Ejercicio15() {
        super("Ejercicio 15"); //Le ponemos titulo
        setBounds(10, 20, 800, 600);
        setLayout(null);

        mnb1 = new JMenuBar();
        setJMenuBar(mnb1);

        mnu1 = new JMenu("Opciones");
   
     mnb1.add(mnu1);

        mni1 = new JMenuItem("Azul");
        mni1.addActionListener(this);
        mnu1.add(mni1);

        mni2 = new JMenuItem("Verde");
        mni2.addActionListener(this);
        mnu1.add(mni2);

        mni3 = new JMenuItem("Rojo");
        mni3.addActionListener(this);
        mnu1.add(mni3);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Container f = this.getContentPane();

        if (e.getSource() == mni1) {
            f.setBackground(Color.BLUE);
        }

        if (e.getSource() == mni2) {
            f.setBackground(Color.GREEN);
        }

        if (e.getSource() == mni3) {
            f.setBackground(Color.RED);
        }
    }

    public static void main(String[] args) {

       Ejercicio15 eje15 = new Ejercicio15();
       eje15.setVisible(true);
    }
}

