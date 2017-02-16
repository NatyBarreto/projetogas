package prjgas.Fronteiras;

import java.util.ArrayList;
import prjgas.Modelo.Funcionario;
import prjgas.Modelo.MovimentacaoFinanceira;
import prjgas.Modelo.Produto;
import prjgas.Persisitencias.PerFuncionario;
import prjgas.Persisitencias.PerMovimentacaoFinanceira;
import prjgas.Persisitencias.PerProduto;

public class FrmCadastroMovmFinanceira extends javax.swing.JInternalFrame {

    public FrmCadastroMovmFinanceira() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        txtdtMovmFinanceira = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtvlMovmFinanceira = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        bttMovmEstoque = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txadscrMovmFinanceira = new javax.swing.JTextArea();
        cmbProduto = new javax.swing.JComboBox<>();
        cmbTipoMovimentacao = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        cmbFuncionario = new javax.swing.JComboBox<>();
        bttMovmEstoque1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setPreferredSize(new java.awt.Dimension(680, 580));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel4.setBackground(new java.awt.Color(0, 204, 102));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText(" Movimentação Financeira");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 670, 62);
        getContentPane().add(txtdtMovmFinanceira);
        txtdtMovmFinanceira.setBounds(40, 100, 250, 30);

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Valor:");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(10, 150, 120, 29);
        getContentPane().add(txtvlMovmFinanceira);
        txtvlMovmFinanceira.setBounds(40, 180, 250, 29);

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Produto:");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(350, 150, 112, 27);

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Tipo Movimentação:");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(10, 230, 240, 30);

        txtQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantidadeActionPerformed(evt);
            }
        });
        getContentPane().add(txtQuantidade);
        txtQuantidade.setBounds(370, 260, 270, 30);

        bttMovmEstoque.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        bttMovmEstoque.setText("NOVO");
        bttMovmEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttMovmEstoqueActionPerformed(evt);
            }
        });
        getContentPane().add(bttMovmEstoque);
        bttMovmEstoque.setBounds(360, 470, 120, 40);

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Data:");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(10, 70, 120, 30);

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Descrição:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(20, 310, 109, 23);

        txadscrMovmFinanceira.setColumns(20);
        txadscrMovmFinanceira.setRows(5);
        jScrollPane1.setViewportView(txadscrMovmFinanceira);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 340, 610, 96);

        cmbProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(cmbProduto);
        cmbProduto.setBounds(370, 180, 270, 30);

        getContentPane().add(cmbTipoMovimentacao);
        cmbTipoMovimentacao.setBounds(40, 260, 260, 30);

        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Funionário:");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(360, 80, 112, 27);

        jLabel23.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("Quantidade:");
        getContentPane().add(jLabel23);
        jLabel23.setBounds(370, 230, 112, 27);

        cmbFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(cmbFuncionario);
        cmbFuncionario.setBounds(370, 110, 270, 30);

        bttMovmEstoque1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        bttMovmEstoque1.setText("SALVAR");
        bttMovmEstoque1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttMovmEstoque1ActionPerformed(evt);
            }
        });
        getContentPane().add(bttMovmEstoque1);
        bttMovmEstoque1.setBounds(170, 470, 120, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttMovmEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttMovmEstoqueActionPerformed
        MovimentacaoFinanceira financeira = new MovimentacaoFinanceira();
        financeira.setdtMovmFinanceira(txtdtMovmFinanceira.getText());
        financeira.setvlMovmFinanceira(Double.parseDouble(txtvlMovmFinanceira.getText()));
        financeira.setdscrMovmFinanceira(txadscrMovmFinanceira.getText());
       //financeira.setfuncionario(txtFuncionario.getText());
       //financeira.settipoMovmFinanceira(txttipoMovmFinanceira.getText());
       //movimentacaoestoque

        PerMovimentacaoFinanceira.inserirMovimentacaoFinanceira(financeira);
    }//GEN-LAST:event_bttMovmEstoqueActionPerformed

    private void txtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantidadeActionPerformed

    private void cmbProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbProdutoActionPerformed

    private void cmbFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbFuncionarioActionPerformed

    private void bttMovmEstoque1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttMovmEstoque1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttMovmEstoque1ActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
         PerFuncionario perFuncionario=new PerFuncionario();
        ArrayList<Funcionario> funcionario=perFuncionario.TodosFuncionarios();//ArrayList=matriz dinanmica 
        for(Funcionario f:funcionario){
            String linha[]=new String[1];
            //linha[0]=String.valueOf(f.getidFuncionario());
           linha[0]=f.getnmFuncionario();
           // linha[2]=String.valueOf(f.getidSalario());
            cmbFuncionario.addItem(linha[0]);
        }
        
          PerProduto perProduto= new PerProduto();
     //   ArrayList<Produto> produto=perProduto.TodosProdutos();//ArrayList=matriz dinanmica 
        for(Funcionario f:funcionario){
            String linha[]=new String[1];
            //linha[0]=String.valueOf(f.getidFuncionario());
           linha[0]=f.getnmFuncionario();
           // linha[2]=String.valueOf(f.getidSalario());
            cmbFuncionario.addItem(linha[0]);
        }
        
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttMovmEstoque;
    private javax.swing.JButton bttMovmEstoque1;
    private javax.swing.JComboBox<String> cmbFuncionario;
    private javax.swing.JComboBox<String> cmbProduto;
    private javax.swing.JComboBox<String> cmbTipoMovimentacao;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txadscrMovmFinanceira;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtdtMovmFinanceira;
    private javax.swing.JTextField txtvlMovmFinanceira;
    // End of variables declaration//GEN-END:variables
}
