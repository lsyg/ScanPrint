package DAO;

import conexoes.ConexaoMySql;
import model.Arquivo;

public class DAOArquivo {

    public int salvarDAO(Arquivo pArquivo) {

        ConexaoMySql conexao = new ConexaoMySql();

        try {

            conexao.conectar();

            String sql = "insert into arquivo(nome_arquivo,local_arquivo, "
                    + "cadastrousuario_id_cad_user) \n" + "values("
                    + "'" + pArquivo.getNome_arquivo() + "'" + ","
                    + "'" + pArquivo.getLocal_arquivo() + "',"
                    + "'" + pArquivo.getId_cad_user() + "'"
                    + ");";

            return conexao.insertSQL(sql);

        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            conexao.fecharConexao();
        }
    }
    
    public Arquivo getUltimoArquivoDAO() {
        Arquivo arquivo = new Arquivo();
        ConexaoMySql conexao = new ConexaoMySql();

        try {

            conexao.conectar();

            String sql
                    = "SELECT id_arquivo FROM arquivo ORDER BY id_arquivo DESC LIMIT 1;" ;
            conexao.executarSQL(sql);

            while (conexao.getResultSet().next()) {
                arquivo.setId_arquivo(conexao.getResultSet().getInt("id_arquivo"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexao.fecharConexao();
        }

        return arquivo;

    }

    public Arquivo getListaArquivo(int pCodigoArquivo) {
        Arquivo arquivo = new Arquivo();
        ConexaoMySql conexao = new ConexaoMySql();

        try {

            conexao.conectar();

            String sql
                    = "select * from  arquivo where id_arquivo ='" + pCodigoArquivo + "'"
                    + ";";

            conexao.executarSQL(sql);

            while (conexao.getResultSet().next()) {
                arquivo.setId_arquivo(conexao.getResultSet().getInt("id_arquivo"));
                arquivo.setNome_arquivo(conexao.getResultSet().getString("nome_arquivo"));
                arquivo.setLocal_arquivo(conexao.getResultSet().getString("local_arquivo"));
                arquivo.setId_cad_user(conexao.getResultSet().getInt("cadastrousuario_id_cad_user"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexao.fecharConexao();
        }

        return arquivo;

    }

    
    
}
