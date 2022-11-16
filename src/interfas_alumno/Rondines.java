/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfas_alumno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Geovanni
 */
public class Rondines extends javax.swing.JFrame {

    /**
     * Creates new form Administrar_horario
     */
    public Rondines(final String nom) {
        initComponents();
        this.setLocationRelativeTo(null);
        lb_nomusuarios.setText(nom);
        llenar_Salones();
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
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lb_nomusuarios = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bt_administarHorarios = new javax.swing.JButton();
        bt_rondines = new javax.swing.JButton();
        bt_reportes = new javax.swing.JButton();
        bt_inventario = new javax.swing.JButton();
        bt_administarUsuarios = new javax.swing.JButton();
        bt_notificaciones = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        cb_salon = new javax.swing.JComboBox<>();
        lb_salon = new javax.swing.JLabel();
        lb_observaciones = new javax.swing.JLabel();
        bt_registrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_observacion = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(107, 8, 48));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/administrador.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        lb_nomusuarios.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lb_nomusuarios.setForeground(new java.awt.Color(255, 255, 255));
        lb_nomusuarios.setText("Administrador");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("usuario:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lb_nomusuarios)
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(48, 48, 48))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_nomusuarios)
                        .addGap(42, 42, 42))))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/isc350X140.png"))); // NOI18N

        bt_administarHorarios.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt_administarHorarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calendario60X60.png"))); // NOI18N
        bt_administarHorarios.setText("Administar horarios");
        bt_administarHorarios.setContentAreaFilled(false);
        bt_administarHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_administarHorariosActionPerformed(evt);
            }
        });

        bt_rondines.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt_rondines.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ronda60X60.png"))); // NOI18N
        bt_rondines.setText("Rondines              ");
        bt_rondines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_rondinesActionPerformed(evt);
            }
        });

        bt_reportes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt_reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte2_60X60.png"))); // NOI18N
        bt_reportes.setText("Reportes                ");
        bt_reportes.setContentAreaFilled(false);
        bt_reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_reportesActionPerformed(evt);
            }
        });

        bt_inventario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt_inventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inventario60X60.png"))); // NOI18N
        bt_inventario.setText("Inventario           ");
        bt_inventario.setContentAreaFilled(false);
        bt_inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_inventarioActionPerformed(evt);
            }
        });

        bt_administarUsuarios.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt_administarUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/grupo-de-usuarios60X60.png"))); // NOI18N
        bt_administarUsuarios.setText("Administar usuarios");
        bt_administarUsuarios.setContentAreaFilled(false);
        bt_administarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_administarUsuariosActionPerformed(evt);
            }
        });

        bt_notificaciones.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bt_notificaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/correo60X60.png"))); // NOI18N
        bt_notificaciones.setText("Notificaciones         ");
        bt_notificaciones.setContentAreaFilled(false);
        bt_notificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_notificacionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bt_administarHorarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bt_administarUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bt_reportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bt_rondines, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bt_notificaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(bt_inventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_administarHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_administarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_reportes, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_rondines, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_notificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_inventario, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(244, 244, 244));

        cb_salon.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cb_salon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lb_salon.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lb_salon.setText("Salón:");

        lb_observaciones.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lb_observaciones.setText("Observaciones:");

        bt_registrar.setBackground(new java.awt.Color(107, 8, 48));
        bt_registrar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bt_registrar.setForeground(new java.awt.Color(255, 255, 255));
        bt_registrar.setText("Registrar rondin");
        bt_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_registrarActionPerformed(evt);
            }
        });

        ta_observacion.setColumns(20);
        ta_observacion.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        ta_observacion.setLineWrap(true);
        ta_observacion.setRows(5);
        ta_observacion.setWrapStyleWord(true);
        ta_observacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ta_observacionKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(ta_observacion);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(416, Short.MAX_VALUE)
                .addComponent(bt_registrar)
                .addGap(389, 389, 389))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_salon, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_salon)
                    .addComponent(lb_observaciones))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lb_salon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_salon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lb_observaciones)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_registrar)
                .addGap(36, 36, 36))
        );

        jPanel2.setBackground(new java.awt.Color(1, 26, 93));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_administarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_administarUsuariosActionPerformed
       Usuarios ventana = new Usuarios(lb_nomusuarios.getText());
                ventana.setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_bt_administarUsuariosActionPerformed

    private void bt_reportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_reportesActionPerformed
        Reportes ventana = new Reportes( lb_nomusuarios.getText());
                ventana.setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_bt_reportesActionPerformed

    private void bt_administarHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_administarHorariosActionPerformed
        Administrar_horario2 ventana = new Administrar_horario2(lb_nomusuarios.getText() );
                ventana.setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_bt_administarHorariosActionPerformed

    private void bt_rondinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_rondinesActionPerformed
        Rondines ventana = new Rondines( lb_nomusuarios.getText());
                ventana.setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_bt_rondinesActionPerformed

    private void bt_inventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_inventarioActionPerformed
            Inventario ventana = new Inventario(lb_nomusuarios.getText() );
                ventana.setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_bt_inventarioActionPerformed

    private void bt_notificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_notificacionesActionPerformed
                Notificaciones ventana = new Notificaciones( lb_nomusuarios.getText());
                ventana.setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_bt_notificacionesActionPerformed

    private void bt_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_registrarActionPerformed
       String Administrador= lb_nomusuarios.getText();
       String Salon=(String) cb_salon.getSelectedItem();
       String Comentario=ta_observacion.getText();
        try{
            if(ta_observacion.getText().isEmpty()){
                
                JOptionPane.showMessageDialog(null,"Campo vacios","Campo vacios",JOptionPane.PLAIN_MESSAGE,new ImageIcon("src/img/documento.png"));
            }else{
            Connection connection = Base_datos.getConnection();
            PreparedStatement ps=connection.prepareStatement("INSERT INTO Rondines (Administrador ,Salon,Comentario )VALUES(?,?,?)");
            ps.setString(1, Administrador);
            ps.setString(2, Salon);
            ps.setString(3, Comentario);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Registro Guardado","Registro Guardado",JOptionPane.PLAIN_MESSAGE,new ImageIcon("src/webservices-http-api-playsms-para-agregar-una-cuenta-de-usuario.png"));
            }
        }catch(SQLException ex){
            System.out.println(""+ex);
        }
    }//GEN-LAST:event_bt_registrarActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        cerrar();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void ta_observacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ta_observacionKeyTyped
            if( ta_observacion.getText().length() >= 200)
    {
        evt.consume();
    }
    }//GEN-LAST:event_ta_observacionKeyTyped
public void cerrar(){
        Object [] opciones ={"Aceptar","Cancelar"};
        int eleccion = JOptionPane.showOptionDialog(rootPane,"Desea cerrar sesión","Mensaje de Confirmacion",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE,null,opciones,"Aceptar");
        if (eleccion == JOptionPane.YES_OPTION)
        {
        inicio ventana = new inicio( );
        ventana.setVisible(true);
        this.setVisible(false);
        }else{
        }
    }
    
    
    //aqui se llenan el combobox de tipo salones
    private ArrayList<Integer> llena_Salone() {
        Connection connection = Base_datos.getConnection();
        Statement stmt;
        ResultSet rs;
        ArrayList  salones =new ArrayList<>();
        try {
            stmt = connection.createStatement();
            rs = stmt.executeQuery("SELECT Id FROM Salones");
            while (rs.next()) {
                salones.add(rs.getString("Id"));
            }
        } catch (SQLException ex) {
            
        }
        return salones;
    }
    private void llenar_Salones(){
        ArrayList salones = llena_Salone();
        try {
            cb_salon.removeAllItems();
                 for (int i = 0; i <= salones.size(); i++) {
                cb_salon.addItem(salones.get(i).toString());
            }
        } catch (Exception ex) {
            
        }
    }
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_administarHorarios;
    private javax.swing.JButton bt_administarUsuarios;
    private javax.swing.JButton bt_inventario;
    private javax.swing.JButton bt_notificaciones;
    private javax.swing.JButton bt_registrar;
    private javax.swing.JButton bt_reportes;
    private javax.swing.JButton bt_rondines;
    private javax.swing.JComboBox<String> cb_salon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_nomusuarios;
    private javax.swing.JLabel lb_observaciones;
    private javax.swing.JLabel lb_salon;
    private javax.swing.JTextArea ta_observacion;
    // End of variables declaration//GEN-END:variables
}
