package br.com.rsd.model;

import java.util.Date;

public class TransferenciaModel extends MovimentacaoModel
{
    private int codContaDest;

    public TransferenciaModel(){} //Construtor padrão

    public TransferenciaModel(int usuCodigo, int codConta, String descMovimentacao, int tipoMovimentacao, float valor, Date dataMovimentacao, String localizacao, int codContaDest)
    {
        super(usuCodigo, codConta, descMovimentacao, tipoMovimentacao, valor, dataMovimentacao, localizacao);
        this.codContaDest = codContaDest;
    }

    //Getters and Setters
    public Integer getCodContaDest()
    {
        return codContaDest;
    }

    public void setCodContaDest(Integer codContaDest)
    {
        this.codContaDest = codContaDest;
    }

}
