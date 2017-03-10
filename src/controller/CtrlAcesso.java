package controller;

import DAO.DAOAcesso;
import model.Acesso;

public class CtrlAcesso {
        public int salvarCtrl(Acesso pAcesso) {
        return new DAOAcesso().salvarDAO(pAcesso);
    }
        
        public Acesso getCtrl(){
        return new DAOAcesso().getAcessoDAO();
    }
        
}
