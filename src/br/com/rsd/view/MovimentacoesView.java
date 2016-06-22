package br.com.rsd.view;

import br.com.rsd.persistencia.ConexaoPersistencia;
import br.com.rsd.controller.ReceitaController;
import br.com.rsd.controller.TransferenciaController;
import br.com.rsd.controller.DespesaController;
import br.com.rsd.model.ReceitaModel;
import br.com.rsd.model.TransferenciaModel;
import br.com.rsd.model.DespesaModel;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import java.util.*;
import java.text.*;

public class MovimentacoesView extends javax.swing.JFrame
{
    public MovimentacoesView()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jPanel1 = new javax.swing.JPanel();
        cDescricao = new javax.swing.JTextField();
        cLocal = new javax.swing.JTextField();
        jLocal = new javax.swing.JLabel();
        jData = new javax.swing.JLabel();
        jValor = new javax.swing.JLabel();
        jContaOrigem = new javax.swing.JLabel();
        jContaDestino = new javax.swing.JLabel();
        jTipo = new javax.swing.JLabel();
        jDescricao = new javax.swing.JLabel();
        cTipo = new javax.swing.JComboBox();
        btSalvar = new javax.swing.JButton();
        btSair = new javax.swing.JButton();
        cContaOrigem = new javax.swing.JComboBox<>();
        cContaDestino = new javax.swing.JComboBox<>();
        cData = new com.toedter.calendar.JDateChooser();
        cValor = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        cDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cDescricaoActionPerformed(evt);
            }
        });

        jLocal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLocal.setText("Local");

        jData.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jData.setText("Data");

        jValor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jValor.setText("Valor");

        jContaOrigem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jContaOrigem.setText("Conta de origem");

        jContaDestino.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jContaDestino.setText("Conta de destino");

        jTipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTipo.setText("Tipo");

        jDescricao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jDescricao.setText("Descrição");

        cTipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Receita", "Despesa", "Transferência" }));
        cTipo.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cTipoPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        btSalvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btSair.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        cContaOrigem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cContaDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cData.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cDataFocusLost(evt);
            }
        });
        cData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cDataMouseClicked(evt);
            }
        });

        cValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        cValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cValorActionPerformed(evt);
            }
        });
        cValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cValorKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDescricao)
                    .addComponent(jLocal)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTipo))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jValor)
                            .addComponent(cValor, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cData, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jData)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jContaOrigem)
                                .addComponent(cContaOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cContaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jContaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(cLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(36, 36, 36)
                            .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(cDescricao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jData)
                    .addComponent(jValor)
                    .addComponent(jTipo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cData, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(cValor))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jContaOrigem)
                    .addComponent(jContaDestino))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cContaOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cContaDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLocal)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cLocal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/rsd/image/money-bag.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 0, 24)); // NOI18N
        jLabel1.setText("Movimetações");
        jLabel1.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cDescricaoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cDescricaoActionPerformed
    {//GEN-HEADEREND:event_cDescricaoActionPerformed
       
    }//GEN-LAST:event_cDescricaoActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        String vCodConta[] = cContaOrigem.getSelectedItem().toString().split("-");
        String vCodCatConta[] = cContaOrigem.getSelectedItem().toString().split("-");
        
        try {
            
            try {  
               int i = Integer.parseInt(cValor.getText());  
            
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor incorreto!", "ERRO", JOptionPane.ERROR_MESSAGE);
                return;
            } 
          
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            format.setLenient(false);
            try {
                // se passou pra cá, é porque a data é válida
                Date data = format.parse(cData.getDate().toString());              
            } catch(ParseException e) {
                // se cair aqui, a data é inválida
                JOptionPane.showMessageDialog(null, "Data incorreta!", "ERRO", JOptionPane.ERROR_MESSAGE);
                return;
            }


            switch (this.cTipo.getSelectedIndex())
            { 
                case 0:
                    ReceitaModel receita = new ReceitaModel(Integer.parseInt(vCodConta[0]), cDescricao.getText(), cTipo.getSelectedIndex(),Float.parseFloat(cValor.getText()), formato.parse(cData.getDateFormatString()), cLocal.getText(), Integer.parseInt(vCodCatConta[0]));
                    if (ReceitaController.inserir(receita)== true) {
                        JOptionPane.showMessageDialog(this, "Receita gravada com sucesso");
                        dispose();
                    }break;
                case 1:
                    DespesaModel despesa = new DespesaModel(Integer.parseInt(vCodConta[0]), cDescricao.getText(), cTipo.getSelectedIndex(),Float.parseFloat(cValor.getText()), formato.parse(cData.getDateFormatString()), cLocal.getText(), Integer.parseInt(vCodCatConta[0]));
                    if (DespesaController.inserir(despesa)== true) {
                        JOptionPane.showMessageDialog(this, "Despesa gravada com sucesso");
                        dispose();
                    }break;
                case 2:
                    TransferenciaModel transferencia = new TransferenciaModel(Integer.parseInt(vCodConta[0]), cDescricao.getText(), cTipo.getSelectedIndex(),Float.parseFloat(cValor.getText()), formato.parse(cData.getDateFormatString()), cLocal.getText(), Integer.parseInt(vCodCatConta[0]));
                    if (TransferenciaController.inserir(transferencia)== true) {
                        JOptionPane.showMessageDialog(this, "Transferência gravada com sucesso");
                        dispose();
                    }
            } 
        }   
        catch (ParseException ex) {
              Logger.getLogger(MovimentacoesView.class.getName()).log(Level.SEVERE, null, ex);
          }
        catch (Exception ex) {
              Logger.getLogger(MovimentacoesView.class.getName()).log(Level.SEVERE, null, ex);
          }      
        
        
    }//GEN-LAST:event_btSalvarActionPerformed

    public void preencheCampo(Integer tipo){
    cContaDestino.removeAllItems();
        if (tipo == 0)
        { 
           jContaDestino.setName("Conta de Destino");     
       try {
        Connection con2;
        con2 = DriverManager.getConnection("jdbc:mysql://localhost/rsd", "root", "");
        
           PreparedStatement stmt2 = con2.prepareStatement("select * from Conta");
            // executa um select
            ResultSet rs2 = stmt2.executeQuery();
            // itera no ResultSet
            while (rs2.next()) {
             cContaDestino.addItem(rs2.getString("CodConta") + "-" +rs2.getString("DescConta"));
            }
        stmt2.close();
    con2.close();
   }   catch (SQLException ex) {
           Logger.getLogger(MovimentacoesView.class.getName()).log(Level.SEVERE, null, ex);
     } 
           
        } 
           else{
          try {
        Connection con;
        con = DriverManager.getConnection("jdbc:mysql://localhost/rsd", "root", "");
        
        jContaDestino.setName("Categoría");

        PreparedStatement stmt = con.prepareStatement("select * from Categoria");

            // executa um select
        ResultSet rs = stmt.executeQuery();

            // itera no ResultSet
        while (rs.next()) {
          cContaDestino.addItem(rs.getString("CodCategoria") + "-" +rs.getString("DescCategoria"));
        }
        stmt.close();
        con.close();
   }   catch (SQLException ex) {
           Logger.getLogger(MovimentacoesView.class.getName()).log(Level.SEVERE, null, ex);
     }  
           
        }  
    }
    
    
    private void cTipoPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cTipoPopupMenuWillBecomeInvisible
        preencheCampo(this.cTipo.getSelectedIndex());
        
        
    }//GEN-LAST:event_cTipoPopupMenuWillBecomeInvisible

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void cDataFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_cDataFocusLost
    {//GEN-HEADEREND:event_cDataFocusLost
        try{
            Calendar data = Calendar.getInstance();
            SimpleDateFormat formato = new 
            SimpleDateFormat("dd/MM/yyyy");
            formato.setLenient(false);
            data.setTime(formato.parse(cData.toString()));
            System.out.println(formato.format(data.getTime()));
        } 
            catch(ParseException e){
                System.out.println("Data Inválida.");
            }
    }//GEN-LAST:event_cDataFocusLost

    private void cDataMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_cDataMouseClicked
    {//GEN-HEADEREND:event_cDataMouseClicked

    }//GEN-LAST:event_cDataMouseClicked

    private void cValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cValorActionPerformed

    private void cValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cValorKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_cValorKeyTyped

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        preencheCampo(2);
    }//GEN-LAST:event_formComponentShown
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSair;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox<String> cContaDestino;
    private javax.swing.JComboBox<String> cContaOrigem;
    private com.toedter.calendar.JDateChooser cData;
    private javax.swing.JTextField cDescricao;
    private javax.swing.JTextField cLocal;
    private javax.swing.JComboBox cTipo;
    private javax.swing.JFormattedTextField cValor;
    private javax.swing.JLabel jContaDestino;
    private javax.swing.JLabel jContaOrigem;
    private javax.swing.JLabel jData;
    private javax.swing.JLabel jDescricao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLocal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jTipo;
    private javax.swing.JLabel jValor;
    // End of variables declaration//GEN-END:variables
}
