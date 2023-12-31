/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package cadastrocliente;

import java.util.ArrayList;

/**
 *
 * @author tatip
 */
public class JanelaCadastro extends javax.swing.JDialog {

    /**
     * Creates new form JanelaCadastro
     */
    private ModeloTabelaPessoa modeloPessoa;
    public JanelaCadastro(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        modeloPessoa = new ModeloTabelaPessoa(new ArrayList<Pessoa>());
tabPessoa.setModel(modeloPessoa); //pg 126
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buIncluir = new javax.swing.JButton();
        buAlterar = new javax.swing.JButton();
        buExcluir = new javax.swing.JButton();
        buSelecionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        buIncluir.setText("Incluir");
        buIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buIncluirActionPerformed(evt);
            }
        });

        buAlterar.setText("Alterar");
        buAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buAlterarActionPerformed(evt);
            }
        });

        buExcluir.setText("Excluir");
        buExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buExcluirActionPerformed(evt);
            }
        });

        buSelecionar.setText("Selecionar");
        buSelecionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buSelecionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(314, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buSelecionar)
                    .addComponent(buExcluir)
                    .addComponent(buAlterar)
                    .addComponent(buIncluir))
                .addGap(31, 31, 31))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(182, Short.MAX_VALUE)))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {buAlterar, buExcluir, buIncluir, buSelecionar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(buIncluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buAlterar)
                .addGap(18, 18, 18)
                .addComponent(buExcluir)
                .addGap(18, 18, 18)
                .addComponent(buSelecionar)
                .addContainerGap(204, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(44, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(171, Short.MAX_VALUE)))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {buAlterar, buExcluir, buIncluir, buSelecionar});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buIncluirActionPerformed

{
Pessoa pessoa = new Pessoa();
pessoa.atualizarNome("Nome");
pessoa.atualizarTelefone("telefone");
pessoa.atualizarEmail("Email");
pessoa.atualizarLogradouro("Logradouro");
pessoa.atualizarNumero("numero");
pessoa.atualizarComplemento("Complemento");
pessoa.atualizarBairro("Bairro");
pessoa.atualizarCidade("Cidade");
pessoa.atualizarEstado("Estado");
pessoa.atualizarCep("Cep");
modeloPessoa.incluirPessoa(pessoa);
}        // TODO add your handling code here:
    }//GEN-LAST:event_buIncluirActionPerformed

    private void buAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buAlterarActionPerformed
        // TODO add your handling code here:
        
int indice = tabPessoa.getSelectedRow();
if (indice >= 0){
Pessoa pessoa = modeloPessoa.obterPessoa(indice);
pessoa.atualizarNome("Fulano");
modeloPessoa.atualizarPessoa(indice, pessoa); //pg 128 add outros obj
}
}
    }//GEN-LAST:event_buAlterarActionPerformed

    private void buExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buExcluirActionPerformed
        // TODO add your handling code here:

int indice = tabPessoa.getSelectedRow();
if (indice >= 0){
modeloPessoa.excluirPessoa(indice);

} //pgn 129
    }//GEN-LAST:event_buExcluirActionPerformed

    private void buSelecionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buSelecionarActionPerformed
        // TODO add your handling code here:
int indice = tabPessoa.getSelectedRow();
if (indice >= 0){
Pessoa pessoa = modeloPessoa.obterPessoa(indice);
JOptionPane.showMessageDialog(this,pessoa.obterNome()+" "+
pessoa.obterTelefone());

} // modificar pg 130
    }//GEN-LAST:event_buSelecionarActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JanelaCadastro dialog = new JanelaCadastro(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buAlterar;
    private javax.swing.JButton buExcluir;
    private javax.swing.JButton buIncluir;
    private javax.swing.JButton buSelecionar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
