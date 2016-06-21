package br.com.rsd.model;

import java.util.Date;

public abstract class MovimentacaoModel
{
    private int codConta, tipoMovimentacao;
    private String descMovimentacao, localizacao;
    private Float valor;
    private Date dataMovimentacao;

    public MovimentacaoModel(){} //Construtor padrão

    public MovimentacaoModel(int codConta, String descMovimentacao, int tipoMovimentacao, float valor, Date dataMovimentacao, String localizacao)
    {
        this.codConta = codConta;
        this.tipoMovimentacao = tipoMovimentacao;
        this.descMovimentacao = descMovimentacao;
        this.localizacao = localizacao;
        this.valor = valor;
        this.dataMovimentacao = dataMovimentacao;
    }

    //Getters and Setters
    public Integer getCodConta()
    {
        return codConta;
    }

    public void setCodConta(int codConta)
    {
        this.codConta = codConta;
    }

    public Integer getTipoMovimentacao()
    {
        return tipoMovimentacao;
    }

    public void setTipoMovimentacao(int tipoMovimentacao)
    {
        this.tipoMovimentacao = tipoMovimentacao;
    }

    public String getDescMovimentacao()
    {
        return descMovimentacao;
    }

    public void setDescMovimentacao(String descMovimentacao)
    {
        this.descMovimentacao = descMovimentacao;
    }

    public String getLocalizacao()
    {
        return localizacao;
    }

    public void setLocalizacao(String localizacao)
    {
        this.localizacao = localizacao;
    }

    public Float getValor()
    {
        return valor;
    }

    public void setValor(float valor)
    {
        this.valor = valor;
    }

    public Date getDataMovimentacao()
    {
        return dataMovimentacao;
    }

    public void setDataMovimentacao(Date dataMovimentacao)
    {
        this.dataMovimentacao = dataMovimentacao;
    }

}