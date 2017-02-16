
package prjgas.Fronteiras;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import prjgas.Modelo.Produto;
import prjgas.Persisitencias.PerProduto;

public class FrmProduto extends javax.swing.JInternalFrame {

  DefaultTableModel vTabelaProduto=new DefaultTableModel();
    public FrmProduto() {
        initComponents();
        
        vTabelaProduto.addColumn("Produto");
        vTabelaProduto.addColumn("Descrição");
        vTabelaProduto.addColumn("idProduto");
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtnmProduto = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txadscrProduto = new javax.swing.JTextArea();
        bttNovo = new javax.swing.JButton();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtnmProduto1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txadscrProduto1 = new javax.swing.JTextArea();
        bttProduto1 = new javax.swing.JButton();
        bttSalvar = new javax.swing.JButton();
        bttDeletar = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblProduto = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setPreferredSize(new java.awt.Dimension(700, 650));
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 204, 102));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro Produto");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 690, 62);

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Descrição:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(340, 91, 109, 30);
        getContentPane().add(txtnmProduto);
        txtnmProduto.setBounds(30, 120, 270, 30);

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Nome:");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(10, 90, 104, 30);

        txadscrProduto.setColumns(20);
        txadscrProduto.setRows(5);
        jScrollPane1.setViewportView(txadscrProduto);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(340, 120, 330, 96);

        bttNovo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        bttNovo.setText("NOVO");
        bttNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttNovoActionPerformed(evt);
            }
        });
        getContentPane().add(bttNovo);
        bttNovo.setBounds(160, 200, 120, 50);

        jInternalFrame1.setClosable(true);
        jInternalFrame1.setIconifiable(true);
        jInternalFrame1.getContentPane().setLayout(null);

        jLabel2.setBackground(new java.awt.Color(0, 204, 102));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cadastro Produto");
        jLabel2.setOpaque(true);
        jInternalFrame1.getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 690, 62);

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Descrição:");
        jInternalFrame1.getContentPane().add(jLabel18);
        jLabel18.setBounds(330, 80, 109, 41);
        jInternalFrame1.getContentPane().add(txtnmProduto1);
        txtnmProduto1.setBounds(20, 120, 270, 36);

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Nome:");
        jInternalFrame1.getContentPane().add(jLabel19);
        jLabel19.setBounds(10, 80, 104, 36);

        txadscrProduto1.setColumns(20);
        txadscrProduto1.setRows(5);
        jScrollPane2.setViewportView(txadscrProduto1);

        jInternalFrame1.getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(330, 120, 300, 96);

        bttProduto1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        bttProduto1.setText("SALVAR");
        bttProduto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttProduto1ActionPerformed(evt);
            }
        });
        jInternalFrame1.getContentPane().add(bttProduto1);
        bttProduto1.setBounds(40, 200, 97, 39);

        getContentPane().add(jInternalFrame1);
        jInternalFrame1.setBounds(0, 0, 60, 33);

        bttSalvar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        bttSalvar.setText("SALVAR");
        bttSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(bttSalvar);
        bttSalvar.setBounds(20, 200, 120, 50);

        bttDeletar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        bttDeletar.setText("DELETAR");
        bttDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttDeletarActionPerformed(evt);
            }
        });
        getContentPane().add(bttDeletar);
        bttDeletar.setBounds(520, 550, 150, 39);

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Tabela Produto");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(0, 270, 215, 37);

        jScrollPane3.setPreferredSize(new java.awt.Dimension(700, 900));
        jScrollPane3.setRequestFocusEnabled(false);

        tblProduto.setModel(vTabelaProduto);
        tblProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProdutoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblProduto);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(30, 310, 640, 230);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttNovoActionPerformed
   
    }//GEN-LAST:event_bttNovoActionPerformed

    private void bttSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSalvarActionPerformed
            Produto produto = new Produto();
        produto.setnmProduto(txtnmProduto.getText());
        produto.setdscrProduto(txadscrProduto.getText());

        PerProduto.inserirProduto(produto);
        Limpar();
    }//GEN-LAST:event_bttSalvarActionPerformed

    private void bttDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttDeletarActionPerformed
        PerProduto perProduto= new PerProduto();
        int idProduto = Integer.parseInt(vTabelaProduto.getValueAt(tblProduto.getSelectedRow(), 2) + "");
        perProduto.deletarProduto(idProduto);
        PreencherTabelaProduto();

        JOptionPane.showMessageDialog(this, "Registro deletado com sucesso!");
        Limpar();
    }//GEN-LAST:event_bttDeletarActionPerformed

    private void bttProduto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttProduto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bttProduto1ActionPerformed

    private void tblProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProdutoMouseClicked
        txtnmProduto.setText(vTabelaProduto.getValueAt(tblProduto.getSelectedRow(), 0).toString());
        txadscrProduto.setText(vTabelaProduto.getValueAt(tblProduto.getSelectedRow(), 1).toString());

    }//GEN-LAST:event_tblProdutoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttDeletar;
    private javax.swing.JButton bttNovo;
    private javax.swing.JButton bttProduto1;
    private javax.swing.JButton bttSalvar;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblProduto;
    private javax.swing.JTextArea txadscrProduto;
    private javax.swing.JTextArea txadscrProduto1;
    private javax.swing.JTextField txtnmProduto;
    private javax.swing.JTextField txtnmProduto1;
    // End of variables declaration//GEN-END:variables

    private void Limpar() {
        txtnmProduto.setText(null);
        txadscrProduto.setText(null);
    }

    private void PreencherTabelaProduto() {
       
        vTabelaProduto.setRowCount(0);
       PerProduto perFuncionario=new PerProduto();
       ArrayList<Produto> classeProduto= perFuncionario.TodosProdutos();
       
       for(Produto p:classeProduto){
           
           String linha[]=new String[4];
           
           linha[0]=p.getnmProduto();
           linha[1]=p.getdscrProduto();
           linha[2]=String.valueOf(p.getidProduto());
              vTabelaProduto.addRow(linha);
       }
    }

}
