/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jsplitpane;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author pedro.rinpiz
 */
public class FrmPrincipal extends javax.swing.JFrame {

    private ArrayList<Fruta> arrayFrutas = new ArrayList<>();
    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
        setTitle("Lista de Frutas");
        setLocationRelativeTo(null);
        
        arrayFrutas.add(new Fruta("ciruela", "ciruela.jpg"));
        arrayFrutas.add(new Fruta("kiwi", "kiwi.jpg"));
        arrayFrutas.add(new Fruta("manzana", "manzana.jpg"));
        arrayFrutas.add(new Fruta("melocotón", "melocoton.jpg"));
        arrayFrutas.add(new Fruta("pera", "pera.jpg"));
        
        DefaultListModel modelo = new DefaultListModel();
        
        for(Fruta f : arrayFrutas)
        {
            modelo.addElement(f.getNombre());
        }
        lstFrutas.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        spPane = new javax.swing.JSplitPane();
        scrIzqui = new javax.swing.JScrollPane();
        lstFrutas = new javax.swing.JList<>();
        pnDerecha = new javax.swing.JPanel();
        lblImagen = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        spPane.setDividerLocation(200);

        lstFrutas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstFrutasValueChanged(evt);
            }
        });
        scrIzqui.setViewportView(lstFrutas);

        spPane.setLeftComponent(scrIzqui);

        lblImagen.setText("jLabel1");

        javax.swing.GroupLayout pnDerechaLayout = new javax.swing.GroupLayout(pnDerecha);
        pnDerecha.setLayout(pnDerechaLayout);
        pnDerechaLayout.setHorizontalGroup(
            pnDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImagen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1238, Short.MAX_VALUE)
        );
        pnDerechaLayout.setVerticalGroup(
            pnDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDerechaLayout.createSequentialGroup()
                .addComponent(lblImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
                .addContainerGap())
        );

        spPane.setRightComponent(pnDerecha);

        lblResultado.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1509, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblResultado)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spPane, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblResultado)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lstFrutasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstFrutasValueChanged
        String strFrutaSel, strImagenSel = "";
        strFrutaSel = lstFrutas.getSelectedValue();
        
        lblResultado.setText("Has seleccionado " + strFrutaSel);
        
        for(Fruta f : arrayFrutas)
        {
            if(f.getNombre().equals(strFrutaSel))
            {
                strImagenSel = f.getImagen();
            }
        }
        lblImagen.setIcon(new ImageIcon("src\\img\\" + strImagenSel));
        
        ImageIcon imgIcon = (ImageIcon) lblImagen.getIcon();
        Image imgEscalada = imgIcon.getImage().getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado = new ImageIcon(imgEscalada);

        lblImagen.setIcon(iconoEscalado);
        
    }//GEN-LAST:event_lstFrutasValueChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JList<String> lstFrutas;
    private javax.swing.JPanel pnDerecha;
    private javax.swing.JScrollPane scrIzqui;
    private javax.swing.JSplitPane spPane;
    // End of variables declaration//GEN-END:variables
}
