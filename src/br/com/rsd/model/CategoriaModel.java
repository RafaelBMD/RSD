package br.com.rsd.model;

public class CategoriaModel
{
    private int usuCodigo;
    private String descCategoria;
    private int tipoCategoria;
    private boolean categoriaAtiva;



    public CategoriaModel(){} //Construtor padrão
    
    public CategoriaModel(int usuCodigo, String descCategoria, int tipoCategoria, boolean categoriaAtiva)
    {
        this.usuCodigo = usuCodigo;
        this.descCategoria = descCategoria;
        this.tipoCategoria = tipoCategoria;
        this.categoriaAtiva = categoriaAtiva;
    }

    //Getters and Setters
    
    public int getUsuCodigo() {
        return usuCodigo;
    }

    public void setUsuCodigo(int usuCodigo) {
        this.usuCodigo = usuCodigo;
    }
    
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

    public boolean getCategoriaAtiva()
    {
        return categoriaAtiva;
    }

    public void setCategoriaAtiva(boolean categoriaAtiva)
    {
        this.categoriaAtiva = categoriaAtiva;
    }

}
