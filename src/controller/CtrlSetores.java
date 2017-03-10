package controller;

import DAO.DAOSetores;
import model.Setores;


public class CtrlSetores {
            public int salvarCtrl(Setores pSetores) {
        return new DAOSetores().salvarDAO(pSetores);
    }
            
            
    public Setores getCtrl2(int pPcodigo){
        return new DAOSetores().getListaSetores(pPcodigo);
    }            
}
