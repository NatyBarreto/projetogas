package prjgas.Fronteiras;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import prjgas.Modelo.MovimentacaoEstoque;
import prjgas.Modelo.Produto;
import prjgas.Modelo.TipoMovimentacao;
import prjgas.Persisitencias.PerMovimentacaoEstoque;
import prjgas.Persisitencias.PerProduto;
import prjgas.Persisitencias.PerTipoMovimentacao;

public class FrmMovimentacaoEstoque extends javax.swing.JInternalFrame {

   DefaultTableModel vTabela= new DefaultTableModel();
    public FrmMovimentacaoEstoque() {
        initComponents();
        
        vTabela.addColumn("Data");
        vTabela.addColumn("Quantidade");
        vTabela.addColumn("Produto");
        vTabela.addColumn("Tipo");
        vTabela.addColumn("idMovmEstoque");
        
        txtidMovmEstoque.setVisible(false);
        txtidProduto.setVisible(false);
        txtidTipoMovm.setVisible(false);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        bttSalvar = new javax.swing.JButton();
        cmbTipoMovm = new javax.swing.JComboBox<>();
        cmbProduto = new javax.swing.JComboBox<>();
        bttNovo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMovmEstoque = new javax.swing.JTable();
        bttDeletar = new javax.swing.JButton();
        txtidMovmEstoque = new javax.swing.JTextField();
        txtidProduto = new javax.swing.JTextField();
        txtidTipoMovm = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setPreferredSize(new java.awt.Dimension(683, 631));
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

        jLabel1.setBackground(new java.awt.Color(0, 153, 102));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" Movimentação Estoque");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 670, 62);

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Data:");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(30, 80, 70, 30);
        getContentPane().add(txtData);
        txtData.setBounds(40, 110, 230, 29);

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Quantidade:");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(40, 160, 120, 31);
        getContentPane().add(txtQuantidade);
        txtQuantidade.setBounds(40, 190, 230, 28);

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Produto:");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(370, 80, 80, 30);

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Tipo Movimentação:");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(370, 160, 190, 30);

        bttSalvar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        bttSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/checked.png"))); // NOI18N
        bttSalvar.setText("SALVAR");
        bttSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(bttSalvar);
        bttSalvar.setBounds(150, 240, 170, 70);

        cmbTipoMovm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbTipoMovmActionPerformed(evt);
            }
        });
        getContentPane().add(cmbTipoMovm);
        cmbTipoMovm.setBounds(370, 190, 280, 30);

        cmbProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(cmbProduto);
        cmbProduto.setBounds(370, 110, 280, 30);

        bttNovo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        bttNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/add.png"))); // NOI18N
        bttNovo.setText("NOVO");
        bttNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttNovoActionPerformed(evt);
            }
        });
        getContentPane().add(bttNovo);
        bttNovo.setBounds(330, 240, 160, 70);

        tblMovmEstoque.setModel(vTabela);
        tblMovmEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMovmEstoqueMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMovmEstoque);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 330, 610, 170);

        bttDeletar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        bttDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cancel.png"))); // NOI18N
        bttDeletar.setText("DELETAR");
        bttDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttDeletarActionPerformed(evt);
            }
        });
        getContentPane().add(bttDeletar);
        bttDeletar.setBounds(470, 520, 170, 70);
        getContentPane().add(txtidMovmEstoque);
        txtidMovmEstoque.setBounds(0, 60, 60, 30);
        getContentPane().add(txtidProduto);
        txtidProduto.setBounds(310, 110, 60, 30);
        getContentPane().add(txtidTipoMovm);
        txtidTipoMovm.setBounds(310, 190, 60, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSalvarActionPerformed
      MovimentacaoEstoque estoque = new MovimentacaoEstoque();
      PerMovimentacaoEstoque perMovmEstoque=new PerMovimentacaoEstoque();
        if(txtidMovmEstoque.getText().length()==0){ 
        
        estoque.setdtMovmEstoque(txtData.getText());
        estoque.setproduto(Integer.parseInt(txtidProduto.getText()));
        estoque.setqtdMovmEstoque(Integer.parseInt(txtQuantidade.getText()));
        estoque.setTipoMovimentacao(Integer.parseInt(txtidTipoMovm.getText()));

        perMovmEstoque.inserirMovimentacaoEstoque(estoque);
      }else{
        estoque.setdtMovmEstoque(txtData.getText());
        estoque.setproduto(Integer.parseInt(txtidProduto.getText()));
        estoque.setqtdMovmEstoque(Integer.parseInt(txtQuantidade.getText()));
        estoque.setTipoMovimentacao(Integer.parseInt(txtidTipoMovm.getText())); 
        
        perMovmEstoque.AlterarMovmEstoque(estoque);
        this.getParent();
      }
        Limpar();
        PreencherTabela();
    }//GEN-LAST:event_bttSalvarActionPerformed

    private void bttNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttNovoActionPerformed
     Limpar();
    }//GEN-LAST:event_bttNovoActionPerformed

    private void bttDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttDeletarActionPerformed
      PerMovimentacaoEstoque perMovimentacaoEstoque = new PerMovimentacaoEstoque();
        int idMovmEstoque = Integer.parseInt(vTabela.getValueAt(tblMovmEstoque.getSelectedRow(), 4) + "");
        perMovimentacaoEstoque.deletarMovmEstoque(idMovmEstoque);
        PreencherTabela();

        JOptionPane.showMessageDialog(this, "Registro deletado com sucesso!");
        Limpar();
    }//GEN-LAST:event_bttDeletarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
      PerProduto perProduto=new PerProduto();
        ArrayList<Produto> produto=perProduto.TodosProdutos();//ArrayList=matriz dinanmica 
        for(Produto p:produto){
            String linha[]=new String[2];
            linha[0]=String.valueOf(p.getidProduto());
            linha[1]=p.getnmProduto();

            cmbProduto.addItem(linha[1]);
        }
        
        PerTipoMovimentacao perTipoMovmPai=new PerTipoMovimentacao();
        ArrayList<TipoMovimentacao> tipoMovmPai=perTipoMovmPai.TodosTiposMovimentacao();//ArrayList=matriz dinanmica 
        for(TipoMovimentacao t:tipoMovmPai){
            String linha[]=new String[2];
            linha[0]=String.valueOf(t.getidTipoMovimentacao());
            linha[1]=t.getnmTipoMovimentacao();

            cmbTipoMovm.addItem(linha[1]);
        }
        PreencherTabela();
    }//GEN-LAST:event_formInternalFrameOpened

    private void tblMovmEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMovmEstoqueMouseClicked
        txtData.setText(vTabela.getValueAt(tblMovmEstoque.getSelectedRow(), 0).toString());
        txtQuantidade.setText(vTabela.getValueAt(tblMovmEstoque.getSelectedRow(), 1).toString());
        cmbProduto.setSelectedItem(vTabela.getValueAt(tblMovmEstoque.getSelectedRow(), 2).toString());
        cmbTipoMovm.setSelectedItem(vTabela.getValueAt(tblMovmEstoque.getSelectedRow(), 3).toString());
        txtidMovmEstoque.setText(vTabela.getValueAt(tblMovmEstoque.getSelectedRow(), 4).toString());
        
    }//GEN-LAST:event_tblMovmEstoqueMouseClicked

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

    private void cmbTipoMovmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbTipoMovmActionPerformed
       PerTipoMovimentacao perTipoMovm=new PerTipoMovimentacao();
        ArrayList<TipoMovimentacao> tipoMovm=perTipoMovm.TodosTiposMovimentacao();//ArrayList=matriz dinanmica 
        for(TipoMovimentacao p:tipoMovm){
            String linha[]=new String[2];
            linha[0]=String.valueOf(p.getidTipoMovimentacao());
            linha[1]=p.getnmTipoMovimentacao();
            if(linha[1].equals(cmbTipoMovm.getSelectedItem())){
                txtidTipoMovm.setText(linha[0]);
            }            

        }
    }//GEN-LAST:event_cmbTipoMovmActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttDeletar;
    private javax.swing.JButton bttNovo;
    private javax.swing.JButton bttSalvar;
    private javax.swing.JComboBox<String> cmbProduto;
    private javax.swing.JComboBox<String> cmbTipoMovm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMovmEstoque;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JTextField txtidMovmEstoque;
    private javax.swing.JTextField txtidProduto;
    private javax.swing.JTextField txtidTipoMovm;
    // End of variables declaration//GEN-END:variables

    private void Limpar() {
       txtData.setText(null);
       txtQuantidade.setText(null);
       txtidMovmEstoque.setText(null);
    }

    private void PreencherTabela() {
        vTabela.setRowCount(0);
        PerMovimentacaoEstoque perMovmEstoque = new PerMovimentacaoEstoque();
        ArrayList<MovimentacaoEstoque> classeMovmEstoque = perMovmEstoque.TodasMovmEstoque();

        for (MovimentacaoEstoque m : classeMovmEstoque) {

            String linha[] = new String[5];

            linha[0] = m.getdtMovmEstoque();
            linha[1] = String.valueOf(m.getqtdMovmEstoque());
            linha[2] = String.valueOf(m.getproduto());
            linha[3] = String.valueOf(m.getTipoMovimentacao());
            linha[4] = String.valueOf(m.getidMovmEstoque());
            vTabela.addRow(linha);
        }
    
    }
}
