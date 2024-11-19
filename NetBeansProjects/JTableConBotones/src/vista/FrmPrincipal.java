/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import clases.RenderTabla;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Persona;

public class FrmPrincipal extends javax.swing.JFrame {
    public ArrayList<Persona> listaPersonas=new ArrayList<>();
    public static int columna,row;
    JButton boton1=new JButton();
    JButton boton2=new JButton();
    DefaultTableModel modeloTabla=new DefaultTableModel();
    public FrmPrincipal() {
        initComponents();
        inicializarControles();
        CargarTabla();
        boton1.setName("btn1");
        boton2.setName("btn2");
    }
    public void inicializarControles(){
        this.setTitle("Botones en Jtable");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        boton1.setText("Modificar");
        boton2.setText("Eliminar");
        boton2.setBackground(Color.red);
        InsertarIcono(boton1, "/imagenes/Edit.png");
        InsertarIcono(boton2, "/imagenes/CANCELACION.png");
        
        JTable1.setDefaultRenderer(Object.class,new RenderTabla());
        modeloTabla.setColumnIdentifiers(new String[]{"# DNI","NOMBRE","APELLIDOS","MODIFICAR","ELIMINAR"});
        JTable1.setModel(modeloTabla);
        JTable1.setRowHeight(40);
        
    }
    public void CargarTabla(){
        
        //Creo una lista con 3 personas
        listaPersonas.add(new Persona("20202044X","Ana","Ruiz"));
        listaPersonas.add(new Persona("19191919X","Rosa","Gomez"));
        listaPersonas.add(new Persona("21212121X","Alejandra","Perez"));
        
        //Paso de la lista al JTable
        for (Persona per : listaPersonas) {  
            Object lineaPer[]={per.getDni(),per.getNombre(),per.getApellidos(),boton1,boton2};
            modeloTabla.addRow(lineaPer);
        }
        
    } 
    public void LimpiarFormulario(){
        txtapellidos.setText("");
        txtdni.setText("");
        txtnombres.setText("");
        txtdni.grabFocus();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtapellidos = new javax.swing.JTextField();
        txtdni = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnombres = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 204, 153));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("CRUD DE PERSONAS");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setText("DNI :");

        jLabel3.setText("Apellidos : ");

        jLabel2.setText("Nombre : ");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        JTable1 = new javax.swing.JTable(){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        JTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        JTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String dni, nombre, apellidos;
        dni=txtdni.getText();
        nombre=txtnombres.getText();
        apellidos=txtapellidos.getText();
        
        listaPersonas.add(new Persona(dni,nombre,apellidos));
        
        Object lineaPer[]={dni,nombre,apellidos,boton1,boton2};
        modeloTabla.addRow(lineaPer);
        
        LimpiarFormulario();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void JTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTable1MouseClicked
       columna=JTable1.getColumnModel().getColumnIndexAtX(evt.getX());
       row=evt.getY()/JTable1.getRowHeight();
       if(columna<=JTable1.getColumnCount() && columna>=0 && row<=JTable1.getRowCount()&& row>=0){
           Object objeto=JTable1.getValueAt(row, columna);
           if(objeto instanceof JButton){
           ((JButton)objeto).doClick();
               JButton botones=(JButton)objeto;
               Object dni=JTable1.getValueAt(row, 0);
               if(botones.getName().equals("btn1")){
                    JOptionPane.showMessageDialog(null,"Usuario , usted presionó el boton Modificar del DNI:"+dni.toString());
                
               }else{
                   if(botones.getName().equals("btn2")){
                     JOptionPane.showMessageDialog(null,"Usuario, usted presionó el boton Eliminar del DNI:"+dni.toString());
                   
                   }
               }
           }
       }
    }//GEN-LAST:event_JTable1MouseClicked
public void InsertarIcono(JButton btn,String ruta){
    btn.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta)));
}

public static void main(String args[]) {
        FrmPrincipal bt=new FrmPrincipal();
        bt.setVisible(true);
         
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTable1;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtnombres;
    // End of variables declaration//GEN-END:variables
}
