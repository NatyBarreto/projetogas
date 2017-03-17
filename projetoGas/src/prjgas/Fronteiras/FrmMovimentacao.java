package prjgas.Fronteiras;

import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import prjgas.Modelo.Funcionario;
import prjgas.Modelo.Movimentacao;
import prjgas.Modelo.Produto;
import prjgas.Modelo.TipoMovimentacao;
import prjgas.Persisitencias.PerFuncionario;
import prjgas.Persisitencias.PerProduto;
import prjgas.Persisitencias.PerMovimentacao;
import prjgas.Persisitencias.PerTipoMovimentacao;

public class FrmMovimentacao extends javax.swing.JInternalFrame {
DefaultTableModel vTabela=new DefaultTableModel();
    public FrmMovimentacao() {
        initComponents();
        
        vTabela.addColumn("Data");
        vTabela.addColumn("Valor");
        vTabela.addColumn("Tipo");
        vTabela.addColumn("idMovmFinanceira");
        
        
        txtidFuncionario.setVisible(false);
        txtidTipoMovm.setVisible(false);
        txtIdMovimentacao.setVisible(false);
        txtidProduto.setVisible(false);
        
        tblMovimentacao.getColumnModel().getColumn(3).setMinWidth(0);
        tblMovimentacao.getColumnModel().getColumn(3).setPreferredWidth(0);
        tblMovimentacao.getColumnModel().getColumn(3).setMaxWidth(0);
        
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        lbValor = new javax.swing.JLabel();
        bttNovo = new javax.swing.JButton();
        lbData = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txadscrMovimentacao = new javax.swing.JTextArea();
        lbFuncionario = new javax.swing.JLabel();
        cmbFuncionario = new javax.swing.JComboBox<>();
        bttSalvar = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        cmbTipoMovimentacao = new javax.swing.JComboBox<>();
        txtidTipoMovm = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMovimentacao = new javax.swing.JTable();
        bttDeletar = new javax.swing.JButton();
        txtidFuncionario = new javax.swing.JTextField();
        txtIdMovimentacao = new javax.swing.JTextField();
        txtData = new javax.swing.JFormattedTextField();
        lbQuantidade = new javax.swing.JLabel();
        lbProduto = new javax.swing.JLabel();
        txtidProduto = new javax.swing.JTextField();
        cmbProduto = new javax.swing.JComboBox<>();
        txtValor = new javax.swing.JTextField();
        txtQuantidade = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setPreferredSize(new java.awt.Dimension(779, 644));
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

        jLabel4.setBackground(new java.awt.Color(0, 153, 102));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText(" Movimentação ");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 770, 60);

        lbValor.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbValor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbValor.setText("Valor:");
        getContentPane().add(lbValor);
        lbValor.setBounds(430, 250, 60, 29);

        bttNovo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        bttNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/add.png"))); // NOI18N
        bttNovo.setText("NOVO");
        bttNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttNovoActionPerformed(evt);
            }
        });
        getContentPane().add(bttNovo);
        bttNovo.setBounds(390, 330, 160, 70);

        lbData.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbData.setText("Data:");
        getContentPane().add(lbData);
        lbData.setBounds(30, 130, 60, 30);

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Descrição:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(30, 190, 109, 30);

        txadscrMovimentacao.setColumns(20);
        txadscrMovimentacao.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txadscrMovimentacao.setRows(5);
        jScrollPane1.setViewportView(txadscrMovimentacao);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 220, 320, 90);

        lbFuncionario.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbFuncionario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFuncionario.setText("Funionário:");
        getContentPane().add(lbFuncionario);
        lbFuncionario.setBounds(430, 70, 120, 30);

        cmbFuncionario.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cmbFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(cmbFuncionario);
        cmbFuncionario.setBounds(430, 100, 310, 30);

        bttSalvar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        bttSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/checked.png"))); // NOI18N
        bttSalvar.setText("SALVAR");
        bttSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(bttSalvar);
        bttSalvar.setBounds(210, 330, 170, 70);

        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Tipo Movimentação:");
        getContentPane().add(jLabel22);
        jLabel22.setBounds(30, 70, 190, 30);

        cmbTipoMovimentacao.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cmbTipoMovimentacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoMovimentacaoActionPerformed(evt);
            }
        });
        getContentPane().add(cmbTipoMovimentacao);
        cmbTipoMovimentacao.setBounds(30, 100, 320, 30);
        getContentPane().add(txtidTipoMovm);
        txtidTipoMovm.setBounds(0, 100, 30, 30);

        tblMovimentacao.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tblMovimentacao.setModel(vTabela);
        tblMovimentacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMovimentacaoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblMovimentacao);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(30, 410, 520, 190);

        bttDeletar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        bttDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cancel.png"))); // NOI18N
        bttDeletar.setText("DELETAR");
        bttDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttDeletarActionPerformed(evt);
            }
        });
        getContentPane().add(bttDeletar);
        bttDeletar.setBounds(570, 530, 180, 70);
        getContentPane().add(txtidFuncionario);
        txtidFuncionario.setBounds(390, 100, 40, 30);
        getContentPane().add(txtIdMovimentacao);
        txtIdMovimentacao.setBounds(0, 60, 30, 30);

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtData.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        getContentPane().add(txtData);
        txtData.setBounds(30, 160, 320, 30);

        lbQuantidade.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbQuantidade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbQuantidade.setText("Quantidade:");
        getContentPane().add(lbQuantidade);
        lbQuantidade.setBounds(430, 190, 120, 31);

        lbProduto.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbProduto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbProduto.setText("Produto:");
        getContentPane().add(lbProduto);
        lbProduto.setBounds(430, 130, 80, 30);
        getContentPane().add(txtidProduto);
        txtidProduto.setBounds(390, 160, 40, 30);

        cmbProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(cmbProduto);
        cmbProduto.setBounds(430, 160, 310, 30);
        getContentPane().add(txtValor);
        txtValor.setBounds(430, 280, 310, 30);
        getContentPane().add(txtQuantidade);
        txtQuantidade.setBounds(430, 220, 310, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttNovoActionPerformed
    Limpar();
    }//GEN-LAST:event_bttNovoActionPerformed

    private void cmbFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFuncionarioActionPerformed
       PerFuncionario perFuncionario=new PerFuncionario();
        ArrayList<Funcionario> funcionario=perFuncionario.TodosFuncionarios();//ArrayList=matriz dinanmica 
        for(Funcionario f:funcionario){
            String linha[]=new String[2];
            linha[0]=String.valueOf(f.getidFuncionario());
            linha[1]=f.getnmFuncionario();
            if(linha[1].equals(cmbFuncionario.getSelectedItem())){
                txtidFuncionario.setText(linha[0]);
            }            

        }
    }//GEN-LAST:event_cmbFuncionarioActionPerformed

    private void bttSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSalvarActionPerformed
        Movimentacao movm = new Movimentacao();
        PerMovimentacao perMovimentacao = new PerMovimentacao();
        if (txtIdMovimentacao.getText().length() == 0) {
            if(!txtValor.getText().isEmpty()){
                 txtValor.setText(txtValor.getText().replace(',','.'));
            }

            DateFormat dataFormato = new SimpleDateFormat("dd/MM/yyyy");
           
            java.sql.Date dataSQL = null;
          try {
              java.util.Date data =  dataFormato.parse(txtData.getText());
              dataSQL = new java.sql.Date(data.getTime());
              
               
          } catch (ParseException ex) {
              Logger.getLogger(FrmMovimentacaoEstoque.class.getName()).log(Level.SEVERE, null, ex);
          }
         
            movm.setDtMovimentacao(dataSQL);
            movm.setVlMovimentcao(Double.parseDouble(txtValor.getText()));
            movm.setDscrMovimentacao(txadscrMovimentacao.getText());
            movm.setTipoMovimentacao(Integer.parseInt(txtidTipoMovm.getText()));
            movm.setQtdMovimentcao(Integer.parseInt(txtQuantidade.getText()));//nao ta funcionando
            movm.setFuncionario(Integer.parseInt(txtidFuncionario.getText()));
            movm.setProduto(Integer.parseInt(txtidProduto.getText()));

            perMovimentacao.inserirMovimentacao(movm);
        } else {
            if(!txtValor.getText().isEmpty()){
                 txtValor.setText(txtValor.getText().replace(',','.'));
            }
            DateFormat dataFormato = new SimpleDateFormat("dd/MM/yyyy");
            java.sql.Date dataSQL = null;
            try {
                java.util.Date data = dataFormato.parse(txtData.getText());
                dataSQL = new java.sql.Date(data.getTime());
            } catch (ParseException ex) {
                Logger.getLogger(FrmMovimentacaoEstoque.class.getName()).log(Level.SEVERE, null, ex);
            }
            movm.setIdMovimentcao(Integer.parseInt(txtIdMovimentacao.getText()));
            movm.setDtMovimentacao(dataSQL);
            movm.setVlMovimentcao(Double.parseDouble(txtValor.getText()));
            movm.setDscrMovimentacao(txadscrMovimentacao.getText());
            movm.setTipoMovimentacao(Integer.parseInt(txtidTipoMovm.getText()));
            movm.setQtdMovimentcao(Integer.parseInt(txtQuantidade.getText()));
            movm.setFuncionario(Integer.parseInt(txtidFuncionario.getText()));
            movm.setProduto(Integer.parseInt(txtidProduto.getText()));

            perMovimentacao.AlterarMovimentacao(movm);
        }

        
        Limpar();
        PreencherTabela();
    }//GEN-LAST:event_bttSalvarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        PerFuncionario perFuncionario = new PerFuncionario();
        ArrayList<Funcionario> funcionario = perFuncionario.TodosFuncionarios();//ArrayList=matriz dinanmica 
        for (Funcionario f : funcionario) {
            String linha[] = new String[1];
            linha[0] = f.getnmFuncionario();
            cmbFuncionario.addItem(linha[0]);
        }
       
        PerTipoMovimentacao perTipoMovm = new PerTipoMovimentacao();
        ArrayList<TipoMovimentacao> tipoMovm = perTipoMovm.TodosTiposMovimentacao();//ArrayList=matriz dinanmica 
        for (TipoMovimentacao p : tipoMovm) {
            String linha[] = new String[1];;
            linha[0] = p.getnmTipoMovimentacao();
            cmbTipoMovimentacao.addItem(linha[0]);
        }
        
        PerProduto perProduto = new PerProduto();
        ArrayList<Produto> produto = perProduto.TodosProdutos();//ArrayList=matriz dinanmica 
        for (Produto p : produto) {
            String linha[] = new String[1];;
            linha[0] = p.getnmProduto();
            cmbProduto.addItem(linha[0]);
        }
               
        PreencherTabela();
    }//GEN-LAST:event_formInternalFrameOpened

    private void cmbTipoMovimentacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoMovimentacaoActionPerformed
        PerTipoMovimentacao perTipoMovm=new PerTipoMovimentacao();
        ArrayList<TipoMovimentacao> tipoMovm=perTipoMovm.TodosTiposMovimentacao();//ArrayList=matriz dinanmica 
        for(TipoMovimentacao p:tipoMovm){
            String linha[]=new String[2];
            linha[0]=String.valueOf(p.getidTipoMovimentacao());
            linha[1]=p.getnmTipoMovimentacao();
            if(linha[1].equals(cmbTipoMovimentacao.getSelectedItem())){
                txtidTipoMovm.setText(linha[0]);
            }            
        }
             
        lbFuncionario.setVisible(false);
        cmbFuncionario.setVisible(false);
        cmbProduto.setVisible(false);
        txtQuantidade.setVisible(false);
        lbProduto.setVisible(false);
        lbQuantidade.setVisible(false);
        txtValor.setVisible(false);
        lbValor.setVisible(false);
        
        PerTipoMovimentacao perTipoMovimentacao = new PerTipoMovimentacao();
        TipoMovimentacao tipoMovimentacao = perTipoMovimentacao.ConsultarTipoMovimentacao(Integer.parseInt(txtidTipoMovm.getText()));
        if (tipoMovimentacao.isRequerFuncionario()) {
            lbFuncionario.setVisible(true);
            cmbFuncionario.setVisible(true);
        } 
            if (tipoMovimentacao.isEntradaEstoque()) {
            cmbProduto.setVisible(true);
            txtQuantidade.setVisible(true);
            
            lbProduto.setVisible(true);
            lbQuantidade.setVisible(true);
            
        } else if (tipoMovimentacao.isSaidaEstoque()) {
            cmbProduto.setVisible(true);
            txtQuantidade.setVisible(true);
            
            lbProduto.setVisible(true);
            lbQuantidade.setVisible(true);
        }
        if (tipoMovimentacao.isEntradaFinanceira()) {
            txtValor.setVisible(true);
            lbValor.setVisible(true);

        }else if (tipoMovimentacao.isSaidaFinanceira()) {
            txtValor.setVisible(true);
            lbValor.setVisible(true);
        }
    }//GEN-LAST:event_cmbTipoMovimentacaoActionPerformed

    private void bttDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttDeletarActionPerformed
        PerMovimentacao perMovimentacaoFinanceira = new PerMovimentacao();
        int idMovmFinanceira = Integer.parseInt(vTabela.getValueAt(tblMovimentacao.getSelectedRow(), 3) + "");
        perMovimentacaoFinanceira.deletarMovimentacao(idMovmFinanceira);
        PreencherTabela();

        JOptionPane.showMessageDialog(this, "Registro deletado com sucesso!");
        Limpar();
    }//GEN-LAST:event_bttDeletarActionPerformed

    private void tblMovimentacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMovimentacaoMouseClicked
        txtIdMovimentacao.setText(vTabela.getValueAt(tblMovimentacao.getSelectedRow(), 3).toString());
        PerMovimentacao perMovimentacao = new PerMovimentacao();
        Movimentacao consulta = perMovimentacao.ConsultarMovimentacao(Integer.parseInt(txtIdMovimentacao.getText()));
        DateFormat dataFormato = new SimpleDateFormat("dd/MM/yyyy");
        txtData.setText(dataFormato.format(consulta.getDtMovimentacao()));
        txadscrMovimentacao.setText(consulta.getDscrMovimentacao());
        txtQuantidade.setText(String.valueOf(consulta.getQtdMovimentcao()));
        txtValor.setText(String.valueOf(consulta.getVlMovimentcao()));
        txtidFuncionario.setText(String.valueOf(consulta.getFuncionario()));
        txtidProduto.setText(String.valueOf(consulta.getProduto()));
        txtidTipoMovm.setText(String.valueOf(consulta.getTipoMovimentacao()));
        
        /*falta colocar os valores nas combos*/
    }//GEN-LAST:event_tblMovimentacaoMouseClicked

    private void cmbProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProdutoActionPerformed
        PerProduto perProduto=new PerProduto();
        ArrayList<Produto> produto=perProduto.TodosProdutos();//ArrayList=matriz dinanmica
        for(Produto p:produto){
            String linha[]=new String[2];
            linha[0]=String.valueOf(p.getidProduto());
            linha[1]=p.getnmProduto();
            if(linha[1].equals(cmbProduto.getSelectedItem())){
                txtidProduto.setText(linha[0]);
            }

        }
        
        
        
    }//GEN-LAST:event_cmbProdutoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttDeletar;
    private javax.swing.JButton bttNovo;
    private javax.swing.JButton bttSalvar;
    private javax.swing.JComboBox<String> cmbFuncionario;
    private javax.swing.JComboBox<String> cmbProduto;
    private javax.swing.JComboBox<String> cmbTipoMovimentacao;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbData;
    private javax.swing.JLabel lbFuncionario;
    private javax.swing.JLabel lbProduto;
    private javax.swing.JLabel lbQuantidade;
    private javax.swing.JLabel lbValor;
    private javax.swing.JTable tblMovimentacao;
    private javax.swing.JTextArea txadscrMovimentacao;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtIdMovimentacao;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtValor;
    private javax.swing.JTextField txtidFuncionario;
    private javax.swing.JTextField txtidProduto;
    private javax.swing.JTextField txtidTipoMovm;
    // End of variables declaration//GEN-END:variables

    private void Limpar() {
      txtData.setText(null);
      txtValor.setText(null);
      txadscrMovimentacao.setText(null);
      txtQuantidade.setText(null);
    }
    
    private void PreencherTabela() {
        vTabela.setRowCount(0);
        PerMovimentacao perMovimentacao = new PerMovimentacao();
        PerTipoMovimentacao perTipoMovimentacao=new PerTipoMovimentacao();
        ArrayList<Movimentacao> classeMovm = perMovimentacao.TodasMovimentacao();

        for (Movimentacao m : classeMovm) {

            String linha[] = new String[4];

            DateFormat dataFormato = new SimpleDateFormat("dd/MM/yyyy");

            linha[0] = dataFormato.format(m.getDtMovimentacao());;
            linha[1] = String.valueOf(m.getVlMovimentcao());
            
            TipoMovimentacao tipoMovm = perTipoMovimentacao.ConsultarTipoMovimentacao(Integer.parseInt( String.valueOf(m.getTipoMovimentacao())));
            String nomeTipoMovm= tipoMovm.getnmTipoMovimentacao();

            linha[2] =nomeTipoMovm;
            linha[3] = String.valueOf(m.getIdMovimentcao());
            vTabela.addRow(linha);
        }
    
    }
}
