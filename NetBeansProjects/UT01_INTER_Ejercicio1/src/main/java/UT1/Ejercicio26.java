/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UT1;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.*;

/**
 *
 * @author pedro.rinpiz
 */
public class Ejercicio26 extends JFrame
{
    private JToolBar toolbar;
    private Container contentPane;
    private JButton btnArchivo;
    private JTextArea textArea;
    private JScrollPane scrollPane;
    public Ejercicio26()
    {
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        toolbar = new JToolBar();
        toolbar.setRollover(true);
        btnArchivo = new JButton("Archivo");
        toolbar.add(btnArchivo);
        toolbar.addSeparator();
        toolbar.add(new JButton("Editar"));
        toolbar.add(new JComboBox<>(new String[] {"Opción 1", "Opción 2", "Opción 3"}));
        contentPane = this.getContentPane();
        contentPane.add(toolbar, BorderLayout.NORTH);
        textArea = new JTextArea();
        scrollPane = new JScrollPane(textArea);
        contentPane.add(scrollPane, BorderLayout.CENTER);
    }
    // Método main
    public static void main(String[] args){
        // Instanciar 
        Ejercicio26 ej26 = new Ejercicio26();
        ej26.setVisible(true);
    }
}
