/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UT1;

import UT1.util.JDesktopPanePersonalizado;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;

/**
 *
 * @author pedro.rinpiz
 */
public class Ejercicio24 extends JFrame
{
    private JDesktopPanePersonalizado escritorio;
    
    public Ejercicio24()
    {
        super("Ejercicio 24");
        setLayout(null);
        setBounds(0, 0, 900, 700);
        escritorio = new JDesktopPanePersonalizado("a.jpg");
        
        setContentPane(escritorio);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) 
    {
        Ejercicio24 ej24 = new Ejercicio24();
        ej24.setVisible(true);
    }
}
