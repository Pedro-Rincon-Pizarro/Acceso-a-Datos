/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package chatTcp5;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pedro.rinpiz
 */
public class FrmCliente extends javax.swing.JFrame {

    /**
     * Creates new form FrmCliente
     */
    private Socket socket;
    private InputStream is;
    private OutputStream os;
    private InputStreamReader isr;
    private BufferedReader br;
    private PrintWriter pw;
    private FrmCliente cliente;
    
    public FrmCliente() {
        initComponents();
        try 
        {
            
            inicio();   
            AbrirCanalesTexto();
            //ENVIO MENSAJE
            enviarMensajeTexto("Hola servidor, soy el cliente" +"\n");
            String mensajeRecibido = leerMensajeTexto();
            txtArea.append("Servidor mensaje recibido... " + mensajeRecibido +"\n");
            
            
        } 
        catch (UnknownHostException e)
        {
            e.printStackTrace();    
        }
        catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }
    public void inicio() throws IOException
    {
        try 
        {
            txtArea.append("Cliente estableciendo conexion" +"\n");
            socket = new Socket("localhost", 9000);
            os = socket.getOutputStream();
            is = socket.getInputStream();
        }
        catch (Exception e) 
        {
            
        }
    }
    
    public void stop() throws IOException
    {
        txtArea.append("Cliente cerrando conexiones..." +"\n");
        is.close();
        os.close();
        socket.close();
        txtArea.append("Cliente conexiones cerradas..." +"\n");
    }
    
    public void AbrirCanalesTexto()
    {
        txtArea.append("Cliente abriendo canales de texto..." +"\n");
        isr=new InputStreamReader(is);
        br=new BufferedReader(isr);
        pw=new PrintWriter(os,true);
        txtArea.append("Cliente canales de texto abiertos..." +"\n");
    }
    
    public void cerrarCanalesTexto() throws IOException
    {
        txtArea.append("Cliente cerrando canales de texto..." +"\n");
        br.close();
        isr.close();
        pw.close();
        txtArea.append("Cliente canales de texto cerrados..." +"\n");
    }
    
    public void enviarMensajeTexto(String mensaje)
    {
        txtArea.append("Cliente enviando mensaje..." +"\n");
        pw.println(mensaje);
        txtArea.append("Cliente mensaje enviado..." +"\n");
    }
    
    public String leerMensajeTexto() throws IOException
    {
        txtArea.append("Cliente leyendo mensaje..." +"\n");
        String mensaje="Mondongo";
        txtArea.append("Cliente mensaje leido..." +"\n");
        return mensaje;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btSalir.setText("jButton1");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(btSalir)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btSalir)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        try {
            cerrarCanalesTexto();
            stop();
            System.exit(0);
        } catch (IOException ex) {
            Logger.getLogger(FrmCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables
}