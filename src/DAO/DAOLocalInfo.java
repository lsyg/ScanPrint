package DAO;

import conexoes.ConexaoMySql;
import model.LocalInfo;


public class DAOLocalInfo {
    
    
    
        public int salvarDAO(LocalInfo pLocalInfo) {

        ConexaoMySql conexao = new ConexaoMySql();

        try {

            conexao.conectar();

            String sql = "insert into user_local_info(arquivo_id_arquivo,"
                    + "data_info, hora_info) \n" + "values("
                    + "'" + pLocalInfo.getArquivo_id_arquivo()+ "'" + ","
                    + "'" + pLocalInfo.getData_info()+ "',"
                    + "'" + pLocalInfo.getHora_info()+ "'"
                    + ");";

            return conexao.insertSQL(sql);

        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            conexao.fecharConexao();
        }
    }

        public LocalInfo getListaLocalInfo(int pCodigoLocalInfo) {
        LocalInfo localinfo = new LocalInfo();
        ConexaoMySql conexao = new ConexaoMySql();

        try {

            conexao.conectar();

            String sql
                    = "select * from  user_local_info where id_local_info ='" + pCodigoLocalInfo + "'"
                    + ";";

            conexao.executarSQL(sql);

            while (conexao.getResultSet().next()) {
                localinfo.setId_user_local_info(conexao.getResultSet().getInt("id_local_info"));
                localinfo.setData_info(conexao.getResultSet().getString("data_info"));
                localinfo.setHora_info(conexao.getResultSet().getString("hora_info"));
                
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexao.fecharConexao();
        }

        return localinfo;

    }
   
    
    
    
}
