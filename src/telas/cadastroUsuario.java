package telas;

import controller.CtrlCadastroUsuario;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Usuario;

public class cadastroUsuario extends javax.swing.JPanel {


    public cadastroUsuario() {
        initComponents();
        cadPainel1.setVisible(false);
        cadPainel2.setVisible(true);
        
        Usuario usuario = new Usuario();
        CtrlCadastroUsuario ctrlUltimo = new CtrlCadastroUsuario();
        Usuario ulti = ctrlUltimo.getUltimo();

        DefaultTableModel dtmProdutos = (DefaultTableModel) tabelaUsuarios.getModel();
        int i = 1;
        
        
        CtrlCadastroUsuario ctrlPessoa = new CtrlCadastroUsuario();

        usuario.setId_cad_user(ulti.getId_cad_user());
                
        while (i <= ulti.getId_cad_user()) {
       
        Usuario usuario1 = ctrlPessoa.getCtrl(i);
        
        Object[] dados = {i, usuario1.getUser_user()};

        
            dtmProdutos.addRow(dados);
            i++;
        
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cadPainel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cadEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cadCargo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cadUser = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cadNome = new javax.swing.JTextField();
        cadCPF = new javax.swing.JTextField();
        cadEndereco = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cadTel = new javax.swing.JTextField();
        cadSenha = new javax.swing.JPasswordField();
        jbtSalvar = new javax.swing.JButton();
        jbtnExcluir = new javax.swing.JButton();
        jbtnAtualizar = new javax.swing.JButton();
        cadLimparCapos = new javax.swing.JButton();
        cadPainel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaUsuarios = new javax.swing.JTable();
        jbtnExibir = new javax.swing.JButton();
        cadId = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        cadNovoUsuario = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/cadastro.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(19, 11, 100, 30);

        cadPainel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel3.setText("CPF");

        cadEmail.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        cadEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadEmailActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel4.setText("Endereço");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        cadCargo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel5.setText("Telefone");

        cadUser.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setText("Email");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel7.setText("Cargo");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel8.setText("Usuário");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel11.setText("Tela de Usuário");

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setText("Senha");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        cadNome.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        cadNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadNomeActionPerformed(evt);
            }
        });

        cadCPF.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        cadEndereco.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel12.setText("Nome");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        cadTel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        cadSenha.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        jbtSalvar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jbtSalvar.setText("Salvar Novo Usuário");
        jbtSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSalvarActionPerformed(evt);
            }
        });

        jbtnExcluir.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jbtnExcluir.setText("Excluir");
        jbtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExcluirActionPerformed(evt);
            }
        });

        jbtnAtualizar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jbtnAtualizar.setText("Atualizar Dados");
        jbtnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAtualizarActionPerformed(evt);
            }
        });

        cadLimparCapos.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        cadLimparCapos.setText("Limpar Campos");
        cadLimparCapos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadLimparCaposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cadPainel1Layout = new javax.swing.GroupLayout(cadPainel1);
        cadPainel1.setLayout(cadPainel1Layout);
        cadPainel1Layout.setHorizontalGroup(
            cadPainel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadPainel1Layout.createSequentialGroup()
                .addGroup(cadPainel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cadPainel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(cadPainel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(cadPainel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cadEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cadEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cadNome, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cadCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cadUser, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cadSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(cadPainel1Layout.createSequentialGroup()
                                .addComponent(jbtnExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbtnAtualizar)))
                        .addGap(14, 14, 14)
                        .addGroup(cadPainel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(cadPainel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cadCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cadTel, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(cadPainel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cadLimparCapos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtSalvar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jLabel11))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        cadPainel1Layout.setVerticalGroup(
            cadPainel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadPainel1Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(cadPainel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(cadPainel1Layout.createSequentialGroup()
                        .addGroup(cadPainel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cadPainel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel12))
                            .addComponent(cadNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(cadPainel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cadPainel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel4))
                            .addComponent(cadEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(cadPainel1Layout.createSequentialGroup()
                        .addComponent(cadLimparCapos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtSalvar)))
                .addGap(3, 3, 3)
                .addGroup(cadPainel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cadPainel1Layout.createSequentialGroup()
                        .addGroup(cadPainel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(cadPainel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6))
                            .addGroup(cadPainel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(cadEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(cadPainel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cadCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))))
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cadPainel1Layout.createSequentialGroup()
                        .addGroup(cadPainel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cadCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(cadPainel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5)
                    .addComponent(cadTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cadPainel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(cadPainel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnExcluir)
                    .addComponent(jbtnAtualizar))
                .addContainerGap(152, Short.MAX_VALUE))
        );

        cadPainel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cadCargo, cadEmail, cadEndereco, cadNome, cadSenha, cadUser});

        add(cadPainel1);
        cadPainel1.setBounds(400, 140, 861, 450);

        cadPainel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel10.setText("Usuários");

        tabelaUsuarios.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        tabelaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Usuário"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaUsuarios);

        javax.swing.GroupLayout cadPainel2Layout = new javax.swing.GroupLayout(cadPainel2);
        cadPainel2.setLayout(cadPainel2Layout);
        cadPainel2Layout.setHorizontalGroup(
            cadPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadPainel2Layout.createSequentialGroup()
                .addGroup(cadPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cadPainel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel10))
                    .addGroup(cadPainel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        cadPainel2Layout.setVerticalGroup(
            cadPainel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cadPainel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(cadPainel2);
        cadPainel2.setBounds(10, 100, 370, 610);

        jbtnExibir.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jbtnExibir.setText("Exibir Usuário");
        jbtnExibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExibirActionPerformed(evt);
            }
        });
        add(jbtnExibir);
        jbtnExibir.setBounds(160, 50, 129, 27);

        cadId.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        add(cadId);
        cadId.setBounds(70, 50, 69, 30);

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel13.setText("ID");
        add(jLabel13);
        jLabel13.setBounds(30, 50, 20, 18);

        cadNovoUsuario.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        cadNovoUsuario.setText("Cadastrar Novo Usuário");
        cadNovoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadNovoUsuarioActionPerformed(evt);
            }
        });
        add(cadNovoUsuario);
        cadNovoUsuario.setBounds(400, 50, 201, 27);
    }// </editor-fold>//GEN-END:initComponents

    private void cadNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadNomeActionPerformed

    }//GEN-LAST:event_cadNomeActionPerformed

    private void cadEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadEmailActionPerformed

    }//GEN-LAST:event_cadEmailActionPerformed

    private void jbtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSalvarActionPerformed

        Usuario usuario = new Usuario();
        CtrlCadastroUsuario ctrlPessoa = new CtrlCadastroUsuario();
        usuario.setNome_user(cadNome.getText());
        usuario.setCpf_user(cadCPF.getText());
        usuario.setEndereco_user(cadEndereco.getText());
        usuario.setTelefone_user(cadTel.getText());
        usuario.setEmail_user(cadEmail.getText());
        usuario.setCargo_user(cadCargo.getText());
        usuario.setUser_user(cadUser.getText());
        usuario.setSenha_user(cadSenha.getText());

        ctrlPessoa.salvarCtrl(usuario);

        JOptionPane.showMessageDialog(this, "Usuário cadastrado com sucesso!");

        cadNome.setText("");
        cadCPF.setText("");
        cadEndereco.setText("");
        cadTel.setText("");
        cadEmail.setText("");
        cadId.setText("");
        cadCargo.setText("");
        cadUser.setText("");
        cadSenha.setText("");


    }//GEN-LAST:event_jbtSalvarActionPerformed

    private void jbtnExibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExibirActionPerformed
        cadLimparCapos.setVisible(false);
        jbtSalvar.setVisible(false);

        cadPainel1.setVisible(true);

        CtrlCadastroUsuario ctrlPessoa = new CtrlCadastroUsuario();

        Usuario usuario = ctrlPessoa.getCtrl(Integer.parseInt(cadId.getText()));

        cadNome.setText(usuario.getNome_user());
        cadCPF.setText(usuario.getCpf_user());
        cadEndereco.setText(usuario.getEndereco_user());
        cadTel.setText(usuario.getTelefone_user());
        cadEmail.setText(usuario.getEmail_user());
        cadCargo.setText(usuario.getCargo_user());
        cadUser.setText(usuario.getUser_user());
        cadSenha.setText(usuario.getSenha_user());

//        

    }//GEN-LAST:event_jbtnExibirActionPerformed

    private void jbtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExcluirActionPerformed
        JOptionPane.showMessageDialog(this, "O Usuário que já digitalizou documento, não poderá ser excluido");
        
        CtrlCadastroUsuario ctrlPessoa = new CtrlCadastroUsuario();

        boolean exluiu = ctrlPessoa.excluirCtrl(Integer.parseInt(cadId.getText()));

        if (exluiu) {
//            JOptionPane.showMessageDialog(this, "Excluido");
        }

    }//GEN-LAST:event_jbtnExcluirActionPerformed

    private void jbtnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAtualizarActionPerformed
        CtrlCadastroUsuario ctrlPessoa = new CtrlCadastroUsuario();

        Usuario usuario = new Usuario();

        usuario.setId_cad_user(Integer.parseInt(cadId.getText()));
        usuario.setNome_user(cadNome.getText());
        usuario.setCpf_user(cadCPF.getText());
        usuario.setEndereco_user(cadEndereco.getText());
        usuario.setTelefone_user(cadTel.getText());
        usuario.setEmail_user(cadEmail.getText());
        usuario.setCargo_user(cadCargo.getText());
        usuario.setUser_user(cadUser.getText());
        usuario.setSenha_user(cadSenha.getText());

        boolean atualizou = ctrlPessoa.updateCtrl(usuario);

        if (atualizou) {
            JOptionPane.showMessageDialog(this, "Atualizou");
        }
        cadId.setText("");
        cadNome.setText("");
        cadCPF.setText("");
        cadEndereco.setText("");
        cadTel.setText("");
        cadEmail.setText("");
        cadCargo.setText("");
        cadUser.setText("");
        cadSenha.setText("");


    }//GEN-LAST:event_jbtnAtualizarActionPerformed

    private void cadNovoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadNovoUsuarioActionPerformed
        cadPainel1.setVisible(true);
        cadLimparCapos.setVisible(true);
        jbtSalvar.setVisible(true);

        cadNome.setText("");
        cadCPF.setText("");
        cadEndereco.setText("");
        cadTel.setText("");
        cadEmail.setText("");
        cadId.setText("");
        cadUser.setText("");
        cadCargo.setText("");
        cadSenha.setText("");
    }//GEN-LAST:event_cadNovoUsuarioActionPerformed

    private void cadLimparCaposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadLimparCaposActionPerformed
        cadNome.setText("");
        cadCPF.setText("");
        cadEndereco.setText("");
        cadTel.setText("");
        cadEmail.setText("");
        cadCargo.setText("");
        cadId.setText("");
        cadUser.setText("");
        cadSenha.setText("");
    }//GEN-LAST:event_cadLimparCaposActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cadCPF;
    private javax.swing.JTextField cadCargo;
    private javax.swing.JTextField cadEmail;
    private javax.swing.JTextField cadEndereco;
    private javax.swing.JTextField cadId;
    private javax.swing.JButton cadLimparCapos;
    private javax.swing.JTextField cadNome;
    private javax.swing.JButton cadNovoUsuario;
    private javax.swing.JPanel cadPainel1;
    private javax.swing.JPanel cadPainel2;
    private javax.swing.JPasswordField cadSenha;
    private javax.swing.JTextField cadTel;
    private javax.swing.JTextField cadUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtSalvar;
    private javax.swing.JButton jbtnAtualizar;
    private javax.swing.JButton jbtnExcluir;
    private javax.swing.JButton jbtnExibir;
    private javax.swing.JTable tabelaUsuarios;
    // End of variables declaration//GEN-END:variables
}
