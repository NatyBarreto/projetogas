package prjgas.Fronteiras;


public class FrmMovimentacao extends javax.swing.JInternalFrame {

   
    public FrmMovimentacao() {
        initComponents();
        
        lbData.setVisible(false);
        lbDescricao.setVisible(false);
        lbFuncionario.setVisible(false);
        lbProduto.setVisible(false);
        lbQuantidade.setVisible(false);
        lbTipoMovmFinanceira.setVisible(false);
        lbValor.setVisible(false);
        
        txtData.setVisible(false);
        txtQuantidade.setVisible(false);
        txtValor.setVisible(false);
        txaDescricao.setVisible(false);
        
        cmbFuncionario.setVisible(false);
        cmbProduto.setVisible(false);
        cmbTipoMovmFinanceira.setVisible(false);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        cbFuncionario = new javax.swing.JCheckBox();
        cbSaidaFinanceira = new javax.swing.JCheckBox();
        cbEntradaFinanceira = new javax.swing.JCheckBox();
        cbSaidaEstoque = new javax.swing.JCheckBox();
        cbEntradaEstoque = new javax.swing.JCheckBox();
        lbDescricao = new javax.swing.JLabel();
        lbTipoMovmFinanceira = new javax.swing.JLabel();
        txtData = new javax.swing.JFormattedTextField();
        lbValor = new javax.swing.JLabel();
        txtValor = new javax.swing.JFormattedTextField();
        txtQuantidade = new javax.swing.JTextField();
        lbData = new javax.swing.JLabel();
        cmbTipoMovmFinanceira = new javax.swing.JComboBox<>();
        lbProduto = new javax.swing.JLabel();
        cmbProduto = new javax.swing.JComboBox<>();
        lbFuncionario = new javax.swing.JLabel();
        cmbFuncionario = new javax.swing.JComboBox<>();
        lbQuantidade = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDescricao = new javax.swing.JTextArea();
        bttNovo = new javax.swing.JButton();
        bttSalvar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setPreferredSize(new java.awt.Dimension(720, 475));
        getContentPane().setLayout(null);

        jLabel4.setBackground(new java.awt.Color(0, 204, 102));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Movimentação");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 770, 62);

        cbFuncionario.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cbFuncionario.setText("Requer Funcionário");
        cbFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(cbFuncionario);
        cbFuncionario.setBounds(10, 230, 200, 23);

        cbSaidaFinanceira.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cbSaidaFinanceira.setText("Saída Financeira");
        cbSaidaFinanceira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSaidaFinanceiraActionPerformed(evt);
            }
        });
        getContentPane().add(cbSaidaFinanceira);
        cbSaidaFinanceira.setBounds(10, 110, 200, 23);

        cbEntradaFinanceira.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cbEntradaFinanceira.setText("Entrada Financeira");
        cbEntradaFinanceira.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEntradaFinanceiraActionPerformed(evt);
            }
        });
        getContentPane().add(cbEntradaFinanceira);
        cbEntradaFinanceira.setBounds(10, 140, 200, 23);

        cbSaidaEstoque.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cbSaidaEstoque.setText("Saída de Estoque");
        cbSaidaEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSaidaEstoqueActionPerformed(evt);
            }
        });
        getContentPane().add(cbSaidaEstoque);
        cbSaidaEstoque.setBounds(10, 170, 200, 23);

        cbEntradaEstoque.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cbEntradaEstoque.setText("Entrada de Estoque");
        cbEntradaEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEntradaEstoqueActionPerformed(evt);
            }
        });
        getContentPane().add(cbEntradaEstoque);
        cbEntradaEstoque.setBounds(10, 200, 200, 23);

        lbDescricao.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbDescricao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDescricao.setText("Descrição:");
        getContentPane().add(lbDescricao);
        lbDescricao.setBounds(230, 320, 130, 30);

        lbTipoMovmFinanceira.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        lbTipoMovmFinanceira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTipoMovmFinanceira.setText("Tipo de Movimentação Financeira:");
        getContentPane().add(lbTipoMovmFinanceira);
        lbTipoMovmFinanceira.setBounds(440, 240, 260, 30);

        txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        getContentPane().add(txtData);
        txtData.setBounds(250, 110, 140, 30);

        lbValor.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbValor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbValor.setText("Valor:");
        getContentPane().add(lbValor);
        lbValor.setBounds(220, 160, 110, 30);

        txtValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getCurrencyInstance())));
        getContentPane().add(txtValor);
        txtValor.setBounds(250, 190, 140, 30);
        getContentPane().add(txtQuantidade);
        txtQuantidade.setBounds(250, 270, 140, 30);

        lbData.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbData.setText("Data:");
        getContentPane().add(lbData);
        lbData.setBounds(220, 80, 110, 30);

        cmbTipoMovmFinanceira.setPreferredSize(new java.awt.Dimension(777, 445));
        getContentPane().add(cmbTipoMovmFinanceira);
        cmbTipoMovmFinanceira.setBounds(440, 270, 220, 30);

        lbProduto.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbProduto.setText("Produto:");
        getContentPane().add(lbProduto);
        lbProduto.setBounds(420, 80, 110, 30);

        getContentPane().add(cmbProduto);
        cmbProduto.setBounds(440, 110, 220, 30);

        lbFuncionario.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbFuncionario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFuncionario.setText("Funcionário:");
        getContentPane().add(lbFuncionario);
        lbFuncionario.setBounds(430, 160, 120, 30);

        getContentPane().add(cmbFuncionario);
        cmbFuncionario.setBounds(440, 190, 220, 30);

        lbQuantidade.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbQuantidade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbQuantidade.setText("Quantidade:");
        getContentPane().add(lbQuantidade);
        lbQuantidade.setBounds(240, 240, 130, 30);

        txaDescricao.setColumns(20);
        txaDescricao.setRows(5);
        jScrollPane1.setViewportView(txaDescricao);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(250, 350, 410, 70);

        bttNovo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        bttNovo.setText("NOVO");
        getContentPane().add(bttNovo);
        bttNovo.setBounds(40, 370, 130, 50);

        bttSalvar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        bttSalvar.setText("SALVAR");
        getContentPane().add(bttSalvar);
        bttSalvar.setBounds(40, 310, 130, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbSaidaFinanceiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSaidaFinanceiraActionPerformed
        lbData.setVisible(true);
        lbDescricao.setVisible(true);
        lbFuncionario.setVisible(false);
        lbProduto.setVisible(false);
        lbQuantidade.setVisible(false);
        lbTipoMovmFinanceira.setVisible(true);
        lbValor.setVisible(true);
        
        txtData.setVisible(true);
        txtQuantidade.setVisible(false);
        txtValor.setVisible(true);
        txaDescricao.setVisible(true);
        
        cmbFuncionario.setVisible(false);
        cmbProduto.setVisible(false);
        cmbTipoMovmFinanceira.setVisible(true);
    }//GEN-LAST:event_cbSaidaFinanceiraActionPerformed

    private void cbEntradaFinanceiraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEntradaFinanceiraActionPerformed
        lbData.setVisible(true);
        lbDescricao.setVisible(true);
        lbFuncionario.setVisible(false);
        lbProduto.setVisible(false);
        lbQuantidade.setVisible(false);
        lbTipoMovmFinanceira.setVisible(true);
        lbValor.setVisible(true);
        
        txtData.setVisible(true);
        txtQuantidade.setVisible(false);
        txtValor.setVisible(true);
        txaDescricao.setVisible(true);
        
        cmbFuncionario.setVisible(false);
        cmbProduto.setVisible(false);
        cmbTipoMovmFinanceira.setVisible(true);
    }//GEN-LAST:event_cbEntradaFinanceiraActionPerformed

    private void cbSaidaEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSaidaEstoqueActionPerformed
        lbData.setVisible(true);
        lbDescricao.setVisible(true);
        lbFuncionario.setVisible(false);
        lbProduto.setVisible(false);
        lbQuantidade.setVisible(true);
        lbTipoMovmFinanceira.setVisible(false);
        lbValor.setVisible(false);
        
        txtData.setVisible(true);
        txtQuantidade.setVisible(true);
        txtValor.setVisible(false);
        txaDescricao.setVisible(true);
        
        cmbFuncionario.setVisible(false);
        cmbProduto.setVisible(false);
        cmbTipoMovmFinanceira.setVisible(false);
    }//GEN-LAST:event_cbSaidaEstoqueActionPerformed

    private void cbEntradaEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEntradaEstoqueActionPerformed
        lbData.setVisible(true);
        lbDescricao.setVisible(false);
        lbFuncionario.setVisible(false);
        lbProduto.setVisible(true);
        lbQuantidade.setVisible(false);
        lbTipoMovmFinanceira.setVisible(false);
        lbValor.setVisible(false);
        
        txtData.setVisible(false);
        txtQuantidade.setVisible(false);
        txtValor.setVisible(false);
        txaDescricao.setVisible(false);
        
        cmbFuncionario.setVisible(false);
        cmbProduto.setVisible(true);
        cmbTipoMovmFinanceira.setVisible(false);
    }//GEN-LAST:event_cbEntradaEstoqueActionPerformed

    private void cbFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFuncionarioActionPerformed
        lbData.setVisible(false);
        lbDescricao.setVisible(false);
        lbFuncionario.setVisible(true);
        lbProduto.setVisible(false);
        lbQuantidade.setVisible(false);
        lbTipoMovmFinanceira.setVisible(false);
        lbValor.setVisible(false);

        txtData.setVisible(false);
        txtQuantidade.setVisible(false);
        txtValor.setVisible(false);
        txaDescricao.setVisible(false);

        cmbFuncionario.setVisible(true);
        cmbProduto.setVisible(false);
        cmbTipoMovmFinanceira.setVisible(false);
    }//GEN-LAST:event_cbFuncionarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttNovo;
    private javax.swing.JButton bttSalvar;
    private javax.swing.JCheckBox cbEntradaEstoque;
    private javax.swing.JCheckBox cbEntradaFinanceira;
    private javax.swing.JCheckBox cbFuncionario;
    private javax.swing.JCheckBox cbSaidaEstoque;
    private javax.swing.JCheckBox cbSaidaFinanceira;
    private javax.swing.JComboBox<String> cmbFuncionario;
    private javax.swing.JComboBox<String> cmbProduto;
    private javax.swing.JComboBox<String> cmbTipoMovmFinanceira;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbDescricao;
    private javax.swing.JLabel lbFuncionario;
    private javax.swing.JLabel lbProduto;
    private javax.swing.JLabel lbQuantidade;
    private javax.swing.JLabel lbTipoMovmFinanceira;
    private javax.swing.JLabel lbValor;
    private javax.swing.JTextArea txaDescricao;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JFormattedTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
