/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rsd.view;

import br.com.rsd.controller.RelatorioController;
import br.com.rsd.controller.CategoriaController;
import br.com.rsd.dao.ReceitaDao;
import br.com.rsd.controller.DespesaController;
import br.com.rsd.controller.ReceitaController;
import br.com.rsd.model.DespesaModel;
import br.com.rsd.model.ReceitaModel;
import br.com.rsd.model.TransferenciaModel;
import br.com.rsd.persistencia.ConexaoPersistencia;
import com.mysql.jdbc.Statement;
import static groovy.ui.text.FindReplaceUtility.dispose;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author rafae
 */
public class RelatorioView2 extends javax.swing.JPanel {

    /**
     * Creates new form RelatorioView
     */
    public RelatorioView2() {
        System.out.println("asd");
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jData = new javax.swing.JLabel();
        jData1 = new javax.swing.JLabel();
        cTipo = new javax.swing.JComboBox();
        jTipo = new javax.swing.JLabel();
        cContaOrigem = new javax.swing.JComboBox<>();
        jContaOrigem = new javax.swing.JLabel();
        cContaDestino = new javax.swing.JComboBox<>();
        jContaDestino = new javax.swing.JLabel();
        cDescricao = new javax.swing.JTextField();
        jDescricao = new javax.swing.JLabel();
        cLocal = new javax.swing.JTextField();
        jLocal = new javax.swing.JLabel();
        btImprimir = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        cRelatorio = new javax.swing.JComboBox<>();
        jContaOrigem1 = new javax.swing.JLabel();
        cDataI = new com.toedter.calendar.JDateChooser();
        cDataF = new com.toedter.calendar.JDateChooser();
        cCategoria = new javax.swing.JComboBox<>();
        jContaDestino1 = new javax.swing.JLabel();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/rsd/image/money-bag.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 0, 24)); // NOI18N
        jLabel1.setText("Relatório");
        jLabel1.setOpaque(true);

        jData.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jData.setText("Data Início");

        jData1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jData1.setText("Data Fim");

        cTipo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todos", "Receita", "Despesa", "Transferência" }));
        cTipo.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cTipoPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jTipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTipo.setText("Tipo");

        cContaOrigem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jContaOrigem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jContaOrigem.setText("Conta de origem");

        cContaDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jContaDestino.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jContaDestino.setText("Conta de destino");

        cDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cDescricaoActionPerformed(evt);
            }
        });

        jDescricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jDescricao.setText("Descrição");

        jLocal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLocal.setText("Local");

        btImprimir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btImprimir.setText("Imprimir");
        btImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btImprimirActionPerformed(evt);
            }
        });

        btSair.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        cRelatorio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escrito", "Coluna", "Pizza" }));

        jContaOrigem1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jContaOrigem1.setText("Relatório");

        cDataI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cDataIFocusLost(evt);
            }
        });
        cDataI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cDataIMouseClicked(evt);
            }
        });

        cDataF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cDataFFocusLost(evt);
            }
        });
        cDataF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cDataFMouseClicked(evt);
            }
        });

        cCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jContaDestino1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jContaDestino1.setText("Categoria");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cDescricao)
                                    .addComponent(jContaOrigem)
                                    .addComponent(cContaOrigem, 0, 148, Short.MAX_VALUE)
                                    .addComponent(jDescricao))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLocal, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jContaDestino, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cLocal, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(cContaDestino, 0, 148, Short.MAX_VALUE)
                                        .addGap(4, 4, 4))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jData)
                                    .addComponent(cDataI, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jData1)
                                    .addComponent(cDataF, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTipo)
                            .addComponent(cTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cRelatorio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jContaOrigem1)
                                        .addComponent(jContaDestino1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jData1)
                        .addGap(4, 4, 4)
                        .addComponent(cDataF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jData)
                        .addGap(4, 4, 4)
                        .addComponent(cDataI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jContaOrigem)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cContaOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jContaDestino)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cContaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jContaDestino1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jDescricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLocal)
                        .addGap(3, 3, 3)
                        .addComponent(cLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jContaOrigem1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cDescricaoActionPerformed

    private void cTipoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cTipoPopupMenuWillBecomeInvisible
        
    }//GEN-LAST:event_cTipoPopupMenuWillBecomeInvisible

    private void btImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btImprimirActionPerformed
        String filtro = "";
        String[] codigo;
        
        if(cDataI.getDate().before(cDataF.getDate())){
         JOptionPane.showMessageDialog(null, "Data Início deve ser Menor ou Igual que a Data Fim!", "ERRO", JOptionPane.ERROR_MESSAGE);
                return;        
        }
        
        try {
           if(!cDataI.equals(null)){
               filtro = filtro + " AND m.dataMovimentacao >= " + cDataI.getDate();
           }
           if(!cDataF.equals(null)){
               filtro = filtro + " AND m.dataMovimentacao <= " + cDataF.getDate();
           } 
           if(cTipo.getSelectedIndex() != 1){
               codigo = cTipo.toString().split("-");
               filtro = filtro + " AND m.TipoMovimentacao = " + codigo[0].trim();
           }
           if(cContaOrigem.getSelectedIndex() != 1){
               codigo = cContaOrigem.toString().split("-");
               filtro = filtro + " AND c.codConta = " + codigo[0].trim();
           }
           if(cContaDestino.getSelectedIndex() != 1){
               codigo = cContaDestino.toString().split("-");
               filtro = filtro + " AND t.codConta = " + codigo[0].trim();
           }
           if(cCategoria.getSelectedIndex() != 1){
               codigo = cCategoria.toString().split("-");
               filtro = filtro + " AND c.codCategoria = " + codigo[0].trim();
           }
           if(cDescricao.getText().equals("")){
               filtro = filtro + " AND m.descMovimentacao = " + cDescricao.getText().trim();
           }
           if(cLocal.getText().equals("")){
               filtro = filtro + " AND m.localidade = " + cLocal.getText().trim();
           }
            
           switch (cRelatorio.getSelectedIndex())
        { 
            case 0:
                if (RelatorioController.relatorio(filtro, "") == true) {
                JOptionPane.showMessageDialog(this, "Relatório impresso com sucesso");
            }
                break;
            case 1:
                if (RelatorioController.relatorio(filtro, "") == true) {
                JOptionPane.showMessageDialog(this, "Relatório impresso com sucesso");
            }
                break;
            case 2:
                if (RelatorioController.relatorio(filtro, "") == true) {
                JOptionPane.showMessageDialog(this, "Relatório impresso com sucesso");
            }
                break;
            case 3:
                if (RelatorioController.relatorio(filtro, "") == true) {
                JOptionPane.showMessageDialog(this, "Relatório impresso com sucesso");
            }
                break;    
        }
           
           
           
            
        } catch (Exception ex) {
            Logger.getLogger(CategoriaView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btImprimirActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        dispose();
    }//GEN-LAST:event_btSairActionPerformed

    
    private void cDataIFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cDataIFocusLost
        try{
            Calendar data = Calendar.getInstance();
            SimpleDateFormat formato = new
            SimpleDateFormat("dd/MM/yyyy");
            formato.setLenient(false);
            data.setTime(formato.parse(cDataI.toString()));
            System.out.println(formato.format(data.getTime()));
        }
        catch(ParseException e){
            System.out.println("Data Inválida.");
        }
    }//GEN-LAST:event_cDataIFocusLost

        public void preencheCampo(){
        cContaDestino.removeAllItems();
        cContaOrigem.removeAllItems();
       
           jContaDestino.setName("Conta de Destino");     
       try {
        Connection con;
        Connection con2;
        con = DriverManager.getConnection("jdbc:mysql://localhost/rsd", "root", "");
        con2 = DriverManager.getConnection("jdbc:mysql://localhost/rsd", "root", "");
        
        PreparedStatement stmt = con.prepareStatement("select * from Categoria");
        PreparedStatement stmt2 = con2.prepareStatement("select * from Conta");
         // executa um select
         ResultSet rs = stmt.executeQuery();
         ResultSet rs2 = stmt2.executeQuery();      
         // itera no ResultSet
         while (rs.next()) {
           cContaDestino.addItem(rs.getString("CodCategoria") + "-" +rs.getString("DescCategoria"));
         }

         while (rs2.next()) {
          cContaDestino.addItem(rs2.getString("CodConta") + "-" +rs2.getString("DescConta"));
          cContaOrigem.addItem(rs2.getString("CodConta") + "-" +rs2.getString("DescConta"));
         }
        stmt.close();
        con.close();
        stmt2.close();
        con2.close();
   }   catch (SQLException ex) {
           Logger.getLogger(MovimentacoesView.class.getName()).log(Level.SEVERE, null, ex);
     }                  
    }
    
    private void cDataIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cDataIMouseClicked

    }//GEN-LAST:event_cDataIMouseClicked

    private void cDataFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cDataFFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_cDataFFocusLost

    private void cDataFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cDataFMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cDataFMouseClicked

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        preencheCampo();
    }//GEN-LAST:event_formComponentShown


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btImprimir;
    private javax.swing.JButton btSair;
    private javax.swing.JComboBox<String> cCategoria;
    private javax.swing.JComboBox<String> cContaDestino;
    private javax.swing.JComboBox<String> cContaOrigem;
    private com.toedter.calendar.JDateChooser cDataF;
    private com.toedter.calendar.JDateChooser cDataI;
    private javax.swing.JTextField cDescricao;
    private javax.swing.JTextField cLocal;
    private javax.swing.JComboBox<String> cRelatorio;
    private javax.swing.JComboBox cTipo;
    private javax.swing.JLabel jContaDestino;
    private javax.swing.JLabel jContaDestino1;
    private javax.swing.JLabel jContaOrigem;
    private javax.swing.JLabel jContaOrigem1;
    private javax.swing.JLabel jData;
    private javax.swing.JLabel jData1;
    private javax.swing.JLabel jDescricao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLocal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jTipo;
    // End of variables declaration//GEN-END:variables
}