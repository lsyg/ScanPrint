package model;

public class historico{
 
    private int id_arquivo;
    private String nome_arquivo;
    private String nome_tipoArquivo;
    private String nome_setores;
    private String nome_user;
    private String data_info;
    private String hora_info;

    public historico() {
    }

    public historico(int id_arquivo, String nome_arquivo, String nome_tipoArquivo, String nome_setores, String nome_user, String data_info, String hora_info) {
        this.id_arquivo = id_arquivo;
        this.nome_arquivo = nome_arquivo;
        this.nome_tipoArquivo = nome_tipoArquivo;
        this.nome_setores = nome_setores;
        this.nome_user = nome_user;
        this.data_info = data_info;
        this.hora_info = hora_info;
    }

    public int getId_arquivo() {
        return id_arquivo;
    }

    public void setId_arquivo(int id_arquivo) {
        this.id_arquivo = id_arquivo;
    }

    public String getNome_arquivo() {
        return nome_arquivo;
    }

    public void setNome_arquivo(String nome_arquivo) {
        this.nome_arquivo = nome_arquivo;
    }

    public String getNome_tipoArquivo() {
        return nome_tipoArquivo;
    }

    public void setNome_tipoArquivo(String nome_tipoArquivo) {
        this.nome_tipoArquivo = nome_tipoArquivo;
    }

    public String getNome_setores() {
        return nome_setores;
    }

    public void setNome_setores(String nome_setores) {
        this.nome_setores = nome_setores;
    }

    public String getNome_user() {
        return nome_user;
    }

    public void setNome_user(String nome_user) {
        this.nome_user = nome_user;
    }

    public String getData_info() {
        return data_info;
    }

    public void setData_info(String data_info) {
        this.data_info = data_info;
    }

    public String getHora_info() {
        return hora_info;
    }

    public void setHora_info(String hora_info) {
        this.hora_info = hora_info;
    }
    
    
    
}
