package DAO;

import conexoes.ConexaoMySql;
import model.Acesso;

public class DAOAcesso {

    public int salvarDAO(Acesso pAcesso) {

        ConexaoMySql conexao = new ConexaoMySql();

        try {

            conexao.conectar();

            String sql = "insert into acesso(id_cad_user,"
                    + "data_acesso) \n" + "values("
                    + "'" + pAcesso.getId_cad_user()+"'" + ","
                    + "now() );";

            return conexao.insertSQL(sql);

        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            conexao.fecharConexao();
        }
    }

    public Acesso getAcessoDAO() {
        Acesso acesso = new Acesso();
        ConexaoMySql conexao = new ConexaoMySql();

        try {

            conexao.conectar();

            String sql
                    = "SELECT idAcesso,id_cad_user, data_acesso FROM acesso ORDER BY idAcesso DESC LIMIT 1;" ;
            conexao.executarSQL(sql);

            while (conexao.getResultSet().next()) {
                acesso.setIdAcesso(conexao.getResultSet().getInt("idAcesso"));
                acesso.setId_cad_user(conexao.getResultSet().getInt("id_cad_user"));
                acesso.setData_acesso(conexao.getResultSet().getString("data_acesso"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexao.fecharConexao();
        }

        return acesso;

    }

}
