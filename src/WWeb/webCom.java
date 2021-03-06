package WWeb;

import controller.CtrlAcesso;
import controller.CtrlArquivo;
import controller.CtrlLocalInfo;
import controller.CtrlSetores;
import controller.CtrlTipoArquivo;
import java.awt.AWTKeyStroke;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.KeyboardFocusManager;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Acesso;
import model.Arquivo;
import model.LocalInfo;
import model.Setores;
import model.TipoArquivo;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.highgui.Highgui;
import org.opencv.highgui.VideoCapture;


public class webCom extends javax.swing.JDialog {



    private DaemonThread myThread = null;
    int count = 0;
    VideoCapture webSource = null;

    Mat frame = new Mat();
    MatOfByte mem = new MatOfByte();

    class DaemonThread implements Runnable {

        protected volatile boolean runnable = false;

        @Override
        public void run() {
            synchronized (this) {
                while (runnable) {
                    if (webSource.grab()) {
                        try {
                            webSource.retrieve(frame);
                            Highgui.imencode(".bmp", frame, mem);
//                            Highgui.imencode(".png", frame, mem);
                            Image im = ImageIO.read(new ByteArrayInputStream(mem.toArray()));

                            BufferedImage buff = (BufferedImage) im;
                            Graphics g = telaWeb.getGraphics();

                            if (g.drawImage(buff, 0, 0, getWidth(), getHeight() - 150, 0, 0, buff.getWidth(), buff.getHeight(), null)) {
                                if (runnable == false) {
                                    System.out.println("Going to wait()");
                                    this.wait();
                                }
                            }
                        } catch (Exception ex) {
                            // System.out.println("Error" + ex.getMessage());
                        }
                    }
                }
            }
        }
    }

    public webCom() {



        initComponents();
        setModal(true);
        setLocationRelativeTo(null);


        DefaultTableModel modelo = new DefaultTableModel() {
            public boolean isCellEditable(int linha, int coluna) {
                return false;// retornando false para o usuario nao poder editar nada na tabela
            }
        };

        HashSet conj = new HashSet(this.getFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS));
        conj.add(AWTKeyStroke.getAWTKeyStroke(KeyEvent.VK_ENTER, 0));
        this.setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, conj);


        setResizable(false);
        this.addComponentListener(new ComponentAdapter() {
            public void componentMoved(ComponentEvent e) {
                setEnabled(false);
                setEnabled(true);
            }
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        caminhoArquivo = new javax.swing.JFileChooser();
        icon = new javax.swing.JLabel();
        btnSair = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnParar = new javax.swing.JButton();
        btnIniciar = new javax.swing.JButton();
        telaWeb = new javax.swing.JPanel();
        setor = new javax.swing.JLabel();
        boxSetores = new javax.swing.JComboBox<>();
        tipoArquivo = new javax.swing.JLabel();
        boxTipoArquivo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Controle de Vendas");

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/scanprintlogoP.png"))); // NOI18N

        btnSair.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        btnSalvar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnParar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnParar.setText("Parar");
        btnParar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPararActionPerformed(evt);
            }
        });

        btnIniciar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        telaWeb.setBackground(new java.awt.Color(255, 255, 255));
        telaWeb.setPreferredSize(new java.awt.Dimension(640, 480));

        org.jdesktop.layout.GroupLayout telaWebLayout = new org.jdesktop.layout.GroupLayout(telaWeb);
        telaWeb.setLayout(telaWebLayout);
        telaWebLayout.setHorizontalGroup(
            telaWebLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 1012, Short.MAX_VALUE)
        );
        telaWebLayout.setVerticalGroup(
            telaWebLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 659, Short.MAX_VALUE)
        );

        setor.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        setor.setText("Setor");

        boxSetores.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        boxSetores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vendas", "Financeiro", "R.H", "Serviços", "T.I", "Outros", " " }));
        boxSetores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxSetoresActionPerformed(evt);
            }
        });

        tipoArquivo.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        tipoArquivo.setText("Tipo Arquivo");

        boxTipoArquivo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        boxTipoArquivo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NF-e", "NFs-e", "Recibo", "O.S", "Contrato", "Documento", "Outros" }));
        boxTipoArquivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxTipoArquivoActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(telaWeb, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 1012, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(icon)
                        .add(10, 10, 10))
                    .add(layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(setor)
                            .add(boxSetores, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(tipoArquivo)
                            .add(boxTipoArquivo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 91, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(btnIniciar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 79, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(btnSalvar, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(btnParar, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(btnSair, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 79, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(new java.awt.Component[] {boxSetores, boxTipoArquivo, btnIniciar, btnParar, btnSair, btnSalvar, setor, tipoArquivo}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(telaWeb, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 659, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(layout.createSequentialGroup()
                        .add(icon)
                        .add(18, 18, 18)
                        .add(setor)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(boxSetores, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(tipoArquivo)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(boxTipoArquivo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(67, 67, 67)
                        .add(btnIniciar)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(btnSalvar)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(btnParar)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(btnSair)))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        layout.linkSize(new java.awt.Component[] {boxSetores, boxTipoArquivo, btnIniciar, btnParar, btnSair, btnSalvar, setor, tipoArquivo}, org.jdesktop.layout.GroupLayout.VERTICAL);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        //setTitle("Controle de Vendas");
        iniciarWebCam();
        pararWebCam();
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        String caminho = ("C:\\scanprint/").toString();
        SimpleDateFormat d = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        
//        File outputfile = new File(caminho+d.format(new Date())+".jpg");
        Highgui.imwrite(caminho+d.format(new Date()) + ".jpg", frame);
        
        
        
        int returnVal = caminhoArquivo.showSaveDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = caminhoArquivo.getSelectedFile();
            Highgui.imwrite(file.getPath() + ".jpg", frame);
        } else {
            System.out.println("Processo de Salvar Cancelado pelo Usuário");
        }
        
                JOptionPane.showMessageDialog(null, "Salvando Servidor, ScanPrin ");
        //pega data do sistema
        
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
        arquivo.setLocal_arquivo("C:\\scanprint/");
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
        
        
        
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnPararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPararActionPerformed
        pararWebCam();
    }//GEN-LAST:event_btnPararActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        iniciarWebCam();
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void boxSetoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxSetoresActionPerformed
        boxSetores.getToolTipText();
        System.out.println(boxSetores.getToolTipText());
    }//GEN-LAST:event_boxSetoresActionPerformed

    private void boxTipoArquivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTipoArquivoActionPerformed

    }//GEN-LAST:event_boxTipoArquivoActionPerformed

    public void iniciarWebCam() {
        webSource = new VideoCapture(0);
        myThread = new webCom.DaemonThread();
        Thread t = new Thread(myThread);
        t.setDaemon(true);
        myThread.runnable = true;
        t.start();
        btnIniciar.setEnabled(false);  //botão Iniciar
        btnParar.setEnabled(true);  // botão Parar
    }

    public void pararWebCam() {
        myThread.runnable = false;
        btnParar.setEnabled(false);
        btnIniciar.setEnabled(true);

        webSource.release();
    }

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
            java.util.logging.Logger.getLogger(webCom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(webCom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(webCom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(webCom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new webCom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxSetores;
    private javax.swing.JComboBox<String> boxTipoArquivo;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnParar;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JFileChooser caminhoArquivo;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel setor;
    private javax.swing.JPanel telaWeb;
    private javax.swing.JLabel tipoArquivo;
    // End of variables declaration//GEN-END:variables

}
