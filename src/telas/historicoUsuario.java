package telas;

import controller.CtrlHistoricoArquivo;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.historico;

public class historicoUsuario extends javax.swing.JPanel {

    public historicoUsuario() {
        initComponents();
        // novo
        historico historico = new historico();
        CtrlHistoricoArquivo ctrlHistorico = new CtrlHistoricoArquivo();
        ArrayList<historico> listHistorico = new ArrayList();
        listHistorico = ctrlHistorico.getHistoricoArquivoCtrl();
        DefaultTableModel dtmProdutos = (DefaultTableModel) tabelaHis.getModel();

        for (int i = 0; i < listHistorico.size(); i++) {
            Object[] dados = {listHistorico.get(i).getId_arquivo(), listHistorico.get(i).getNome_arquivo(), listHistorico.get(i).getNome_tipoArquivo(),
                listHistorico.get(i).getNome_setores(), listHistorico.get(i).getNome_user(), listHistorico.get(i).getData_info()
                + " as " + listHistorico.get(i).getHora_info()};
            dtmProdutos.addRow(dados);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaHis = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1280, 720));

        tabelaHis.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tabelaHis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Nome Arquivo", "Tipo Arquivo", "Setor Arquivo", "Usuário", "Data de Criação"
            }
        ));
        jScrollPane1.setViewportView(tabelaHis);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setText("Historico de Registro do Usuário");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaHis;
    // End of variables declaration//GEN-END:variables
}
