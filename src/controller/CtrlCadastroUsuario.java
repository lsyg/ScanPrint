package controller;

import DAO.DAOCadastroUsuario;
import model.Usuario;

public class CtrlCadastroUsuario {

    public boolean loginCtrl(Usuario pPessoa) {
        return new DAOCadastroUsuario().loginUsuario(pPessoa);
    }

    public int salvarCtrl(Usuario pPessoa) {
        return new DAOCadastroUsuario().salvarDAO(pPessoa);
    }

    public Usuario getCtrl(int pPcodigo) {
        return new DAOCadastroUsuario().getCadastroUsuarioDAO(pPcodigo);
    }

    public boolean excluirCtrl(int pCodigoPessoa) {
        return new DAOCadastroUsuario().excluirDAO(pCodigoPessoa);
    }

    public boolean updateCtrl(Usuario pPessoa) {
        return new DAOCadastroUsuario().updateDAO(pPessoa);
    }

    public Usuario getCtrl2(int pPcodigo) {
        return new DAOCadastroUsuario().getCadastroUsuarioIdUserDAO(pPcodigo);
    }

    public Usuario tabelaUser(int pPcodigo) {
        return new DAOCadastroUsuario().getUserTabela(pPcodigo);
    }

    public Usuario getUltimo() {
        return new DAOCadastroUsuario().getUltimoUserDAO();
    }

}
