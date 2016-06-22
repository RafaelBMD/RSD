/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rsd.dao;

import br.com.rsd.model.ReceitaModel;
import br.com.rsd.persistencia.ConexaoPersistencia;
import com.mysql.jdbc.Statement;
import java.util.HashMap;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class RelatorioDao {
        public static boolean relatorio(String filtro, String nomeRel) throws Exception
    {
      try
        {
            ConexaoPersistencia conect = new ConexaoPersistencia();
            Statement st = conect.getSt();
            
            st.execute("SELECT m.*,    \n" +
            "    case m.tipoMovimentacao\n" +
            "        when 0 then \"Receita\"\n" +
            "        when 1 then \"Despesa\"\n" +
            "        else \"Tranferência\"\n" +
            "    end as tipo,COALESCE((SELECT catRec.descCategoria FROM Categoria catRec WHERE catRec.codCategoria = r.codCategoria),\n" +
            "                     (SELECT catDesp.descCategoria FROM Categoria catDesp WHERE catDesp.codCategoria = r.codCategoria)) descCategoria,  (SELECT c.descConta FROM Conta c WHERE c.codConta = m.CodConta) contaOrigem, (SELECT contaTranf.descConta FROM Conta contaTranf WHERE contaTranf.codConta = t.CodContaDestino) contaDestino\n" +
            "   FROM Movimentacao m\n" +
            "   LEFT JOIN Transferencia t ON t.codMovimentacao = m.codMovimentacao\n" +
            "   LEFT JOIN Receita r ON r.codMovimentacao = m.codMovimentacao\n" +
            "   LEFT JOIN Despesa d ON d.codMovimentacao = m.codMovimentacao\n" +
            "   WHERE 1 = 1 " + filtro);
            JRResultSetDataSource relResult = new JRResultSetDataSource(conect.getSt().getResultSet());
            JasperPrint jpPrint = JasperFillManager.fillReport("iReports/" + nomeRel,new HashMap(), relResult);
            
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
