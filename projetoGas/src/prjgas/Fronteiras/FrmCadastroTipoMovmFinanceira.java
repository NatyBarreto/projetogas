package prjgas.Fronteiras;

import javax.swing.table.DefaultTableModel;
import prjgas.Modelo.TipoMovimentacao;
import prjgas.Persisitencias.PerTipoMovimentacao;

public class FrmCadastroTipoMovmFinanceira extends javax.swing.JInternalFrame {

  DefaultTableModel vTabelaTipoMovimentacao= new DefaultTableModel();
    public FrmCadastroTipoMovmFinanceira() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtnmTipoMovmFinanceira = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txadscrTipoMovmFinanceira = new javax.swing.JTextArea();
        bttDeletar = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        cmbTipoMovPai = new javax.swing.JComboBox<>();
        bttSalvar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        bttNovo = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setPreferredSize(new java.awt.Dimension(760, 700));
        getContentPane().setLayout(null);

        jLabel4.setBackground(new java.awt.Color(0, 204, 102));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Cadastro Tipo Movimentação Financeira");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 750, 62);

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Tabela Tipo Movimentação Financeira");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(10, 280, 380, 30);

        txtnmTipoMovmFinanceira.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        getContentPane().add(txtnmTipoMovmFinanceira);
        txtnmTipoMovmFinanceira.setBounds(30, 100, 280, 32);

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Tipo Movimentação Pai:");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(30, 160, 230, 30);

        txadscrTipoMovmFinanceira.setColumns(20);
        txadscrTipoMovmFinanceira.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txadscrTipoMovmFinanceira.setRows(5);
        jScrollPane1.setViewportView(txadscrTipoMovmFinanceira);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(370, 100, 350, 101);

        bttDeletar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        bttDeletar.setText("DELETAR");
        bttDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttDeletarActionPerformed(evt);
            }
        });
        getContentPane().add(bttDeletar);
        bttDeletar.setBounds(590, 590, 130, 50);

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Nome:");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(10, 73, 109, 30);

        cmbTipoMovPai.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cmbTipoMovPai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Despesa", "Compra", "Venda", "Vale", "Doação" }));
        getContentPane().add(cmbTipoMovPai);
        cmbTipoMovPai.setBounds(30, 190, 280, 30);

        bttSalvar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        bttSalvar.setText("SALVAR");
        bttSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(bttSalvar);
        bttSalvar.setBounds(410, 220, 130, 50);

        jTable1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jTable1.setModel(vTabelaTipoMovimentacao);
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(30, 310, 690, 250);

        bttNovo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        bttNovo.setText("NOVO");
        bttNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttNovoActionPerformed(evt);
            }
        });
        getContentPane().add(bttNovo);
        bttNovo.setBounds(550, 220, 130, 50);

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Descrição:");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(370, 70, 109, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttDeletarActionPerformed
 
    }//GEN-LAST:event_bttDeletarActionPerformed

    private void bttSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSalvarActionPerformed
       TipoMovimentacao tipo = new TipoMovimentacao();
        tipo.setnmTipoMovmFinanceira(txtnmTipoMovmFinanceira.getText());
        tipo.setdscrTipoMovmFinanceira(txadscrTipoMovmFinanceira.getText());

        PerTipoMovimentacao.inserirTipoMovmFinanceira(tipo);
    }//GEN-LAST:event_bttSalvarActionPerformed

    private void bttNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttNovoActionPerformed
       Limpar();
    }//GEN-LAST:event_bttNovoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttDeletar;
    private javax.swing.JButton bttNovo;
    private javax.swing.JButton bttSalvar;
    private javax.swing.JComboBox<String> cmbTipoMovPai;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea txadscrTipoMovmFinanceira;
    private javax.swing.JTextField txtnmTipoMovmFinanceira;
    // End of variables declaration//GEN-END:variables

    private void Limpar() {
      txtnmTipoMovmFinanceira.setText(null);
      txadscrTipoMovmFinanceira.setText(null);
    }
}
