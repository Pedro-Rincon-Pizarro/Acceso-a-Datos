/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package menu;

import javax.swing.ImageIcon;

/**
 *
 * @author pedro.rinpiz
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    private Registro regis;
    public FrmPrincipal() {
        initComponents();
        setTitle("Casa");
        setSize(600, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        regis = new Registro(0, 0, 0, 0);
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPane = new javax.swing.JTextPane();
        mnb = new javax.swing.JMenuBar();
        mnuCasa = new javax.swing.JMenu();
        mnuHabit = new javax.swing.JMenu();
        mniHab1 = new javax.swing.JMenuItem();
        mniHab2 = new javax.swing.JMenuItem();
        mniSalon = new javax.swing.JCheckBoxMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mniCocina = new javax.swing.JRadioButtonMenuItem();
        mniBaño = new javax.swing.JRadioButtonMenuItem();
        mnuExtras = new javax.swing.JMenu();
        mniGaraje = new javax.swing.JMenuItem();
        mniTrastero = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(txtPane);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 932, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                .addContainerGap())
        );

        mnuCasa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/casa.png"))); // NOI18N
        mnuCasa.setText("Casa");

        mnuHabit.setText("Habitaciones");

        mniHab1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniHab1.setText("Habitación 1");
        mniHab1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniHab1ActionPerformed(evt);
            }
        });
        mnuHabit.add(mniHab1);

        mniHab2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniHab2.setText("Habitación 2");
        mniHab2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniHab2ActionPerformed(evt);
            }
        });
        mnuHabit.add(mniHab2);

        mnuCasa.add(mnuHabit);

        mniSalon.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniSalon.setText("Salón");
        mniSalon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSalonActionPerformed(evt);
            }
        });
        mnuCasa.add(mniSalon);
        mnuCasa.add(jSeparator2);

        mniCocina.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniCocina.setText("Cocina");
        mniCocina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCocinaActionPerformed(evt);
            }
        });
        mnuCasa.add(mniCocina);

        mniBaño.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniBaño.setText("Baño");
        mniBaño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniBañoActionPerformed(evt);
            }
        });
        mnuCasa.add(mniBaño);

        mnb.add(mnuCasa);

        mnuExtras.setText("Extras");

        mniGaraje.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mniGaraje.setText("Garaje");
        mniGaraje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniGarajeActionPerformed(evt);
            }
        });
        mnuExtras.add(mniGaraje);

        mniTrastero.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mniTrastero.setText("Trastero");
        mniTrastero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniTrasteroActionPerformed(evt);
            }
        });
        mnuExtras.add(mniTrastero);

        mnb.add(mnuExtras);

        setJMenuBar(mnb);

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

    private void mniHab1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniHab1ActionPerformed
        regis.setContHabi(regis.getContHabi() +1 );
    }//GEN-LAST:event_mniHab1ActionPerformed

    private void mniHab2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniHab2ActionPerformed
        regis.setContHabi(regis.getContHabi() +1 );
    }//GEN-LAST:event_mniHab2ActionPerformed

    private void mniSalonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSalonActionPerformed
        String estado;
        regis.setContSalon(regis.getContSalon()+1 );
        if(mniSalon.isSelected())
        {
            estado = "Activado";
        }
        else
        {
            estado = "Desactivado";
        }
        txtPane.setText(txtPane.getText() + "\nHas entrado al salón " + regis.getContSalon() + " veces. Estado: " + estado);
    }//GEN-LAST:event_mniSalonActionPerformed

    private void mniCocinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCocinaActionPerformed
        String estado;
        
        if(mniCocina.isSelected())
        {
             estado = "Activado";
             regis.setContCocina(regis.getContCocina()+1 );
             txtPane.setText(txtPane.getText() + "\nHas entrado a la Cocina " + regis.getContCocina() + " veces. Estado: " + estado);
        }
        else
        {
            estado = "Desactivado";
            txtPane.setText(txtPane.getText() + "\nHas salido de la Cocina " + regis.getContCocina() + " veces. Estado: " + estado);
        }
        
    }//GEN-LAST:event_mniCocinaActionPerformed

    private void mniBañoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniBañoActionPerformed
        String estado;
        regis.setContBaño(regis.getContBaño() + 1 );
        if(mniCocina.isSelected())
        {
            estado = "Activado";
        }
        else
        {
            estado = "Desactivado";
        }
        txtPane.setText(txtPane.getText() + "\nHas entrado al salón " + regis.getContBaño()+ " veces. Estado: " + estado);
    }//GEN-LAST:event_mniBañoActionPerformed

    private void mniGarajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniGarajeActionPerformed
        
    }//GEN-LAST:event_mniGarajeActionPerformed

    private void mniTrasteroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniTrasteroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mniTrasteroActionPerformed

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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuBar mnb;
    private javax.swing.JRadioButtonMenuItem mniBaño;
    private javax.swing.JRadioButtonMenuItem mniCocina;
    private javax.swing.JMenuItem mniGaraje;
    private javax.swing.JMenuItem mniHab1;
    private javax.swing.JMenuItem mniHab2;
    private javax.swing.JCheckBoxMenuItem mniSalon;
    private javax.swing.JMenuItem mniTrastero;
    private javax.swing.JMenu mnuCasa;
    private javax.swing.JMenu mnuExtras;
    private javax.swing.JMenu mnuHabit;
    private javax.swing.JTextPane txtPane;
    // End of variables declaration//GEN-END:variables
}
