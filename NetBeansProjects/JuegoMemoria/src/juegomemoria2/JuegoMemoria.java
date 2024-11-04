package juegomemoria2;

import java.awt.Cursor;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author pedro.rinpiz
 */
public class JuegoMemoria extends javax.swing.JFrame {

    private int imagen1, imagen2;
    private int[] arrPosCartas = {1, 1, 2, 2, 3, 3, 4, 4};
    private int puntos = 0;
    private int aciertos = 0;
    private int partidas = 0;

    /**
     * Creates new form JuegoMemoria
     */
    public JuegoMemoria() {
        initComponents();
        this.setTitle("Juego de memoria");
        setLocationRelativeTo(null);
        inicializarBotones();
        inicializarJuego();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        bt1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        bt4 = new javax.swing.JButton();
        bt5 = new javax.swing.JButton();
        bt6 = new javax.swing.JButton();
        bt7 = new javax.swing.JButton();
        bt8 = new javax.swing.JButton();
        btComenzar = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();
        lblPuntos = new javax.swing.JLabel();
        lblpartidas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setLayout(new java.awt.GridLayout(4, 2));

        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        panel.add(bt1);

        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });
        panel.add(bt2);

        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });
        panel.add(bt3);

        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4ActionPerformed(evt);
            }
        });
        panel.add(bt4);

        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5ActionPerformed(evt);
            }
        });
        panel.add(bt5);

        bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt6ActionPerformed(evt);
            }
        });
        panel.add(bt6);

        bt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt7ActionPerformed(evt);
            }
        });
        panel.add(bt7);

        bt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt8ActionPerformed(evt);
            }
        });
        panel.add(bt8);

        btComenzar.setText("Empezar partida");
        btComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btComenzarActionPerformed(evt);
            }
        });

        btSalir.setText("Salir");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        lblPuntos.setText("Puntos: ");

        lblpartidas.setText("Partidas: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btComenzar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btSalir))
                            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(lblPuntos)
                        .addGap(204, 204, 204)
                        .addComponent(lblpartidas)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPuntos)
                    .addComponent(lblpartidas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btComenzar)
                    .addComponent(btSalir))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
       destaparBoton(bt1, 1);
        comprobarJugada(1);
    }//GEN-LAST:event_bt1ActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        destaparBoton(bt2, 2);
        comprobarJugada(2);
    }//GEN-LAST:event_bt2ActionPerformed

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
        destaparBoton(bt3, 3);
        comprobarJugada(3);
    }//GEN-LAST:event_bt3ActionPerformed

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4ActionPerformed
        destaparBoton(bt4, 4);
        comprobarJugada(4);
    }//GEN-LAST:event_bt4ActionPerformed

    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt5ActionPerformed
        destaparBoton(bt5, 5);
        comprobarJugada(5);
    }//GEN-LAST:event_bt5ActionPerformed

    private void bt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt6ActionPerformed
        destaparBoton(bt6, 6);
        comprobarJugada(6);
    }//GEN-LAST:event_bt6ActionPerformed

    private void bt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt7ActionPerformed
        destaparBoton(bt7, 7);
        comprobarJugada(7);
    }//GEN-LAST:event_bt7ActionPerformed

    private void bt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt8ActionPerformed
        destaparBoton(bt8, 8);
        comprobarJugada(8);
    }//GEN-LAST:event_bt8ActionPerformed

    private void btComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btComenzarActionPerformed
        inicializarBotones();
        inicializarJuego();
        lblPuntos.setText("Puntos: 0");
    }//GEN-LAST:event_btComenzarActionPerformed

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
            java.util.logging.Logger.getLogger(JuegoMemoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JuegoMemoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JuegoMemoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JuegoMemoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JuegoMemoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt4;
    private javax.swing.JButton bt5;
    private javax.swing.JButton bt6;
    private javax.swing.JButton bt7;
    private javax.swing.JButton bt8;
    private javax.swing.JButton btComenzar;
    private javax.swing.JButton btSalir;
    private javax.swing.JLabel lblPuntos;
    private javax.swing.JLabel lblpartidas;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables

    private void inicializarBotones() {
        btnInicializar(bt1);
        btnInicializar(bt2);
        btnInicializar(bt3);
        btnInicializar(bt4);
        btnInicializar(bt5);
        btnInicializar(bt6);
        btnInicializar(bt7);
        btnInicializar(bt8);

    }

    private void btnTapar(JButton btn) {
        ImageIcon icono = new ImageIcon(".\\src\\juegomemoria\\imgs\\interrogacion.png");
        btn.setSelected(false);
        btn.setIcon(icono);
        btn.setOpaque(true);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    private void btnInicializar(JButton btn) {
        ImageIcon icono = new ImageIcon(".\\src\\juegomemoria\\imgs\\interrogacion.png");
        btn.setText("");
        btn.setSelected(false);
        btn.setIcon(icono);
        btn.setVisible(true);
        btn.setOpaque(true);
        btn.setEnabled(true);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    private void inicializarJuego() {
        puntos = 0;
        aciertos = 0;
        lblPuntos.setText("Puntos: 0");

        arrPosCartas = shuffle(arrPosCartas);
    }

    private int[] shuffle(int[] arr) {
        Random rd = new Random();
        int i, j, temp;
        for (i = arr.length - 1; i > 0; i--) {
            j = rd.nextInt(i + 1);
            // Intercambiar arr[i] y arr[j]
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }

    private void deshabilitarBotones(int imagen) {
        switch (imagen) {
            case 1:
                bt1.setEnabled(false);
                break;
            case 2:
                bt2.setEnabled(false);
                break;
            case 3:
                bt3.setEnabled(false);
                break;
            case 4:
                bt4.setEnabled(false);
                break;
            case 5:
                bt5.setEnabled(false);
                break;
            case 6:
                bt6.setEnabled(false);
                break;
            case 7:
                bt7.setEnabled(false);
                break;
            case 8:
                bt8.setEnabled(false);
                break;
            default:
                break;
        }  
    }

    private void rdoGanar() {
        imagen1 = 0;
        imagen2 = 0;
        puntos = puntos + 10;
        aciertos++;
        if (aciertos == 4) {
            JOptionPane.showMessageDialog(null, "Usted es un ganador");
            partidas++;
        }
    }

    private void rdoPerder() {
        imagen1 = 0;
        imagen2 = 0;
        JOptionPane.showMessageDialog(null, "No hay suerte!");
    }

    private void comprobarJugada(int pos) {
        // ¿Es la primera carta?
        if (imagen1 == 0) {
            imagen1 = pos;
        } 
        // ¿Es la segunda carta?
        else if (imagen2 == 0) {
            imagen2 = pos;
            if (arrPosCartas[imagen1 - 1] == arrPosCartas[imagen2 - 1]) {
                deshabilitarBotones(imagen1);
                deshabilitarBotones(imagen2);
                rdoGanar();
                lblPuntos.setText("Puntos: " + puntos);
                lblpartidas.setText("Partidas: " + partidas);
            } else {
                // Tapar con interrogantes
                esperar(1);
                taparImagenes(imagen1);
                taparImagenes(imagen2);
                rdoPerder();
            }
        }
    }

    private void esperar(int segundos){
        try{
            Thread.sleep(segundos*200);
        } catch(InterruptedException e) {

        }
    }
    
    public void destaparBoton(JButton btn, int pos) {
        btn.setSelected(true);
        btn.setIcon(new ImageIcon(".\\src\\juegomemoria\\imgs\\" + arrPosCartas[pos - 1] + ".png"));
        btn.setDisabledIcon(new ImageIcon(".\\src\\juegomemoria\\imgs\\" + arrPosCartas[pos - 1] + ".png"));
        btn.setVisible(true);
    }

    private void taparImagenes(int imagen) {
        switch (imagen) {
            case 1:
                btnTapar(bt1);
                break;
            case 2:
                btnTapar(bt2);
                break;
            case 3:
                btnTapar(bt3);
                break;
            case 4:
                btnTapar(bt4);
                break;
            case 5:
                btnTapar(bt5);
                break;
            case 6:
                btnTapar(bt6);
                break;
            case 7:
                btnTapar(bt7);
                break;
            case 8:
                btnTapar(bt8);
                break;
            default:
                break;
        }   
    }
}