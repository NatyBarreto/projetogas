package prjgas.Fronteiras;

import prjgas.Modelo.Salario;
import prjgas.Persisitencias.PerSalario;

public class FrmCadastroSalario extends javax.swing.JInternalFrame {

    public FrmCadastroSalario() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtdtInicioVigencia = new javax.swing.JTextField();
        txtvlSalario = new javax.swing.JTextField();
        bttSalario = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtdtTerminoVigencia = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(null);
        getContentPane().add(txtdtInicioVigencia);
        txtdtInicioVigencia.setBounds(340, 400, 200, 36);
        getContentPane().add(txtvlSalario);
        txtvlSalario.setBounds(340, 510, 200, 36);

        bttSalario.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        bttSalario.setText("SALVAR");
        bttSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSalarioActionPerformed(evt);
            }
        });
        getContentPane().add(bttSalario);
        bttSalario.setBounds(300, 580, 97, 46);

        jLabel4.setBackground(new java.awt.Color(0, 204, 102));
        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Cadastro Salário");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 736, 62);

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Funcionário:");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(10, 70, 180, 35);

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Data Término Vigência:");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(130, 450, 213, 37);
        getContentPane().add(txtdtTerminoVigencia);
        txtdtTerminoVigencia.setBounds(340, 450, 200, 34);

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Valor do Salário:");
        getContentPane().add(jLabel19);
        jLabel19.setBounds(130, 510, 213, 37);

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Data Início Vigência:");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(130, 400, 213, 35);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(200, 70, 320, 30);

        jTable1.setModel(vTabelaSalario);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(110, 120, 450, 240);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSalarioActionPerformed
        Salario salario = new Salario();
          salario.setdtInicioVigencia(txtdtInicioVigencia.getText());
          salario.setdtTerminoVigencia(txtdtTerminoVigencia.getText());
          salario.setvlSalario(Double.parseDouble(txtvlSalario.getText()));
          
        PerSalario.inserirSalario(salario);
    }//GEN-LAST:event_bttSalarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttSalario;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtdtInicioVigencia;
    private javax.swing.JTextField txtdtTerminoVigencia;
    private javax.swing.JTextField txtvlSalario;
    // End of variables declaration//GEN-END:variables
}
