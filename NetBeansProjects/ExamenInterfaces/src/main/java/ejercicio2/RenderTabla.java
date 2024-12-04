 
package ejercicio2;
 
import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class RenderTabla  extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
        if(o instanceof JCheckBox){
            JCheckBox boton=(JCheckBox)o;
            return boton;
        }
        if (i%2==0){
            setBackground(Color.LIGHT_GRAY);
            setForeground(Color.BLACK);
        }
        else{
            setBackground(Color.WHITE);
            setForeground(Color.BLACK);
        }
        return super.getTableCellRendererComponent(jtable, o, bln, bln1, i, i1); //To change body of generated methods, choose Tools | Templates.
    }
   
    
}
