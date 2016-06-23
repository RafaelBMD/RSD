package br.com.rsd.view;

public class PrincipalView extends javax.swing.JFrame
{
    int vUsuCodigo;
    
    public PrincipalView(int vUsuCodigo)
    {
        this.vUsuCodigo = vUsuCodigo;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Cadastros = new javax.swing.JComboBox();
        Movimentacoes = new javax.swing.JComboBox();
        CampoValorTotal = new javax.swing.JTextField();
        ValorTotal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Principal = new javax.swing.JLabel();
        btRelatorio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Cadastros.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Cadastros.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cadastros", "Conta", "Categoria" }));
        Cadastros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrosActionPerformed(evt);
            }
        });

        Movimentacoes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Movimentacoes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Movimentações", "Receita", "Despesa", "Transferência", "Consulta" }));
        Movimentacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MovimentacoesActionPerformed(evt);
            }
        });

        CampoValorTotal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        ValorTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ValorTotal.setText("Valor Total");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/rsd/image/coins.png"))); // NOI18N

        Principal.setFont(new java.awt.Font("Palatino Linotype", 0, 24)); // NOI18N
        Principal.setText("Principal");

        btRelatorio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btRelatorio.setText("Relatório");
        btRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRelatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Principal)
                                .addGap(0, 243, Short.MAX_VALUE))
                            .addComponent(jSeparator1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Cadastros, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(Movimentacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(CampoValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(ValorTotal)
                        .addGap(190, 190, 190))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(17, Short.MAX_VALUE)
                        .addComponent(Principal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(ValorTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Movimentacoes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Cadastros, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(103, Short.MAX_VALUE))
        );

        btRelatorio.getAccessibleContext().setAccessibleName("btRelatorio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CadastrosActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_CadastrosActionPerformed
    {//GEN-HEADEREND:event_CadastrosActionPerformed
        try{
        switch (this.Cadastros.getSelectedIndex())
        { 
            case 1:
                ContaView conta = new ContaView(vUsuCodigo);
                conta.setVisible(true);
                break;
            case 2:
                CategoriaView categoria = new CategoriaView(vUsuCodigo);
                categoria.setVisible(true);
                break;
        }
        }finally{
           Cadastros.setSelectedIndex(0);
        }
        
    }//GEN-LAST:event_CadastrosActionPerformed

    private void MovimentacoesActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_MovimentacoesActionPerformed
    {//GEN-HEADEREND:event_MovimentacoesActionPerformed
        try{
        switch (this.Movimentacoes.getSelectedIndex())
        { 
            case 1:
                MovimentacoesView receita = new MovimentacoesView(vUsuCodigo);
                receita.preencheCampo(0);
                receita.selecionaTipo(0);
                receita.setVisible(true);              
                break;
            case 2:
                MovimentacoesView despesa = new MovimentacoesView(vUsuCodigo);                
                despesa.preencheCampo(1);
                despesa.selecionaTipo(1);
                despesa.setVisible(true);
                break;
            case 3:
                MovimentacoesView transferencia = new MovimentacoesView(vUsuCodigo);
                transferencia.preencheCampo(2);
                transferencia.selecionaTipo(2);
                transferencia.setVisible(true);
                break;
            case 4:
                
                ConsultaView consulta = new ConsultaView(vUsuCodigo);
                consulta.setVisible(true);
                break;    
        }
        }finally{
           Movimentacoes.setSelectedIndex(0);
        }
    }//GEN-LAST:event_MovimentacoesActionPerformed

    private void btRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRelatorioActionPerformed
        RelatorioView relatorio = new RelatorioView();       
        relatorio.setVisible(true);
    }//GEN-LAST:event_btRelatorioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Cadastros;
    private javax.swing.JTextField CampoValorTotal;
    private javax.swing.JComboBox Movimentacoes;
    private javax.swing.JLabel Principal;
    private javax.swing.JLabel ValorTotal;
    private javax.swing.JButton btRelatorio;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
