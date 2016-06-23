package br.com.rsd.dao;

import br.com.rsd.model.CategoriaModel;
import br.com.rsd.persistencia.ConexaoPersistencia;
import com.mysql.jdbc.Statement;
import java.util.HashMap;

import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class CategoriaDao
{   
    public static boolean inserir(CategoriaModel categoria, int vUsuCodigo) throws Exception
    {
        try
        {
            ConexaoPersistencia conect = new ConexaoPersistencia();
            Statement st = conect.getSt();
            st.execute("INSERT INTO categoria (usuCodigo, DescCategoria, TipoCategoria, CategoriaAtiva)"
                    + "VALUES ("+ vUsuCodigo + ",'"
                    + categoria.getDescCategoria() + "',"
                    + categoria.getTipoCategoria() + ", "
                    + categoria.getCategoriaAtiva() + "); ");

        } catch (Exception e)
        {
            System.out.println("Problemas Ocorreram");
            e.printStackTrace();
            throw new Exception("Erro ao Salvar Dados!");
        }
        return true;
    }
    
    public static boolean excluir(String codigo, int vUsuCodigo) throws Exception
    {
        try
        {
            ConexaoPersistencia conect = new ConexaoPersistencia();
            Statement st = conect.getSt();
            st.execute("DELETE FROM Categoria WHERE codCategoria = " +  codigo + " and usuCodigo = " + vUsuCodigo);

        } catch (Exception e)
        {
            System.out.println("Problemas Ocorreram");
            e.printStackTrace();
            throw new Exception("Erro ao Salvar dados!");
        }
        return true;
    }
    
    public static boolean alterar(CategoriaModel categoria, String CodCategoria, int vUsuCodigo) throws Exception
    {
        try
        {
            ConexaoPersistencia conect = new ConexaoPersistencia();
            Statement st = conect.getSt();
            st.execute("UPDATE Categoria SET  DescCategoria = '" + categoria.getDescCategoria() + "'," 
                    + " TipoCategoria = " + categoria.getTipoCategoria() + ","
                    + " CategoriaAtiva = " + categoria.getCategoriaAtiva()
                    + " WHERE codCategoria = " +  CodCategoria + " and usuCodigo = " + vUsuCodigo);
            
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
            
            st.execute("SELECT  * FROM Categoria where usuCodigo = " + vUsuCodigo);
            JRResultSetDataSource relResult = new JRResultSetDataSource(conect.getSt().getResultSet());
            JasperPrint jpPrint = JasperFillManager.fillReport("iReports/RelatorioCategoria.jasper",new HashMap(), relResult);
            
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
