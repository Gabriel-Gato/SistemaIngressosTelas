/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Model;
import Dados.Autenticacao;
import javax.swing.JOptionPane;
import java.util.prefs.Preferences;
/**
 *
 * @author Ryan
 */
public class TelaLogin extends javax.swing.JFrame {

    private Preferences prefs = Preferences.userNodeForPackage(TelaLogin.class);
    
    public TelaLogin() {
        initComponents();
        String emailSalvo = prefs.get("email", "");
        String senhaSalva = prefs.get("senha", "");
        txtEMAIL_LOGIN.setText(emailSalvo);
        txtSENHA_LOGIN.setText(senhaSalva);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtEMAIL_LOGIN = new javax.swing.JTextField();
        txtSENHA_LOGIN = new javax.swing.JPasswordField();
        BtnRealizarCadastro = new javax.swing.JButton();
        BtnLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEMAIL_LOGIN.setFont(new java.awt.Font("Georgia", 0, 12)); // NOI18N
        txtEMAIL_LOGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEMAIL_LOGINActionPerformed(evt);
            }
        });
        getContentPane().add(txtEMAIL_LOGIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 200, 30));

        txtSENHA_LOGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSENHA_LOGINActionPerformed(evt);
            }
        });
        getContentPane().add(txtSENHA_LOGIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 262, 200, 30));

        BtnRealizarCadastro.setContentAreaFilled(false);
        BtnRealizarCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnRealizarCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRealizarCadastroActionPerformed(evt);
            }
        });
        getContentPane().add(BtnRealizarCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, 160, 40));

        BtnLogin.setContentAreaFilled(false);
        BtnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(BtnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 160, 50));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/telaLoginTelaLogin.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 670, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEMAIL_LOGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEMAIL_LOGINActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEMAIL_LOGINActionPerformed

    private void txtSENHA_LOGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSENHA_LOGINActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSENHA_LOGINActionPerformed

    private void BtnRealizarCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRealizarCadastroActionPerformed
        TelaCadastro telaCadastro = new TelaCadastro();
        telaCadastro.setVisible(true);
    }//GEN-LAST:event_BtnRealizarCadastroActionPerformed

    private void BtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLoginActionPerformed
        String email = txtEMAIL_LOGIN.getText();
        String senha = txtSENHA_LOGIN.getText();
        
        Autenticacao auth = new Autenticacao();
        
        if(auth.autenticarUsuario(email, senha)) {
        // Login bem-sucedido, redirecione para a próxima tela ou realize outras ações
        JOptionPane.showMessageDialog(this, "Login bem-sucedido!");
       
        //salva a senha e o email digitado 
        prefs.put("email", email);
        prefs.put("senha", senha);
        // Adicione aqui a lógica para redirecionar para a próxima tela ou realizar outras ações
        TelaFilmes telaFilmes = new TelaFilmes();
        telaFilmes.setVisible(true);
    } else {
        // Login falhou, exiba uma mensagem de erro
        JOptionPane.showMessageDialog(this, "Email ou senha inválidos. Tente novamente.");
    }
    }//GEN-LAST:event_BtnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLogin;
    private javax.swing.JButton BtnRealizarCadastro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtEMAIL_LOGIN;
    private javax.swing.JPasswordField txtSENHA_LOGIN;
    // End of variables declaration//GEN-END:variables
}
