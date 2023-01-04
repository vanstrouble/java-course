/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import java.awt.Color;

/**
 *
 * @author pedrovazquezg
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        grupoBotones.add(radioBoton1);
        grupoBotones.add(radioBoton2);
        grupoBotones.add(radioBoton3);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotones = new javax.swing.ButtonGroup();
        menuDesplegable = new javax.swing.JPopupMenu();
        ventanaMax = new javax.swing.JMenuItem();
        ventanaMin = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        cambiarColor = new javax.swing.JMenu();
        colorAzul = new javax.swing.JMenuItem();
        colorRojo = new javax.swing.JMenuItem();
        panel = new javax.swing.JPanel();
        barraMenu = new javax.swing.JMenuBar();
        menu1 = new javax.swing.JMenu();
        menuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu1 = new javax.swing.JMenu();
        radioBoton1 = new javax.swing.JRadioButtonMenuItem();
        radioBoton2 = new javax.swing.JRadioButtonMenuItem();
        radioBoton3 = new javax.swing.JRadioButtonMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuItemSalir = new javax.swing.JMenuItem();

        menuDesplegable.setComponentPopupMenu(menuDesplegable);

        ventanaMax.setText("Ventana más grande");
        ventanaMax.setToolTipText("Ventana más grande");
        ventanaMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventanaMaxActionPerformed(evt);
            }
        });
        menuDesplegable.add(ventanaMax);

        ventanaMin.setText("Ventana más pequeña");
        ventanaMin.setToolTipText("");
        ventanaMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventanaMinActionPerformed(evt);
            }
        });
        menuDesplegable.add(ventanaMin);
        menuDesplegable.add(jSeparator3);

        cambiarColor.setText("Cambiar color");

        colorAzul.setText("Azul");
        colorAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorAzulActionPerformed(evt);
            }
        });
        cambiarColor.add(colorAzul);

        colorRojo.setText("Color Rojo");
        colorRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorRojoActionPerformed(evt);
            }
        });
        cambiarColor.add(colorRojo);

        menuDesplegable.add(cambiarColor);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panelMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        menu1.setText("Menú");

        menuItem1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        menuItem1.setText("Inicio");
        menu1.add(menuItem1);
        menu1.add(jSeparator1);

        jMenu1.setText("Sub Menú");
        jMenu1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N

        radioBoton1.setSelected(true);
        radioBoton1.setText("Item 1");
        jMenu1.add(radioBoton1);

        radioBoton2.setSelected(true);
        radioBoton2.setText("Item 2");
        jMenu1.add(radioBoton2);

        radioBoton3.setSelected(true);
        radioBoton3.setText("Item 3");
        jMenu1.add(radioBoton3);

        jMenuItem1.setText("jMenuItem1");
        jMenu1.add(jMenuItem1);

        menu1.add(jMenu1);
        menu1.add(jSeparator2);

        menuItemSalir.setIcon(new javax.swing.ImageIcon("/Users/pedrovazquezg/OneDrive - Universidad de Guanajuato/Universidad/UG/04 Cursos/Udemy/Java/13 Interfaces gráficas de usuario/Barra de menu/BarraMenu/src/main/java/imagenes/salir.png")); // NOI18N
        menuItemSalir.setText("Salir");
        menuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSalirActionPerformed(evt);
            }
        });
        menu1.add(menuItemSalir);

        barraMenu.add(menu1);

        setJMenuBar(barraMenu);

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

    private void menuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuItemSalirActionPerformed

    private void panelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMouseReleased
        if (evt.isPopupTrigger()) {
            menuDesplegable.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_panelMouseReleased

    private void ventanaMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventanaMaxActionPerformed
        this.setSize(500, 500);
    }//GEN-LAST:event_ventanaMaxActionPerformed

    private void ventanaMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventanaMinActionPerformed
        this.setSize(300, 300);
    }//GEN-LAST:event_ventanaMinActionPerformed

    private void colorRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorRojoActionPerformed
        panel.setBackground(Color.red);
    }//GEN-LAST:event_colorRojoActionPerformed

    private void colorAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorAzulActionPerformed
        panel.setBackground(Color.BLUE);
    }//GEN-LAST:event_colorAzulActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenu cambiarColor;
    private javax.swing.JMenuItem colorAzul;
    private javax.swing.JMenuItem colorRojo;
    private javax.swing.ButtonGroup grupoBotones;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JMenu menu1;
    private javax.swing.JPopupMenu menuDesplegable;
    private javax.swing.JMenuItem menuItem1;
    private javax.swing.JMenuItem menuItemSalir;
    private javax.swing.JPanel panel;
    private javax.swing.JRadioButtonMenuItem radioBoton1;
    private javax.swing.JRadioButtonMenuItem radioBoton2;
    private javax.swing.JRadioButtonMenuItem radioBoton3;
    private javax.swing.JMenuItem ventanaMax;
    private javax.swing.JMenuItem ventanaMin;
    // End of variables declaration//GEN-END:variables
}
