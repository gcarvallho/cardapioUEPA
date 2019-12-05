
package view;
import dao.AdministradorDAO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Administrador;
public class TelaCadastroAdministrador extends javax.swing.JFrame {

    /**
     * Creates new form TelaAplicacao
     */
    public TelaCadastroAdministrador() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTNome_completo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTUsuario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPSenha = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jPSenha_confirmar = new javax.swing.JPasswordField();
        jLCadastrar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastrar Administrador");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 30, 280, 40);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Nome completo");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(50, 80, 90, 16);

        jTNome_completo.setBackground(new java.awt.Color(102, 102, 102));
        jTNome_completo.setForeground(new java.awt.Color(255, 255, 255));
        jTNome_completo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNome_completoActionPerformed(evt);
            }
        });
        jPanel1.add(jTNome_completo);
        jTNome_completo.setBounds(50, 100, 280, 40);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Usuário");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(50, 150, 50, 16);

        jTUsuario.setBackground(new java.awt.Color(102, 102, 102));
        jTUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jTUsuario);
        jTUsuario.setBounds(50, 170, 280, 40);

        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("Senha");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(50, 220, 50, 16);

        jPSenha.setBackground(new java.awt.Color(102, 102, 102));
        jPSenha.setForeground(new java.awt.Color(255, 255, 255));
        jPSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPSenhaActionPerformed(evt);
            }
        });
        jPanel1.add(jPSenha);
        jPSenha.setBounds(50, 240, 280, 40);

        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("Confirme a senha");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(50, 290, 100, 16);

        jPSenha_confirmar.setBackground(new java.awt.Color(102, 102, 102));
        jPSenha_confirmar.setForeground(new java.awt.Color(255, 255, 255));
        jPSenha_confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPSenha_confirmarActionPerformed(evt);
            }
        });
        jPanel1.add(jPSenha_confirmar);
        jPSenha_confirmar.setBounds(50, 310, 280, 40);

        jLCadastrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CRIAR-CONTA (1).png"))); // NOI18N
        jLCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLCadastrarMouseClicked(evt);
            }
        });
        jPanel1.add(jLCadastrar);
        jLCadastrar.setBounds(20, 440, 330, 70);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("VOLTAR");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(130, 530, 120, 14);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPSenhaActionPerformed

    private void jLCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCadastrarMouseClicked
        Administrador a = new Administrador();
        AdministradorDAO adao = new AdministradorDAO();
        
        a.setNome_completo(jTNome_completo.getText());
        a.setUsuario(jTUsuario.getText());
        a.setSenha(String.valueOf(jPSenha.getPassword()));
        //Aqui inserir o usuário no banco
        adao.inserir(a);
        
        //limpar os campos
        jTNome_completo.setText(null);
        jTUsuario.setText(null);
        jPSenha.setText(null);
        jPSenha_confirmar.setText(null);
                
    }//GEN-LAST:event_jLCadastrarMouseClicked

    private void jPSenha_confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPSenha_confirmarActionPerformed
        
    }//GEN-LAST:event_jPSenha_confirmarActionPerformed

    private void jTNome_completoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNome_completoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNome_completoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLCadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPSenha;
    private javax.swing.JPasswordField jPSenha_confirmar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTNome_completo;
    private javax.swing.JTextField jTUsuario;
    // End of variables declaration//GEN-END:variables
}
