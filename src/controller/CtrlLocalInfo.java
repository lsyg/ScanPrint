package controller;

import DAO.DAOLocalInfo;
import model.LocalInfo;

public class CtrlLocalInfo {

    public int salvarCtrl(LocalInfo pLocalInfo) {
        return new DAOLocalInfo().salvarDAO(pLocalInfo);
    }

       public LocalInfo getCtrl2(int pPcodigo) {
        return new DAOLocalInfo().getListaLocalInfo(pPcodigo);
    }
    
    
}
