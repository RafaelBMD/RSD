package br.com.rsd.controller;

import br.com.rsd.dao.CategoriaDao;
import br.com.rsd.model.CategoriaModel;

public class CategoriaController
{
    public static boolean inserir(CategoriaModel categoria) throws Exception
    {
        return CategoriaDao.inserir(categoria);
    }

    public static boolean excluir(String codigo) throws Exception
    {
        return CategoriaDao.excluir(codigo);
    }
    
    public static boolean alterar(CategoriaModel categoria, String codigo) throws Exception
    {
        return CategoriaDao.alterar(categoria,codigo);
    }
    
    public static boolean relatorio(CategoriaModel categoria) throws Exception
    {
        return CategoriaDao.relatorio(categoria);
    }
}
