/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;

import java.net.URL;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author pedrovazquezg
 */
public class Persona extends javax.swing.JFrame {

    public static final String URL = "jdbc:mysql://localhost:3306/escuela?autoReconnet=true&useSSL=false"; 
    public static final String usuario = "root";
    public static final String contrasena = "Frikis.Life09";
    PreparedStatement ps;
    ResultSet rs;
    
    public Connection getConnection() {
       Connection conexion = null;
       
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(URL, usuario, contrasena);
            // JOptionPane.showMessageDialog(null, "Conexión éxitosa");
        } catch (Exception e) {
            System.err.println("Error. " + e);
        }
       return conexion;
    }
    
    public void cleanerBox() {
        boxBuscar.setText(null);
        boxClave.setText(null);
        boxNombre.setText(null);
        boxDomicilio.setText(null);
        boxCelular.setText(null);
        boxCorreo.setText(null);
        boxFechaNacimiento.setText(null);
        comboGenero.setSelectedIndex(0);
    }
    
    public Persona() {
        initComponents();
        boxID.setVisible(false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        boxClave = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        boxNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        boxDomicilio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        boxCelular = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        boxCorreo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        boxFechaNacimiento = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        comboGenero = new javax.swing.JComboBox<>();
        botonInsertar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonLimpiar = new javax.swing.JButton();
        botonBuscar = new javax.swing.JButton();
        boxBuscar = new javax.swing.JTextField();
        boxID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        jLabel1.setText("Clave:");

        boxClave.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N

        jLabel2.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        jLabel2.setText("Nombre:");

        boxNombre.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N

        jLabel3.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        jLabel3.setText("Domicilio:");

        boxDomicilio.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N

        jLabel4.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        jLabel4.setText("Celular:");

        boxCelular.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N

        jLabel5.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        jLabel5.setText("Correo electrónico:");

        boxCorreo.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N

        jLabel6.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        jLabel6.setText("Fecha de nacimiento:");

        boxFechaNacimiento.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N

        jLabel7.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        jLabel7.setText("Género: ");

        comboGenero.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        comboGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Masculino", "Femenino" }));

        botonInsertar.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        botonInsertar.setText("Insertar");
        botonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarActionPerformed(evt);
            }
        });

        botonModificar.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        botonModificar.setText("Modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        botonEliminar.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        botonLimpiar.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        botonLimpiar.setText("Limpiar");
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });

        botonBuscar.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N
        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        boxBuscar.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N

        boxID.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 13)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonInsertar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonLimpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxFechaNacimiento)
                            .addComponent(boxCorreo)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boxBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(boxID, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(botonBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(boxClave, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                            .addComponent(boxDomicilio)
                            .addComponent(boxCelular)
                            .addComponent(boxNombre))))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonBuscar)
                    .addComponent(boxBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boxID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(boxClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(boxNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(boxDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(boxCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(boxCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(boxFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(comboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonInsertar)
                    .addComponent(botonModificar)
                    .addComponent(botonEliminar)
                    .addComponent(botonLimpiar))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarActionPerformed
        Connection conexion = null;
        
        try {
            conexion = getConnection();
            ps = conexion.prepareStatement("insert into persona (clave, nombre, domicilio, celular, correo_electronico, fecha_nacimiento, genero) values(?,?,?,?,?,?,?)");
            
            ps.setString(1, boxClave.getText());
            ps.setString(2, boxNombre.getText());
            ps.setString(3, boxDomicilio.getText());
            ps.setString(4, boxCelular.getText());
            ps.setString(5, boxCorreo.getText());
            ps.setDate(6, Date.valueOf(boxFechaNacimiento.getText()));
            ps.setString(7, comboGenero.getSelectedItem().toString());
            
            int resultado = ps.executeUpdate(); // Ejecutamos la inserción de los datos
            
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Registro insertado correctamente");
                cleanerBox();
            } else {
                JOptionPane.showMessageDialog(null, "Error al insertar registro");
                cleanerBox();
            }
            
            conexion.close();
        } catch (Exception e) {
            System.err.println("Error" + e);
        }
    }//GEN-LAST:event_botonInsertarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        Connection conexion = null;
        
        try {
            conexion = getConnection();
            ps = conexion.prepareStatement("update persona set clave = ?, nombre = ?, domicilio = ?, celular = ?, correo_electronico = ?, fecha_nacimiento = ?, genero = ? where idPersona = ?");
            
            ps.setString(1, boxClave.getText());
            ps.setString(2, boxNombre.getText());
            ps.setString(3, boxDomicilio.getText());
            ps.setString(4, boxCelular.getText());
            ps.setString(5, boxCorreo.getText());
            ps.setDate(6, Date.valueOf(boxFechaNacimiento.getText()));
            ps.setString(7, comboGenero.getSelectedItem().toString());
            ps.setInt(8, Integer.parseInt(boxID.getText()));
            
            int resultado = ps.executeUpdate(); // Ejecutamos la modificación de los datos
            
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Registro modificado correctamente");
                cleanerBox();
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar registro");
                cleanerBox();
            }
            
            conexion.close();
        } catch (Exception e) {
            System.err.println("Error" + e);
        }
    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        Connection conexion = null;
        
        try {
            conexion = getConnection();
            ps = conexion.prepareStatement("delete from persona where idPersona = ?");
            
            ps.setInt(1, Integer.parseInt(boxID.getText()));
            
            int resultado = ps.executeUpdate(); // Ejecutamos la eliminación de los datos
            
            if (resultado > 0) {
                JOptionPane.showMessageDialog(null, "Registro eliminado correctamente");
                cleanerBox();
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar registro");
                cleanerBox();
            }
            
            conexion.close();
        } catch (Exception e) {
            System.err.println("Error" + e);
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        cleanerBox();
    }//GEN-LAST:event_botonLimpiarActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        Connection conexion = null;
        
        try {
            conexion = getConnection();
            ps = conexion.prepareStatement("select * from persona where clave = ?");
            ps.setString(1, boxBuscar.getText());
            rs = ps.executeQuery();
            
            if (rs.next()) {
                boxID.setText(String.valueOf(rs.getInt("idPersona")));
                boxClave.setText(rs.getString("clave"));
                boxNombre.setText(rs.getString("nombre"));
                boxDomicilio.setText(rs.getString("domicilio"));
                boxCelular.setText(rs.getString("celular"));
                boxCorreo.setText(rs.getString("correo_electronico"));
                boxFechaNacimiento.setText(String.valueOf(rs.getDate("fecha_nacimiento")));
                comboGenero.setSelectedItem(rs.getString("genero"));
            } else {
                JOptionPane.showMessageDialog(null, "No existe una persona con esa clave");
            }
            
            conexion.close();
        } catch (Exception e) {
            System.err.println("Error. " + e);
        }
    }//GEN-LAST:event_botonBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(Persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Persona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Persona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonInsertar;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JTextField boxBuscar;
    private javax.swing.JTextField boxCelular;
    private javax.swing.JTextField boxClave;
    private javax.swing.JTextField boxCorreo;
    private javax.swing.JTextField boxDomicilio;
    private javax.swing.JTextField boxFechaNacimiento;
    private javax.swing.JTextField boxID;
    private javax.swing.JTextField boxNombre;
    private javax.swing.JComboBox<String> comboGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
