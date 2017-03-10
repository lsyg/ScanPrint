package DAO;

import conexoes.ConexaoMySql;
import model.Setores;

public class DAOSetores {

    public int salvarDAO(Setores pSetores) {

        ConexaoMySql conexao = new ConexaoMySql();

        try {

            conexao.conectar();

            String sql = "insert into setores(nome_setores,"
                    + "arquivo_id_arquivo) \n" + "values("
                    + "'" + pSetores.getNome_setores() + "'" + ","
                    + "'" + pSetores.getId_arquivo() + "'"
                    + ");";

            return conexao.insertSQL(sql);

        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            conexao.fecharConexao();
        }
    }

    public Setores getListaSetores(int pCodigoSetores) {
        Setores setores = new Setores();
        ConexaoMySql conexao = new ConexaoMySql();

        try {

            conexao.conectar();

            String sql
                    = "select * from setores where id_setores ='" + pCodigoSetores + "'"
                    + ";";

            conexao.executarSQL(sql);

            while (conexao.getResultSet().next()) {
                setores.setId_setores(conexao.getResultSet().getInt("id_setores"));
                setores.setNome_setores(conexao.getResultSet().getString("nome_setores"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexao.fecharConexao();
        }

        return setores;

    }

}
