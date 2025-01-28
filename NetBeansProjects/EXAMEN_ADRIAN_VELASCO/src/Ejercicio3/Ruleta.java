/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Ejercicio3;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author adrian.veldie.2
 */
public class Ruleta extends javax.swing.JFrame {

    // Palabra a adivinar
    String[] palabras = {"arandano", "granadas", "naranjas", "manzanas", "duraznos", "platanos"};
    String palabra = palabras[new Random().nextInt(palabras.length)];

    // Variables para manejar el turno
    boolean turnoJugador1 = true; // Si es true, es el turno de Jugador 1, si es false, es el turno de Jugador 2.
    Jugador jugador1;  // Declarar los jugadores aquí, pero no instanciarlos aún
    Jugador jugador2; // Si es true, es el turno de Jugador 1, si es false, es el turno de Jugador 2.

    /**
     * Creates new form Ruleta
     */
    public Ruleta() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Juego de la Ruleta");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        pnLetras = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        lblResolver = new javax.swing.JLabel();
        lblJug1 = new javax.swing.JLabel();
        lblJug2 = new javax.swing.JLabel();
        txtJug1 = new javax.swing.JTextField();
        txtJug2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblTurno = new javax.swing.JLabel();
        btnJugar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTitulo.setText("RULETA DE LA FORTUNA");

        pnLetras.setLayout(new java.awt.GridLayout());

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jButton1.setText("_");
        pnLetras.add(jButton1);

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jButton2.setText("_");
        pnLetras.add(jButton2);

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jButton3.setText("_");
        pnLetras.add(jButton3);

        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jButton4.setText("_");
        pnLetras.add(jButton4);

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jButton5.setText("_");
        pnLetras.add(jButton5);

        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jButton6.setText("_");
        pnLetras.add(jButton6);

        jButton7.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jButton7.setText("_");
        pnLetras.add(jButton7);

        jButton8.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jButton8.setText("_");
        pnLetras.add(jButton8);

        lblResolver.setText("Palabra a resolver: ");

        lblJug1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblJug1.setText("Jugador 1: ");

        lblJug2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblJug2.setText("Jugador 2:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Puntos: 0");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Puntos: 0");

        lblTurno.setText("TURNO DE: ");

        btnJugar.setText("Jugar");
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });

        jLabel3.setText("Despues de girar la ruleta: ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("RULETA: ");

        jLabel5.setText("\"arandano\", \"granadas\", \"naranjas\", \"manzanas\", \"duraznos\", \"platanos\"");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pnLetras, javax.swing.GroupLayout.PREFERRED_SIZE, 859, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblTitulo)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblJug1)
                                .addComponent(lblJug2))
                            .addGap(28, 28, 28)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtJug1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addComponent(txtJug2))
                            .addGap(92, 92, 92)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addGap(248, 248, 248)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblTurno)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblResolver)
                            .addGap(126, 126, 126))))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lblTitulo)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(lblResolver))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnLetras, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJug1)
                    .addComponent(txtJug1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(lblTurno))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblJug2)
                    .addComponent(txtJug2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        // TODO add your handling code here:
        Random rand = new Random();
        int ruleta = rand.nextInt(6) + 1;

        // Mostrar el valor de la ruleta en la interfaz
        jLabel4.setText("RUETA: " + ruleta);

        // Preguntar qué acción tomar: Letra o Resolver
        String accion = JOptionPane.showInputDialog(this, "Elige acción: Letra o Resolver");

        if (accion.equalsIgnoreCase("Letra")) {
            // Pedir una letra al jugador
            String letra = JOptionPane.showInputDialog(this, "Introduce una letra:");

            // Revisar si la letra está en la palabra
            if (palabra.contains(letra)) {
                // Actualizar la interfaz (revelar la letra en los botones)
                for (int i = 0; i < palabra.length(); i++) {
                    if (palabra.charAt(i) == letra.charAt(0)) {
                        // Encontrar el botón correspondiente y mostrar la letra
                        // Suponiendo que tienes un arreglo de botones (jButton1, jButton2, etc.)
                        // Actualiza el texto de los botones que corresponden a la letra
                        ((javax.swing.JButton) pnLetras.getComponent(i)).setText(letra);
                    }
                }

                // Sumar puntos al jugador correspondiente
                if (turnoJugador1) {
                    jugador1.agregarPuntos(ruleta);
                } else {
                    jugador2.agregarPuntos(ruleta);
                }
                actualizarPuntos();
            } else {
                // Si la letra no está, cambiar turno
                turnoJugador1 = !turnoJugador1;
                actualizarTurno();
            }
        } else if (accion.equalsIgnoreCase("Resolver")) {
            // Resolver palabra
            String palabraResuelta = JOptionPane.showInputDialog(this, "Intenta resolver la palabra:");

            if (palabraResuelta.equalsIgnoreCase(palabra)) {
                // El jugador resolvió correctamente, termina el juego
                if (turnoJugador1) {
                    jugador1.agregarPuntos(ruleta);
                } else {
                    jugador2.agregarPuntos(ruleta);
                }
                actualizarPuntos();
                JOptionPane.showMessageDialog(this, "¡Felicidades! El jugador ha ganado con " + (turnoJugador1 ? jugador1.getPuntos() : jugador2.getPuntos()) + " puntos.");
            } else {
                // Si no resolvió correctamente, cambiar turno
                turnoJugador1 = !turnoJugador1;
                actualizarTurno();
            }
        }
    }//GEN-LAST:event_btnJugarActionPerformed

    private void actualizarTurno() {
        // Actualizar la etiqueta de turno
        lblTurno.setText("TURNO DE: " + (turnoJugador1 ? txtJug1.getText() : txtJug2.getText()));
    }

    private void actualizarPuntos() {
        // Actualizar los puntos en la interfaz
        jLabel1.setText("Puntos: " + jugador1.getPuntos());
        jLabel2.setText("Puntos: " + jugador2.getPuntos());
    }

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
            java.util.logging.Logger.getLogger(Ruleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ruleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ruleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ruleta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ruleta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblJug1;
    private javax.swing.JLabel lblJug2;
    private javax.swing.JLabel lblResolver;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTurno;
    private javax.swing.JPanel pnLetras;
    private javax.swing.JTextField txtJug1;
    private javax.swing.JTextField txtJug2;
    // End of variables declaration//GEN-END:variables
}
