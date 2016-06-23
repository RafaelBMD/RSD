package br.com.rsd.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public abstract class MovimentacaoModel
{
    private int usuCodigo, codConta, tipoMovimentacao;
    private String descMovimentacao, localizacao;
    private Float valor;
    private Date dataMovimentacao;

    public MovimentacaoModel(){} //Construtor padrão

    public MovimentacaoModel(int usuCodigo, int codConta, String descMovimentacao, int tipoMovimentacao, float valor, Date dataMovimentacao, String localizacao)
    {
        this.usuCodigo = usuCodigo;
        this.codConta = codConta;
        this.tipoMovimentacao = tipoMovimentacao;
        this.descMovimentacao = descMovimentacao;
        this.localizacao = localizacao;
        this.valor = valor;
        this.dataMovimentacao = dataMovimentacao;
    }
      public String formataData(Date vData){
       Calendar data = Calendar.getInstance();
       SimpleDateFormat formato = new 
       SimpleDateFormat("yyyy-MM-dd");
       formato.setLenient(false);   
    return (formato.format(vData.getTime()));
    }
    //Getters and Setters
    public Integer getUsuCodigo()
    {
        return usuCodigo;
    }

    public void setUsuCodigo(int usuCodigo)
    {
        this.usuCodigo = usuCodigo;
    }
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