package prjgas.Fronteiras;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import prjgas.Modelo.Funcionario;
import prjgas.Modelo.Salario;
import prjgas.Persisitencias.PerFuncionario;
import prjgas.Persisitencias.PerSalario;

public class FrmSalario extends javax.swing.JInternalFrame {
DefaultTableModel vTabelaSalario=new DefaultTableModel();
    public FrmSalario() {
        initComponents();
        
         vTabelaSalario.addColumn("Salario");
         vTabelaSalario.addColumn("Data Início");
         vTabelaSalario.addColumn("Data Término");
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtdtInicioVigencia = new javax.swing.JTextField();
        bttNovo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtdtTerminoVigencia = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        cmbFuncionario = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSalario = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        bttSalvar = new javax.swing.JButton();
        txtvlSalario = new javax.swing.JTextField();
        txtidSalario = new javax.swing.JTextField();
        txtidFuncionario = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setPreferredSize(new java.awt.Dimension(820, 550));
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
        getContentPane().add(txtdtInicioVigencia);
        txtdtInicioVigencia.setBounds(40, 290, 200, 36);

        bttNovo.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        bttNovo.setText("NOVO");
        bttNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttNovoActionPerformed(evt);
            }
        });
        getContentPane().add(bttNovo);
        bttNovo.setBounds(620, 380, 140, 46);

        jLabel4.setBackground(new java.awt.Color(0, 204, 102));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Salário");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 810, 62);

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Funcionário:");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(0, 70, 180, 35);

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Data Término Vigência:");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(40, 370, 213, 37);
        getContentPane().add(txtdtTerminoVigencia);
        txtdtTerminoVigencia.setBounds(40, 400, 200, 34);

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Tabela Salário");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(370, 80, 213, 37);

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Data Início Vigência:");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(30, 260, 213, 35);

        cmbFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(cmbFuncionario);
        cmbFuncionario.setBounds(30, 100, 320, 30);

        tblSalario.setModel(vTabelaSalario);
        jScrollPane1.setViewportView(tblSalario);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(410, 110, 370, 240);

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Valor do Salário:");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(30, 160, 213, 37);

        bttSalvar.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        bttSalvar.setText("SALVAR");
        bttSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(bttSalvar);
        bttSalvar.setBounds(420, 380, 140, 46);
        getContentPane().add(txtvlSalario);
        txtvlSalario.setBounds(40, 190, 200, 36);
        getContentPane().add(txtidSalario);
        txtidSalario.setBounds(170, 140, 110, 20);
        getContentPane().add(txtidFuncionario);
        txtidFuncionario.setBounds(30, 140, 110, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttNovoActionPerformed
        Limpar();
    }//GEN-LAST:event_bttNovoActionPerformed

    private void bttSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSalvarActionPerformed
        Salario salario = new Salario();
          salario.setdtInicioVigencia(txtdtInicioVigencia.getText());
          salario.setdtTerminoVigencia(txtdtTerminoVigencia.getText());
          salario.setvlSalario(Double.parseDouble(txtvlSalario.getText()));
          
        PerSalario.inserirSalario(salario);
        Limpar();
        
        PreencherTabela();
    }//GEN-LAST:event_bttSalvarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
    PerFuncionario perFuncionario=new PerFuncionario();
        ArrayList<Funcionario> funcionario=perFuncionario.TodosFuncionarios();//ArrayList=matriz dinanmica 
        for(Funcionario f:funcionario){
            String linha[]=new String[3];
            linha[0]=String.valueOf(f.getidFuncionario());
            linha[1]=f.getnmFuncionario();
            linha[2]=String.valueOf(f.getidSalario());
            cmbFuncionario.addItem(linha[1]);
            txtidFuncionario.setText(linha[0]);
            txtidSalario.setText(linha[2]);
        }
        
        PreencherTabela();
        
    }//GEN-LAST:event_formInternalFrameOpened

    private void cmbFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFuncionarioActionPerformed
        PreencherTabela();
        
        
    }//GEN-LAST:event_cmbFuncionarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttNovo;
    private javax.swing.JButton bttSalvar;
    private javax.swing.JComboBox<String> cmbFuncionario;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSalario;
    private javax.swing.JTextField txtdtInicioVigencia;
    private javax.swing.JTextField txtdtTerminoVigencia;
    private javax.swing.JTextField txtidFuncionario;
    private javax.swing.JTextField txtidSalario;
    private javax.swing.JTextField txtvlSalario;
    // End of variables declaration//GEN-END:variables

    private void Limpar() {
        txtdtInicioVigencia.setText("");
        txtdtTerminoVigencia.setText("");
        txtvlSalario.setText("");
    }

    private void PreencherTabela() {
       vTabelaSalario.setRowCount(0);
       PerSalario persalario=new PerSalario();
       ArrayList<Salario> classeSalario= persalario.TodosSalarios(); 
       
        for(Salario s:classeSalario){
           
           String linha[]=new String[3];
           
           linha[0]=String.valueOf(s.getvlSalario());
           linha[1]=s.getdtInicioVigencia();
           linha[2]=s.getdtTerminoVigencia();
              vTabelaSalario.addRow(linha);
       }
    
    }

    
}