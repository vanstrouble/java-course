/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

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
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        panel = new javax.swing.JPanel();
        imagenC1 = new javax.swing.JLabel();
        tituloC1 = new javax.swing.JLabel();
        generoC1 = new javax.swing.JLabel();
        imagenC2 = new javax.swing.JLabel();
        tituloC2 = new javax.swing.JLabel();
        generoC2 = new javax.swing.JLabel();
        imagenC3 = new javax.swing.JLabel();
        tituloC3 = new javax.swing.JLabel();
        generoC3 = new javax.swing.JLabel();
        imagenC4 = new javax.swing.JLabel();
        tituloC4 = new javax.swing.JLabel();
        generoC4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Caricaturas");

        panel.setLayout(new java.awt.GridBagLayout());

        imagenC1.setIcon(new javax.swing.ImageIcon("/Users/pedrovazquezg/OneDrive - Universidad de Guanajuato/Universidad/UG/04 Cursos/Udemy/Java/13 Interfaces gráficas de usuario/Ejercicio7/src/main/java/imagenes/spiderman.jpg")); // NOI18N
        imagenC1.setLabelFor(imagenC1);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 0);
        panel.add(imagenC1, gridBagConstraints);

        tituloC1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        tituloC1.setText("Título: The Spectacular Spider Man");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 20);
        panel.add(tituloC1, gridBagConstraints);

        generoC1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        generoC1.setText("Género: Acción");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 20);
        panel.add(generoC1, gridBagConstraints);

        imagenC2.setIcon(new javax.swing.ImageIcon("/Users/pedrovazquezg/OneDrive - Universidad de Guanajuato/Universidad/UG/04 Cursos/Udemy/Java/13 Interfaces gráficas de usuario/Ejercicio7/src/main/java/imagenes/adventuretime.jpg")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 0);
        panel.add(imagenC2, gridBagConstraints);

        tituloC2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        tituloC2.setText("Título: Adventure Time");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 20);
        panel.add(tituloC2, gridBagConstraints);

        generoC2.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        generoC2.setText("Género: Aventura");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 20);
        panel.add(generoC2, gridBagConstraints);

        imagenC3.setIcon(new javax.swing.ImageIcon("/Users/pedrovazquezg/OneDrive - Universidad de Guanajuato/Universidad/UG/04 Cursos/Udemy/Java/13 Interfaces gráficas de usuario/Ejercicio7/src/main/java/imagenes/simpsons.jpg")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 0);
        panel.add(imagenC3, gridBagConstraints);

        tituloC3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        tituloC3.setText("Título: The Simpsons");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 20);
        panel.add(tituloC3, gridBagConstraints);

        generoC3.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        generoC3.setText("Género: Comedia");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 20);
        panel.add(generoC3, gridBagConstraints);

        imagenC4.setIcon(new javax.swing.ImageIcon("/Users/pedrovazquezg/OneDrive - Universidad de Guanajuato/Universidad/UG/04 Cursos/Udemy/Java/13 Interfaces gráficas de usuario/Ejercicio7/src/main/java/imagenes/rickandmorty.jpg")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 0);
        panel.add(imagenC4, gridBagConstraints);

        tituloC4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        tituloC4.setText("Título: Rick and Morty");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 0, 20);
        panel.add(tituloC4, gridBagConstraints);

        generoC4.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        generoC4.setText("Género: Ciencia ficción");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.insets = new java.awt.Insets(10, 20, 0, 20);
        panel.add(generoC4, gridBagConstraints);

        jScrollPane1.setViewportView(panel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JLabel generoC1;
    private javax.swing.JLabel generoC2;
    private javax.swing.JLabel generoC3;
    private javax.swing.JLabel generoC4;
    private javax.swing.JLabel imagenC1;
    private javax.swing.JLabel imagenC2;
    private javax.swing.JLabel imagenC3;
    private javax.swing.JLabel imagenC4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel tituloC1;
    private javax.swing.JLabel tituloC2;
    private javax.swing.JLabel tituloC3;
    private javax.swing.JLabel tituloC4;
    // End of variables declaration//GEN-END:variables
}
