package DAO;

import conexoes.ConexaoMySql;
import model.Usuario;

public class DAOCadastroUsuario {

    public static boolean loginUsuario(Usuario usuario) {
        boolean usuarioAutenticado = false;
        ConexaoMySql conexao = new ConexaoMySql();

        try {
            conexao.conectar();
            String sql = "select cadastrousuario.id_cad_user, cadastrousuario.user_user, cadastrousuario.senha_user from cadastrousuario "
                    + "WHERE user_user = '"+ usuario.getUser_user()+"' AND senha_user = '"+usuario.getSenha_user()+"';";
            conexao.executarSQL(sql);

            if (conexao.getResultSet().next()) {
                usuario.setId_cad_user(conexao.getResultSet().getInt("id_cad_user"));
                usuario.setUser_user(conexao.getResultSet().getString("user_user"));
                usuario.setSenha_user(conexao.getResultSet().getString("senha_user"));
                usuarioAutenticado = true;
                return usuarioAutenticado;
            } else{
                usuarioAutenticado = false;
                return usuarioAutenticado;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            conexao.fecharConexao();
        }
    }

    public int salvarDAO(Usuario pPessoa) {

        ConexaoMySql conexao = new ConexaoMySql();

        try {

            conexao.conectar();

            String sql = "insert into cadastrousuario(nome_user,cpf_user,endereco_user,telefone_user,email_user,cargo_user,user_user,senha_user) values ("
                    + "'" + pPessoa.getNome_user() + "'" + ","
                    + "'" + pPessoa.getCpf_user() + "'" + ","
                    + "'" + pPessoa.getEndereco_user() + "'" + ","
                    + "'" + pPessoa.getTelefone_user() + "'" + ","
                    + "'" + pPessoa.getEmail_user() + "'" + ","
                    + "'" + pPessoa.getCargo_user() + "'" + ","
                    + "'" + pPessoa.getUser_user() + "'" + ","
                    + "'" + pPessoa.getSenha_user() + "'"
                    + ");";

            return conexao.insertSQL(sql);

        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            conexao.fecharConexao();
        }
    }

    public Usuario getCadastroUsuarioDAO(int pCodigoPessoa) {
        Usuario usuario = new Usuario();
        ConexaoMySql conexao = new ConexaoMySql();

        try {

            conexao.conectar();

            String sql
                    = "SELECT nome_user,cpf_user,endereco_user,telefone_user,email_user,cargo_user,user_user,senha_user FROM cadastrousuario WHERE id_cad_user = '" + pCodigoPessoa + "'"
                    + ";";

            conexao.executarSQL(sql);

            while (conexao.getResultSet().next()) {
                usuario.setNome_user(conexao.getResultSet().getString("nome_user"));
                usuario.setCpf_user(conexao.getResultSet().getString("cpf_user"));
                usuario.setEndereco_user(conexao.getResultSet().getString("endereco_user"));
                usuario.setTelefone_user(conexao.getResultSet().getString("telefone_user"));
                usuario.setEmail_user(conexao.getResultSet().getString("email_user"));
                usuario.setCargo_user(conexao.getResultSet().getString("cargo_user"));
                usuario.setUser_user(conexao.getResultSet().getString("user_user"));
                usuario.setSenha_user(conexao.getResultSet().getString("senha_user"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexao.fecharConexao();
        }

        return usuario;

    }

    public boolean excluirDAO(int pCodigoPessoa) {

        ConexaoMySql conexao = new ConexaoMySql();

        try {

            conexao.conectar();

            String sql
                    = "DELETE FROM cadastrousuario WHERE id_cad_user = '" + pCodigoPessoa + "';";

            conexao.executarUpdateDeleteSQL(sql);

            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            conexao.fecharConexao();
        }

    }

    public boolean updateDAO(Usuario pPessoa) {
        ConexaoMySql conexao = new ConexaoMySql();

        try {

            conexao.conectar();

            String sql
                    = "UPDATE cadastrousuario SET "
                    + " nome_user = '" + pPessoa.getNome_user() + "',"
                    + " cpf_user = '" + pPessoa.getCpf_user() + "',"
                    + " endereco_user = '" + pPessoa.getEndereco_user() + "',"
                    + " telefone_user = '" + pPessoa.getTelefone_user() + "',"
                    + " email_user = '" + pPessoa.getEmail_user() + "',"
                    + " cargo_user = '" + pPessoa.getCargo_user() + "',"
                    + " user_user = '" + pPessoa.getUser_user() + "',"
                    + " senha_user= '" + pPessoa.getSenha_user() + "'"
                    + "WHERE id_cad_user='" + pPessoa.getId_cad_user() + "';";

            conexao.executarUpdateDeleteSQL(sql);

            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            conexao.fecharConexao();
        }

    }

    public Usuario getCadastroUsuarioIdUserDAO(int pCodigoPessoa) {
        Usuario usuario = new Usuario();
        ConexaoMySql conexao = new ConexaoMySql();

        try {

            conexao.conectar();

            String sql
                    = "SELECT id_cad_user,user_user,senha_user FROM cadastrousuario WHERE id_cad_user = '" + pCodigoPessoa + "'"
                    + ";";

            conexao.executarSQL(sql);

            while (conexao.getResultSet().next()) {
                usuario.setId_cad_user(conexao.getResultSet().getInt("id_cad_user"));
                usuario.setUser_user(conexao.getResultSet().getString("user_user"));
                usuario.setSenha_user(conexao.getResultSet().getString("senha_user"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexao.fecharConexao();
        }

        return usuario;

    }

    public Usuario getUserTabela(int pCodigoPessoa) {
        Usuario usuario = new Usuario();
        ConexaoMySql conexao = new ConexaoMySql();

        try {

            conexao.conectar();

            String sql
                    = "select id_cad_user, user_user from cadastrousuario where id_cad_user = '" + pCodigoPessoa + "'"
                    + ";";

            conexao.executarSQL(sql);

            while (conexao.getResultSet().next()) {
                usuario.setId_cad_user(conexao.getResultSet().getInt("id_cad_user"));
                usuario.setUser_user(conexao.getResultSet().getString("user_user"));

            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexao.fecharConexao();
        }

        return usuario;
    }

    public Usuario getUltimoUserDAO() {
        Usuario arquivo = new Usuario();
        ConexaoMySql conexao = new ConexaoMySql();

        try {

            conexao.conectar();

            String sql
                    = "SELECT id_cad_user FROM cadastrousuario ORDER BY id_cad_user DESC LIMIT 1;";
            conexao.executarSQL(sql);

            while (conexao.getResultSet().next()) {
                arquivo.setId_cad_user(conexao.getResultSet().getInt("id_cad_user"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexao.fecharConexao();
        }

        return arquivo;

    }

}
