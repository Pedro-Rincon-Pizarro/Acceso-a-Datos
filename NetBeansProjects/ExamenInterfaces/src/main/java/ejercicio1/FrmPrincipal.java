/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ejercicio1;

import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author pedro.rinpiz
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
        panelCentral.setBackground(new Color(153,255,204));
        lbl1Princi.setText("DIA Y HORA DEL ACONTECIMIENTO");
        lbl2Lunes.setVisible(true);
        lbl2Lunes.setText("SEMANA DEPORTIVA EN EL PALACIO DE FESTIVALES DE SANTANDER");
        lbl3Lunes.setVisible(true);
        lbl3Lunes.setText("Lugar: Auditorium");
        lbl4Lunes.setVisible(true);
        lbl4Lunes.setText("Fechas: del Lunes 9 al Viernes 13 de Diciembre");
        imageLunes.setVisible(true);
        imageLunes.setIcon(new ImageIcon("semana.png"));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btLunes = new javax.swing.JButton();
        btMartes = new javax.swing.JButton();
        btMiercoles = new javax.swing.JButton();
        btJueves = new javax.swing.JButton();
        btViernes = new javax.swing.JButton();
        lbl1Princi = new javax.swing.JLabel();
        panelCentral = new javax.swing.JPanel();
        lbl2Lunes = new javax.swing.JLabel();
        lbl3Lunes = new javax.swing.JLabel();
        lbl4Lunes = new javax.swing.JLabel();
        imageLunes = new javax.swing.JLabel();
        lbldia = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        lblHorario = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btRestaurar = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btLunes.setText("Lunes");
        btLunes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLunesActionPerformed(evt);
            }
        });

        btMartes.setText("Martes");
        btMartes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMartesActionPerformed(evt);
            }
        });

        btMiercoles.setText("Miercoles");
        btMiercoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMiercolesActionPerformed(evt);
            }
        });

        btJueves.setText("Jueves");
        btJueves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btJuevesActionPerformed(evt);
            }
        });

        btViernes.setText("Viernes");
        btViernes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btViernesActionPerformed(evt);
            }
        });

        lbl1Princi.setText("DIA Y HORA DEL ACONTECIMIENTO");

        panelCentral.setBackground(new java.awt.Color(153, 255, 204));

        lbl2Lunes.setText("SEMANA DEPORTIVA EN EL PALACIO DE FESTIVALES DE SANTANDER");

        lbl3Lunes.setText("Lugar: Auditorium");

        lbl4Lunes.setText("Fechas: del Lunes 9 al Viernes 13 de Diciembre");

        imageLunes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/semana.png"))); // NOI18N
        imageLunes.setText("IMAGEN");

        lbldia.setText("jLabel1");

        lblHora.setText("jLabel1");

        lblHorario.setText("jLabel1");

        lblDescripcion.setText("jLabel1");

        javax.swing.GroupLayout panelCentralLayout = new javax.swing.GroupLayout(panelCentral);
        panelCentral.setLayout(panelCentralLayout);
        panelCentralLayout.setHorizontalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescripcion)
                    .addComponent(lblHorario)
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addComponent(lbldia)
                        .addGap(284, 284, 284)
                        .addComponent(lblHora))
                    .addComponent(imageLunes, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl4Lunes)
                    .addComponent(lbl3Lunes)
                    .addComponent(lbl2Lunes))
                .addContainerGap(331, Short.MAX_VALUE))
        );
        panelCentralLayout.setVerticalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(lbl2Lunes)
                .addGap(2, 2, 2)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldia)
                    .addComponent(lblHora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl3Lunes)
                .addGap(18, 18, 18)
                .addComponent(lbl4Lunes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHorario)
                .addGap(65, 65, 65)
                .addComponent(lblDescripcion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imageLunes, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        jLabel6.setText("Pulsa sobre los botones para ver la informacion del Festival");

        btRestaurar.setText("Restaurar");
        btRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRestaurarActionPerformed(evt);
            }
        });

        btSalir.setText("Salir");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btRestaurar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSalir)
                        .addGap(58, 58, 58))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btRestaurar)
                    .addComponent(btSalir))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl1Princi)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btLunes)
                        .addGap(18, 18, 18)
                        .addComponent(btMartes)
                        .addGap(18, 18, 18)
                        .addComponent(btMiercoles)
                        .addGap(18, 18, 18)
                        .addComponent(btJueves)
                        .addGap(18, 18, 18)
                        .addComponent(btViernes)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panelCentral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLunes)
                    .addComponent(btMartes)
                    .addComponent(btMiercoles)
                    .addComponent(btJueves)
                    .addComponent(btViernes))
                .addGap(18, 18, 18)
                .addComponent(lbl1Princi)
                .addGap(29, 29, 29)
                .addComponent(panelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLunesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLunesActionPerformed
        panelCentral.setBackground(new Color(204,255,255));
        lbl1Princi.setText("Lunes 09/12 Horarios 9:00-14:00 y de 16:00 a 21:00");
        lbl2Lunes.setVisible(false);
        lbl3Lunes.setVisible(false);
        lbl4Lunes.setVisible(false);
        imageLunes.setVisible(false);
        lbldia.setText("Dia 09/12 Lunes:");
        lblHora.setText("Apertura de las puertas a las 9:00 horas");
        lblHorario.setText("Horario(s) evento 9-14h y de 16-21h");
        lblDescripcion.setText("INAUGURACION, INTRODUCCION A TODOS");
    }//GEN-LAST:event_btLunesActionPerformed

    private void btMartesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMartesActionPerformed
       panelCentral.setBackground(new Color(204,204,255));
        lbl1Princi.setText("Martes 10/12 Horarios 9:00-14:00 y de 16:00 a 21:00");
        lbl2Lunes.setVisible(false);
        lbl3Lunes.setVisible(false);
        lbl4Lunes.setVisible(false);
        imageLunes.setVisible(false);
        lbldia.setText("Dia 10/12 Martes:");
        lblHora.setText("Apertura de las puertas a las 9:00 horas");
        lblHorario.setText("Horario(s) evento 9-14h y de 16-21h");
        lblDescripcion.setText("DIA DEL FUTBOL");
        
    }//GEN-LAST:event_btMartesActionPerformed

    private void btMiercolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMiercolesActionPerformed
        
        panelCentral.setBackground(new Color(255,204,255));
        lbl1Princi.setText("Miercoles 11/12 Horarios 9:00-14:00 y de 16:00 a 21:00");
        lbl2Lunes.setVisible(false);
        lbl3Lunes.setVisible(false);
        lbl4Lunes.setVisible(false);
        imageLunes.setVisible(false);
        lbldia.setText("Dia 11/12 Miercoles:");
        lblHora.setText("Apertura de las puertas a las 9:00 horas");
        lblHorario.setText("Horario(s) evento 9-14h y de 16-21h");
        lblDescripcion.setText("DIA DEL BALONCESTO");
    }//GEN-LAST:event_btMiercolesActionPerformed

    private void btJuevesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btJuevesActionPerformed
        panelCentral.setBackground(new Color(255,204,204));
        lbl1Princi.setText("Jueves 12/12 Horarios 9:00-14:00 y de 16:00 a 21:00");
        lbl2Lunes.setVisible(false);
        lbl3Lunes.setVisible(false);
        lbl4Lunes.setVisible(false);
        imageLunes.setVisible(false);
        lbldia.setText("Dia 12/12 Jueves:");
        lblHora.setText("Apertura de las puertas a las 9:00 horas");
        lblHorario.setText("Horario(s) evento 9-14h y de 16-21h");
        lblDescripcion.setText("DIA DEL CICLISMO");
    }//GEN-LAST:event_btJuevesActionPerformed

    private void btViernesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btViernesActionPerformed
        panelCentral.setBackground(new Color(255,255,204));
        lbl1Princi.setText("Viernes 13/12 Horarios 9:00-14:00 y de 16:00 a 21:00");
        lbl2Lunes.setVisible(false);
        lbl3Lunes.setVisible(false);
        lbl4Lunes.setVisible(false);
        imageLunes.setVisible(false);
        lbldia.setText("Dia 13/12 Viernes:");
        lblHora.setText("Apertura de las puertas a las 9:00 horas");
        lblHorario.setText("Horario(s) evento 9-14h y de 16-21h");
        lblDescripcion.setText("FIESTA DE CLAUSURA A ULTIMA HORA");
    }//GEN-LAST:event_btViernesActionPerformed

    private void btRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRestaurarActionPerformed
        panelCentral.setBackground(new Color(153,255,204));
        lbl1Princi.setText("DIA Y HORA DEL ACONTECIMIENTO");
        lbl2Lunes.setVisible(true);
        lbl2Lunes.setText("SEMANA DEPORTIVA EN EL PALACIO DE FESTIVALES DE SANTANDER");
        lbl3Lunes.setVisible(true);
        lbl3Lunes.setText("Lugar: Auditorium");
        lbl4Lunes.setVisible(true);
        lbl4Lunes.setText("Fechas: del Lunes 9 al Viernes 13 de Diciembre");
        imageLunes.setVisible(true);
        imageLunes.setIcon(new ImageIcon("semana.png"));
        
    }//GEN-LAST:event_btRestaurarActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btSalirActionPerformed

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
    private javax.swing.JButton btJueves;
    private javax.swing.JButton btLunes;
    private javax.swing.JButton btMartes;
    private javax.swing.JButton btMiercoles;
    private javax.swing.JButton btRestaurar;
    private javax.swing.JButton btSalir;
    private javax.swing.JButton btViernes;
    private javax.swing.JLabel imageLunes;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl1Princi;
    private javax.swing.JLabel lbl2Lunes;
    private javax.swing.JLabel lbl3Lunes;
    private javax.swing.JLabel lbl4Lunes;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblHorario;
    private javax.swing.JLabel lbldia;
    private javax.swing.JPanel panelCentral;
    // End of variables declaration//GEN-END:variables
}
