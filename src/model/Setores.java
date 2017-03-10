package model;


public class Setores {
    private int id_arquivo;
    private int id_setores;
    private String nome_setores;
    
    public Setores() {
    }

    public Setores(int id_arquivo, int id_setores, String nome_setores) {
        this.id_setores = id_setores;
        this.id_arquivo = id_arquivo;
        this.nome_setores = nome_setores;

    }

    
    

    public int getId_arquivo() {
        return id_arquivo;
    }

    public void setId_arquivo(int id_arquivo) {
        this.id_arquivo = id_arquivo;
    }

    public int getId_setores() {
        return id_setores;
    }

    public void setId_setores(int id_setores) {
        this.id_setores = id_setores;
    }

    public String getNome_setores() {
        return nome_setores;
    }

    public void setNome_setores(String nome_setores) {
        this.nome_setores = nome_setores;
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
