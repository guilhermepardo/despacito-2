/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.projeto.swing.encapsulamento;

/**
 *
 * @author jose
 */
public class TelaCarro extends javax.swing.JFrame {

    Carro carro1 = new Carro();
    Carro carro2 = new Carro();
    
    /**
     * Creates new form TelaCarro
     */
    public TelaCarro() {
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

        btLigar = new javax.swing.JButton();
        btAcelerar = new javax.swing.JButton();
        btFrear = new javax.swing.JButton();
        btDesligar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbStatus = new javax.swing.JLabel();
        lbVelocidade = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btLigar1 = new javax.swing.JButton();
        btAcelerar1 = new javax.swing.JButton();
        btFrear1 = new javax.swing.JButton();
        btDesligar1 = new javax.swing.JButton();
        lbStatus2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pbVelocidade2 = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btLigar.setText("Ligar");
        btLigar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLigarActionPerformed(evt);
            }
        });

        btAcelerar.setText("Acelerar");
        btAcelerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAcelerarActionPerformed(evt);
            }
        });

        btFrear.setText("Frear");
        btFrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFrearActionPerformed(evt);
            }
        });

        btDesligar.setText("Desligar");
        btDesligar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDesligarActionPerformed(evt);
            }
        });

        jLabel1.setText("Status do Carro:");

        lbStatus.setForeground(new java.awt.Color(0, 102, 0));
        lbStatus.setText("Desligado");

        lbVelocidade.setForeground(new java.awt.Color(0, 102, 0));
        lbVelocidade.setText("0");

        jLabel4.setText("Velocidade Atual:");

        btLigar1.setText("Ligar");
        btLigar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLigar1ActionPerformed(evt);
            }
        });

        btAcelerar1.setText("Acelerar");
        btAcelerar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAcelerar1ActionPerformed(evt);
            }
        });

        btFrear1.setText("Frear");
        btFrear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFrear1ActionPerformed(evt);
            }
        });

        btDesligar1.setText("Desligar");
        btDesligar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDesligar1ActionPerformed(evt);
            }
        });

        lbStatus2.setForeground(new java.awt.Color(0, 102, 0));
        lbStatus2.setText("Desligado");

        jLabel2.setText("Status do Carro:");

        pbVelocidade2.setMaximum(120);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pbVelocidade2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btLigar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btAcelerar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btFrear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btDesligar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbStatus))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbVelocidade, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btLigar1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btAcelerar1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btFrear1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btDesligar1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbStatus2)))
                        .addGap(0, 21, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLigar)
                    .addComponent(btAcelerar)
                    .addComponent(btFrear)
                    .addComponent(btDesligar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbStatus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lbVelocidade))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLigar1)
                    .addComponent(btAcelerar1)
                    .addComponent(btFrear1)
                    .addComponent(btDesligar1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbStatus2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pbVelocidade2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btFrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFrearActionPerformed
        carro1.frear();
        
        lbStatus.setText(carro1.getStatus());
        lbVelocidade.setText(carro1.getVelocidadeFormatada());
    }//GEN-LAST:event_btFrearActionPerformed

    private void btLigarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLigarActionPerformed
        carro1.ligar();
        
        lbStatus.setText(carro1.getStatus());
        lbVelocidade.setText(carro1.getVelocidadeFormatada());
    }//GEN-LAST:event_btLigarActionPerformed

    private void btAcelerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAcelerarActionPerformed
        carro1.acelerar();
        
        lbStatus.setText(carro1.getStatus());
        lbVelocidade.setText(carro1.getVelocidadeFormatada());        // TODO add your handling code here:
    }//GEN-LAST:event_btAcelerarActionPerformed

    private void btDesligarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDesligarActionPerformed
        carro1.desligar();
        
        lbStatus.setText(carro1.getStatus());
        lbVelocidade.setText(carro1.getVelocidadeFormatada());
    }//GEN-LAST:event_btDesligarActionPerformed

    private void btLigar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLigar1ActionPerformed
        carro2.ligar();
        
        lbStatus2.setText(carro2.getStatus());
        
    }//GEN-LAST:event_btLigar1ActionPerformed

    private void btAcelerar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAcelerar1ActionPerformed
        carro2.acelerar();
        
        pbVelocidade2.setValue(carro2.getVelocidade().intValue());
    }//GEN-LAST:event_btAcelerar1ActionPerformed

    private void btFrear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFrear1ActionPerformed
        carro2.frear();
        
        pbVelocidade2.setValue(carro2.getVelocidade().intValue());
    }//GEN-LAST:event_btFrear1ActionPerformed

    private void btDesligar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDesligar1ActionPerformed
        carro2.desligar();
        
        pbVelocidade2.setValue(carro2.getVelocidade().intValue());
        lbStatus2.setText(carro2.getStatus());
    }//GEN-LAST:event_btDesligar1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCarro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAcelerar;
    private javax.swing.JButton btAcelerar1;
    private javax.swing.JButton btDesligar;
    private javax.swing.JButton btDesligar1;
    private javax.swing.JButton btFrear;
    private javax.swing.JButton btFrear1;
    private javax.swing.JButton btLigar;
    private javax.swing.JButton btLigar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JLabel lbStatus2;
    private javax.swing.JLabel lbVelocidade;
    private javax.swing.JProgressBar pbVelocidade2;
    // End of variables declaration//GEN-END:variables
}