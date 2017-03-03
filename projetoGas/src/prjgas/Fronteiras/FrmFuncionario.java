
package prjgas.Fronteiras;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import prjgas.Modelo.Funcionario;
import prjgas.Persisitencias.PerFuncionario;


public class FrmFuncionario extends javax.swing.JInternalFrame {
 DefaultTableModel vTabelaFuncionario = new DefaultTableModel();
    public FrmFuncionario() {
        initComponents();
         vTabelaFuncionario.addColumn("Nome");
         vTabelaFuncionario.addColumn("Cargo");
         vTabelaFuncionario.addColumn("idFuncionario");
         
                
         txtidFuncionario.setVisible(false);
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
        bttNovo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFuncionario = new javax.swing.JTable();
        bttSalvar = new javax.swing.JButton();
        txtidFuncionario = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setPreferredSize(new java.awt.Dimension(780, 613));
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
        jLabel1.setText(" Funcionário");
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(360, 45));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 770, 60);

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Nome:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(20, 70, 89, 30);

        txtnmFuncionario.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        getContentPane().add(txtnmFuncionario);
        txtnmFuncionario.setBounds(30, 100, 340, 30);

        bttDeletar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        bttDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cancel.png"))); // NOI18N
        bttDeletar.setText("DELETAR");
        bttDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttDeletarActionPerformed(evt);
            }
        });
        getContentPane().add(bttDeletar);
        bttDeletar.setBounds(570, 490, 170, 70);

        txtnmCargoFuncinario.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        getContentPane().add(txtnmCargoFuncinario);
        txtnmCargoFuncinario.setBounds(420, 100, 320, 30);

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Cargo:");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(410, 70, 89, 30);

        bttNovo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        bttNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/add.png"))); // NOI18N
        bttNovo.setText("NOVO");
        bttNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttNovoActionPerformed(evt);
            }
        });
        getContentPane().add(bttNovo);
        bttNovo.setBounds(390, 160, 160, 70);

        tblFuncionario.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        tblFuncionario.setModel(vTabelaFuncionario);
        tblFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFuncionarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblFuncionario);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 250, 720, 230);

        bttSalvar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        bttSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/checked.png"))); // NOI18N
        bttSalvar.setText("SALVAR");
        bttSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(bttSalvar);
        bttSalvar.setBounds(220, 160, 165, 70);

        txtidFuncionario.setAutoscrolls(false);
        getContentPane().add(txtidFuncionario);
        txtidFuncionario.setBounds(40, 170, 70, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttNovoActionPerformed
        Limpar();
        
    }//GEN-LAST:event_bttNovoActionPerformed

    private void bttSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSalvarActionPerformed
        Funcionario funcionario = new Funcionario();
        PerFuncionario perFuncionario = new PerFuncionario();
        if (txtidFuncionario.getText().length() == 0) {
            funcionario.setnmFuncionario(txtnmFuncionario.getText());
            funcionario.setnmCargoFuncionario(txtnmCargoFuncinario.getText());
            perFuncionario.inserirFuncionario(funcionario);
        } else {
            funcionario.setidFuncionario(Integer.parseInt(txtidFuncionario.getText()));
            funcionario.setnmFuncionario(txtnmFuncionario.getText());
            funcionario.setnmCargoFuncionario(txtnmCargoFuncinario.getText());
            
            perFuncionario.AlterarFuncionario(funcionario);
            this.getParent(); 
            
            
        }
        Limpar();
        PreencherTabelaFuncionario();
    }//GEN-LAST:event_bttSalvarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
       PreencherTabelaFuncionario();
       
       
    }//GEN-LAST:event_formInternalFrameOpened

    private void tblFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFuncionarioMouseClicked
          txtnmFuncionario.setText(vTabelaFuncionario.getValueAt(tblFuncionario.getSelectedRow(), 0).toString());
          txtnmCargoFuncinario.setText(vTabelaFuncionario.getValueAt(tblFuncionario.getSelectedRow(), 1).toString()); 
          txtidFuncionario.setText(vTabelaFuncionario.getValueAt(tblFuncionario.getSelectedRow(), 2).toString()); 
    }//GEN-LAST:event_tblFuncionarioMouseClicked

    private void bttDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttDeletarActionPerformed
        PerFuncionario perFuncionario= new PerFuncionario();    
        int idFuncionario = Integer.parseInt(vTabelaFuncionario.getValueAt(tblFuncionario.getSelectedRow(), 2) + "");
        perFuncionario.deletarFuncionario(idFuncionario);
        PreencherTabelaFuncionario();  
        
        JOptionPane.showMessageDialog(this, "Registro deletado com sucesso!");
        Limpar();
    }//GEN-LAST:event_bttDeletarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttDeletar;
    private javax.swing.JButton bttNovo;
    private javax.swing.JButton bttSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblFuncionario;
    private javax.swing.JTextField txtidFuncionario;
    private javax.swing.JTextField txtnmCargoFuncinario;
    private javax.swing.JTextField txtnmFuncionario;
    // End of variables declaration//GEN-END:variables

    private void PreencherTabelaFuncionario() {      
       vTabelaFuncionario.setRowCount(0);
       PerFuncionario perFuncionario=new PerFuncionario();
       ArrayList<Funcionario> classeFuncionario= perFuncionario.TodosFuncionarios();
       
       for(Funcionario f:classeFuncionario){
           
           String linha[]=new String[4];
           
           linha[0]=f.getnmFuncionario();
           linha[1]=f.getnmCargoFuncionario();
           linha[2]=String.valueOf(f.getidFuncionario());
              vTabelaFuncionario.addRow(linha);
       }
    }
    private void Limpar() {
        txtnmFuncionario.setText(null);
        txtnmCargoFuncinario.setText(null);
        txtidFuncionario.setText(null);
    }
}
