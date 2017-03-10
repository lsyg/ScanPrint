package model;

public class TipoArquivo {

    private int id_tipoArquivo;
    private String nome_tipoarquivo;
    private int id_arquivo;

    public TipoArquivo() {
    }

    public TipoArquivo(int id_tipoArquivo, int id_arquivo,String nome_tipoarquivo) {

        this.id_tipoArquivo = id_tipoArquivo;
        this.nome_tipoarquivo = nome_tipoarquivo;
        this.id_arquivo = id_arquivo;

    }

    public int getId_tipoArquivo() {
        return id_tipoArquivo;
    }

    public void setId_tipoArquivo(int id_tipoArquivo) {
        this.id_tipoArquivo = id_tipoArquivo;
    }

    public String getNome_tipoarquivo() {
        return nome_tipoarquivo;
    }

    public void setNome_tipoarquivo(String nome_tipoarquivo) {
        this.nome_tipoarquivo = nome_tipoarquivo;
    }

    public int getId_arquivo() {
        return id_arquivo;
    }

    public void setId_arquivo(int id_arquivo) {
        this.id_arquivo = id_arquivo;
    }
    
    
}
