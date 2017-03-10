package model;

public class Acesso {
   int idAcesso;
   int id_cad_user;
   String data_acesso;
   
       public Acesso() {
    }

    public Acesso(int idAcesso, int id_cad_user, String data_acesso) {

        this.idAcesso = idAcesso;
        this.id_cad_user = id_cad_user;
        this.data_acesso = data_acesso;
    }

    public int getIdAcesso() {
        return idAcesso;
    }

    public void setIdAcesso(int idAcesso) {
        this.idAcesso = idAcesso;
    }

    public int getId_cad_user() {
        return id_cad_user;
    }

    public void setId_cad_user(int id_cad_user) {
        this.id_cad_user = id_cad_user;
    }

    public String getData_acesso() {
        return data_acesso;
    }

    public void setData_acesso(String data_acesso) {
        this.data_acesso = data_acesso;
    }
    
   
   
   
   
}
