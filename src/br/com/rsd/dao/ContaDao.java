package br.com.rsd.dao;

import br.com.rsd.model.ContaModel;
import br.com.rsd.persistencia.ConexaoPersistencia;
import com.mysql.jdbc.Statement;

public class ContaDao
{

    
    public static boolean inserir(ContaModel conta) throws Exception
    {
        try
        {
            ConexaoPersistencia conect = new ConexaoPersistencia();
            Statement st = conect.getSt();
         
            st.execute("INSERT INTO conta (DescConta, Saldo, SaldoInicial, ContaAtiva)"
                    + "VALUES ('" + conta.getDescConta() + "',"
                    + conta.getSaldo() + ", "
                    + conta.getSaldoInicial() + ", "
                    + conta.getContaAtiva() + "); ");

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
            st.execute("DELETE FROM Conta WHERE codConta = " +  codigo);

        } catch (Exception e)
        {
            System.out.println("Problemas Ocorreram");
            e.printStackTrace();
            throw new Exception("Erro ao Salvar dados!");
        }
        return true;
    }
    
    public static boolean alterar(ContaModel conta, String CodConta) throws Exception
    {
        try
        {
            
            ConexaoPersistencia conect = new ConexaoPersistencia();
            Statement st = conect.getSt();
            st.execute("UPDATE Conta SET  DescConta = '" + conta.getDescConta() + "'," 
                    + " Saldo = " + conta.getSaldo() + ","
                    + " SaldoInicial = " + conta.getSaldoInicial() + ","
                    + " ContaAtiva = " + conta.getContaAtiva() 
                    + " WHERE codConta = " +  CodConta);
            
        } catch (Exception e)
        {
            System.out.println("Problemas Ocorreram");
            e.printStackTrace();
            throw new Exception("Erro ao Salvar dados!");
        }
        return true;
    }
    public static boolean relatorio(ContaModel conta) throws Exception
    {
        try
        {
            ConexaoPersistencia conect = new ConexaoPersistencia();
            Statement st = conect.getSt();
            //Statement st2 = conect.getSt();
            st.execute("SELECT  * FROM conta");
        } catch (Exception e)
        {
            System.out.println("Problemas Ocorreram");
            e.printStackTrace();
            throw new Exception("Erro ao Salvar Dados!");
        }
        return false;
    }
}
