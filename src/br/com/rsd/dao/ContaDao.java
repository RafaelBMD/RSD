package br.com.rsd.dao;

import br.com.rsd.model.ContaModel;
import br.com.rsd.persistencia.ConexaoPersistencia;
import com.mysql.jdbc.Statement;
import java.util.HashMap;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class ContaDao
{    
    public static boolean inserir(ContaModel conta, int vUsuCodigo) throws Exception
    {
        try
        {
            ConexaoPersistencia conect = new ConexaoPersistencia();
            Statement st = conect.getSt();
         
            st.execute("INSERT INTO conta (usuCodigo, DescConta, Saldo, SaldoInicial, ContaAtiva)"
                    + "VALUES (" + vUsuCodigo + ",'" 
                    + conta.getDescConta() + "',"
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
    public static boolean excluir(String codigo, int vUsuCodigo) throws Exception
    {
        try
        {
            ConexaoPersistencia conect = new ConexaoPersistencia();
            Statement st = conect.getSt();
            st.execute("DELETE FROM Conta WHERE codConta = " +  codigo + " and usuCodigo = " + vUsuCodigo);

        } catch (Exception e)
        {
            System.out.println("Problemas Ocorreram");
            e.printStackTrace();
            throw new Exception("Erro ao Salvar dados!");
        }
        return true;
    }
    
    public static boolean alterar(ContaModel conta, String CodConta, int vUsuCodigo) throws Exception
    {
        try
        {
            
            ConexaoPersistencia conect = new ConexaoPersistencia();
            Statement st = conect.getSt();
            st.execute("UPDATE Conta SET  DescConta = '" + conta.getDescConta() + "'," 
                    + " Saldo = " + conta.getSaldo() + ","
                    + " SaldoInicial = " + conta.getSaldoInicial() + ","
                    + " ContaAtiva = " + conta.getContaAtiva() 
                    + " WHERE codConta = " +  CodConta + " and usuCodigo = " + vUsuCodigo);
            
        } catch (Exception e)
        {
            System.out.println("Problemas Ocorreram");
            e.printStackTrace();
            throw new Exception("Erro ao Salvar dados!");
        }
        return true;
    }
    public static boolean relatorio(int vUsuCodigo) throws Exception
    {
        try
        {
            ConexaoPersistencia conect = new ConexaoPersistencia();
            Statement st = conect.getSt();
            
            st.execute("SELECT  * FROM Conta usuCodigo = " + vUsuCodigo);
            JRResultSetDataSource relResult = new JRResultSetDataSource(conect.getSt().getResultSet());
            JasperPrint jpPrint = JasperFillManager.fillReport("iReports/RelatorioConta.jasper",new HashMap(), relResult);
            
            JasperViewer jv = new JasperViewer(jpPrint, false);
            jv.setVisible(true);
            jv.toFront();
            
            
        } catch (Exception e)
        {
            System.out.println("Problemas Ocorreram");
            e.printStackTrace();
            throw new Exception("Erro ao Salvar Dados!");
        }
        return true;
    }
}
