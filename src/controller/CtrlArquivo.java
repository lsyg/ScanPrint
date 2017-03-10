package controller;

import DAO.DAOArquivo;
import model.Arquivo;

public class CtrlArquivo {

    public int salvarCtrl(Arquivo pArquivo) {
        return new DAOArquivo().salvarDAO(pArquivo);
    }

    public Arquivo getCtrl() {
        return new DAOArquivo().getUltimoArquivoDAO();
    }

    public Arquivo getCtrl2(int pPcodigo) {
        return new DAOArquivo().getListaArquivo(pPcodigo);
    }

}
