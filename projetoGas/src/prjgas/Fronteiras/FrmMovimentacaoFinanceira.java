package prjgas.Fronteiras;

import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import prjgas.Modelo.Funcionario;
import prjgas.Modelo.MovimentacaoFinanceira;
import prjgas.Modelo.Produto;
import prjgas.Modelo.TipoMovimentacao;
import prjgas.Persisitencias.PerFuncionario;
import prjgas.Persisitencias.PerMovimentacaoFinanceira;
import prjgas.Persisitencias.PerProduto;
import prjgas.Persisitencias.PerTipoMovimentacao;

public class FrmMovimentacaoFinanceira extends javax.swing.JInternalFrame {
DefaultTableModel vTabela=new DefaultTableModel();
    public FrmMovimentacaoFinanceira() {
        initComponents();
        
        vTabela.addColumn("Data");
        vTabela.addColumn("Valor");
        vTabela.addColumn("Tipo");
        vTabela.addColumn("idMovmFinanceira");
        
        
        txtidFuncionario.setVisible(false);
        txtidTipoMovm.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        txtdtMovmFinanceira = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtvlMovmFinanceira = new javax.swing.JTextField();
        bttNovo = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txadscrMovmFinanceira = new javax.swing.JTextArea();
        lbFuncionario = new javax.swing.JLabel();
        cmbFuncionario = new javax.swing.JComboBox<>();
        bttSalvar = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        cmbTipoMovimentacao = new javax.swing.JComboBox<>();
        txtidTipoMovm = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMovmFinanceira = new javax.swing.JTable();
        bttDeletar = new javax.swing.JButton();
        txtidFuncionario = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setPreferredSize(new java.awt.Dimension(798, 606));
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

        bttNovo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        bttNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/add.png"))); // NOI18N
        bttNovo.setText("NOVO");
        bttNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttNovoActionPerformed(evt);
            }
        });
        getContentPane().add(bttNovo);
        bttNovo.setBounds(410, 320, 160, 70);

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Data:");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(10, 70, 120, 30);

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Descrição:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(430, 150, 109, 30);

        txadscrMovmFinanceira.setColumns(20);
        txadscrMovmFinanceira.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txadscrMovmFinanceira.setRows(5);
        jScrollPane1.setViewportView(txadscrMovmFinanceira);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(430, 180, 330, 70);

        lbFuncionario.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        lbFuncionario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFuncionario.setText("Funionário:");
        getContentPane().add(lbFuncionario);
        lbFuncionario.setBounds(420, 70, 120, 30);

        cmbFuncionario.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        cmbFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(cmbFuncionario);
        cmbFuncionario.setBounds(430, 100, 330, 30);

        bttSalvar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        bttSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/checked.png"))); // NOI18N
        bttSalvar.setText("SALVAR");
        bttSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(bttSalvar);
        bttSalvar.setBounds(230, 320, 170, 70);

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
        getContentPane().add(txtidTipoMovm);
        txtidTipoMovm.setBounds(40, 280, 90, 30);

        tblMovmFinanceira.setModel(vTabela);
        jScrollPane2.setViewportView(tblMovmFinanceira);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(30, 420, 520, 130);

        bttDeletar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        bttDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cancel.png"))); // NOI18N
        bttDeletar.setText("DELETAR");
        bttDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttDeletarActionPerformed(evt);
            }
        });
        getContentPane().add(bttDeletar);
        bttDeletar.setBounds(570, 420, 180, 70);
        getContentPane().add(txtidFuncionario);
        txtidFuncionario.setBounds(370, 100, 60, 30);

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
        PerMovimentacaoFinanceira perMovmFinanceira = new PerMovimentacaoFinanceira();
        MovimentacaoFinanceira financeira = new MovimentacaoFinanceira();
        if (txtidTipoMovm.getText().length() == 0) {
            financeira.setDtMovmFinanceira(Date.valueOf(txtdtMovmFinanceira.getText()));
            financeira.setvlMovmFinanceira(Double.parseDouble(txtvlMovmFinanceira.getText()));
            financeira.setdscrMovmFinanceira(txadscrMovmFinanceira.getText());
            financeira.setTipoMovimentacao(Integer.parseInt(txtidTipoMovm.getText()));
            financeira.setfuncionario(Integer.parseInt(txtidFuncionario.getText()));
            // movimentacao de estoque

            perMovmFinanceira.inserirMovimentacaoFinanceira(financeira);
        } else {

            financeira.setIdMovmFinanceira(Integer.parseInt(txtidTipoMovm.getText()));
            financeira.setDtMovmFinanceira(Date.valueOf(txtdtMovmFinanceira.getText()));
            financeira.setvlMovmFinanceira(Double.parseDouble(txtvlMovmFinanceira.getText()));
            financeira.setdscrMovmFinanceira(txadscrMovmFinanceira.getText());
            financeira.setTipoMovimentacao(Integer.parseInt(txtidTipoMovm.getText()));
            financeira.setfuncionario(Integer.parseInt(txtidFuncionario.getText()));
            //movimentacao de estoque

            perMovmFinanceira.AlterarMovimentacaoFinanceira(financeira);
            this.getParent();
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
    }//GEN-LAST:event_cmbTipoMovimentacaoActionPerformed

    private void bttDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttDeletarActionPerformed
         PerMovimentacaoFinanceira perMovimentacaoFinanceira= new PerMovimentacaoFinanceira();    
        int idMovmFinanceira = Integer.parseInt(vTabela.getValueAt(tblMovmFinanceira.getSelectedRow(), 4) + "");
        perMovimentacaoFinanceira.deletarMovmFinanceira(idMovmFinanceira);
        PreencherTabela();  
        
        JOptionPane.showMessageDialog(this, "Registro deletado com sucesso!");
        Limpar();
    }//GEN-LAST:event_bttDeletarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttDeletar;
    private javax.swing.JButton bttNovo;
    private javax.swing.JButton bttSalvar;
    private javax.swing.JComboBox<String> cmbFuncionario;
    private javax.swing.JComboBox<String> cmbTipoMovimentacao;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbFuncionario;
    private javax.swing.JTable tblMovmFinanceira;
    private javax.swing.JTextArea txadscrMovmFinanceira;
    private javax.swing.JTextField txtdtMovmFinanceira;
    private javax.swing.JTextField txtidFuncionario;
    private javax.swing.JTextField txtidTipoMovm;
    private javax.swing.JTextField txtvlMovmFinanceira;
    // End of variables declaration//GEN-END:variables

    private void Limpar() {
      txtdtMovmFinanceira.setText(null);
      txtvlMovmFinanceira.setText(null);
      txadscrMovmFinanceira.setText(null);
    }

    private void PreencherTabela() {
         vTabela.setRowCount(0);
       PerMovimentacaoFinanceira perMovimentacaoFinanceira=new PerMovimentacaoFinanceira();
       ArrayList<MovimentacaoFinanceira> classeMovmFinanceira= perMovimentacaoFinanceira.TodasMovmFinanceira();
       
       for(MovimentacaoFinanceira f:classeMovmFinanceira){
           
           String linha[]=new String[4];
           
           linha[0]=String.valueOf(f.getDtMovmFinanceira());
           linha[1]=String.valueOf(f.getvlMovmFinanceira());
           linha[2]=String.valueOf(f.getTipoMovimentacao());
              vTabela.addRow(linha);
       }
    }
}
