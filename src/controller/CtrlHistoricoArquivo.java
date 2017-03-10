package controller;

import DAO.DAOHistoricoArquivo;
import java.util.ArrayList;
import model.historico;
import telas.historicoUsuario;

public class CtrlHistoricoArquivo {

    public ArrayList<historico> getHistoricoArquivoCtrl() {
        return new DAOHistoricoArquivo().getHistoricoArquivo();
    }
}
