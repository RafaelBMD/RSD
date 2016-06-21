package br.com.rsd.model;

public class ContaModel
{
    private String descConta;
    private float saldo;
    private float saldoInicial;
    private boolean contaAtiva;

    public ContaModel(){} //Construtor padrão

    public ContaModel(String descConta, float saldo, float saldoInicial, boolean contaAtiva)
    {
        this.descConta = descConta;
        this.saldo = saldo;
        this.saldoInicial = saldoInicial;
        this.contaAtiva = contaAtiva;
    }

    //Getters and Setters
    public String getDescConta()
    {
        return descConta;
    }

    public void setDescConta(String descConta)
    {
        this.descConta = descConta;
    }

    public float getSaldo()
    {
        return saldo;
    }

    public void setSaldo(float saldo)
    {
        this.saldo = saldo;
    }

    public float getSaldoInicial()
    {
        return saldoInicial;
    }

    public void setSaldoInicial(float saldoInicial)
    {
        this.saldoInicial = saldoInicial;
    }

    public boolean getContaAtiva()
    {
        return contaAtiva;
    }

    public void setContaAtiva(boolean contaAtiva)
    {
        this.contaAtiva = contaAtiva;
    }

}
