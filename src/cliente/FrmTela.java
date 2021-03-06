/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;


/**
 *
 * @author mrodrigues
 */
public class FrmTela extends javax.swing.JFrame {
    
    private final Cliente cliente;

    /**
     * Creates new form FrmTela
     */
    public FrmTela() {
        
        initComponents();
        
        this.cliente = new Cliente();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoDoenca = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        pnSintomas = new javax.swing.JPanel();
        checkFebre = new javax.swing.JCheckBox();
        checkMancha = new javax.swing.JCheckBox();
        checkCansaco = new javax.swing.JCheckBox();
        checkOlho = new javax.swing.JCheckBox();
        checkArticulacao = new javax.swing.JCheckBox();
        checkVomito = new javax.swing.JCheckBox();
        checkDiarreia = new javax.swing.JCheckBox();
        checkTosse = new javax.swing.JCheckBox();
        checkCabeca = new javax.swing.JCheckBox();
        checkGarganta = new javax.swing.JCheckBox();
        pnDoenca = new javax.swing.JPanel();
        checkResfriado = new javax.swing.JRadioButton();
        checkGripe = new javax.swing.JRadioButton();
        checkVirose = new javax.swing.JRadioButton();
        checkAlergia = new javax.swing.JRadioButton();
        checkDengue = new javax.swing.JRadioButton();
        pnRsultado = new javax.swing.JPanel();
        btnEnviar = new javax.swing.JButton();
        txtDoenca = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPaciente = new javax.swing.JTextField();
        txtMedico = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sistema de Apoio a Tomada de Decisao");

        pnSintomas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Sintomas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14))); // NOI18N
        pnSintomas.setLayout(new java.awt.GridLayout(2, 5));

        checkFebre.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        checkFebre.setText("Febre");
        pnSintomas.add(checkFebre);

        checkMancha.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        checkMancha.setText("Manchas cutaneas");
        pnSintomas.add(checkMancha);

        checkCansaco.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        checkCansaco.setText("Cansaço");
        pnSintomas.add(checkCansaco);

        checkOlho.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        checkOlho.setText("Olhos irritados");
        pnSintomas.add(checkOlho);

        checkArticulacao.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        checkArticulacao.setText("Dores nas articulaçoes");
        pnSintomas.add(checkArticulacao);

        checkVomito.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        checkVomito.setText("Vomito");
        pnSintomas.add(checkVomito);

        checkDiarreia.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        checkDiarreia.setText("Diarreia");
        pnSintomas.add(checkDiarreia);

        checkTosse.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        checkTosse.setText("Tosse");
        pnSintomas.add(checkTosse);

        checkCabeca.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        checkCabeca.setText("Dor de cabeça");
        pnSintomas.add(checkCabeca);

        checkGarganta.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        checkGarganta.setText("Dor de garganta");
        pnSintomas.add(checkGarganta);

        pnDoenca.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Doença", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14))); // NOI18N
        pnDoenca.setLayout(new java.awt.GridLayout(1, 5));

        grupoDoenca.add(checkResfriado);
        checkResfriado.setText("Resfriado");
        pnDoenca.add(checkResfriado);

        grupoDoenca.add(checkGripe);
        checkGripe.setText("Gripe");
        pnDoenca.add(checkGripe);

        grupoDoenca.add(checkVirose);
        checkVirose.setText("Virose");
        pnDoenca.add(checkVirose);

        grupoDoenca.add(checkAlergia);
        checkAlergia.setText("Alergia");
        pnDoenca.add(checkAlergia);

        grupoDoenca.add(checkDengue);
        checkDengue.setText("Dengue");
        pnDoenca.add(checkDengue);

        pnRsultado.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Resultado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14))); // NOI18N

        btnEnviar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        txtDoenca.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        javax.swing.GroupLayout pnRsultadoLayout = new javax.swing.GroupLayout(pnRsultado);
        pnRsultado.setLayout(pnRsultadoLayout);
        pnRsultadoLayout.setHorizontalGroup(
            pnRsultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRsultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDoenca))
        );
        pnRsultadoLayout.setVerticalGroup(
            pnRsultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRsultadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnRsultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDoenca, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Dados Basicos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14))); // NOI18N
        jPanel1.setLayout(new java.awt.GridLayout(2, 2, 20, 0));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel2.setText("Paciente:");
        jPanel1.add(jLabel2);

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel3.setText("Medico:");
        jPanel1.add(jLabel3);
        jPanel1.add(txtPaciente);
        jPanel1.add(txtMedico);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnSintomas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnDoenca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnRsultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnSintomas, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnDoenca, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(pnRsultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        // TODO add your handling code here:
        
        String mensagem = "";
        
        mensagem += txtPaciente.getText() + ";";
        mensagem += txtMedico.getText() + ";";
        
        mensagem += checkFebre.isSelected() ? "1" : "0";
        mensagem += checkMancha.isSelected() ? "1" : "0";
        mensagem += checkCansaco.isSelected() ? "1" : "0";
        mensagem += checkOlho.isSelected() ? "1" : "0";
        mensagem += checkArticulacao.isSelected() ? "1" : "0";
        mensagem += checkVomito.isSelected() ? "1" : "0";
        mensagem += checkDiarreia.isSelected() ? "1" : "0";
        mensagem += checkTosse.isSelected() ? "1" : "0";
        mensagem += checkCabeca.isSelected() ? "1" : "0";
        mensagem += checkGarganta.isSelected() ? "1" : "0";
                
        mensagem += ";";
        
        if(checkResfriado.isSelected()) mensagem += "0";
        else if(checkGripe.isSelected()) mensagem += "1";
        else if(checkDengue.isSelected()) mensagem += "2";
        else if(checkAlergia.isSelected()) mensagem += "3";
        else if(checkVirose.isSelected()) mensagem += "4";
        
        mensagem += ";"; 
        
        mensagem = cliente.Enviar(mensagem);
        System.out.println("Mensagem do servidor: " + mensagem );
        
        txtDoenca.setText(mensagem);
        
    }//GEN-LAST:event_btnEnviarActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JRadioButton checkAlergia;
    private javax.swing.JCheckBox checkArticulacao;
    private javax.swing.JCheckBox checkCabeca;
    private javax.swing.JCheckBox checkCansaco;
    private javax.swing.JRadioButton checkDengue;
    private javax.swing.JCheckBox checkDiarreia;
    private javax.swing.JCheckBox checkFebre;
    private javax.swing.JCheckBox checkGarganta;
    private javax.swing.JRadioButton checkGripe;
    private javax.swing.JCheckBox checkMancha;
    private javax.swing.JCheckBox checkOlho;
    private javax.swing.JRadioButton checkResfriado;
    private javax.swing.JCheckBox checkTosse;
    private javax.swing.JRadioButton checkVirose;
    private javax.swing.JCheckBox checkVomito;
    private javax.swing.ButtonGroup grupoDoenca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pnDoenca;
    private javax.swing.JPanel pnRsultado;
    private javax.swing.JPanel pnSintomas;
    private javax.swing.JTextField txtDoenca;
    private javax.swing.JTextField txtMedico;
    private javax.swing.JTextField txtPaciente;
    // End of variables declaration//GEN-END:variables
}
