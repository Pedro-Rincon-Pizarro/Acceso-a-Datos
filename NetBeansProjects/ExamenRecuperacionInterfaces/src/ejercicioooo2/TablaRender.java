/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioooo2;

/**
 *
 * @author pedro.rinpiz
 */
import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;


public class TablaRender extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
        if(o instanceof JCheckBox){
          JCheckBox checks=(JCheckBox)o;
          return checks;
        }
        return super.getTableCellRendererComponent(jtable, o, bln, bln1, i, i1); 
        //To change body of generated methods, choose Tools | Templates.
    }
    
}
