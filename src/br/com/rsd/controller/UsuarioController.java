package br.com.rsd.controller;

import br.com.rsd.dao.UsuarioDao;
import br.com.rsd.model.UsuarioModel;

public class UsuarioController
{
    public static boolean inserir(UsuarioModel usuario) throws Exception
    {
        return UsuarioDao.inserir(usuario);
    }

    public static boolean excluir(String vUsuario) throws Exception
    {
        return UsuarioDao.excluir(vUsuario);
    }
    public static boolean alterarSenha(String senha, String codigo) throws Exception
    {
        return UsuarioDao.alterarSenha(senha,codigo);
    }
    public static boolean alterar(UsuarioModel usuario, String codigo) throws Exception
    {
        return UsuarioDao.alterar(usuario,codigo);
    }
    
    public static boolean relatorio(UsuarioModel usuario) throws Exception
    {
        return UsuarioDao.relatorio(usuario);
    }
}