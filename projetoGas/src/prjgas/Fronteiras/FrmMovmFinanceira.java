package prjgas.Fronteiras;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import prjgas.Modelo.Funcionario;
import prjgas.Modelo.MovimentacaoFinanceira;
import prjgas.Modelo.Produto;
import prjgas.Modelo.TipoMovimentacao;
import prjgas.Persisitencias.PerFuncionario;
import prjgas.Persisitencias.PerMovimentacaoFinanceira;
import prjgas.Persisitencias.PerProduto;
import prjgas.Persisitencias.PerTipoMovimentacao;

public class FrmMovmFinanceira extends javax.swing.JInternalFrame {

    public FrmMovmFinanceira() {
        initComponents();

        cmbFuncionario.setVisible(false);
        cmbProduto.setVisible(false);
        txtQuantidade.setVisible(false);

        lbFuncionario.setVisible(false);
        lbProduto.setVisible(false);
        lbQuantidade.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        txtdtMovmFinanceira = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtvlMovmFinanceira = new javax.swing.JTextField();
        lbProduto = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        bttNovo = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txadscrMovmFinanceira = new javax.swing.JTextArea();
        cmbProduto = new javax.swing.JComboBox<>();
        cmbDespesa = new javax.swing.JComboBox<>();
        lbFuncionario = new javax.swing.JLabel();
        lbQuantidade = new javax.swing.JLabel();
        cmbFuncionario = new javax.swing.JComboBox<>();
        bttSalvar = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        cmbTipoMovimentacao = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setPreferredSize(new java.awt.Dimension(800, 650));
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
        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText(" Movimentação Financeira");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 790, 62);

        txtdtMovmFinanceira.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        getContentPane().add(txtdtMovmFinanceira);
        txtdtMovmFinanceira.setBounds(40, 100, 320, 30);

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Valor:");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(10, 150, 120, 29);

        txtvlMovmFinanceira.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        getContentPane().add(txtvlMovmFinanceira);
        txtvlMovmFinanceira.setBounds(40, 180, 320, 29);

        lbProduto.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbProduto.setText("Produto:");
        getContentPane().add(lbProduto);
        lbProduto.setBounds(410, 70, 120, 27);

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Despesas Diversas:");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(20, 300, 200, 30);

        txtQuantidade.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantidadeActionPerformed(evt);
            }
        });
        getContentPane().add(txtQuantidade);
        txtQuantidade.setBounds(430, 260, 330, 30);

        bttNovo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        bttNovo.setText("NOVO");
        bttNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttNovoActionPerformed(evt);
            }
        });
        getContentPane().add(bttNovo);
        bttNovo.setBounds(400, 530, 130, 50);

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Data:");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(10, 70, 120, 30);

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Descrição:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(20, 373, 109, 30);

        txadscrMovmFinanceira.setColumns(20);
        txadscrMovmFinanceira.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txadscrMovmFinanceira.setRows(5);
        jScrollPane1.setViewportView(txadscrMovmFinanceira);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 400, 740, 100);

        cmbProduto.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cmbProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(cmbProduto);
        cmbProduto.setBounds(430, 100, 330, 30);

        cmbDespesa.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cmbDespesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDespesaActionPerformed(evt);
            }
        });
        getContentPane().add(cmbDespesa);
        cmbDespesa.setBounds(40, 330, 320, 30);

        lbFuncionario.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbFuncionario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFuncionario.setText("Funionário:");
        getContentPane().add(lbFuncionario);
        lbFuncionario.setBounds(420, 150, 120, 30);

        lbQuantidade.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbQuantidade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbQuantidade.setText("Quantidade:");
        getContentPane().add(lbQuantidade);
        lbQuantidade.setBounds(430, 230, 120, 27);

        cmbFuncionario.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cmbFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(cmbFuncionario);
        cmbFuncionario.setBounds(430, 180, 330, 30);

        bttSalvar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        bttSalvar.setText("SALVAR");
        bttSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(bttSalvar);
        bttSalvar.setBounds(260, 530, 130, 50);

        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Tipo Movimentação:");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(10, 220, 240, 30);

        cmbTipoMovimentacao.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cmbTipoMovimentacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoMovimentacaoActionPerformed(evt);
            }
        });
        getContentPane().add(cmbTipoMovimentacao);
        cmbTipoMovimentacao.setBounds(40, 250, 320, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttNovoActionPerformed
        MovimentacaoFinanceira financeira = new MovimentacaoFinanceira();
        financeira.setdtMovmFinanceira(txtdtMovmFinanceira.getText());
        financeira.setvlMovmFinanceira(Double.parseDouble(txtvlMovmFinanceira.getText()));
        financeira.setdscrMovmFinanceira(txadscrMovmFinanceira.getText());
        //financeira.setfuncionario(txtFuncionario.getText());
        //financeira.settipoMovmFinanceira(txttipoMovmFinanceira.getText());
        //movimentacaoestoque

        PerMovimentacaoFinanceira.inserirMovimentacaoFinanceira(financeira);
    }//GEN-LAST:event_bttNovoActionPerformed

    private void txtQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantidadeActionPerformed

    private void cmbProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbProdutoActionPerformed

    private void cmbFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbFuncionarioActionPerformed

    private void bttSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSalvarActionPerformed
       if((cmbTipoMovimentacao.getSelectedIndex()==0)&&(cmbDespesa.getSelectedIndex()!=0)){
           JOptionPane.showMessageDialog(null,"Esta movimentção é realmente uma despesa?"); 
       }else if((cmbTipoMovimentacao.getSelectedIndex()!=0)&&(cmbDespesa.getSelectedIndex()==0)){
           JOptionPane.showMessageDialog(null,"Esta movimentção tem realmente um tipo?");
       }
    }//GEN-LAST:event_bttSalvarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        PerFuncionario perFuncionario = new PerFuncionario();
        ArrayList<Funcionario> funcionario = perFuncionario.TodosFuncionarios();//ArrayList=matriz dinanmica 
        for (Funcionario f : funcionario) {
            String linha[] = new String[1];
            // linha[0]=String.valueOf(f.getidFuncionario());
            linha[0] = f.getnmFuncionario();
            //  linha[2]=String.valueOf(f.getidSalario());
            cmbFuncionario.addItem(linha[0]);
        }

        PerProduto perProduto = new PerProduto();
        ArrayList<Produto> produto = perProduto.TodosProdutos();//ArrayList=matriz dinanmica 
        for (Produto p : produto) {
            String linha[] = new String[1];
            // linha[0]=String.valueOf(f.getidProduto());
            linha[0] = p.getnmProduto();
            cmbProduto.addItem(linha[0]);
        }
        
        PerTipoMovimentacao perTipoMovmFinanceira = new PerTipoMovimentacao();
        ArrayList<TipoMovimentacao> tipoMovmFinanceira = perTipoMovmFinanceira.TodosTiposMovmFinanceira();//ArrayList=matriz dinanmica 
        for (TipoMovimentacao t : tipoMovmFinanceira) {
            String linha[] = new String[1];
            // linha[0]=String.valueOf(f.getidTipoMovmFinanceira());
            linha[0] = t.getnmTipoMovmFinanceira();
           // linha[2]=String.valueOf(f.getdscrTipoMovmFinanceira());
            cmbDespesa.addItem(linha[0]);
        }
        

    }//GEN-LAST:event_formInternalFrameOpened

    private void cmbDespesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDespesaActionPerformed
   
    }//GEN-LAST:event_cmbDespesaActionPerformed

    private void cmbTipoMovimentacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoMovimentacaoActionPerformed
           if (cmbTipoMovimentacao.getSelectedItem().equals("Compra") || cmbTipoMovimentacao.getSelectedItem().equals("Venda") || cmbTipoMovimentacao.getSelectedItem().equals("Doação")) {
            txtQuantidade.setVisible(true);
            lbQuantidade.setVisible(true);

            cmbProduto.setVisible(true);
            lbProduto.setVisible(true);

            cmbFuncionario.setVisible(false);
            lbFuncionario.setVisible(false);

        } else if (cmbTipoMovimentacao.getSelectedItem().equals("Vale")) {
            cmbFuncionario.setVisible(true);
            lbFuncionario.setVisible(true);

            txtQuantidade.setVisible(false);
            lbQuantidade.setVisible(false);

            cmbProduto.setVisible(false);
            lbProduto.setVisible(false);
        }
    }//GEN-LAST:event_cmbTipoMovimentacaoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttNovo;
    private javax.swing.JButton bttSalvar;
    private javax.swing.JComboBox<String> cmbDespesa;
    private javax.swing.JComboBox<String> cmbFuncionario;
    private javax.swing.JComboBox<String> cmbProduto;
    private javax.swing.JComboBox<String> cmbTipoMovimentacao;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbFuncionario;
    private javax.swing.JLabel lbProduto;
    private javax.swing.JLabel lbQuantidade;
    private javax.swing.JTextArea txadscrMovmFinanceira;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtdtMovmFinanceira;
    private javax.swing.JTextField txtvlMovmFinanceira;
    // End of variables declaration//GEN-END:variables
}
