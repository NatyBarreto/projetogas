
package prjgas.Fronteiras;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import prjgas.Modelo.Funcionario;
import prjgas.Persisitencias.PerFuncionario;
import sun.misc.Perf;

public class FrmCadastroFuncionario extends javax.swing.JInternalFrame {
 DefaultTableModel vTabelaSalario = new DefaultTableModel();
 DefaultTableModel vTabelaFuncionario = new DefaultTableModel();
    public FrmCadastroFuncionario() {
        initComponents();
         vTabelaFuncionario.addColumn("Nome");
         vTabelaFuncionario.addColumn("Cargo");
         vTabelaFuncionario.addColumn("idFuncionario");
         
         vTabelaSalario.addColumn("Salario");
         vTabelaSalario.addColumn("Data Início");
         vTabelaSalario.addColumn("Data Término");
         
         idFuncionario.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtnmFuncionario = new javax.swing.JTextField();
        bttDeletar = new javax.swing.JButton();
        txtnmCargoFuncinario = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        bttNovo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFuncionario = new javax.swing.JTable();
        bttSalvar = new javax.swing.JButton();
        idFuncionario = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
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

        jLabel1.setBackground(new java.awt.Color(0, 204, 102));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro Funcionário");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 880, 62);

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Nome:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(10, 70, 89, 37);
        getContentPane().add(txtnmFuncionario);
        txtnmFuncionario.setBounds(90, 80, 330, 30);

        bttDeletar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        bttDeletar.setText("DELETAR");
        bttDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttDeletarActionPerformed(evt);
            }
        });
        getContentPane().add(bttDeletar);
        bttDeletar.setBounds(680, 450, 150, 39);
        getContentPane().add(txtnmCargoFuncinario);
        txtnmCargoFuncinario.setBounds(560, 80, 276, 30);

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Cargo:");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(470, 80, 89, 30);

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Tabela Funcionário");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(0, 220, 215, 37);

        bttNovo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        bttNovo.setText("NOVO");
        bttNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttNovoActionPerformed(evt);
            }
        });
        getContentPane().add(bttNovo);
        bttNovo.setBounds(450, 150, 150, 39);

        tblFuncionario.setModel(vTabelaFuncionario);
        tblFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFuncionarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblFuncionario);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 260, 640, 230);

        bttSalvar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        bttSalvar.setText("SALVAR");
        bttSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(bttSalvar);
        bttSalvar.setBounds(230, 150, 170, 39);

        idFuncionario.setText("jTextField1");
        getContentPane().add(idFuncionario);
        idFuncionario.setBounds(720, 180, 59, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttNovoActionPerformed
        txtnmFuncionario.setText("");
        txtnmCargoFuncinario.setText("");
    }//GEN-LAST:event_bttNovoActionPerformed

    private void bttSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSalvarActionPerformed
        Funcionario funcionario = new Funcionario();
        PerFuncionario perFuncionario = new PerFuncionario();
        if (idFuncionario.getText().length() == 0) {
            funcionario.setnmFuncionario(txtnmFuncionario.getText());
            funcionario.setnmCargoFuncionario(txtnmCargoFuncinario.getText());
            perFuncionario.inserirFuncionario(funcionario);
        } else {
            funcionario.setidFuncionario(Integer.parseInt(idFuncionario.getText()));
            funcionario.setnmFuncionario(txtnmFuncionario.getText());
            funcionario.setnmCargoFuncionario(txtnmCargoFuncinario.getText());
            perFuncionario.AlterarFuncionario(funcionario);
            
            
        }
    }//GEN-LAST:event_bttSalvarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
       PreencherTabelaFuncionario();
       
       
    }//GEN-LAST:event_formInternalFrameOpened

    private void tblFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFuncionarioMouseClicked
          txtnmFuncionario.setText(vTabelaFuncionario.getValueAt(tblFuncionario.getSelectedRow(), 1).toString());
          txtnmCargoFuncinario.setText(vTabelaFuncionario.getValueAt(tblFuncionario.getSelectedRow(), 2).toString()); 
          idFuncionario.setText(vTabelaFuncionario.getValueAt(tblFuncionario.getSelectedRow(), 3).toString()); 
    }//GEN-LAST:event_tblFuncionarioMouseClicked

    private void bttDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttDeletarActionPerformed
        PerFuncionario perFuncionario= new PerFuncionario();    
        int codFuncionario = Integer.parseInt(vTabelaFuncionario.getValueAt(tblFuncionario.getSelectedRow(), 0) + "");
        perFuncionario.deletarFuncionario(codFuncionario);
        PreencherTabelaFuncionario();  
        
        JOptionPane.showMessageDialog(this, "Registro deletado com sucesso!");
    }//GEN-LAST:event_bttDeletarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttDeletar;
    private javax.swing.JButton bttNovo;
    private javax.swing.JButton bttSalvar;
    private javax.swing.JTextField idFuncionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFuncionario;
    private javax.swing.JTextField txtnmCargoFuncinario;
    private javax.swing.JTextField txtnmFuncionario;
    // End of variables declaration//GEN-END:variables

    private void PreencherTabelaFuncionario() {
        vTabelaFuncionario=(DefaultTableModel)tblFuncionario.getModel();// Aplicar Conversão
       int t=vTabelaFuncionario.getRowCount();
       
       for(int i=0;i<t;i++){
           vTabelaFuncionario.removeRow(i);
       }
       
       PerFuncionario perFuncionario=new PerFuncionario();
       ArrayList<Funcionario> classeFuncionario= perFuncionario.TodosFuncionarios();
       
       for(Funcionario f:classeFuncionario){
           
           String linha[]=new String[4];
           
           linha[0]=f.getnmFuncionario();
           linha[1]=f.getnmCargoFuncionario();
           
              vTabelaFuncionario.addRow(linha);
       }
    }
}