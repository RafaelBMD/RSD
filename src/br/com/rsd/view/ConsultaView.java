package br.com.rsd.view;

import br.com.rsd.controller.DespesaController;
import br.com.rsd.controller.ReceitaController;
import br.com.rsd.controller.TransferenciaController;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsultaView extends javax.swing.JFrame
{
    public ConsultaView()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Consulta = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tCategoria = new javax.swing.JTable();
        btSair = new javax.swing.JButton();
        btIncluir = new javax.swing.JComboBox();
        btAlterar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter()
        {
            public void componentShown(java.awt.event.ComponentEvent evt)
            {
                jPanel1ComponentShown(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/rsd/image/notebook.png"))); // NOI18N

        Consulta.setFont(new java.awt.Font("Palatino Linotype", 0, 24)); // NOI18N
        Consulta.setText("Movimentações");

        tCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][]
            {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String []
            {
                "Código", "Descrição", "Conta origem", "Conta destino", "Categoria", "Tipo", "Valor", "Data", "Local"
            }
        )
        {
            Class[] types = new Class []
            {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex)
            {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tCategoria);

        btSair.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btSairActionPerformed(evt);
            }
        });

        btIncluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btIncluir.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Incluir", "Receita", "Despesa", "Transferência" }));
        btIncluir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btIncluirActionPerformed(evt);
            }
        });

        btAlterar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btAlterar.setText("Alterar");
        btAlterar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btAlterarActionPerformed(evt);
            }
        });

        btExcluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Consulta)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(Consulta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
       dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btIncluirActionPerformed
       switch (this.btIncluir.getSelectedIndex())
        { 
            case 1:
                MovimentacoesView receita = new MovimentacoesView();
                receita.setVisible(true);
                break;
            case 2:
                MovimentacoesView despesa = new MovimentacoesView();
                despesa.setVisible(true);
                break;
            case 3:
                MovimentacoesView transferencia = new MovimentacoesView();
                transferencia.setVisible(true);
                break;    
        }
    }//GEN-LAST:event_btIncluirActionPerformed

    private void btAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarActionPerformed
        preencheGrid();
    }//GEN-LAST:event_btAlterarActionPerformed

    private void jPanel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentShown
        preencheGrid();       
    }//GEN-LAST:event_jPanel1ComponentShown

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btExcluirActionPerformed
    {//GEN-HEADEREND:event_btExcluirActionPerformed
        if (tCategoria.getSelectedRowCount() == 0){
            JOptionPane.showMessageDialog(this, "Favor selecionar um Registro");
        }else     
        try {
            
        switch (tCategoria.getValueAt(tCategoria.getX(), 5).toString())
        { 
            case "Receita":
                if (ReceitaController.excluir(tCategoria.getValueAt(tCategoria.getX(), 0).toString()) == true) {
                    JOptionPane.showMessageDialog(this, "Receita excluida com sucesso");
                }
                break;
            case "Despesa":
                if (DespesaController.excluir(tCategoria.getValueAt(tCategoria.getX(), 0).toString()) == true) {
                    JOptionPane.showMessageDialog(this, "Despesa excluida com sucesso");
                }
                break;
            case "Transferência":
                if (TransferenciaController.excluir(tCategoria.getValueAt(tCategoria.getX(), 0).toString()) == true) {
                    JOptionPane.showMessageDialog(this, "Transferência excluida com sucesso");
                }
                break;
        }
           
            preencheGrid();  
        } catch (Exception ex) {
            Logger.getLogger(CategoriaView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btExcluirActionPerformed

 private void preencheGrid()                                          
    {                                              
       try {
        Connection con2;
        con2 = DriverManager.getConnection("jdbc:mysql://localhost/rsd", "root", "");
        DefaultTableModel modelo = (DefaultTableModel) tCategoria.getModel();
        
        PreparedStatement stmt2 = con2.prepareStatement(
        "   SELECT m.CodMovimentacao,m.DescMovimentacao, \n" +
        "     (SELECT c.DescConta from Conta c where c.CodConta = m.CodConta) ContaOrigem,\n" +
        "	 (SELECT cTransf.DescConta FROM Conta cTransf WHERE t.CodContaDestino = cTransf.CodConta) ContaDestino,\n" +
        "	 COALESCE((SELECT cRec.DescCategoria FROM Categoria cRec WHERE cRec.CodCategoria = r.CodCategoria),\n" +
        "	 (SELECT cDesp.DescCategoria FROM Categoria cDesp WHERE cDesp.CodCategoria = d.CodCategoria)) Categoria,\n" +
        "     CASE m.TipoMovimentacao \n" +
        "     WHEN 0 THEN 'Receita'\n" +
        "     WHEN 1 THEN 'Despesa'\n" +
        "     ELSE 'Tranferência' \n" +
        "     END Tipo,              \n" +
        "     m.Valor, m.DataMovimentacao , m.Localizacao \n" +
        "     FROM movimentacao m\n" +
        "	 LEFT JOIN Despesa d on d.codMovimentacao = m.Codmovimentacao\n" +
        "	 LEFT JOIN Receita r on r.codMovimentacao = m.Codmovimentacao\n" +
        "	 LEFT JOIN Transferencia t on t.codMovimentacao = m.Codmovimentacao");
            // executa um select
            ResultSet rs2 = stmt2.executeQuery();
            // itera no ResultSet
             while (modelo.getRowCount() > 0)
              modelo.removeRow(0);
            while (rs2.next()) {
             modelo.addRow(new Object[]{
             rs2.getInt("CodMovimentacao"),
             rs2.getString("DescMovimentacao"),
             rs2.getString("ContaDestino"),
             rs2.getString("Categoria"),
             rs2.getString("Tipo"),
             rs2.getFloat("Valor"),
             rs2.getString("DataMovimentacao"),
             rs2.getString("Localizacao")              
             });
            }

        stmt2.close();
    con2.close();
   }   catch (SQLException ex) {
           Logger.getLogger(MovimentacoesView.class.getName()).log(Level.SEVERE, null, ex);
     } 
          
    } 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Consulta;
    private javax.swing.JButton btAlterar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JComboBox btIncluir;
    private javax.swing.JButton btSair;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tCategoria;
    // End of variables declaration//GEN-END:variables
}
