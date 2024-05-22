package Model;

public class TelaFormasDePagamento extends javax.swing.JFrame {

    public TelaFormasDePagamento() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnCancelar = new javax.swing.JButton();
        BtnDebito = new javax.swing.JButton();
        BtnPix = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnCancelar.setContentAreaFilled(false);
        BtnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 160, 50));

        BtnDebito.setContentAreaFilled(false);
        BtnDebito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnDebito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDebitoActionPerformed(evt);
            }
        });
        getContentPane().add(BtnDebito, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 230, 60));

        BtnPix.setContentAreaFilled(false);
        BtnPix.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnPix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPixActionPerformed(evt);
            }
        });
        getContentPane().add(BtnPix, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 230, 90));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/TelaFormasDePagamento.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnDebitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDebitoActionPerformed
     TelaDebito debito = new TelaDebito();
     debito.setVisible(true);
    }//GEN-LAST:event_BtnDebitoActionPerformed

    private void BtnPixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPixActionPerformed
      TelaPix pix = new TelaPix();
     pix.setVisible(true);
    }//GEN-LAST:event_BtnPixActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
          TelaIngressos ing = new TelaIngressos();
     ing.setVisible(true);
    }//GEN-LAST:event_BtnCancelarActionPerformed
                                             

    
    public static void main(String args[]) {
       

     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFormasDePagamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnDebito;
    private javax.swing.JButton BtnPix;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
