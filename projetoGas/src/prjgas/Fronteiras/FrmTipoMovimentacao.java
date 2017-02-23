package prjgas.Fronteiras;

import java.awt.Component;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicComboBoxRenderer;
import javax.swing.table.DefaultTableModel;
import prjgas.Modelo.Item;
import prjgas.Modelo.TipoMovimentacao;
import prjgas.Persisitencias.PerTipoMovimentacao;


public class FrmTipoMovimentacao extends javax.swing.JInternalFrame {

   DefaultTableModel vTabela=new DefaultTableModel();
   

    public FrmTipoMovimentacao() {
        initComponents();
        
        txtidTipoMovimentacao.setVisible(false);
        cmbPai.setVisible(false);
        
        vTabela.addColumn("Nome");
        vTabela.addColumn("Descrição");
        vTabela.addColumn("idTipoMovimentacao");
        PreencherCombo();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel4 = new javax.swing.JLabel();
        cbFuncionario = new javax.swing.JCheckBox();
        lbDescricao = new javax.swing.JLabel();
        lbTipoMovmFinanceira = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        cmbTipoMovmPai = new javax.swing.JComboBox<Item>();
        lbQuantidade = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDescricao = new javax.swing.JTextArea();
        bttSituacao = new javax.swing.JButton();
        bttSalvar = new javax.swing.JButton();
        rbEntradaEstoque = new javax.swing.JRadioButton();
        rbSaidaFinanceira = new javax.swing.JRadioButton();
        rbEntradaFinanceira = new javax.swing.JRadioButton();
        rbSaidaEstoque = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTipoMovimentacao = new javax.swing.JTable();
        bttNovo = new javax.swing.JButton();
        bttDeletar = new javax.swing.JButton();
        txtidTipoMovimentacao = new javax.swing.JTextField();
        cmbPai = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setPreferredSize(new java.awt.Dimension(785, 663));
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
        jLabel4.setText("Tipo Movimentação");
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
        cbFuncionario.setBounds(30, 300, 200, 40);

        lbDescricao.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbDescricao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDescricao.setText("Descrição:");
        getContentPane().add(lbDescricao);
        lbDescricao.setBounds(400, 80, 130, 30);

        lbTipoMovmFinanceira.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbTipoMovmFinanceira.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTipoMovmFinanceira.setText("Tipo de Movimentação Pai:");
        getContentPane().add(lbTipoMovmFinanceira);
        lbTipoMovmFinanceira.setBounds(30, 160, 250, 30);

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        getContentPane().add(txtNome);
        txtNome.setBounds(30, 110, 310, 30);

        cmbTipoMovmPai.setPreferredSize(new java.awt.Dimension(777, 445));
        cmbTipoMovmPai.setRenderer(new ItemRenderer());
        getContentPane().add(cmbTipoMovmPai);
        cmbTipoMovmPai.setBounds(30, 190, 310, 30);

        lbQuantidade.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbQuantidade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbQuantidade.setText("Nome:");
        getContentPane().add(lbQuantidade);
        lbQuantidade.setBounds(0, 80, 130, 30);

        txaDescricao.setColumns(20);
        txaDescricao.setRows(5);
        jScrollPane1.setViewportView(txaDescricao);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(410, 110, 310, 70);

        bttSituacao.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        bttSituacao.setText("ATIVAR/DESATIVAR");
        bttSituacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSituacaoActionPerformed(evt);
            }
        });
        getContentPane().add(bttSituacao);
        bttSituacao.setBounds(570, 500, 200, 50);

        bttSalvar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        bttSalvar.setText("SALVAR");
        bttSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(bttSalvar);
        bttSalvar.setBounds(510, 220, 130, 50);

        buttonGroup2.add(rbEntradaEstoque);
        rbEntradaEstoque.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        rbEntradaEstoque.setText("Entrada de Estoque");
        getContentPane().add(rbEntradaEstoque);
        rbEntradaEstoque.setBounds(230, 290, 200, 40);

        buttonGroup1.add(rbSaidaFinanceira);
        rbSaidaFinanceira.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        rbSaidaFinanceira.setText("Saída Financeira");
        getContentPane().add(rbSaidaFinanceira);
        rbSaidaFinanceira.setBounds(30, 240, 170, 40);

        buttonGroup1.add(rbEntradaFinanceira);
        rbEntradaFinanceira.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        rbEntradaFinanceira.setText("Entrada Financeira");
        getContentPane().add(rbEntradaFinanceira);
        rbEntradaFinanceira.setBounds(30, 270, 190, 40);

        buttonGroup2.add(rbSaidaEstoque);
        rbSaidaEstoque.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        rbSaidaEstoque.setText("Saída de Estoque");
        getContentPane().add(rbSaidaEstoque);
        rbSaidaEstoque.setBounds(230, 260, 180, 40);

        tblTipoMovimentacao.setModel(vTabela);
        tblTipoMovimentacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTipoMovimentacaoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblTipoMovimentacao);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 370, 540, 240);

        bttNovo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        bttNovo.setText("NOVO");
        bttNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttNovoActionPerformed(evt);
            }
        });
        getContentPane().add(bttNovo);
        bttNovo.setBounds(510, 280, 130, 50);

        bttDeletar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        bttDeletar.setText("DELETAR");
        bttDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttDeletarActionPerformed(evt);
            }
        });
        getContentPane().add(bttDeletar);
        bttDeletar.setBounds(610, 560, 130, 50);
        getContentPane().add(txtidTipoMovimentacao);
        txtidTipoMovimentacao.setBounds(230, 80, 6, 20);

        cmbPai.setAutoscrolls(true);
        getContentPane().add(cmbPai);
        cmbPai.setBounds(390, 200, 28, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFuncionarioActionPerformed

    }//GEN-LAST:event_cbFuncionarioActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void bttSituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSituacaoActionPerformed
        TipoMovimentacao tipoMovimentacao = new TipoMovimentacao();
        PerTipoMovimentacao perTipoMovimentacao = new PerTipoMovimentacao();
        if (tipoMovimentacao.getSituacao().equals("Desativado")) {
            tipoMovimentacao.setSituacao("Ativo");
        } else {
            tipoMovimentacao.setSituacao("Desativado");
        }
        
        perTipoMovimentacao.AlterarTipoMovimentacao(tipoMovimentacao);
        this.getParent();
    }//GEN-LAST:event_bttSituacaoActionPerformed

    private void bttNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttNovoActionPerformed
       limpar();
    }//GEN-LAST:event_bttNovoActionPerformed

    private void bttDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttDeletarActionPerformed
         PerTipoMovimentacao perTipoMovm= new PerTipoMovimentacao();    
        int idTipoMovimentacao = Integer.parseInt(vTabela.getValueAt(tblTipoMovimentacao.getSelectedRow(), 3) + "");
        perTipoMovm.deletarTipoMovimentacao(idTipoMovimentacao);
        PreencherTabela(); 
        PreencherCombo();
        
        JOptionPane.showMessageDialog(this, "Registro deletado com sucesso!");
        limpar();
    }//GEN-LAST:event_bttDeletarActionPerformed

    private void bttSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSalvarActionPerformed
        TipoMovimentacao tipoMovimentacao = new TipoMovimentacao();
        PerTipoMovimentacao perTipoMovimentacao = new PerTipoMovimentacao();
        if (txtidTipoMovimentacao.getText().length() == 0) {
            tipoMovimentacao.setnmTipoMovimentacao(txtNome.getText());
            tipoMovimentacao.setdscrTipoMovimentacao(txaDescricao.getText());
            tipoMovimentacao.setidTipoMovimentcaoPai(Integer.parseInt(cmbTipoMovmPai.getSelectedItem().toString()));
            tipoMovimentacao.setSituacao("Ativo");
            
            if(rbSaidaFinanceira.isSelected()){
                tipoMovimentacao.setSaidaFinanceira("Saida Financeira");
            }else if(rbEntradaFinanceira.isSelected()){
                tipoMovimentacao.setEntradaFinanceira("Entrada Financeira");
            }
            if(rbSaidaEstoque.isSelected()){
                tipoMovimentacao.setSaidaEstoque("Saida Estoque");
            }else if(rbEntradaEstoque.isSelected()){
                tipoMovimentacao.setEntradaEstoque("Entrada Estoque");
            }
            if(cbFuncionario.isSelected()){
                tipoMovimentacao.setRequerFuncionario("Requer Funcionario");
            }
            perTipoMovimentacao.inserirTipoMovimentacao(tipoMovimentacao);
        } else {
            tipoMovimentacao.setidTipoMovimentcao(Integer.parseInt(txtidTipoMovimentacao.getText()));
            tipoMovimentacao.setnmTipoMovimentacao(txtNome.getText());
            tipoMovimentacao.setdscrTipoMovimentacao(txaDescricao.getText());
            
            perTipoMovimentacao.AlterarTipoMovimentacao(tipoMovimentacao);
            this.getParent(); 
            
            
        }
        limpar();
        PreencherTabela();
        PreencherCombo();
    }//GEN-LAST:event_bttSalvarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        PreencherTabela();
        PreencherCombo();
    }//GEN-LAST:event_formInternalFrameOpened

    private void tblTipoMovimentacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTipoMovimentacaoMouseClicked
         txtNome.setText(vTabela.getValueAt(tblTipoMovimentacao.getSelectedRow(), 0).toString());
         txaDescricao.setText(vTabela.getValueAt(tblTipoMovimentacao.getSelectedRow(), 1).toString());
    }//GEN-LAST:event_tblTipoMovimentacaoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttDeletar;
    private javax.swing.JButton bttNovo;
    private javax.swing.JButton bttSalvar;
    private javax.swing.JButton bttSituacao;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox cbFuncionario;
    private javax.swing.JComboBox<TipoMovimentacao> cmbPai;
    private javax.swing.JComboBox cmbTipoMovmPai;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbDescricao;
    private javax.swing.JLabel lbQuantidade;
    private javax.swing.JLabel lbTipoMovmFinanceira;
    private javax.swing.JRadioButton rbEntradaEstoque;
    private javax.swing.JRadioButton rbEntradaFinanceira;
    private javax.swing.JRadioButton rbSaidaEstoque;
    private javax.swing.JRadioButton rbSaidaFinanceira;
    private javax.swing.JTable tblTipoMovimentacao;
    private javax.swing.JTextArea txaDescricao;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtidTipoMovimentacao;
    // End of variables declaration//GEN-END:variables

    private void limpar() {
       txtNome.setText(null);
       txaDescricao.setText(null);
       rbEntradaEstoque.setSelected(false);
       rbEntradaFinanceira.setSelected(false);
       rbSaidaEstoque.setSelected(false);
       rbSaidaFinanceira.setSelected(false);
       cbFuncionario.setSelected(false);
    }

    private void PreencherTabela() {
         vTabela.setRowCount(0);
        PerTipoMovimentacao perTipoMovimentacao=new PerTipoMovimentacao();
       ArrayList<TipoMovimentacao> classeTipo= perTipoMovimentacao.TodosTiposMovimentacao();
       
       for(TipoMovimentacao f:classeTipo){
           
           String linha[]=new String[3];
           
           linha[0]=f.getnmTipoMovimentacao();
           linha[1]=f.getdscrTipoMovimentacao();
           linha[2]=String.valueOf(f.getidTipoMovimentacao());
              vTabela.addRow(linha);
       }
    }
    
    private void PreencherCombo(){
          PerTipoMovimentacao perTipoMovimentacao=new PerTipoMovimentacao();
          ArrayList<TipoMovimentacao> classeTipo= perTipoMovimentacao.TodosTiposMovimentacao();
          Vector model= new Vector();
          Vector model2 = new Vector();
          for(TipoMovimentacao t:classeTipo){
              model.addElement(new Item(t.getidTipoMovimentacao(), t.getnmTipoMovimentacao()));
              model2.addElement(t);
          }
          cmbPai = new JComboBox<TipoMovimentacao>(model2);
          cmbTipoMovmPai = new JComboBox<Item>(model);
          cmbTipoMovmPai.setRenderer(new ItemRenderer());
    }
}

class ItemRenderer extends BasicComboBoxRenderer{
    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus){
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        if(value!=null){
            Item item= (Item) value;
            setText(item.getDescricao());
        }
        return this;
    }
}
