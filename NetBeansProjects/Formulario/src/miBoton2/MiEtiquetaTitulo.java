/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miBoton2;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

/**
 *
 * @author pedro.rinpiz
 */
public class MiEtiquetaTitulo extends JLabel
{
    public MiEtiquetaTitulo()
    {
        super();
        this.setBorder(null);
        this.setFont(new java.awt.Font("Tahoma", Font.PLAIN, 14));
        this.setForeground(Color.BLACK);
        this.setBackground(Color.gray);
        this.setText(this.getText().toUpperCase());
    }
}
