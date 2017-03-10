package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.historico;

public class DAOHistoricoArquivo {
    
    public static ArrayList < historico > getHistoricoArquivo() {
        ConexaoMySql conexao = new ConexaoMySql();
         ArrayList<historico> listHistorico = new ArrayList();

        try {

            conexao.conectar();

            String sql
                    = "SELECT * FROM scanprint.historico_registro_usuario;";

            conexao.executarSQL(sql);

            while (conexao.getResultSet().next()) {
                historico historico = new historico();
                historico.setId_arquivo(conexao.getResultSet().getInt("id_arquivo"));
                historico.setNome_arquivo(conexao.getResultSet().getString("nome_arquivo"));
                historico.setNome_tipoArquivo(conexao.getResultSet().getString("nome_tipoArquivo"));
                historico.setNome_setores(conexao.getResultSet().getString("nome_setores"));
                historico.setNome_user(conexao.getResultSet().getString("nome_user"));
                historico.setData_info(conexao.getResultSet().getString("data_info"));
                historico.setHora_info(conexao.getResultSet().getString("hora_info"));
                
               listHistorico.add(historico);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexao.fecharConexao();
        }
        return listHistorico;
    }
}
