package telas;

import WWeb.webCom;
import controller.CtrlAcesso;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import model.Acesso;
import WWeb.webSem;

public class telaInicio extends javax.swing.JFrame {

    JPanel p;
    boolean visivel = true;

    public telaInicio() {

        initComponents();
        this.setLocationRelativeTo(null);
        // fazer com que a tela inicial identifique o usuário.

        CtrlAcesso ctrlAcesso = new CtrlAcesso();
        Acesso acesso = ctrlAcesso.getCtrl();

        nomeUser.setText(acesso.getData_acesso());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        selectArquivos = new javax.swing.JFileChooser();
        jMenuItem1 = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        painelHome = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        nomeUser = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        menuHome = new javax.swing.JMenuBar();
        menuInicio = new javax.swing.JMenu();
        menuInicioP = new javax.swing.JMenuItem();
        upDoc = new javax.swing.JMenuItem();
        menuCadUser = new javax.swing.JMenu();
        menuCadP = new javax.swing.JMenuItem();
        menuHisRegistro = new javax.swing.JMenu();
        menuHisP = new javax.swing.JMenuItem();

        selectArquivos.setApproveButtonToolTipText("");
        selectArquivos.setCurrentDirectory(new java.io.File("D:\\Usuario\\Documents\\NetBeansProjects\\webCam\\imagens"));
        selectArquivos.setDialogTitle(".jpg");
        selectArquivos.setFileSelectionMode(javax.swing.JFileChooser.FILES_AND_DIRECTORIES);
        selectArquivos.setToolTipText(".jpg");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Inicio");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1280, 800));

        painelHome.setBackground(new java.awt.Color(255, 255, 255));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/LogoScanPrintG.png"))); // NOI18N

        nomeUser.setText(" ");

        jLabel1.setText("Ultimo Acesso:");

        javax.swing.GroupLayout painelHomeLayout = new javax.swing.GroupLayout(painelHome);
        painelHome.setLayout(painelHomeLayout);
        painelHomeLayout.setHorizontalGroup(
            painelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelHomeLayout.createSequentialGroup()
                .addGap(371, 371, 371)
                .addComponent(logo)
                .addContainerGap(318, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelHomeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nomeUser, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        painelHomeLayout.setVerticalGroup(
            painelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelHomeLayout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                .addGroup(painelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeUser)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        menuInicio.setText("Inicio");

        menuInicioP.setText("Novo Documento");
        menuInicioP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInicioPActionPerformed(evt);
            }
        });
        menuInicio.add(menuInicioP);

        upDoc.setText("Upload de Documento");
        upDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upDocActionPerformed(evt);
            }
        });
        menuInicio.add(upDoc);

        menuHome.add(menuInicio);

        menuCadUser.setText("Cadastro Usuário");

        menuCadP.setText("Cadastro");
        menuCadP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCadPActionPerformed(evt);
            }
        });
        menuCadUser.add(menuCadP);

        menuHome.add(menuCadUser);

        menuHisRegistro.setText("Historico de Registros");

        menuHisP.setText("Historico");
        menuHisP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuHisPActionPerformed(evt);
            }
        });
        menuHisRegistro.add(menuHisP);

        menuHome.add(menuHisRegistro);

        setJMenuBar(menuHome);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuInicioPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInicioPActionPerformed

//        if (visivel == true) {
//
//            visivel = false;
//            this.setVisible(true);
//            this.setLayout(new FlowLayout());
//
//            painelHome.setVisible(false);
//            p = new webCam();
//            this.add(p);
//            this.pack();
//        }
//
//        if (visivel == false) {
//            this.remove(p);
//
//            visivel = false;
//            this.setVisible(true);
//            this.setLayout(new FlowLayout());
//
//            painelHome.setVisible(false);
//            p = new webCam();
//            this.add(p);
//            this.pack();
//
//        }
//        new telas.webUser().setVisible(true);
        webCom webCom = new webCom();
       webCom.setVisible(true);

    }//GEN-LAST:event_menuInicioPActionPerformed

    private void menuCadPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCadPActionPerformed
        if (visivel == true) {
            visivel = false;
            this.setVisible(true);
            this.setLayout(new FlowLayout());

            painelHome.setVisible(false);
            p = new cadastroUsuario();
            this.add(p);
            this.pack();

        }

        if (visivel == false) {
            this.remove(p);

            visivel = false;
            this.setVisible(true);
            this.setLayout(new FlowLayout());

            painelHome.setVisible(false);
            p = new cadastroUsuario();
            this.add(p);
            this.pack();

        }

    }//GEN-LAST:event_menuCadPActionPerformed

    private void menuHisPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuHisPActionPerformed

        if (visivel == true) {
            visivel = false;
            this.setVisible(true);
            this.setLayout(new FlowLayout());

            painelHome.setVisible(false);
            p = new historicoUsuario();
            this.add(p);
            this.pack();

        }

        if (visivel == false) {
            this.remove(p);

            visivel = false;
            this.setVisible(true);
            this.setLayout(new FlowLayout());

            painelHome.setVisible(false);
            p = new historicoUsuario();
            this.add(p);
            this.pack();

        }


    }//GEN-LAST:event_menuHisPActionPerformed

    private void upDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upDocActionPerformed
        new EnviarImagem().setVisible(true);

    }//GEN-LAST:event_upDocActionPerformed

    public static void main(String args[]) {
        new telaInicio().setVisible(true);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel logo;
    private javax.swing.JMenuItem menuCadP;
    private javax.swing.JMenu menuCadUser;
    private javax.swing.JMenuItem menuHisP;
    private javax.swing.JMenu menuHisRegistro;
    private javax.swing.JMenuBar menuHome;
    private javax.swing.JMenu menuInicio;
    private javax.swing.JMenuItem menuInicioP;
    private javax.swing.JLabel nomeUser;
    private javax.swing.JPanel painelHome;
    private javax.swing.JFileChooser selectArquivos;
    private javax.swing.JMenuItem upDoc;
    // End of variables declaration//GEN-END:variables
}
