package br.com.rsd.dao;

import br.com.rsd.model.UsuarioModel;
import br.com.rsd.persistencia.ConexaoPersistencia;
import com.mysql.jdbc.Statement;

import javax.swing.JOptionPane;

public class UsuarioDao
{
    public static boolean inserir(UsuarioModel usuario) throws Exception
    {
        try
        {
            ConexaoPersistencia conect = new ConexaoPersistencia();
            Statement st = conect.getSt();
            st.execute("INSERT INTO usuario (usuario, nome, senha, email)"
                    + "VALUES ('" + usuario.getUsuario() + "','"
                    + usuario.getNome() + "', '"
                    + usuario.getSenha() + "', '"
                    + usuario.getEmail() + "'); ");

        } catch (Exception e)
        {
            System.out.println("Problemas Ocorreram");
            e.printStackTrace();
            throw new Exception("Erro ao Salvar Dados!");
        }
        return true;
    }
    
    public static boolean excluir(String vUsuario) throws Exception
    {
        try
        {
            ConexaoPersistencia conect = new ConexaoPersistencia();
            Statement st = conect.getSt();
            st.execute("DELETE FROM usuario WHERE usuario = " +  vUsuario);

        } catch (Exception e)
        {
            System.out.println("Problemas Ocorreram");
            e.printStackTrace();
            throw new Exception("Erro ao Salvar dados!");
        }
        return true;
    }
    
    public static boolean alterar(UsuarioModel usuario, String vUsuario) throws Exception
    {
        try
        {
            ConexaoPersistencia conect = new ConexaoPersistencia();
            Statement st = conect.getSt();
            st.execute("UPDATE Usuario SET  usuario = '" + usuario.getUsuario() + "'," 
                    + " nome = " + usuario.getNome() + ","
                    + " senha = " + usuario.getSenha() + ","
                    + " email = " + usuario.getEmail()
                    + " WHERE usuario = " +  vUsuario);
            
        } catch (Exception e)
        {
            System.out.println("Problemas Ocorreram");
            e.printStackTrace();
            throw new Exception("Erro ao Salvar dados!");
        }
        return true;
    }
    public static boolean relatorio(UsuarioModel categoria) throws Exception
    {
        try
        {
            ConexaoPersistencia conect = new ConexaoPersistencia();
            Statement st = conect.getSt();
            //Statement st2 = conect.getSt();
            st.execute("SELECT  * FROM Usuario");
        } catch (Exception e)
        {
            System.out.println("Problemas Ocorreram");
            e.printStackTrace();
            throw new Exception("Erro ao Salvar Dados!");
        }
        return false;
    }
}