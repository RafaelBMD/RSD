package br.com.rsd.view;
import br.com.rsd.controller.UsuarioController;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import java.util.*;

public class LoginView extends javax.swing.JFrame
{
    public LoginView()
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Senha = new javax.swing.JLabel();
        cUsuario = new javax.swing.JTextField();
        cSenha = new javax.swing.JPasswordField();
        btEntrar = new javax.swing.JButton();
        btCriarUsuario = new javax.swing.JButton();
        btAlterarSenha = new javax.swing.JButton();
        Usuario = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Login = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Senha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Senha.setText("Senha");

        cUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cUsuarioActionPerformed(evt);
            }
        });

        cSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btEntrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btEntrar.setText("Entrar");
        btEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarActionPerformed(evt);
            }
        });

        btCriarUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btCriarUsuario.setText("Criar um usuário");
        btCriarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCriarUsuarioActionPerformed(evt);
            }
        });

        btAlterarSenha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btAlterarSenha.setText("Esqueci minha senha");
        btAlterarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarSenhaActionPerformed(evt);
            }
        });

        Usuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Usuario.setText("Usuário");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Usuario)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btCriarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                            .addComponent(btAlterarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cSenha)
                        .addComponent(Senha, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cUsuario)))
                .addGap(0, 19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Usuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(Senha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCriarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAlterarSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        Login.setFont(new java.awt.Font("Palatino Linotype", 0, 24)); // NOI18N
        Login.setText("Login");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/rsd/image/organization.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cUsuarioActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cUsuarioActionPerformed
    {//GEN-HEADEREND:event_cUsuarioActionPerformed
        
    }//GEN-LAST:event_cUsuarioActionPerformed

    private void btEntrarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btEntrarActionPerformed
    {//GEN-HEADEREND:event_btEntrarActionPerformed
        if(cUsuario.getText().trim().equals("")){
          JOptionPane.showMessageDialog(null, "Favor Informar o Usuário!", "ERRO", JOptionPane.ERROR_MESSAGE);
                return;  
        }
        if(cSenha.getText().trim().equals("")){
          JOptionPane.showMessageDialog(null, "Favor Informar a Senha!", "ERRO", JOptionPane.ERROR_MESSAGE);
                return;  
        }
        
        try {
        Connection con2;
        con2 = DriverManager.getConnection("jdbc:mysql://localhost/rsd", "root", "");
        
        PreparedStatement stmt2 = con2.prepareStatement(
        "  SELECT * FROM Usuario u WHERE u.Usuario = '" + cUsuario.getText() +"' AND u.Senha = '"+ cSenha.getText()+"'");
            // executa um select
            ResultSet rs2 = stmt2.executeQuery();
            // itera no ResultSet
            if (rs2.next()){
                PrincipalView principal = new PrincipalView();
                principal.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Senha ou Usuário Incorreto!", "ERRO", JOptionPane.ERROR_MESSAGE);
                return;
            }
              
        stmt2.close();
    con2.close();
   }   catch (SQLException ex) {
           Logger.getLogger(MovimentacoesView.class.getName()).log(Level.SEVERE, null, ex);
     } 
    }//GEN-LAST:event_btEntrarActionPerformed

    private void btCriarUsuarioActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btCriarUsuarioActionPerformed
    {//GEN-HEADEREND:event_btCriarUsuarioActionPerformed
        CadastrarUsuarioView cadUsuario = new CadastrarUsuarioView();
        cadUsuario.setVisible(true);
    }//GEN-LAST:event_btCriarUsuarioActionPerformed

   private static Random rand = new Random();
   private static char[] letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

public static String nomeAleatorio() {
    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < 6; i++) {
        int ch = rand.nextInt (letras.length);
        sb.append (letras [ch]);
    }    
    return sb.toString();    
}
    
    private void btAlterarSenhaActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btAlterarSenhaActionPerformed
    {//GEN-HEADEREND:event_btAlterarSenhaActionPerformed
        String senhaAleatoria = nomeAleatorio();
        String  vUsuario = JOptionPane.showInputDialog(null, "Informe o seu Usuário, para alterar a senha!", "Nome do Usuário:", JOptionPane.INFORMATION_MESSAGE); 
        if (vUsuario == null) {
           return;
        
            }
        
        try {
        Connection con2;
        con2 = DriverManager.getConnection("jdbc:mysql://localhost/rsd", "root", "");
        
        
        PreparedStatement stmt2 = con2.prepareStatement(
        "  SELECT u.* FROM Usuario u WHERE u.Usuario = '" + vUsuario+"'");
            // executa um select
            ResultSet rs2 = stmt2.executeQuery();
            // itera no ResultSet
           
            
            if (rs2.next()){

                SimpleEmail email = new SimpleEmail();

                try {
                email.setDebug(true);
                email.setHostName("smtp.gmail.com");
                email.setAuthentication("rafaelbmd3@gmail.com","domingos123");
                email.setSSL(true);
                email.addTo(rs2.getString("email")); //pode ser qualquer um email
                email.setFrom("rafaelbmd3@gmail.com"); //aqui necessita ser o email que voce fara a autenticacao
                email.setSubject("Alteração de senha RSD!");
                email.setMsg("Conforme solicitado pelo senhor(a) "+rs2.getString("Nome")+ " Foi alterado a sua senha para "+ senhaAleatoria);
                email.send();

                } catch (EmailException e) {

                System.out.println(e.getMessage());

                }
                try {
                    if (UsuarioController.alterarSenha(senhaAleatoria, vUsuario) == true) {
                        JOptionPane.showMessageDialog(this, "Senha alterada com sucesso! Favor verificar sua nova senha no email "+rs2.getString("email"));
                    }
                } catch (Exception ex) {
                    Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }else{
                JOptionPane.showMessageDialog(null, "Usuário Incorreto!", "ERRO", JOptionPane.ERROR_MESSAGE);
                return;
            }
              
        stmt2.close();
    con2.close();
   }   catch (SQLException ex) {
           Logger.getLogger(MovimentacoesView.class.getName()).log(Level.SEVERE, null, ex);
     }
        
        
    }//GEN-LAST:event_btAlterarSenhaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Login;
    private javax.swing.JLabel Senha;
    private javax.swing.JLabel Usuario;
    private javax.swing.JButton btAlterarSenha;
    private javax.swing.JButton btCriarUsuario;
    private javax.swing.JButton btEntrar;
    private javax.swing.JPasswordField cSenha;
    private javax.swing.JTextField cUsuario;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
