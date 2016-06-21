package br.com.rsd.view;

import br.com.rsd.controller.CategoriaController;
import br.com.rsd.model.CategoriaModel;
import br.com.rsd.persistencia.ConexaoPersistencia;
import com.mysql.jdbc.Statement;
import static com.sun.org.apache.xerces.internal.dom.DOMNormalizer.abort;
import static com.sun.xml.internal.ws.streaming.XMLStreamReaderUtil.close;
import static java.lang.String.valueOf;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.lang.String;
import static java.lang.System.exit;

public class CategoriaView extends javax.swing.JFrame
{
    String codigoCat;
    
    public CategoriaView()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Descricao = new javax.swing.JLabel();
        cDescricao = new javax.swing.JTextField();
        Tipo = new javax.swing.JLabel();
        cEscolhaTipo = new javax.swing.JComboBox();
        Cor = new javax.swing.JLabel();
        cCor = new javax.swing.JComboBox();
        cCategoriaAtiva = new javax.swing.JCheckBox();
        Salvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tCategoria = new javax.swing.JTable();
        Excluir = new javax.swing.JButton();
        Alterar = new javax.swing.JButton();
        Sair = new javax.swing.JButton();
        estado = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Categoria = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        Descricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Descricao.setText("Descrição");

        cDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cDescricaoActionPerformed(evt);
            }
        });

        Tipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Tipo.setText("Tipo");

        cEscolhaTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Receita", "Despesa" }));
        cEscolhaTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cEscolhaTipoActionPerformed(evt);
            }
        });

        Cor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Cor.setText("Cor");

        cCor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cCorActionPerformed(evt);
            }
        });

        cCategoriaAtiva.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cCategoriaAtiva.setText("Ativa");
        cCategoriaAtiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cCategoriaAtivaActionPerformed(evt);
            }
        });

        Salvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Salvar.setText("Salvar");
        Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarActionPerformed(evt);
            }
        });

        tCategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Tipo", "Cor", "Ativa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tCategoria);

        Excluir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Excluir.setText("Excluir");
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });

        Alterar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Alterar.setText("Alterar");
        Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarActionPerformed(evt);
            }
        });

        Sair.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });

        estado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        estado.setText("Inserir");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(Descricao))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Alterar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Excluir))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cDescricao, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Tipo)
                                    .addComponent(cEscolhaTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Cor)
                                    .addComponent(cCor, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(66, 66, 66)
                                .addComponent(cCategoriaAtiva))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(estado)
                            .addComponent(Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(estado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Descricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Tipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cEscolhaTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cCategoriaAtiva, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Cor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cCor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Alterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Excluir))
                        .addGap(43, 43, 43))
                    .addComponent(Sair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/rsd/image/tag.png"))); // NOI18N

        Categoria.setFont(new java.awt.Font("Palatino Linotype", 0, 24)); // NOI18N
        Categoria.setText("Categoria");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Categoria)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Categoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalvarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_SalvarActionPerformed
    {//GEN-HEADEREND:event_SalvarActionPerformed
       try {
            CategoriaModel categoria = new CategoriaModel( 
                    cDescricao.getText(),
                    cEscolhaTipo.getSelectedIndex(),
                    cCor.getSelectedIndex(),
                    cCategoriaAtiva.isSelected());
            if (estado.getText() == "Inserir"){
            if (CategoriaController.inserir(categoria) == true) {
                JOptionPane.showMessageDialog(this, "Categoria salva com sucesso");
            }           
            }else{
            if (CategoriaController.alterar(categoria, codigoCat) == true) {
                JOptionPane.showMessageDialog(this, "Categoria alterada com sucesso");
            }}
          preencheGrid();   
        } catch (Exception ex) {
            Logger.getLogger(CategoriaView.class.getName()).log(Level.SEVERE, null, ex);
        }
       estado.setText("Inserir");     
    }//GEN-LAST:event_SalvarActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_SairActionPerformed
    {//GEN-HEADEREND:event_SairActionPerformed
        dispose();
    }//GEN-LAST:event_SairActionPerformed

    private void cEscolhaTipoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cEscolhaTipoActionPerformed
    {//GEN-HEADEREND:event_cEscolhaTipoActionPerformed

    }//GEN-LAST:event_cEscolhaTipoActionPerformed

    private void cCorActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cCorActionPerformed
    {//GEN-HEADEREND:event_cCorActionPerformed

    }//GEN-LAST:event_cCorActionPerformed

    private void cCategoriaAtivaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cCategoriaAtivaActionPerformed
    {//GEN-HEADEREND:event_cCategoriaAtivaActionPerformed

    }//GEN-LAST:event_cCategoriaAtivaActionPerformed

    private void AlterarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_AlterarActionPerformed
    {//GEN-HEADEREND:event_AlterarActionPerformed
       
       estado.setText("Alterar");   
       codigoCat = tCategoria.getValueAt(tCategoria.getSelectedRow(), 0).toString();
        try {
        Connection con2;
        con2 = DriverManager.getConnection("jdbc:mysql://localhost/rsd", "root", "");
        
        PreparedStatement stmt2 = con2.prepareStatement(
        "  SELECT * WHERE c.CodCategoria = " + codigoCat);
            // executa um select
            ResultSet rs2 = stmt2.executeQuery();
            // itera no ResultSet
        rs2.next();
        cDescricao.setText(rs2.getString("DescCategoria"));
        cEscolhaTipo.setSelectedIndex(rs2.getInt("TipoCategoria"));
        cCor.setSelectedIndex(rs2.getInt("Cor"));
        cCategoriaAtiva.setSelected(rs2.getBoolean("CategoriaAtiva"));
         
        stmt2.close();
    con2.close();
   }   catch (SQLException ex) {
           Logger.getLogger(MovimentacoesView.class.getName()).log(Level.SEVERE, null, ex);
     } 
      
    }//GEN-LAST:event_AlterarActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_ExcluirActionPerformed
    {//GEN-HEADEREND:event_ExcluirActionPerformed
        if (tCategoria.getSelectedRowCount() == 0){
            JOptionPane.showMessageDialog(this, "Favor selecionar um Registro");
        }else     
        try {
            if (CategoriaController.excluir(tCategoria.getValueAt(tCategoria.getX(), 0).toString()) == true) {
                JOptionPane.showMessageDialog(this, "Categoria excluida com sucesso");
            }
           
            preencheGrid();  
        } catch (Exception ex) {
            Logger.getLogger(CategoriaView.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }//GEN-LAST:event_ExcluirActionPerformed

    private void cDescricaoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cDescricaoActionPerformed
    {//GEN-HEADEREND:event_cDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cDescricaoActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        preencheGrid();
    }//GEN-LAST:event_formComponentShown

private void preencheGrid()                                          
    {                                              
       try {
        Connection con2;
        con2 = DriverManager.getConnection("jdbc:mysql://localhost/rsd", "root", "");
        DefaultTableModel modelo = (DefaultTableModel) tCategoria.getModel();
        
        PreparedStatement stmt2 = con2.prepareStatement(
        "  SELECT c.CodCategoria,\n" +
        "  c.DescCategoria,\n" +
        "  CASE c.TipoCategoria \n" +
        "  WHEN 0 THEN 'Receita'\n" +
        "  ELSE 'Despesa' \n" +
        "  END Tipo,\n" +
        "  c.Cor ,\n" + 
        "  c.CategoriaAtiva FROM Categoria c ");
            // executa um select
            ResultSet rs2 = stmt2.executeQuery();
            // itera no ResultSet
             while (modelo.getRowCount() > 0)
              modelo.removeRow(0);
       
             while (rs2.next()) {
             modelo.addRow(new Object[]{
             rs2.getInt("CodCategoria"),
             rs2.getString("DescCategoria"),
             rs2.getString("Tipo"),
             rs2.getInt("Cor"),
             rs2.getBoolean("CategoriaAtiva")              
             });
            }

        stmt2.close();
    con2.close();
   }   catch (SQLException ex) {
           Logger.getLogger(MovimentacoesView.class.getName()).log(Level.SEVERE, null, ex);
     } 
          
    }  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alterar;
    private javax.swing.JLabel Categoria;
    private javax.swing.JLabel Cor;
    private javax.swing.JLabel Descricao;
    private javax.swing.JButton Excluir;
    private javax.swing.JButton Sair;
    private javax.swing.JButton Salvar;
    private javax.swing.JLabel Tipo;
    private javax.swing.JCheckBox cCategoriaAtiva;
    private javax.swing.JComboBox cCor;
    private javax.swing.JTextField cDescricao;
    private javax.swing.JComboBox cEscolhaTipo;
    private javax.swing.JLabel estado;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tCategoria;
    // End of variables declaration//GEN-END:variables
}