package br.com.rsd.controller;

import br.com.rsd.dao.ContaDao;
import br.com.rsd.model.ContaModel;

public class ContaController
{
    public static boolean persistir(ContaModel conta) throws Exception
    {
        return ContaDao.persistir(conta);
    }

        public static boolean excluir(String codigo) throws Exception
    {
        return ContaDao.excluir(codigo);
    }
    
    public static boolean alterar(ContaModel categoria, String codigo) throws Exception
    {
        return ContaDao.alterar(categoria,codigo);
    }
    
    public static boolean relatorio(ContaModel conta) throws Exception
    {
        return ContaDao.relatorio(conta);
    }
}
