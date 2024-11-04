/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UT1;

import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;

/**
 *
 * @author pedro.rinpiz
 */
public class Ejercicio23 extends JFrame
{
    private JScrollBar scb;
    private JLabel lb;
    
    public Ejercicio23()
    {
        setLayout(null);
        setSize(400, 400);
        
        
        lb = new JLabel();
        lb.setHorizontalAlignment(JLabel.CENTER);
        lb.setBounds(50, 10, 200, 20);
        lb.setText("Valor Actua: 100");
        add(lb);
        
        scb = new JScrollBar(JScrollBar.HORIZONTAL, 100, 10, 0, 210);
        scb.setBounds(50, 50, 200, 20);
        
        add(scb);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        scb.addAdjustmentListener(new AdjustmentListener()
        {

            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                lb.setText("Valor actual : " + scb.getValue());
            }
        });
    }
    
    public static void main(String[] args) {
        Ejercicio23 ej23 = new Ejercicio23();
        ej23.setVisible(true);
    }
}
