package br.com.rsd.dao;

import br.com.rsd.model.DespesaModel;
import br.com.rsd.persistencia.ConexaoPersistencia;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class DespesaDao
{
    public static boolean inserir(DespesaModel despesa, int vUsuCodigo) throws Exception
    {
        try
        {
            ConexaoPersistencia conect = new ConexaoPersistencia();
            Statement st = conect.getSt();
            Statement st2 = conect.getSt();
            st.execute("INSERT INTO Movimentacao (usuCodigo, CodConta, TipoMovimentacao, DescMovimentacao, Localizacao, Valor, DataMovimentacao)"
                    + "VALUES (" + vUsuCodigo + ", "
                    + despesa.getCodConta() + ", "
                    + despesa.getTipoMovimentacao() + ", '"
                    + despesa.getDescMovimentacao() + "', '"
                    + despesa.getLocalizacao() + "', "
                    + despesa.getValor() + ", '"
                    + despesa.formataData(despesa.getDataMovimentacao()) + "'); ");

            st2.execute("INSERT INTO Despesa (CodMovimentacao, CodCategoria)"
                    + "VALUES ((SELECT MAX(m.CodMovimentacao) FROM Movimentacao m), "
                    + despesa.getCodConta() + "); ");

        } catch (Exception e)
        {
            System.out.println("Problemas Ocorreram");
            e.printStackTrace();
            throw new Exception("Erro ao Salvar Dados!");
        }
        return true;
    }
    
    public static boolean excluir(String codigo) throws Exception
    {
        try
        {
            ConexaoPersistencia conect = new ConexaoPersistencia();
            Statement st = conect.getSt();
            Statement st2 = conect.getSt();
            st.execute("DELETE FROM Despesa WHERE codMovimentacao = " +  codigo);
            
            st2.execute("DELETE FROM Movimentacao WHERE codMovimentacao = " +  codigo);
            
        } catch (Exception e)
        {
            System.out.println("Problemas Ocorreram");
            e.printStackTrace();
            throw new Exception("Erro ao Salvar dados!");
        }
        return true;
    }
    
    public static boolean alterar(DespesaModel despesa, String CodMovimentacao) throws Exception
    {
        try
        {
            ConexaoPersistencia conect = new ConexaoPersistencia();
            Statement st = conect.getSt();
            st.execute("UPDATE Movimentacao SET  DescMovimentacao = '" + despesa.getDescMovimentacao() + "',"
                    + " TipoMovimentacao = " + despesa.getTipoMovimentacao() + ","
                    + " Valor = " + despesa.getValor() + ","
                    + " DataMovimentacao = '" + despesa.formataData(despesa.getDataMovimentacao()) + "',"
                    + " Localizacao = '" + despesa.getLocalizacao() + "',"
                    + " WHERE CodMovimentacao = " +  CodMovimentacao);
            
        } catch (Exception e)
        {
            System.out.println("Problemas Ocorreram");
            e.printStackTrace();
            throw new Exception("Erro ao Salvar dados!");
        }
        return true;
    }
    
    public static boolean relatorio(DespesaModel despesa) throws Exception
    {
        try
        {
            ConexaoPersistencia conect = new ConexaoPersistencia();
            Statement st = conect.getSt();
            //Statement st2 = conect.getSt();
            st.execute("SELECT  * FROM Despesa");
        } catch (Exception e)
        {
            System.out.println("Problemas Ocorreram");
            e.printStackTrace();
            throw new Exception("Erro ao Salvar Dados!");
        }
        return true;
    }
}
