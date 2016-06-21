package br.com.rsd.model;

public class UsuarioModel
{
    private String usuario, nome, senha, email;


    public UsuarioModel(){} //Construtor padrão
    
    public UsuarioModel(String usuario, String nome, String senha, String email)
    {
        this.usuario = usuario;
        this.nome = nome;
        this.senha = senha;
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



}