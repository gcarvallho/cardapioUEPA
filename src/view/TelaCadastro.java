
package view;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class TelaCadastro extends javax.swing.JFrame {

    /**
     * Creates new form TelaAplicacao
     */
    public TelaCadastro() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        voltar = new javax.swing.JLabel();
        cadastro = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        fundoCampo = new javax.swing.JLabel();
        Faixa = new javax.swing.JLabel();
        botaoConfirmar = new javax.swing.JButton();
        imagemFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/seta-voltar.png"))); // NOI18N
        voltar.setText("jLabel2");
        jPanel1.add(voltar);
        voltar.setBounds(30, 30, 30, 30);

        cadastro.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cadastro.setForeground(new java.awt.Color(255, 255, 255));
        cadastro.setText("CADASTRO");
        jPanel1.add(cadastro);
        cadastro.setBounds(160, 30, 140, 30);

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 120, 90, 20);

        jTextField1.setAlignmentX(0.2F);
        jTextField1.setBorder(null);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(38, 153, 390, 35);

        fundoCampo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CAMPO DE TEXTO.png"))); // NOI18N
        jPanel1.add(fundoCampo);
        fundoCampo.setBounds(30, 120, 410, 100);

        Faixa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/textura-faixa-cadastro.jpg"))); // NOI18N
        Faixa.setText("jLabel4");
        jPanel1.add(Faixa);
        Faixa.setBounds(0, 0, 460, 80);

        botaoConfirmar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        botaoConfirmar.setText("Confirmar");
        jPanel1.add(botaoConfirmar);
        botaoConfirmar.setBounds(170, 630, 120, 40);

        imagemFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fundo-comida-cadastro.png"))); // NOI18N
        jPanel1.add(imagemFundo);
        imagemFundo.setBounds(0, 0, 460, 710);

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
    private javax.swing.JLabel Faixa;
    private javax.swing.JButton botaoConfirmar;
    private javax.swing.JLabel cadastro;
    private javax.swing.JLabel fundoCampo;
    private javax.swing.JLabel imagemFundo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel voltar;
    // End of variables declaration//GEN-END:variables
}
