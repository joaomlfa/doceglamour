/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Conexão.Conexao;
import Dados.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.TabelaClienteCadastrarPedido;

/**
 *
 * @author Aluno
 */
public class BuscarCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form BuscarCliente
     */
    List<Cliente> clientes = new ArrayList<>();
    TabelaClienteCadastrarPedido tableModel = new TabelaClienteCadastrarPedido();
    private String telaPai = "";
    public BuscarCliente(String telaPai) {
        initComponents();
        jTable1.setModel(tableModel);
        this.telaPai = telaPai;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtNomeCliente = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setText("Nome do Cliente:");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Selecionar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtNomeCliente)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 155, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(162, 162, 162))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        tableModel.removeAllRow();
        clientes.clear();
        if(jtNomeCliente.getText().equals("")){
           JOptionPane.showMessageDialog(null, "Campo Nome nao pode ser em Branco", "Atenção", JOptionPane.INFORMATION_MESSAGE);
           jtNomeCliente.requestFocus();
           return;
       }
       Conexao minhaConexao = new Conexao();
       ResultSet rsCliente = null;
       minhaConexao.getConexao();
       String sqlBuscarClientes = "SELECT codigo_cliente, nome, telefone, rua, bairro, cidade, numero, complemento FROM dados.cliente WHERE nome  ~* ?";
        try {
            PreparedStatement stmBuscarClientes = minhaConexao.getConexao().prepareStatement(sqlBuscarClientes);
            stmBuscarClientes.setString(1, jtNomeCliente.getText());
            rsCliente = stmBuscarClientes.executeQuery();
            if(rsCliente.next()){
                do{
                    Cliente novo = new Cliente();
                    novo.setBairro(rsCliente.getString("bairro"));
                    novo.setCidade(rsCliente.getString("cidade"));
                    novo.setCodigo_cliente(rsCliente.getInt("codigo_cliente"));
                    novo.setComplemento(rsCliente.getString("complemento"));
                    novo.setNome(rsCliente.getString("nome"));
                    novo.setNumero(rsCliente.getInt("numero"));
                    novo.setRua(rsCliente.getString("rua"));
                    novo.setTelefone(rsCliente.getString("telefone"));
                    clientes.add(novo);
                }while(rsCliente.next());
            }else{
                JOptionPane.showMessageDialog(null, "Cliente Inexistente", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                jtNomeCliente.requestFocus();
                return;
            }
        } catch (SQLException ex) {
            Logger.getLogger(BuscarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(Cliente c : clientes){
            tableModel.addRow(c);
        }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(jTable1.getSelectedRow() >= 0){
            Cliente selecionado = new Cliente();
            selecionado = tableModel.getRowAt(jTable1.getSelectedRow());
            if(this.telaPai.equals("CadastrarPedido")){
                CadastrarPedido.cliente = selecionado;
                CadastrarPedido.jtCliente.setText(selecionado.getNome());
                this.dispose();
            }else{
                BuscarPedido.jtNomeCliente.setText(selecionado.getNome());
                BuscarPedido.codigoCliente = selecionado.getCodigo_cliente();
                this.dispose();
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Selecione um Cliente na Tabela", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            return;
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jtNomeCliente;
    // End of variables declaration//GEN-END:variables
}
