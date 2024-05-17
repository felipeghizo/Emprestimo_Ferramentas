
package view;

import modelo.LoginPrincipal;
import java.awt.Color;
import dao.SenhaDAO;

public class Primeiro_Acesso extends javax.swing.JFrame {
    SenhaDAO setsenha = new SenhaDAO();
    public Primeiro_Acesso() {
        // Configurações do JFrame
        setTitle("Primeiro acesso");
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null); // Centraliza o JFrame na tela
        ErrorMesage.setVisible(false);
        OkMesage.setVisible(false);
        Seguir.setVisible(false);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        orangePanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        OkMesage = new javax.swing.JLabel();
        ErrorMesage = new javax.swing.JLabel();
        Seguir = new javax.swing.JToggleButton();
        Salvar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        ShowPassword = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        PasswordConfirmation = new javax.swing.JPasswordField();
        Fechar = new javax.swing.JButton();
        l_numerosorteado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        orangePanel.setBackground(new java.awt.Color(255, 149, 0));

        jPanel1.setBackground(new java.awt.Color(39, 56, 75));

        OkMesage.setForeground(new java.awt.Color(0, 255, 51));
        OkMesage.setText("Sucesso!");

        ErrorMesage.setForeground(new java.awt.Color(255, 0, 0));
        ErrorMesage.setText("Senhas não são iguais!");

        Seguir.setBackground(new java.awt.Color(107, 122, 139));
        Seguir.setForeground(new java.awt.Color(255, 255, 255));
        Seguir.setText("Seguir");
        Seguir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeguirActionPerformed(evt);
            }
        });

        Salvar.setBackground(new java.awt.Color(107, 122, 139));
        Salvar.setForeground(new java.awt.Color(255, 255, 255));
        Salvar.setText("Salvar");
        Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Confirme a senha:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Senha:");

        Password.setBackground(new java.awt.Color(107, 122, 139));
        Password.setForeground(new java.awt.Color(255, 255, 255));
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });

        ShowPassword.setBackground(new java.awt.Color(39, 56, 75));
        ShowPassword.setForeground(new java.awt.Color(255, 255, 255));
        ShowPassword.setText("Mostrar Senhas");
        ShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPasswordActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Parece que esse é seu primeiro acesso, vamos configurar sua senha:");

        PasswordConfirmation.setBackground(new java.awt.Color(107, 122, 139));
        PasswordConfirmation.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(Seguir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Salvar, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Password)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ErrorMesage)
                                            .addComponent(PasswordConfirmation, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(OkMesage))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ShowPassword)
                                .addGap(178, 178, 178))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(229, 229, 229))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ShowPassword)
                    .addComponent(PasswordConfirmation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Salvar)
                    .addComponent(ErrorMesage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OkMesage)
                    .addComponent(Seguir))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        Fechar.setBackground(new java.awt.Color(255, 149, 0));
        Fechar.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        Fechar.setForeground(new java.awt.Color(255, 255, 255));
        Fechar.setText(" X ");
        Fechar.setBorder(null);
        Fechar.setBorderPainted(false);
        Fechar.setFocusPainted(false);
        Fechar.setFocusable(false);
        Fechar.setRequestFocusEnabled(false);
        Fechar.setVerifyInputWhenFocusTarget(false);
        Fechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FecharMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                FecharMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                FecharMouseExited(evt);
            }
        });
        Fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FecharActionPerformed(evt);
            }
        });

        l_numerosorteado.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        l_numerosorteado.setForeground(new java.awt.Color(255, 255, 255));
        l_numerosorteado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_numerosorteado.setText("Olá tio Richard, Seja bem-vindo!");
        l_numerosorteado.setPreferredSize(new java.awt.Dimension(20, 26));

        javax.swing.GroupLayout orangePanelLayout = new javax.swing.GroupLayout(orangePanel);
        orangePanel.setLayout(orangePanelLayout);
        orangePanelLayout.setHorizontalGroup(
            orangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orangePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(l_numerosorteado, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orangePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 592, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        orangePanelLayout.setVerticalGroup(
            orangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orangePanelLayout.createSequentialGroup()
                .addGroup(orangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(orangePanelLayout.createSequentialGroup()
                        .addComponent(Fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 5, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orangePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(l_numerosorteado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(orangePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 590, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(orangePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarActionPerformed
        // Obtendo a senha como uma matriz de caracteres
        char[] senhaChar = Password.getPassword();
        char[] senhaConfChar = PasswordConfirmation.getPassword();
        // Convertendo a matriz de caracteres em uma string
        String senha = new String(senhaChar);
        String senhaConf = new String(senhaConfChar);
       
        LoginPrincipal login = new LoginPrincipal();
        if (login.Password(senha, senhaConf)){
           setsenha.configSenha(senha);
           OkMesage.setVisible(true);
           Seguir.setVisible(true);
        }else{
            ErrorMesage.setVisible(true); 
        }
    }//GEN-LAST:event_SalvarActionPerformed

    private void FecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FecharMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_FecharMouseClicked

    private void FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_FecharActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    private void SeguirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeguirActionPerformed
        //this.setVisible(false);
        this.setEnabled(false);
        Menu menu = new Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_SeguirActionPerformed

    private void ShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPasswordActionPerformed
        if(ShowPassword.isSelected()){
            Password.setEchoChar((char)0);
            PasswordConfirmation.setEchoChar((char)0);
        }else{
            Password.setEchoChar('*');
            PasswordConfirmation.setEchoChar('*');
        }
    }//GEN-LAST:event_ShowPasswordActionPerformed

    private void FecharMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FecharMouseEntered
        Color redColor = Color.decode("#FF2424");    
        Fechar.setBackground(redColor);        
    }//GEN-LAST:event_FecharMouseEntered

    private void FecharMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FecharMouseExited
        Color orangeColor = Color.decode("#FF9500");
        Fechar.setBackground(orangeColor); 
    }//GEN-LAST:event_FecharMouseExited

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
            java.util.logging.Logger.getLogger(Primeiro_Acesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Primeiro_Acesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Primeiro_Acesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Primeiro_Acesso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Primeiro_Acesso().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ErrorMesage;
    private javax.swing.JButton Fechar;
    private javax.swing.JLabel OkMesage;
    private javax.swing.JPasswordField Password;
    private javax.swing.JPasswordField PasswordConfirmation;
    private javax.swing.JButton Salvar;
    private javax.swing.JToggleButton Seguir;
    private javax.swing.JCheckBox ShowPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel l_numerosorteado;
    private javax.swing.JPanel orangePanel;
    // End of variables declaration//GEN-END:variables
}
