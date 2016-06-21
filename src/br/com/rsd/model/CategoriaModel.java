package br.com.rsd.model;

public class CategoriaModel
{
    private String descCategoria;
    private int tipoCategoria;
    private int cor;
    private boolean categoriaAtiva;

    public CategoriaModel(){} //Construtor padrão
    
    public CategoriaModel(String descCategoria, int tipoCategoria, int cor, boolean categoriaAtiva)
    {
        this.descCategoria = descCategoria;
        this.tipoCategoria = tipoCategoria;
        this.cor = cor;
        this.categoriaAtiva = categoriaAtiva;
    }

    //Getters and Setters
    public String getDescCategoria()
    {
        return descCategoria;
    }

    public void setDescCategoria(String descCategoria)
    {
        this.descCategoria = descCategoria;
    }

    public int getTipoCategoria()
    {
        return tipoCategoria;
    }

    public void setTipoCategoria(int tipoCategoria)
    {
        this.tipoCategoria = tipoCategoria;
    }

    public int getCor()
    {
        return cor;
    }

    public void setCor(int cor)
    {
        this.cor = cor;
    }

    public boolean getCategoriaAtiva()
    {
        return categoriaAtiva;
    }

    public void setCategoriaAtiva(boolean categoriaAtiva)
    {
        this.categoriaAtiva = categoriaAtiva;
    }

}
