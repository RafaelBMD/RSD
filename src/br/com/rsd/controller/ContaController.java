package br.com.rsd.controller;

import br.com.rsd.dao.ContaDao;
import br.com.rsd.model.ContaModel;

public class ContaController
{
    public static boolean inserir(ContaModel conta, int vUsuCodigo) throws Exception
    {
        return ContaDao.inserir(conta,vUsuCodigo);
    }

        public static boolean excluir(String codigo, int vUsuCodigo) throws Exception
    {
        return ContaDao.excluir(codigo, vUsuCodigo);
    }
    
    public static boolean alterar(ContaModel categoria, String codigo, int vUsuCodigo) throws Exception
    {
        return ContaDao.alterar(categoria,codigo,vUsuCodigo);
    }
    
    public static boolean relatorio(int vUsuCodigo) throws Exception
    {
        return ContaDao.relatorio(vUsuCodigo);
    }
}
