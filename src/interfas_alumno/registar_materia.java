/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfas_alumno;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author liooficial
 */
public class registar_materia extends javax.swing.JFrame {
    private Color color;
    /**
     * Creates new form registar_materia
     */
    public registar_materia() {
        initComponents();
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
        lb_titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_materias = new javax.swing.JTable();
        lb_nombreDeMateria = new javax.swing.JLabel();
        tf_nombreDeMateria = new javax.swing.JTextField();
        pn_color = new javax.swing.JPanel();
        lb_color = new javax.swing.JLabel();
        bt_registrar = new javax.swing.JButton();
        bt_modificar = new javax.swing.JButton();
        bt_eliminar = new javax.swing.JButton();
        bt_regresar = new javax.swing.JButton();
        bt_eliminar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        lb_titulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lb_titulo.setText("Administración de materias");

        tb_materias.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tb_materias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Red", "Green", "Blue"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tb_materias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_materiasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_materias);

        lb_nombreDeMateria.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_nombreDeMateria.setText("Nombre de la materia:");

        tf_nombreDeMateria.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        pn_color.setBackground(new java.awt.Color(255, 204, 102));
        pn_color.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_colorMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pn_colorLayout = new javax.swing.GroupLayout(pn_color);
        pn_color.setLayout(pn_colorLayout);
        pn_colorLayout.setHorizontalGroup(
            pn_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 166, Short.MAX_VALUE)
        );
        pn_colorLayout.setVerticalGroup(
            pn_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );

        lb_color.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_color.setText("Color:");

        bt_registrar.setBackground(new java.awt.Color(255, 255, 255));
        bt_registrar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        bt_registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/editar.png"))); // NOI18N
        bt_registrar.setText("Registrar");
        bt_registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_registrarMouseClicked(evt);
            }
        });
        bt_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_registrarActionPerformed(evt);
            }
        });

        bt_modificar.setBackground(new java.awt.Color(255, 255, 255));
        bt_modificar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        bt_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/documento.png"))); // NOI18N
        bt_modificar.setText("Modificar");
        bt_modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_modificarMouseClicked(evt);
            }
        });

        bt_eliminar.setBackground(new java.awt.Color(255, 255, 255));
        bt_eliminar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        bt_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar (1).png"))); // NOI18N
        bt_eliminar.setText("Eliminar");
        bt_eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_eliminarMouseClicked(evt);
            }
        });

        bt_regresar.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        bt_regresar.setText("Regresar");
        bt_regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_regresarMouseClicked(evt);
            }
        });

        bt_eliminar1.setBackground(new java.awt.Color(255, 255, 255));
        bt_eliminar1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        bt_eliminar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/regreso .png"))); // NOI18N
        bt_eliminar1.setText("Regresar");
        bt_eliminar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_eliminar1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(tf_nombreDeMateria)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lb_titulo)
                                    .addComponent(lb_nombreDeMateria)
                                    .addComponent(lb_color))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pn_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(bt_registrar)
                        .addGap(40, 40, 40)
                        .addComponent(bt_modificar)
                        .addGap(18, 18, 18)
                        .addComponent(bt_eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(bt_eliminar1)
                        .addGap(21, 21, 21))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(394, 394, 394)
                    .addComponent(bt_regresar)
                    .addContainerGap(395, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_titulo)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lb_nombreDeMateria)
                .addGap(18, 18, 18)
                .addComponent(tf_nombreDeMateria, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lb_color)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pn_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bt_modificar)
                        .addComponent(bt_registrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_eliminar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(323, 323, 323)
                    .addComponent(bt_regresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(324, 324, 324)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tb_materiasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_materiasMouseClicked
       
    }//GEN-LAST:event_tb_materiasMouseClicked

    private void pn_colorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_colorMouseClicked
       JColorChooser jcc = new JColorChooser();
        jcc.setVisible(true);
        color = jcc.showDialog(null, "Selecciona el color de la materia", Color.WHITE);
        if (color == null) color = Color.WHITE;
        
        pn_color.setBackground(color);
    }//GEN-LAST:event_pn_colorMouseClicked

    private void bt_registrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_registrarMouseClicked
       
    }//GEN-LAST:event_bt_registrarMouseClicked

    private void bt_modificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_modificarMouseClicked
       
    }//GEN-LAST:event_bt_modificarMouseClicked

    private void bt_eliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_eliminarMouseClicked
       
    }//GEN-LAST:event_bt_eliminarMouseClicked

    private void bt_regresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_regresarMouseClicked
        
    }//GEN-LAST:event_bt_regresarMouseClicked

    private void bt_eliminar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_eliminar1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_eliminar1MouseClicked

    private void bt_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_registrarActionPerformed
        if (nombreEstaVacio()) return;
        try {
            Connection connection = Base_datos.getConnection();
            PreparedStatement prStmt = connection.prepareStatement("INSERT INTO Materias(Nombre, ColorRed, ColorGreen, ColorBlue) VALUES(?, ?, ?, ?);");
            prStmt.setString(1, tf_nombreDeMateria.getText());
            prStmt.setInt(2, pn_color.getBackground().getRed());
            prStmt.setInt(3, pn_color.getBackground().getGreen());
            prStmt.setInt(4, pn_color.getBackground().getBlue());
            prStmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro exitoso");
            llenarTablaDeMaterias();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo realizar el registro");
        }
        
       
    }//GEN-LAST:event_bt_registrarActionPerformed
    private boolean nombreEstaVacio() {
        if (tf_nombreDeMateria.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El nombre de la materia esta vacío");
            return true;
        } else {
            return false;
        }
    }
    
    private void llenarTablaDeMaterias() {
        try {
            String rJ="SELECT Nombre, ColorRed, ColorGreen, ColorBlue FROM Materias;";
            Connection connection = Base_datos.getConnection();
            Statement st;
            ResultSet rs;
            st = connection.createStatement();
            rs = st.executeQuery(rJ);
            DefaultTableModel dtm = (DefaultTableModel) tb_materias.getModel();
            dtm.setRowCount(0);
            
            if (rs != null) {
                while (rs.next()) {
                    String[] fila = {rs.getString("Nombre"), rs.getString("ColorRed"), rs.getString("ColorGreen"), rs.getString("ColorBlue")};
                    dtm.addRow(fila);
                }
            }
            tb_materias.setModel(dtm);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: No se pudó realizar la consulta");
        }
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
            java.util.logging.Logger.getLogger(registar_materia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registar_materia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registar_materia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registar_materia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registar_materia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_eliminar;
    private javax.swing.JButton bt_eliminar1;
    private javax.swing.JButton bt_modificar;
    private javax.swing.JButton bt_registrar;
    private javax.swing.JButton bt_regresar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_color;
    private javax.swing.JLabel lb_nombreDeMateria;
    private javax.swing.JLabel lb_titulo;
    private javax.swing.JPanel pn_color;
    private javax.swing.JTable tb_materias;
    private javax.swing.JTextField tf_nombreDeMateria;
    // End of variables declaration//GEN-END:variables
}
