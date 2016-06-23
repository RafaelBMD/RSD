package br.com.rsd.controller;

import br.com.rsd.dao.CategoriaDao;
import br.com.rsd.model.CategoriaModel;

public class CategoriaController
{
    public static boolean inserir(CategoriaModel categoria, int vUsuCodigo) throws Exception
    {
        return CategoriaDao.inserir(categoria, vUsuCodigo);
    }

    public static boolean excluir(String codigo, int vUsuCodigo) throws Exception
    {
        return CategoriaDao.excluir(codigo, vUsuCodigo);
    }
    
    public static boolean alterar(CategoriaModel categoria, String codigo, int vUsuCodigo) throws Exception
    {
        return CategoriaDao.alterar(categoria,codigo, vUsuCodigo);
    }
    
    public static boolean relatorio(int vUsuCodigo) throws Exception
    {
        return CategoriaDao.relatorio(vUsuCodigo);
    }
}
