/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projeto.swing;

/**
 *
 * @author Aluno
 */
public class ExercicioSwing8 extends javax.swing.JFrame {
    //criando objetos do tipo Elevador
    Elevador elevadorA = new Elevador();
    Elevador elevadorB = new Elevador();
    
    void atualizarElevadorA() {
        lbTotalPassageiro.setText(elevadorA.passageiros.toString());
        lbPesoElevador.setText(elevadorA.peso.toString()+"kg");
    }
    
    void atualizarElevadorB() {
        lbTotalPassageiro2.setText(elevadorB.passageiros.toString());
        lbPesoElevador2.setText(elevadorB.peso.toString()+"kg");
    }
    /**
     * Creates new form ExercicioSwing8
     */
    public ExercicioSwing8() {
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

        btEntrarHomem = new javax.swing.JButton();
        btEntrarMulher = new javax.swing.JButton();
        btEntrarCrianca = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btEntrarHomem2 = new javax.swing.JButton();
        btEntrarMulher2 = new javax.swing.JButton();
        btEntrarCrianca2 = new javax.swing.JButton();
        lbTotalPassageiro = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbTotalPassageiro2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbPesoElevador2 = new javax.swing.JLabel();
        lbPesoElevador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btEntrarHomem.setText("Entrar homens");
        btEntrarHomem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarHomemActionPerformed(evt);
            }
        });

        btEntrarMulher.setText("Entrar mulheres");
        btEntrarMulher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarMulherActionPerformed(evt);
            }
        });

        btEntrarCrianca.setText("Entrar criança");
        btEntrarCrianca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarCriancaActionPerformed(evt);
            }
        });

        jLabel1.setText("Total de passageiros no elevador:");

        btEntrarHomem2.setText("Entrar homens");
        btEntrarHomem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarHomem2ActionPerformed(evt);
            }
        });

        btEntrarMulher2.setText("Entrar mulheres");
        btEntrarMulher2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarMulher2ActionPerformed(evt);
            }
        });

        btEntrarCrianca2.setText("Entrar criança");
        btEntrarCrianca2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarCrianca2ActionPerformed(evt);
            }
        });

        lbTotalPassageiro.setText("0");

        jLabel2.setText("Total de passageiros no elevador:");

        lbTotalPassageiro2.setText("0");

        jLabel3.setText("Peso do elevador:");

        jLabel4.setText("Peso do elevador:");

        lbPesoElevador2.setText("0");

        lbPesoElevador.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbPesoElevador2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbPesoElevador))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTotalPassageiro2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btEntrarHomem2)
                        .addGap(18, 18, 18)
                        .addComponent(btEntrarMulher2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btEntrarCrianca2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTotalPassageiro))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btEntrarHomem)
                        .addGap(18, 18, 18)
                        .addComponent(btEntrarMulher)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btEntrarCrianca)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEntrarHomem)
                    .addComponent(btEntrarMulher)
                    .addComponent(btEntrarCrianca))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbTotalPassageiro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lbPesoElevador))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btEntrarHomem2)
                    .addComponent(btEntrarMulher2)
                    .addComponent(btEntrarCrianca2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lbTotalPassageiro2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lbPesoElevador2))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btEntrarMulherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarMulherActionPerformed
        elevadorA.entrarMulher();
        atualizarElevadorA();
    }//GEN-LAST:event_btEntrarMulherActionPerformed

    private void btEntrarMulher2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarMulher2ActionPerformed
        elevadorB.entrarMulher();
        atualizarElevadorB();
    }//GEN-LAST:event_btEntrarMulher2ActionPerformed

    private void btEntrarHomemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarHomemActionPerformed
        elevadorA.entrarHomem();
        atualizarElevadorA();
    }//GEN-LAST:event_btEntrarHomemActionPerformed

    private void btEntrarHomem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarHomem2ActionPerformed
        elevadorB.entrarHomem();
        atualizarElevadorB();
        
    }//GEN-LAST:event_btEntrarHomem2ActionPerformed

    private void btEntrarCriancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarCriancaActionPerformed
    elevadorA.entrarCrianca();
    atualizarElevadorA();
    }//GEN-LAST:event_btEntrarCriancaActionPerformed

    private void btEntrarCrianca2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarCrianca2ActionPerformed
        elevadorB.entrarCrianca();
        atualizarElevadorB();
    }//GEN-LAST:event_btEntrarCrianca2ActionPerformed

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
            java.util.logging.Logger.getLogger(ExercicioSwing8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExercicioSwing8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExercicioSwing8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExercicioSwing8.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExercicioSwing8().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEntrarCrianca;
    private javax.swing.JButton btEntrarCrianca2;
    private javax.swing.JButton btEntrarHomem;
    private javax.swing.JButton btEntrarHomem2;
    private javax.swing.JButton btEntrarMulher;
    private javax.swing.JButton btEntrarMulher2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbPesoElevador;
    private javax.swing.JLabel lbPesoElevador2;
    private javax.swing.JLabel lbTotalPassageiro;
    private javax.swing.JLabel lbTotalPassageiro2;
    // End of variables declaration//GEN-END:variables
}
