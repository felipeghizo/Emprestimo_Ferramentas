package View;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        atualizarData();  // Chamando o método para exibir a data inicial
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        l_numerosorteado1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jMenuItem1 = new javax.swing.JMenuItem();
        l_numerosorteado2 = new javax.swing.JLabel();
        Ferramentas = new javax.swing.JButton();
        Emprestimos = new javax.swing.JButton();
        Amigos = new javax.swing.JButton();
        Data = new javax.swing.JLabel();
        Fechar = new javax.swing.JButton();
        Relatorio = new javax.swing.JButton();

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel4.setText("Nome:");

        jLabel5.setText("Marca:");

        l_numerosorteado1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        l_numerosorteado1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_numerosorteado1.setText("Cadastro de nova ferramenta");
        l_numerosorteado1.setPreferredSize(new java.awt.Dimension(20, 26));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Parece que esse é seu primeiro acesso, vamos configurar sua senha:");

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel7.setText("Custo:");

        jButton2.setText("Salvar");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        l_numerosorteado2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        l_numerosorteado2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l_numerosorteado2.setText("Gerenciador de empréstimos do Richard");
        l_numerosorteado2.setPreferredSize(new java.awt.Dimension(20, 26));

        Ferramentas.setText("Ferramentas");
        Ferramentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FerramentasActionPerformed(evt);
            }
        });

        Emprestimos.setText("Emprestimos");
        Emprestimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmprestimosActionPerformed(evt);
            }
        });

        Amigos.setText("Amigos");
        Amigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmigosActionPerformed(evt);
            }
        });

        Data.setText("Data");

        Fechar.setText("Fechar");
        Fechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FecharMouseClicked(evt);
            }
        });

        Relatorio.setText("Relarório");
        Relatorio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RelatorioMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_numerosorteado2, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
                .addGap(3, 3, 3))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(Fechar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Data))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Amigos, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(Ferramentas, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Emprestimos, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(Relatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l_numerosorteado2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Emprestimos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ferramentas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Amigos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Relatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Data)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Fechar)
                        .addGap(14, 14, 14))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    // Método para acessar a aba de amigos:
    private void AmigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmigosActionPerformed
        Amigo amigo = new Amigo();
        amigo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AmigosActionPerformed

    // Método para acessar a aba de ferramentas:
    private void FerramentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FerramentasActionPerformed
        Ferramenta ferramenta = new Ferramenta();
        ferramenta.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_FerramentasActionPerformed

    // Método para acessar a aba empréstimo:
    private void EmprestimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmprestimosActionPerformed
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_EmprestimosActionPerformed
    
    // Método para fechar o programa:
    private void FecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FecharMouseClicked
        System.exit(0);
    }//GEN-LAST:event_FecharMouseClicked

    private void RelatorioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RelatorioMouseClicked
        Relatorio relatorio = new Relatorio();
        relatorio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RelatorioMouseClicked
    
    // Método para atualizar a data
    private void atualizarData() {
        // Obtendo a data atual do dispositivo local
        Date dataAtual = new Date();

        // Formatando a data para exibição
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = formatoData.format(dataAtual);

        // Exibindo a data no JLabel
        Data.setText("Data: " + dataFormatada);
        Data.setBounds(10, 10, 200, 20); // Definindo a posição e tamanho do JLabel
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Amigos;
    private javax.swing.JLabel Data;
    private javax.swing.JButton Emprestimos;
    private javax.swing.JButton Fechar;
    private javax.swing.JButton Ferramentas;
    private javax.swing.JButton Relatorio;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel l_numerosorteado1;
    private javax.swing.JLabel l_numerosorteado2;
    // End of variables declaration//GEN-END:variables
}
