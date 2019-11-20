
package view;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaAplicacao
     */
    public TelaPrincipal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        administrador = new javax.swing.JLabel();
        botao_login = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        logo_principal = new javax.swing.JLabel();
        jLabel_fundo_principal = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        administrador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        administrador.setForeground(new java.awt.Color(255, 255, 255));
        administrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ADMINISTRADOR.png"))); // NOI18N
        jPanel1.add(administrador);
        administrador.setBounds(290, 630, 170, 70);

        botao_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botao-login.png"))); // NOI18N
        botao_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botao_loginMouseClicked(evt);
            }
        });
        jPanel1.add(botao_login);
        botao_login.setBounds(80, 400, 297, 100);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botao-cadastrar.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(80, 480, 300, 110);

        logo_principal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LOGO.png"))); // NOI18N
        jPanel1.add(logo_principal);
        logo_principal.setBounds(130, 80, 190, 220);

        jLabel_fundo_principal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundo-comida-principal.png"))); // NOI18N
        jLabel_fundo_principal.setText("jLabel3");
        jPanel1.add(jLabel_fundo_principal);
        jLabel_fundo_principal.setBounds(0, -20, 470, 730);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botao_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botao_loginMouseClicked
        JOptionPane.showMessageDialog(null, "Hello");
    }//GEN-LAST:event_botao_loginMouseClicked

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel administrador;
    private javax.swing.JLabel botao_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_fundo_principal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel logo_principal;
    // End of variables declaration//GEN-END:variables
}
