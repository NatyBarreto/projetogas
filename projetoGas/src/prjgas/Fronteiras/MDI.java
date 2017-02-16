/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prjgas.Fronteiras;

/**
 *
 * @author Nathalia
 */
public class MDI extends javax.swing.JFrame {

    /**
     * Creates new form MDI
     */
    public MDI() {
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

        painel = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Funcionario = new javax.swing.JMenuItem();
        Produto = new javax.swing.JMenuItem();
        Salario = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        MovimentacaoEstoque = new javax.swing.JMenuItem();
        MovimentacaoFinanceira = new javax.swing.JMenuItem();
        TipoMovmFinanceira = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(2147483647, 2147483647));

        javax.swing.GroupLayout painelLayout = new javax.swing.GroupLayout(painel);
        painel.setLayout(painelLayout);
        painelLayout.setHorizontalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 738, Short.MAX_VALUE)
        );
        painelLayout.setVerticalGroup(
            painelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 464, Short.MAX_VALUE)
        );

        jMenu1.setText("Entrada de Dados");
        jMenu1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N

        Funcionario.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        Funcionario.setText("Funcionário");
        Funcionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FuncionarioActionPerformed(evt);
            }
        });
        jMenu1.add(Funcionario);

        Produto.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        Produto.setText("Produto");
        Produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProdutoActionPerformed(evt);
            }
        });
        jMenu1.add(Produto);

        Salario.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        Salario.setText("Salário");
        Salario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalarioActionPerformed(evt);
            }
        });
        jMenu1.add(Salario);

        jMenuItem1.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jMenuItem1.setText("Movimentação");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        MovimentacaoEstoque.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        MovimentacaoEstoque.setText("Movimentação Estoque");
        MovimentacaoEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MovimentacaoEstoqueActionPerformed(evt);
            }
        });
        jMenu1.add(MovimentacaoEstoque);

        MovimentacaoFinanceira.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        MovimentacaoFinanceira.setText("Movimentação Financeira");
        MovimentacaoFinanceira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MovimentacaoFinanceiraActionPerformed(evt);
            }
        });
        jMenu1.add(MovimentacaoFinanceira);

        TipoMovmFinanceira.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        TipoMovmFinanceira.setText("Tipo de Movimentação Financeira");
        TipoMovmFinanceira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipoMovmFinanceiraActionPerformed(evt);
            }
        });
        jMenu1.add(TipoMovmFinanceira);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Relatórios");
        jMenu2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painel)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FuncionarioActionPerformed
        FrmFuncionario funcionario=new FrmFuncionario();
        painel.add(funcionario);
        funcionario.show();
        
    }//GEN-LAST:event_FuncionarioActionPerformed

    private void ProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProdutoActionPerformed
       FrmProduto produto=new FrmProduto();
        painel.add(produto);
        produto.show();
    }//GEN-LAST:event_ProdutoActionPerformed

    private void SalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalarioActionPerformed
        FrmSalario salario=new FrmSalario();
        painel.add(salario);
        salario.show();
    }//GEN-LAST:event_SalarioActionPerformed

    private void MovimentacaoEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MovimentacaoEstoqueActionPerformed
       FrmCadastroMovmEstoque estoque=new FrmCadastroMovmEstoque();
       painel.add(estoque);
       estoque.show();
    }//GEN-LAST:event_MovimentacaoEstoqueActionPerformed

    private void MovimentacaoFinanceiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MovimentacaoFinanceiraActionPerformed
        FrmCadastroMovmFinanceira financeira=new FrmCadastroMovmFinanceira();
        painel.add(financeira);
        financeira.show();
    }//GEN-LAST:event_MovimentacaoFinanceiraActionPerformed

    private void TipoMovmFinanceiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipoMovmFinanceiraActionPerformed
        FrmCadastroTipoMovmFinanceira tipo= new FrmCadastroTipoMovmFinanceira();
        painel.add(tipo);
        tipo.show();
    }//GEN-LAST:event_TipoMovmFinanceiraActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FrmMovimentacao movimentacao= new FrmMovimentacao();
        painel.add(movimentacao);
        movimentacao.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(MDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MDI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Funcionario;
    private javax.swing.JMenuItem MovimentacaoEstoque;
    private javax.swing.JMenuItem MovimentacaoFinanceira;
    private javax.swing.JMenuItem Produto;
    private javax.swing.JMenuItem Salario;
    private javax.swing.JMenuItem TipoMovmFinanceira;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JDesktopPane painel;
    // End of variables declaration//GEN-END:variables
}
