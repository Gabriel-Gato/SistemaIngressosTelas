/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Model;
import Dados.Autenticacao;
import java.util.prefs.Preferences;
/**
 *
 * @author Ryan
 */
public class TelaMeusDados extends javax.swing.JFrame {

    private Preferences prefs = Preferences.userNodeForPackage(TelaMeusDados.class);
    
    public TelaMeusDados() {
        initComponents();
        String emailSalvo = prefs.get("email", "");
        String senhaSalva = prefs.get("senha", "");
        String cpfSalvo = prefs.get("cpf", "");
        
        txtMEU_CPF.setText(cpfSalvo);
        txtMEU_EMAIL.setText(emailSalvo);
        txtMINHA_SENHA.setText(senhaSalva);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtMEU_EMAIL = new javax.swing.JTextField();
        txtMINHA_SENHA = new javax.swing.JPasswordField();
        txtMEU_CPF = new javax.swing.JPasswordField();
        BtnAlterarSenha = new javax.swing.JButton();
        BtnAlterarEmail = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMEU_EMAIL.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        txtMEU_EMAIL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMEU_EMAILActionPerformed(evt);
            }
        });
        getContentPane().add(txtMEU_EMAIL, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 200, 30));

        txtMINHA_SENHA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMINHA_SENHAActionPerformed(evt);
            }
        });
        getContentPane().add(txtMINHA_SENHA, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 200, 30));

        txtMEU_CPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMEU_CPFActionPerformed(evt);
            }
        });
        getContentPane().add(txtMEU_CPF, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 200, 30));

        BtnAlterarSenha.setContentAreaFilled(false);
        BtnAlterarSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnAlterarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAlterarSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(BtnAlterarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 160, 40));

        BtnAlterarEmail.setContentAreaFilled(false);
        BtnAlterarEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnAlterarEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAlterarEmailActionPerformed(evt);
            }
        });
        getContentPane().add(BtnAlterarEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 160, 50));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/TelaMeusDados.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 720, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtMEU_EMAILActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMEU_EMAILActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMEU_EMAILActionPerformed

    private void txtMINHA_SENHAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMINHA_SENHAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMINHA_SENHAActionPerformed

    private void BtnAlterarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAlterarSenhaActionPerformed
        TelaCadastro telaCadastro = new TelaCadastro();
        telaCadastro.setVisible(true);
    }//GEN-LAST:event_BtnAlterarSenhaActionPerformed

    private void BtnAlterarEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAlterarEmailActionPerformed
        String email = txtMEU_EMAIL.getText();
        String senha = txtMINHA_SENHA.getText();
        String cpf = txtMEU_CPF.getText();
        
        Autenticacao auth = new Autenticacao();
        
        if(auth.autenticarUsuario(email, senha)) {
       
        //salva a senha e o email digitado 
        prefs.put("email", email);
        prefs.put("senha", senha);
        prefs.put("cpf", cpf);
      
    } 
    }//GEN-LAST:event_BtnAlterarEmailActionPerformed

    private void txtMEU_CPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMEU_CPFActionPerformed
    }//GEN-LAST:event_txtMEU_CPFActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMeusDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMeusDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMeusDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMeusDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMeusDados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAlterarEmail;
    private javax.swing.JButton BtnAlterarSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField txtMEU_CPF;
    private javax.swing.JTextField txtMEU_EMAIL;
    private javax.swing.JPasswordField txtMINHA_SENHA;
    // End of variables declaration//GEN-END:variables
}
