package br.com.rsd.dao;

import br.com.rsd.model.TransferenciaModel;
import br.com.rsd.persistencia.ConexaoPersistencia;
import com.mysql.jdbc.Statement;

public class TransferenciaDao
{
    public static boolean inserir(TransferenciaModel transferencia) throws Exception
    {
        try
        {
            ConexaoPersistencia conect = new ConexaoPersistencia();
            Statement st = conect.getSt();
            Statement st2 = conect.getSt();
            st.execute("INSERT INTO Movimentacao (DescMovimentacao, TipoMovimentacao, Valor, DataMovimentacao, Localizacao)"
                    + "VALUES ('" + transferencia.getDescMovimentacao() + "', "
                    + transferencia.getTipoMovimentacao() + ","
                    + transferencia.getValor() + ", '"
                    + transferencia.getDataMovimentacao() + "', '"
                    + transferencia.getLocalizacao() + "'); ");

            st2.execute("INSERT INTO Transferencia (CodMovimentacao, CodContaDest)"
                    + "VALUES ((SELECT MAX(m.CodMovimentacao) FROM Movimentacao m), "
                    + transferencia.getCodContaDest() + "); ");

        } catch (Exception e)
        {
            System.out.println("Problemas Ocorreram");
            e.printStackTrace();
            throw new Exception("Erro ao Salvar Dados!");
        }
        return false;
    }
    
    public static boolean excluir(String codigo) throws Exception
    {
        try
        {
            ConexaoPersistencia conect = new ConexaoPersistencia();
            Statement st = conect.getSt();
            Statement st2 = conect.getSt();
            st.execute("DELETE FROM Transferencia WHERE codReceita = " +  codigo);
            
            st2.execute("DELETE FROM Movimentacao WHERE codMovimentacao = " +  codigo);
            
        } catch (Exception e)
        {
            System.out.println("Problemas Ocorreram");
            e.printStackTrace();
            throw new Exception("Erro ao Salvar dados!");
        }
        return true;
    }
    
    public static boolean alterar(TransferenciaModel transferencia, String CodMovimentacao) throws Exception
    {
        try
        {
            ConexaoPersistencia conect = new ConexaoPersistencia();
            Statement st = conect.getSt();
            st.execute("UPDATE Movimentacao SET  DescMovimentacao = '" + transferencia.getDescMovimentacao() + "',"
                    + " TipoMovimentacao = " + transferencia.getTipoMovimentacao() + ","
                    + " Valor = " + transferencia.getValor() + ","
                    + " DataMovimentacao = " + transferencia.getDataMovimentacao() + ","
                    + " Localizacao = " + transferencia.getLocalizacao() + ","
                    + " WHERE CodMovimentacao = " +  CodMovimentacao);
            
        } catch (Exception e)
        {
            System.out.println("Problemas Ocorreram");
            e.printStackTrace();
            throw new Exception("Erro ao Salvar dados!");
        }
        return true;
    }
    
    public static boolean relatorio(TransferenciaModel transferencia) throws Exception
    {
        try
        {
            ConexaoPersistencia conect = new ConexaoPersistencia();
            Statement st = conect.getSt();
            //Statement st2 = conect.getSt();
            st.execute("SELECT  * FROM Transferencia");
        } catch (Exception e)
        {
            System.out.println("Problemas Ocorreram");
            e.printStackTrace();
            throw new Exception("Erro ao Salvar Dados!");
        }
        return false;
    }
}
