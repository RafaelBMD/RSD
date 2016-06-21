package br.com.rsd.controller;

import br.com.rsd.dao.DespesaDao;
import br.com.rsd.model.DespesaModel;

public class DespesaController
{
    public static boolean inserir(DespesaModel despesa) throws Exception
    {
        return DespesaDao.inserir(despesa);
    }

    public static boolean excluir(String codigo) throws Exception
    {
        return DespesaDao.excluir(codigo);
    }
    
    public static boolean alterar(DespesaModel despesa, String codigo) throws Exception
    {
        return DespesaDao.alterar(despesa, codigo);
    }
}
