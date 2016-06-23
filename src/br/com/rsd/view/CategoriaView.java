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
    int vUsuCodigo;
    public CategoriaView(int vUsuCodigo)
    {
        this.vUsuCodigo = vUsuCodigo;
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
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

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
                "Código", "Descrição", "Tipo", "Ativa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 425, Short.MAX_VALUE)
                        .addComponent(estado))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cDescricao)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Tipo)
                                .addGap(71, 71, 71))
                            .addComponent(cEscolhaTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(cCategoriaAtiva)))
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(Descricao))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Alterar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Excluir))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(352, 352, 352)
                                .addComponent(Salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(estado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Descricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Tipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cEscolhaTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cCategoriaAtiva, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
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
                .addGap(18, 18, 18))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/rsd/image/tag.png"))); // NOI18N

        Categoria.setFont(new java.awt.Font("Palatino Linotype", 0, 24)); // NOI18N
        Categoria.setText("Categoria");

        jMenu1.setText("Arquivo");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Registro");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Relatório");

        jMenuItem1.setText("Relação");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

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
     try{
        try {
            CategoriaModel categoria = new CategoriaModel(
                    vUsuCodigo,
                    cDescricao.getText(),
                    cEscolhaTipo.getSelectedIndex(),
                    cCategoriaAtiva.isSelected());
            if (estado.getText() == "Inserir"){
            if (CategoriaController.inserir(categoria, vUsuCodigo) == true) {
                JOptionPane.showMessageDialog(this, "Categoria salva com sucesso");
            }           
            }else{
            if (CategoriaController.alterar(categoria, codigoCat, vUsuCodigo) == true) {
                JOptionPane.showMessageDialog(this, "Categoria alterada com sucesso");
            }}
          preencheGrid();   
        } catch (Exception ex) {
            Logger.getLogger(CategoriaView.class.getName()).log(Level.SEVERE, null, ex);
        }
     }finally{
         limpa();
     }  
       
    }//GEN-LAST:event_SalvarActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_SairActionPerformed
    {//GEN-HEADEREND:event_SairActionPerformed
        dispose();
    }//GEN-LAST:event_SairActionPerformed

    private void cEscolhaTipoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cEscolhaTipoActionPerformed
    {//GEN-HEADEREND:event_cEscolhaTipoActionPerformed

    }//GEN-LAST:event_cEscolhaTipoActionPerformed

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
        "  SELECT * FROM Categoria c WHERE c.CodCategoria = " + codigoCat + " and c.usuCodigo = " + vUsuCodigo);
            // executa um select
            ResultSet rs2 = stmt2.executeQuery();
            // itera no ResultSet
        rs2.next();
        cDescricao.setText(rs2.getString("DescCategoria"));
        cEscolhaTipo.setSelectedIndex(rs2.getInt("TipoCategoria"));
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
            if (CategoriaController.excluir(tCategoria.getValueAt(tCategoria.getSelectedRow(), 0).toString(), vUsuCodigo) == true) {
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
        limpa();
        preencheGrid();
    }//GEN-LAST:event_formComponentShown

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
            if (CategoriaController.relatorio(vUsuCodigo) == true) {
            }
        } catch (Exception ex) {
            Logger.getLogger(CategoriaView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
        "  c.CategoriaAtiva FROM Categoria c where c.usuCodigo = " + vUsuCodigo);
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

    public void limpa(){
      cCategoriaAtiva.setSelected(true);
      cDescricao.setText("");        
      cEscolhaTipo.setSelectedIndex(0);
      estado.setText("Inserir");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alterar;
    private javax.swing.JLabel Categoria;
    private javax.swing.JLabel Descricao;
    private javax.swing.JButton Excluir;
    private javax.swing.JButton Sair;
    private javax.swing.JButton Salvar;
    private javax.swing.JLabel Tipo;
    private javax.swing.JCheckBox cCategoriaAtiva;
    private javax.swing.JTextField cDescricao;
    private javax.swing.JComboBox cEscolhaTipo;
    private javax.swing.JLabel estado;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tCategoria;
    // End of variables declaration//GEN-END:variables
}
