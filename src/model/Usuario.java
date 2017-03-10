package model;

public class Usuario {  
    private int id_cad_user;
    private String nome_user;
    private String cpf_user;
    private String endereco_user;
    private String telefone_user;
    private String email_user;
    private String user_user;
    private String cargo_user;
    private String senha_user;
    
 

    public Usuario(){}
    
    public Usuario(int id_cad_user, String nome_user, String cpf_user, 
            String endereco_user, String telefone_user, String email_user,
            String cargo_user,String user_user, String senha_user) {
            
       
        
    this.id_cad_user = id_cad_user ;
    this.nome_user = nome_user;
    this.cpf_user = cpf_user;
    this.endereco_user = endereco_user;
    this.telefone_user = telefone_user;
    this.email_user = email_user;
    this.cargo_user = cargo_user;
    this.user_user = user_user;
    this.senha_user = senha_user;

    
        
        
        
    }

    public int getId_cad_user() {
        return id_cad_user;
    }

    public void setId_cad_user(int id_cad_user) {
        this.id_cad_user = id_cad_user;
    }

    public String getNome_user() {
        return nome_user;
    }

    public void setNome_user(String nome_user) {
        this.nome_user = nome_user;
    }

    public String getCpf_user() {
        return cpf_user;
    }

    public void setCpf_user(String cpf_user) {
        this.cpf_user = cpf_user;
    }

    public String getEndereco_user() {
        return endereco_user;
    }

    public void setEndereco_user(String endereco_user) {
        this.endereco_user = endereco_user;
    }

    public String getTelefone_user() {
        return telefone_user;
    }

    public void setTelefone_user(String telefone_user) {
        this.telefone_user = telefone_user;
    }

    public String getEmail_user() {
        return email_user;
    }

    public void setEmail_user(String email_user) {
        this.email_user = email_user;
    }


    public String getUser_user() {
        return user_user;
    }

    public void setUser_user(String user_user) {
        this.user_user = user_user;
    }

    public String getSenha_user() {
        return senha_user;
    }

    public void setSenha_user(String senha_user) {
        this.senha_user = senha_user;
    }

    public String getCargo_user() {
        return cargo_user;
    }

    public void setCargo_user(String cargo_user) {
        this.cargo_user = cargo_user;
    }


  


    
}
