package br.com.rsd.controller;

import br.com.rsd.dao.ReceitaDao;
import br.com.rsd.model.DespesaModel;
import br.com.rsd.model.ReceitaModel;
import br.com.rsd.model.TransferenciaModel;

public class ReceitaController
{
    public static boolean inserir(ReceitaModel receita, int vUsuCodigo) throws Exception
    {
        return ReceitaDao.inserir(receita, vUsuCodigo);
    }

    public static boolean excluir(String codigo) throws Exception
    {
        return ReceitaDao.excluir(codigo);
    }
    
    public static boolean alterar(ReceitaModel receita, String codigo) throws Exception
    {
        return ReceitaDao.alterar(receita, codigo);
    }
}
