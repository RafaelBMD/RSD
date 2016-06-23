package br.com.rsd.dao;

import br.com.rsd.model.TransferenciaModel;
import br.com.rsd.persistencia.ConexaoPersistencia;
import com.mysql.jdbc.Statement;

public class TransferenciaDao
{
    public static boolean inserir(TransferenciaModel transferencia, int vUsuCodigo) throws Exception
    {
        try
        {
            ConexaoPersistencia conect = new ConexaoPersistencia();
            Statement st = conect.getSt();
            Statement st2 = conect.getSt();
            st.execute("INSERT INTO Movimentacao (usuCodigo, CodConta, TipoMovimentacao, DescMovimentacao, Localizacao, Valor, DataMovimentacao)"
                    + " VALUES (" + vUsuCodigo + ", "
                    + transferencia.getCodConta() + ", "
                    + transferencia.getTipoMovimentacao() + ", '"
                    + transferencia.getDescMovimentacao() + "', '"
                    + transferencia.getLocalizacao() + "', "
                    + transferencia.getValor() + ", '"
                    + transferencia.formataData(transferencia.getDataMovimentacao()) + "'); ");

            st2.execute("INSERT INTO Transferencia (CodMovimentacao, CodContaDestino)"
                    + "VALUES ((SELECT MAX(m.CodMovimentacao) FROM Movimentacao m), "
                    + transferencia.getCodContaDest() + "); ");
    
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
            st.execute("UPDATE Movimentacao SET CodConta = " + transferencia.getCodConta() + ","
                    + " DescMovimentacao = '" + transferencia.getDescMovimentacao() + "',"
                    + " TipoMovimentacao = " + transferencia.getTipoMovimentacao() + ","
                    + " Valor = " + transferencia.getValor() + ","
                    + " DataMovimentacao = '" + transferencia.formataData(transferencia.getDataMovimentacao()) + "',"
                    + " Localizacao = '" + transferencia.getLocalizacao() + "',"
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
        return true;
    }
}
