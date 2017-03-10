package DAO;

import conexoes.ConexaoMySql;
import model.TipoArquivo;

public class DAOTipoArquivo {

    public int salvarDAO(TipoArquivo pTipoArquivo) {

        ConexaoMySql conexao = new ConexaoMySql();

        try {

            conexao.conectar();

            String sql = "insert into tipoarquivo(nome_tipoarquivo,"
                    + "arquivo_id_arquivo) \n" + "values("
                    + "'" + pTipoArquivo.getNome_tipoarquivo() + "'" + ","
                    + "'" + pTipoArquivo.getId_arquivo() + "'"
                    + ");";

            return conexao.insertSQL(sql);

        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            conexao.fecharConexao();
        }
    }

    
        public TipoArquivo getListaTipoArquivo(int pCodigoTipoArquivo) {
        TipoArquivo tipoarquivo = new TipoArquivo();
        ConexaoMySql conexao = new ConexaoMySql();

        try {

            conexao.conectar();

            String sql
                    = "select * from tipoarquivo where id_tipoarquivo ='" + pCodigoTipoArquivo + "'"
                    + ";";

            conexao.executarSQL(sql);

            while (conexao.getResultSet().next()) {
                tipoarquivo.setId_tipoArquivo(conexao.getResultSet().getInt("id_tipoarquivo"));
                tipoarquivo.setNome_tipoarquivo(conexao.getResultSet().getString("nome_tipoArquivo"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conexao.fecharConexao();
        }

        return tipoarquivo;

    }

    
    
    
}
