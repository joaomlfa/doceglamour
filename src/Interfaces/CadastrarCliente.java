/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Dados.Cliente;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class CadastrarCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastrarCliente
     */
    public CadastrarCliente() {
        initComponents();
        Principal.verificarCliente = false;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jtnome = new javax.swing.JTextField();
        jltelefone = new javax.swing.JLabel();
        jftelefone = new javax.swing.JFormattedTextField();
        jlnome = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jtcomplemento = new javax.swing.JTextField();
        jlnumero = new javax.swing.JLabel();
        jtnumero = new javax.swing.JTextField();
        jlrua = new javax.swing.JLabel();
        jtrua = new javax.swing.JTextField();
        jlbairro = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtbairro = new javax.swing.JTextField();
        jtcidade = new javax.swing.JTextField();
        jlcomplemento = new javax.swing.JLabel();
        jbsalvar = new javax.swing.JButton();
        jblimpar = new javax.swing.JButton();
        jbsair = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastrar Cliente");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
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
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 668, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Dados Pessoais"));

        jtnome.setToolTipText("Campo Obrigatorio");
        jtnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtnomeActionPerformed(evt);
            }
        });

        jltelefone.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jltelefone.setText("Telefone:");

        try {
            jftelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftelefone.setToolTipText("Campo Obrigatorio");
        jftelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jftelefoneActionPerformed(evt);
            }
        });

        jlnome.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jlnome.setText("Nome:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(73, 439, Short.MAX_VALUE)
                        .addComponent(jltelefone))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jlnome)
                        .addGap(42, 42, 42)
                        .addComponent(jtnome, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jftelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlnome)
                    .addComponent(jtnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jltelefone)
                    .addComponent(jftelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Endereço"));

        jtcomplemento.setToolTipText("Opcional");

        jlnumero.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jlnumero.setText("Numero:");

        jtnumero.setToolTipText("Opcional");
        jtnumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtnumeroActionPerformed(evt);
            }
        });

        jlrua.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jlrua.setText("Rua:");

        jtrua.setToolTipText("Opcional");

        jlbairro.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jlbairro.setText("Bairro:");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("Cidade:");

        jtbairro.setToolTipText("Opcional");

        jtcidade.setToolTipText("Opcional");

        jlcomplemento.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jlcomplemento.setText("Complemento:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlcomplemento)
                    .addComponent(jlrua))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtrua)
                            .addComponent(jtcomplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jtcidade, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jlbairro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtbairro, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jlnumero)
                .addGap(0, 597, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlrua)
                    .addComponent(jtrua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbairro)
                    .addComponent(jtbairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtcidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlcomplemento)
                    .addComponent(jtcomplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlnumero)
                    .addComponent(jtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbsalvar.setBackground(new java.awt.Color(204, 204, 204));
        jbsalvar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbsalvar.setText("Salvar");
        jbsalvar.setToolTipText("Salvar");
        jbsalvar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsalvarActionPerformed(evt);
            }
        });

        jblimpar.setBackground(new java.awt.Color(204, 204, 204));
        jblimpar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jblimpar.setText("Limpar");
        jblimpar.setToolTipText("Limpar");
        jblimpar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jblimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jblimparActionPerformed(evt);
            }
        });

        jbsair.setBackground(new java.awt.Color(204, 204, 204));
        jbsair.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbsair.setText("Sair");
        jbsair.setToolTipText("Sair");
        jbsair.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jbsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jblimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbsair, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jblimpar, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(jbsalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbsair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(106, 106, 106)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setBounds(0, 0, 704, 502);
    }// </editor-fold>//GEN-END:initComponents

    private void jtnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtnomeActionPerformed

    private void jftelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jftelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jftelefoneActionPerformed

    private void jblimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jblimparActionPerformed
        jtbairro.setText("");
        jtcomplemento.setText("");
        jtcidade.setText("");
        jtnome.setText("");
        jtnumero.setText("");
        jtrua.setText("");
        jtnome.requestFocus();
        jftelefone.setText("");
    }//GEN-LAST:event_jblimparActionPerformed

    private void jbsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbsairActionPerformed

    private void jbsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsalvarActionPerformed
        if(jtnome.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Campo nome nao pode ser Vazio", "ERROR", JOptionPane.ERROR_MESSAGE);
            jtnome.requestFocus();
            return;
        }
        if(!jftelefone.getText().equals("")){
            int cont=0;
            for (int i = 0; i < jftelefone.getText().length(); i++) {
                if (Character.isDigit(jftelefone.getText().charAt(i))){
                    cont++;
                } 
            }
            if(cont != 11){
                JOptionPane.showMessageDialog(null, "Telefone deve conter DD e Numero com 9 Digitos", "ERROR", JOptionPane.ERROR_MESSAGE);
                jftelefone.requestFocus();
                return;
            }
        }
        try {
            int numero;
            if(jtnumero.getText().equals("")){
                 numero = 0;
            }
            else{
             numero = Integer.parseInt(jtnumero.getText());
            }
            String telefone = jftelefone.getText();
            String bairro = jtbairro.getText();
            String complemento = jtcomplemento.getText();
            String cidade = jtcidade.getText();
            String nome = jtnome.getText();
            String rua = jtrua.getText();
            Cliente novo = new Cliente(nome, telefone, rua, bairro, complemento, cidade, numero);
            novo.InserirBd();

            jtbairro.setText("");
            jtcomplemento.setText("");
            jtcidade.setText("");
            jtnome.setText("");
            jtnumero.setText("");
            jtrua.setText("");
            jtnome.requestFocus();
            jftelefone.setText("00000000000");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Campo 'Número' nao pode ser letra ou Vazio", "ERRO", JOptionPane.ERROR_MESSAGE);
            jtnumero.requestFocus();
        }


    }//GEN-LAST:event_jbsalvarActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        Principal.verificarCliente = true;
    }//GEN-LAST:event_formInternalFrameClosed

    private void jtnumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtnumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtnumeroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jblimpar;
    private javax.swing.JButton jbsair;
    private javax.swing.JButton jbsalvar;
    private javax.swing.JFormattedTextField jftelefone;
    private javax.swing.JLabel jlbairro;
    private javax.swing.JLabel jlcomplemento;
    private javax.swing.JLabel jlnome;
    private javax.swing.JLabel jlnumero;
    private javax.swing.JLabel jlrua;
    private javax.swing.JLabel jltelefone;
    private javax.swing.JTextField jtbairro;
    private javax.swing.JTextField jtcidade;
    private javax.swing.JTextField jtcomplemento;
    private javax.swing.JTextField jtnome;
    private javax.swing.JTextField jtnumero;
    private javax.swing.JTextField jtrua;
    // End of variables declaration//GEN-END:variables
}
