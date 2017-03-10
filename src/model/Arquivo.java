package model;

public class Arquivo {

    private int id_arquivo;
    private String nome_arquivo;
    private String local_arquivo;
    private int id_cad_user;

    public Arquivo() {
    }

    public Arquivo(int id_arquivo, int id_cad_user, String nome_arquivo, String local_arquivo) {

        this.id_arquivo = id_arquivo;
        this.id_cad_user = id_cad_user;
        this.nome_arquivo = nome_arquivo;
        this.local_arquivo = local_arquivo;

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

    public String getLocal_arquivo() {
        return local_arquivo;
    }

    public void setLocal_arquivo(String local_arquivo) {
        this.local_arquivo = local_arquivo;
    }

    public int getId_cad_user() {
        return id_cad_user;
    }

    public void setId_cad_user(int id_cad_user) {
        this.id_cad_user = id_cad_user;
    }

}
