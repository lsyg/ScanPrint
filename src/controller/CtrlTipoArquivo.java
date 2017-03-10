package controller;

import DAO.DAOTipoArquivo;
import model.TipoArquivo;

public class CtrlTipoArquivo {

    public int salvarCtrl(TipoArquivo pTipoArquivo) {
        return new DAOTipoArquivo().salvarDAO(pTipoArquivo);
    }

    public TipoArquivo getCtrl2(int pPcodigo) {
        return new DAOTipoArquivo().getListaTipoArquivo(pPcodigo);
    }

}
