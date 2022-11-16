/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfas_alumno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author liooficial
 */
public class Administracion_de_mensajes extends javax.swing.JFrame {

    /**
     * Creates new form Administracion_de_mensajes
     */
    public Administracion_de_mensajes(final String nom){
        initComponents();
        this.setLocationRelativeTo(null);
        cargar_tabla();
        lb_usuario.setText(nom);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_mensajes = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bt_eliminar = new javax.swing.JButton();
        bt_modificar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tipo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lb_usuario = new javax.swing.JLabel();
        lb_usuario1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jta_cuerpo = new javax.swing.JTextArea();
        jc_estado = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1400, 797));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/isc350X140.png"))); // NOI18N

        salir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/correo60X60.png"))); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(108, 108, 108)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(319, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 630));

        tb_mensajes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tb_mensajes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Creado", "Asunto", "Cuerpo", "Usuario dirigido", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_mensajes.setSelectionBackground(new java.awt.Color(107, 8, 48));
        tb_mensajes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_mensajesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_mensajes);
        if (tb_mensajes.getColumnModel().getColumnCount() > 0) {
            tb_mensajes.getColumnModel().getColumn(0).setResizable(false);
            tb_mensajes.getColumnModel().getColumn(1).setResizable(false);
            tb_mensajes.getColumnModel().getColumn(2).setResizable(false);
            tb_mensajes.getColumnModel().getColumn(3).setResizable(false);
            tb_mensajes.getColumnModel().getColumn(4).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 950, 270));

        jPanel4.setBackground(new java.awt.Color(1, 26, 93));
        jPanel4.setForeground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administración de notificaciones");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(299, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(277, 277, 277))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 1100, -1));

        bt_eliminar.setBackground(new java.awt.Color(107, 8, 48));
        bt_eliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar (1).png"))); // NOI18N
        bt_eliminar.setContentAreaFilled(false);
        bt_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(bt_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 460, 80, 70));

        bt_modificar.setBackground(new java.awt.Color(204, 255, 204));
        bt_modificar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        bt_modificar.setText("modificar");
        bt_modificar.setContentAreaFilled(false);
        bt_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_modificarActionPerformed(evt);
            }
        });
        getContentPane().add(bt_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 720, 180, 70));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Estado:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 490, -1, -1));

        tipo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Estudiante", "Docente", "Todos" }));
        getContentPane().add(tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 490, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Cuerpo:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 570, -1, -1));

        jPanel2.setBackground(new java.awt.Color(107, 8, 48));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/administrador.png"))); // NOI18N

        lb_usuario.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lb_usuario.setForeground(new java.awt.Color(255, 255, 255));
        lb_usuario.setText("jLabel5");

        lb_usuario1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lb_usuario1.setForeground(new java.awt.Color(255, 255, 255));
        lb_usuario1.setText("Usuario:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_usuario)
                    .addComponent(lb_usuario1))
                .addGap(53, 53, 53))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(lb_usuario1)
                .addGap(30, 30, 30)
                .addComponent(lb_usuario)
                .addGap(95, 95, 95))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 630, 350, -1));

        jta_cuerpo.setColumns(20);
        jta_cuerpo.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jta_cuerpo.setLineWrap(true);
        jta_cuerpo.setRows(5);
        jta_cuerpo.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jta_cuerpo);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 570, 880, -1));

        jc_estado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jc_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        getContentPane().add(jc_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 490, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Usuario dirigido:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 490, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tb_mensajesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_mensajesMouseClicked
       try{
            int fila=tb_mensajes.getSelectedRow();
            String  Asunto=(String) tb_mensajes.getValueAt(fila, 1);
            Connection con=Base_datos.getConnection();
            PreparedStatement ps;
            ResultSet rs;
            ps=con.prepareStatement("SELECT Asunto,Cuerpo,TipoDeUsuarioAlQueSeDirige,Estado FROM Mensajes WHERE Asunto=? ");
            ps.setString(1, Asunto);
            rs=ps.executeQuery();
            while(rs.next()){
            jta_cuerpo.setText(rs.getString("Cuerpo"));
            tipo.setSelectedItem(rs.getString("TipoDeUsuarioAlQueSeDirige"));
            jc_estado.setSelectedItem(rs.getString("Estado"));
            }
        }catch(Exception ex){
            //JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_tb_mensajesMouseClicked

    private void bt_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_modificarActionPerformed
       int fila=tb_mensajes.getSelectedRow();
       String  Asunto=(String) tb_mensajes.getValueAt(fila, 1);
       String cuerpo=jta_cuerpo.getText();
       String tipod=(String) tipo.getSelectedItem();
       String estado=(String)jc_estado.getSelectedItem();
        try{
            if(jta_cuerpo.getText().isEmpty() ){
                
                JOptionPane.showMessageDialog(null,"Campos vacios","Campos vacios",JOptionPane.PLAIN_MESSAGE);
            }else{
            Connection con=Base_datos.getConnection();
            PreparedStatement ps=con.prepareStatement("UPDATE Mensajes SET Cuerpo=?, TipoDeUsuarioAlQueSeDirige=?, Estado=? WHERE Asunto=?");
            ps.setString(1, cuerpo);
            ps.setString(2, tipod);
            ps.setString(3, estado);
            ps.setString(4, Asunto);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Registro modificado","Registro modificado",JOptionPane.PLAIN_MESSAGE,new ImageIcon("src/img/correo-electronico.png"));
            limpiar();
            cargar_tabla();
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.toString());
        }
    }//GEN-LAST:event_bt_modificarActionPerformed

    private void bt_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_eliminarActionPerformed
        int fila=tb_mensajes.getSelectedRow();
            String  Asunto=(String) tb_mensajes.getValueAt(fila, 1);
        try{
            Connection con=Base_datos.getConnection();
            PreparedStatement ps=con.prepareStatement("DELETE FROM Mensajes WHERE Asunto=?  ");
            ps.setString(1, Asunto);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Registro ELIMINADO","Registro ELIMINADO",JOptionPane.PLAIN_MESSAGE,new ImageIcon("src/img/eliminar.png"));
            limpiar();
            cargar_tabla();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "");
        }
    }//GEN-LAST:event_bt_eliminarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        Notificaciones ventana = new Notificaciones(lb_usuario.getText() );
                ventana.setVisible(true);
                this.setVisible(false);
    }//GEN-LAST:event_salirActionPerformed
    
    private void cargar_tabla(){
        DefaultTableModel mesajes = (DefaultTableModel) tb_mensajes.getModel(); 
        mesajes.setRowCount(0);
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        try{
            Connection con = Base_datos.getConnection();
            ps=con.prepareStatement("SELECT * FROM Mensajes ");
            rs=ps.executeQuery();
            rsmd=rs.getMetaData();
            columnas =rsmd.getColumnCount();
            while(rs.next()){
                Object[] fila= new Object[columnas];
                for(int indice=0;indice<columnas;indice++){
                    fila[indice]= rs.getObject(indice+1);
                }
                mesajes.addRow(fila);
            }
        }catch(SQLException ex){
         JOptionPane.showMessageDialog(null, ex.toString());
        }
    }
    private void limpiar(){
        jta_cuerpo.setText("");
    }
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_eliminar;
    private javax.swing.JButton bt_modificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jc_estado;
    private javax.swing.JTextArea jta_cuerpo;
    private javax.swing.JLabel lb_usuario;
    private javax.swing.JLabel lb_usuario1;
    private javax.swing.JButton salir;
    private javax.swing.JTable tb_mensajes;
    private javax.swing.JComboBox<String> tipo;
    // End of variables declaration//GEN-END:variables
}
