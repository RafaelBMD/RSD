package br.com.rsd.controller;

import br.com.rsd.dao.UsuarioDao;
import br.com.rsd.model.UsuarioModel;

public class UsuarioController
{
    public static boolean inserir(UsuarioModel categoria) throws Exception
    {
        return UsuarioDao.inserir(categoria);
    }

    public static boolean excluir(String vUsuario) throws Exception
    {
        return UsuarioDao.excluir(vUsuario);
    }
    
    public static boolean alterar(UsuarioModel categoria, String codigo) throws Exception
    {
        return UsuarioDao.alterar(categoria,codigo);
    }
    
    public static boolean relatorio(UsuarioModel categoria) throws Exception
    {
        return UsuarioDao.relatorio(categoria);
    }
}