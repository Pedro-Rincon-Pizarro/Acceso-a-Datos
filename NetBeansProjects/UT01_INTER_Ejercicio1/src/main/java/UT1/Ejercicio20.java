/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UT1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author pedro.rinpiz
 */
public class Ejercicio20 extends JFrame implements ChangeListener
{
    private JLabel lblAno, lblMes, lblDia, lblFechaCompleta;
    private JSpinner jSpinnerAno, jSpinnerMes, jSpinnerDia;
   
    
    public Ejercicio20()
    {
        
        super("Ejercicio 20");
        setLayout(null);
        setBounds(0, 0, 800, 600);
        
        lblDia = new JLabel();
        lblDia.setBounds(40, 10, 80, 30);//50.10.200.30
        add(lblDia);
        
        jSpinnerDia = new JSpinner(new SpinnerNumberModel(1,1,31,1));
        jSpinnerDia.setBounds(80, 40, 70, 30);
        add(jSpinnerDia);
        
        lblMes = new JLabel();
        lblMes.setBounds(120, 10, 80, 30);
        add(lblMes);
        
        String[] months = {"Enero", "Febreo", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        
        jSpinnerMes = new JSpinner(new SpinnerListModel(months));
        jSpinnerMes.setBounds(160, 40, 70, 30);
        add(jSpinnerMes);
        
        lblAno = new JLabel();
        lblAno.setBounds(200, 10, 80, 30);
        add(lblAno);
        
        int an = 2024;
                
        jSpinnerAno = new JSpinner(new SpinnerNumberModel(an,an - 100,an + 100,1));
        jSpinnerAno.setBounds(240, 40, 70, 30);
        add(jSpinnerAno);
        
        
        lblFechaCompleta = new JLabel();
        lblFechaCompleta.setBounds(280, 10, 200, 30);
        add(lblFechaCompleta);
        
        LocalDateTime localDate = LocalDateTime.now();
        
        jSpinnerDia.addChangeListener(this);
        jSpinnerMes.addChangeListener(this);
        jSpinnerAno.addChangeListener(this);
        
        lblDia.setText(Integer.toString((int) jSpinnerDia.getValue()));
        lblMes.setText((String)jSpinnerMes.getValue());
        lblAno.setText(Integer.toString((int) jSpinnerAno.getValue()));
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void stateChanged(ChangeEvent e) 
    {
       if(e.getSource() == jSpinnerDia)
       {
           lblDia.setText(Integer.toString((int) jSpinnerDia.getValue()));
       }
       if(e.getSource() == jSpinnerMes)
       {
            lblMes.setText((String)jSpinnerMes.getValue());
       }
       if(e.getSource() == jSpinnerAno)
       {
           lblAno.setText(Integer.toString((int) jSpinnerAno.getValue()));
       }
       
    }
    
    public static void main(String[] args) {
        Ejercicio20 eje20 = new Ejercicio20();
        eje20.setVisible(true);
    }
    
}
