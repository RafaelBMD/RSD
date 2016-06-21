package br.com.rsd.controller;

import br.com.rsd.dao.TransferenciaDao;
import br.com.rsd.model.TransferenciaModel;

public class TransferenciaController
{
    public static boolean inserir(TransferenciaModel transferencia) throws Exception
    {
        return TransferenciaDao.inserir(transferencia);
    }
public static boolean excluir(String codigo) throws Exception
    {
        return TransferenciaDao.excluir(codigo);
    }
    
    public static boolean alterar(TransferenciaModel transferencia, String codigo) throws Exception
    {
        return TransferenciaDao.alterar(transferencia, codigo);
    }
}
