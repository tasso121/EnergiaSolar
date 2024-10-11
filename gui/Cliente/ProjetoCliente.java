/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.EnergiaSolar.gui.Cliente;

import com.mycompany.EnergiaSolar.src.main.java.poo.example.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Tasso
 */
public class ProjetoCliente extends javax.swing.JFrame {
    
    private Cliente cliente;
    private Projeto projeto;
    /**
     * Creates new form ProjetoCliente
     */
    
    float custoPlacas = 5000; // Valor de exemplo
    float custoInversores = 3000; // Valor de exemplo
    float valor = AplicacaoService.calcularOrcamento(custoPlacas, custoInversores);
    
    public ProjetoCliente() {
        initComponents();
        configurarComponentes();
    }
    
    private void configurarComponentes() {
            valorProjeto.setText("Valor: R$ " + valor); 
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        botaoRecusaProjeto = new javax.swing.JButton();
        botaoAceitaProjeto = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        valorProjeto = new javax.swing.JLabel();
        botaoVoltare = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Solicitar projeto");

        botaoRecusaProjeto.setBackground(new java.awt.Color(0, 0, 153));
        botaoRecusaProjeto.setForeground(new java.awt.Color(255, 255, 255));
        botaoRecusaProjeto.setText("Recusar");
        botaoRecusaProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRecusaProjetoActionPerformed(evt);
            }
        });

        botaoAceitaProjeto.setBackground(new java.awt.Color(0, 0, 153));
        botaoAceitaProjeto.setForeground(new java.awt.Color(255, 255, 255));
        botaoAceitaProjeto.setText("Aceitar");
        botaoAceitaProjeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAceitaProjetoActionPerformed(evt);
            }
        });

        valorProjeto.setText("Valor: X");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(valorProjeto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(valorProjeto)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        botaoVoltare.setBackground(new java.awt.Color(0, 0, 153));
        botaoVoltare.setForeground(new java.awt.Color(255, 255, 255));
        botaoVoltare.setText("Voltar");
        botaoVoltare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltareActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(botaoRecusaProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(botaoAceitaProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoVoltare)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoVoltare))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoRecusaProjeto, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoAceitaProjeto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void botaoRecusaProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRecusaProjetoActionPerformed

        projeto.getOrcamento().setStatus(StatusOrcamento.REPROVADO);
        JOptionPane.showMessageDialog(this, "Orçamento recusado com sucesso.", "Informação", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(this, "Erro ao recusar o orçamento.", "Erro", JOptionPane.ERROR_MESSAGE);
        
        voltarParaInicioCliente();
    }//GEN-LAST:event_botaoRecusaProjetoActionPerformed

    private void botaoAceitaProjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAceitaProjetoActionPerformed
   
        projeto.getOrcamento().setStatus(StatusOrcamento.APROVADO);
        JOptionPane.showMessageDialog(this, "Orçamento aceito com sucesso.", "Informação", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(this, "Erro ao aceitar o orçamento.", "Erro", JOptionPane.ERROR_MESSAGE);
        
        voltarParaInicioCliente();
    }//GEN-LAST:event_botaoAceitaProjetoActionPerformed

    private void botaoVoltareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltareActionPerformed
        new OrcamentoCliente().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoVoltareActionPerformed

    private void voltarParaInicioCliente() {
        new InicioCliente().setVisible(true);
        this.dispose();
    }

    
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
            java.util.logging.Logger.getLogger(ProjetoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjetoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjetoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjetoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjetoCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAceitaProjeto;
    private javax.swing.JButton botaoRecusaProjeto;
    private javax.swing.JButton botaoVoltare;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel valorProjeto;
    // End of variables declaration//GEN-END:variables
}
