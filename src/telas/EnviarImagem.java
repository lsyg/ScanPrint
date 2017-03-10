
package telas;

import UTIL.ManipularImagem;
import controller.CtrlAcesso;
import controller.CtrlArquivo;
import controller.CtrlLocalInfo;
import controller.CtrlSetores;
import controller.CtrlTipoArquivo;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.Acesso;
import model.Arquivo;
import model.LocalInfo;
import model.Setores;
import model.TipoArquivo;


public class EnviarImagem extends javax.swing.JFrame {


     BufferedImage imagem;
    public EnviarImagem() {
        initComponents();
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnImagem = new javax.swing.JButton();
        boxSetores = new javax.swing.JComboBox<>();
        boxTipoArquivo = new javax.swing.JComboBox<>();
        blnEnviar = new javax.swing.JButton();
        lblImagem = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Upload de Documento");
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1280, 900));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setText("Imagem");

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setText("Setor");

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText("Tipo Arquivo");

        btnImagem.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnImagem.setText("Selecionar Imagem");
        btnImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImagemActionPerformed(evt);
            }
        });

        boxSetores.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        boxSetores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vendas", "Financeiro", "R.H", "Serviços", "T.I", "Outros", " " }));
        boxSetores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxSetoresActionPerformed(evt);
            }
        });

        boxTipoArquivo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        boxTipoArquivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NF-e", "NFs-e", "Recibo", "O.S", "Contrato", "Documento", "Outros" }));
        boxTipoArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxTipoArquivoActionPerformed(evt);
            }
        });

        blnEnviar.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        blnEnviar.setText("Salvar");
        blnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blnEnviarActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/uparquivo.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(boxSetores, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(boxTipoArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(blnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblImagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(1086, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnImagem)
                    .addComponent(jLabel2)
                    .addComponent(boxSetores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(boxTipoArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blnEnviar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblImagem, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImagemActionPerformed
        // TODO add your handling code here:
        JFileChooser fc = new JFileChooser();
        int res = fc.showOpenDialog(null);

        if (res == JFileChooser.APPROVE_OPTION) {
            File arquivo = fc.getSelectedFile();

            try {
                imagem = ManipularImagem.setImagemDimensao(arquivo.getAbsolutePath(), 1240, 720);

                lblImagem.setIcon(new ImageIcon(imagem));

            } catch (Exception ex) {
               // System.out.println(ex.printStackTrace().toString());
            }

        } else {
            JOptionPane.showMessageDialog(null, "Voce nao selecionou nenhum arquivo.");
        }
    }//GEN-LAST:event_btnImagemActionPerformed

    private void blnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blnEnviarActionPerformed
         try {
             
             
             SimpleDateFormat d = new SimpleDateFormat("yyyyMMddHHmmssSSS");
             
             
             String caminho = ("C:\\scanprint/").toString();
             
//             System.out.println(d.format(new Date())+".jpg");
             
             File outputfile = new File(caminho+d.format(new Date())+".jpg");
             ImageIO.write(imagem, "jpg", outputfile);
             JOptionPane.showMessageDialog(rootPane, "Imagem enviada com sucesso");
         } catch (IOException ex) {
             Logger.getLogger(EnviarImagem.class.getName()).log(Level.SEVERE, null, ex);
         }
         
         
          JOptionPane.showMessageDialog(null, "Salvando Servidor, ScanPrin ");
        //pega data do sistema
        SimpleDateFormat d = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        SimpleDateFormat hora = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yy");
        //fim pegar data sistema

        // importação Classes
        Arquivo arquivo = new Arquivo();
        CtrlArquivo ctrlUltimo = new CtrlArquivo();
        Arquivo ulti = ctrlUltimo.getCtrl();
        
        Setores setores = new Setores();
        TipoArquivo tipoarquivo = new TipoArquivo();
        LocalInfo localinfo = new LocalInfo();
        
        CtrlAcesso ctrlAcesso = new CtrlAcesso();
        Acesso acesso = ctrlAcesso.getCtrl();
        //fim importação classes

        //get e set dados do banco
        //arquivo
        arquivo.setNome_arquivo(d.format(new Date()));
        arquivo.setLocal_arquivo("C:\\scanprint");
        arquivo.setId_cad_user(acesso.getId_cad_user());

        //setores
        setores.setNome_setores((String) this.boxSetores.getSelectedItem());
        setores.setId_arquivo(ulti.getId_arquivo() + 1);
        //tipoarquivo
        tipoarquivo.setNome_tipoarquivo((String) this.boxTipoArquivo.getSelectedItem());
        tipoarquivo.setId_arquivo(ulti.getId_arquivo() + 1);
        //LocalInfo
        localinfo.setData_info(data.format(new Date()));
        localinfo.setHora_info(hora.format(new Date()));
        localinfo.setArquivo_id_arquivo(ulti.getId_arquivo() + 1);
        //fim get e set dados
        
        //salva info do arquivo
        CtrlArquivo ctrlArquivo = new CtrlArquivo();
        ctrlArquivo.salvarCtrl(arquivo);
        
        CtrlSetores ctrlSetores = new CtrlSetores();
        ctrlSetores.salvarCtrl(setores);
        
        CtrlTipoArquivo ctrlTipoArquivo = new CtrlTipoArquivo();
        ctrlTipoArquivo.salvarCtrl(tipoarquivo);
        
        CtrlLocalInfo ctrlLocalInfo = new CtrlLocalInfo();
        ctrlLocalInfo.salvarCtrl(localinfo);
        

        //fim salvar info do arquivo
         
         
    }//GEN-LAST:event_blnEnviarActionPerformed

    private void boxSetoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxSetoresActionPerformed
        boxSetores.getToolTipText();
        System.out.println(boxSetores.getToolTipText());
    }//GEN-LAST:event_boxSetoresActionPerformed

    private void boxTipoArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTipoArquivoActionPerformed

    }//GEN-LAST:event_boxTipoArquivoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EnviarImagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EnviarImagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EnviarImagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EnviarImagem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EnviarImagem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton blnEnviar;
    private javax.swing.JComboBox<String> boxSetores;
    private javax.swing.JComboBox<String> boxTipoArquivo;
    private javax.swing.JButton btnImagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblImagem;
    // End of variables declaration//GEN-END:variables
}
