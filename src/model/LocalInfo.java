package model;


public class LocalInfo {
    private int id_user_local_info;
    private int arquivo_id_arquivo;
    private String data_info;
    private String hora_info;
    
    
    
    
    public LocalInfo() {
    }

    public LocalInfo(int id_user_local_info, int arquivo_id_arquivo,String data_info, String hora_info ) {

        this.id_user_local_info = id_user_local_info;
        this.arquivo_id_arquivo = arquivo_id_arquivo;
        this.data_info = data_info;
        this.hora_info = hora_info;

    }
    
    
    
    

    public int getId_user_local_info() {
        return id_user_local_info;
    }

    public void setId_user_local_info(int id_user_local_info) {
        this.id_user_local_info = id_user_local_info;
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

    public int getArquivo_id_arquivo() {
        return arquivo_id_arquivo;
    }

    public void setArquivo_id_arquivo(int arquivo_id_arquivo) {
        this.arquivo_id_arquivo = arquivo_id_arquivo;
    }
    
    
    
    
    
}
