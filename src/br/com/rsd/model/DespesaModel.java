package br.com.rsd.model;

import java.util.Date;

public class DespesaModel extends MovimentacaoModel
{
    private int codCategoria;

    public DespesaModel(){} //Construtor padrão

    public DespesaModel(int usuCodigo, int codConta, String descMovimentacao, int tipoMovimentacao, float valor, Date dataMovimentacao, String localizacao, int codCategoria)
    {
        super(usuCodigo, codConta, descMovimentacao, tipoMovimentacao, valor, dataMovimentacao, localizacao);
        this.codCategoria = codCategoria;
    }

    //Getters and Setters
    public Integer getCodContaDest()
    {
        return codCategoria;
    }

    public void setCodContaDest(Integer codContaDest)
    {
        this.codCategoria = codContaDest;
    }

}
