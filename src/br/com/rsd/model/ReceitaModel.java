package br.com.rsd.model;

import java.util.Date;

public class ReceitaModel extends MovimentacaoModel
{
    private int codCategoria;

    public ReceitaModel(){} //Construtor padrão

    public ReceitaModel(int usuCodigo, int codConta, String descMovimentacao, int tipoMovimentacao, float valor, Date dataMovimentacao, String localizacao, int codCategoria)
    {
        super(usuCodigo, codConta, descMovimentacao, tipoMovimentacao, valor, dataMovimentacao, localizacao);
        this.codCategoria = codCategoria;
    }
     
    //Getters and Setters
    public int getCodContaDest()
    {
        return codCategoria;
    }

    public void setCodContaDest(Integer codContaDest)
    {
        this.codCategoria = codContaDest;
    }

}
