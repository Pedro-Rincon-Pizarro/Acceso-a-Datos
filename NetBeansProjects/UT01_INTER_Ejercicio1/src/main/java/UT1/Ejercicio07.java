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
public class Ejercicio07 extends JFrame{
    
    private JTextField txtNombre;
    private JTextArea txaObservaciones;
    
    public Ejercicio07()
    {
        super("Ejercicio 7...");
        setBounds(0, 0, 800, 400);
        setLayout(null);
        
        txtNombre = new JTextField();
        txtNombre.setBounds(40, 10, 200, 30);
        add(txtNombre);
        
        txaObservaciones = new JTextArea();
        txaObservaciones.setBounds(40, 50, 400, 300);
        add(txaObservaciones);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] ar)
    {
        Ejercicio07 miInterfaz = new Ejercicio07();
        miInterfaz.setVisible(true);
    }
    
}
