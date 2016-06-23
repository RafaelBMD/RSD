package br.com.rsd.dao;

import br.com.rsd.model.ReceitaModel;
import br.com.rsd.persistencia.ConexaoPersistencia;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

public class ReceitaDao
{
    
    public static boolean inserir(ReceitaModel receita) throws Exception
    {
        try
        {
            ConexaoPersistencia conect = new ConexaoPersistencia();
            Statement st = conect.getSt();
            Statement st2 = conect.getSt();
            st.execute("INSERT INTO Movimentacao (CodConta, TipoMovimentacao, DescMovimentacao, Localizacao, Valor, DataMovimentacao)"
                    + " VALUES (" + receita.getCodConta() + ", "
                    + receita.getTipoMovimentacao() + ", '"
                    + receita.getDescMovimentacao() + "', '"
                    + receita.getLocalizacao() + "', "
                    + receita.getValor() + ", '"
                    + receita.formataData(receita.getDataMovimentacao()) + "'); ");

            st2.execute("INSERT INTO Receita (CodMovimentacao, CodCategoria)"
                    + "VALUES ((SELECT MAX(m.CodMovimentacao) FROM Movimentacao m), "
                    + receita.getCodConta() + ");");

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
            st.execute("DELETE FROM Receita WHERE codReceita = " +  codigo);
            
            st2.execute("DELETE FROM Movimentacao WHERE codMovimentacao = " +  codigo);
            
        } catch (Exception e)
        {
            System.out.println("Problemas Ocorreram");
            e.printStackTrace();
            throw new Exception("Erro ao Salvar dados!");
        }
        return true;
    }
    
    public static boolean alterar(ReceitaModel receita, String CodMovimentacao) throws Exception
    {
        try
        {
            ConexaoPersistencia conect = new ConexaoPersistencia();
            Statement st = conect.getSt();
            st.execute("UPDATE Movimentacao SET  DescMovimentacao = '" + receita.getDescMovimentacao() + "',"
                    + " TipoMovimentacao = " + receita.getTipoMovimentacao() + ","
                    + " Valor = " + receita.getValor() + ","
                    + " DataMovimentacao = '" + receita.formataData(receita.getDataMovimentacao()) + "',"
                    + " Localizacao = '" + receita.getLocalizacao() + "',"
                    + " WHERE CodMovimentacao = " +  CodMovimentacao);
            
        } catch (Exception e)
        {
            System.out.println("Problemas Ocorreram");
            e.printStackTrace();
            throw new Exception("Erro ao Salvar dados!");
        }
        return true;
    }
    
    public static boolean relatorio(ReceitaModel receita) throws Exception
    {
        try
        {
            ConexaoPersistencia conect = new ConexaoPersistencia();
            Statement st = conect.getSt();
            //Statement st2 = conect.getSt();
            st.execute("SELECT  * FROM Receita");
        } catch (Exception e)
        {
            System.out.println("Problemas Ocorreram");
            e.printStackTrace();
            throw new Exception("Erro ao Salvar Dados!");
        }
        return true;
    }
    
    
}
