/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import java.awt.Toolkit;

/**
 *
 * @author pedrovazquezg
 */
public class VentanaInicial extends javax.swing.JFrame {
    private String usuario1;
    private String usuario2;

    /**
     * Creates new form VentanaInicial
     */
    public VentanaInicial() {
        setSize(620, 450);
        setLocationRelativeTo(null);
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/imagenes/icono.png")));
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
        etiquetaTitulo = new javax.swing.JLabel();
        etiquetaPlayer1 = new javax.swing.JLabel();
        etiquetaPlayer2 = new javax.swing.JLabel();
        cajaPlayer1 = new javax.swing.JTextField();
        cajaPlayer2 = new javax.swing.JTextField();
        etiquetaImagenInicio = new javax.swing.JLabel();
        botonGuardar = new javax.swing.JButton();
        etiquetaMuestra1 = new javax.swing.JLabel();
        etiquetaMuestra2 = new javax.swing.JLabel();
        botonJugar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gati Aideé");

        etiquetaTitulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        etiquetaTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiquetaTitulo.setText("Juego del Gati en Raya");

        etiquetaPlayer1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etiquetaPlayer1.setText("Nombre del Jugador 1:");

        etiquetaPlayer2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etiquetaPlayer2.setText("Nombre del Jugador 2:");

        cajaPlayer1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        cajaPlayer2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        etiquetaImagenInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gatoConLentes.png"))); // NOI18N

        botonGuardar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        etiquetaMuestra1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        etiquetaMuestra2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        botonJugar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        botonJugar.setText("Entendido ¡A Jugar!");
        botonJugar.setVisible(false);
        botonJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonJugarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(etiquetaTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(etiquetaImagenInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(botonGuardar))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(etiquetaMuestra2, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(etiquetaMuestra1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                .addComponent(botonJugar))))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaPlayer1)
                            .addComponent(etiquetaPlayer2))
                        .addGap(18, 18, 18)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cajaPlayer1, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(cajaPlayer2))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(etiquetaTitulo)
                .addGap(57, 57, 57)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaPlayer1)
                    .addComponent(cajaPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaPlayer2)
                    .addComponent(cajaPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(etiquetaImagenInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelLayout.createSequentialGroup()
                        .addComponent(botonGuardar)
                        .addGap(57, 57, 57)
                        .addComponent(etiquetaMuestra1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiquetaMuestra2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonJugar)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        usuario1 = cajaPlayer1.getText();
        usuario2 = cajaPlayer2.getText();
        
        botonGuardar.setVisible(false);
        etiquetaMuestra1.setText(usuario1 + " jugará primero. Ficha: X");
        etiquetaMuestra2.setText(usuario2 + ", tu ficha es: O");
        botonJugar.setVisible(true);
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonJugarActionPerformed
        VentanaPrincipal ventanaP = new VentanaPrincipal(usuario1, usuario2);
        ventanaP.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_botonJugarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonJugar;
    private javax.swing.JTextField cajaPlayer1;
    private javax.swing.JTextField cajaPlayer2;
    private javax.swing.JLabel etiquetaImagenInicio;
    private javax.swing.JLabel etiquetaMuestra1;
    private javax.swing.JLabel etiquetaMuestra2;
    private javax.swing.JLabel etiquetaPlayer1;
    private javax.swing.JLabel etiquetaPlayer2;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
