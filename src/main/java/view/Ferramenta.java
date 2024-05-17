package view;
import java.awt.Color;
import javax.swing.JOptionPane;
import dao.FerramentaDAO;


public class Ferramenta extends javax.swing.JFrame {
    
    // Cores usadas:
    Color orangeColor = Color.decode("#FF9500");
    Color redColor = Color.decode("#FF2424");
    Color whiteColor = Color.decode("#6E6E6E");
    FerramentaDAO ferramenta = new FerramentaDAO();
    
    public Ferramenta() {
        // Configurações do JFrame
        this.setTitle("Ferramenta");
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null); // Centraliza o JFrame na tela
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Fechar = new javax.swing.JButton();
        Voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 149, 0));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Ferramentas");

        jPanel1.setBackground(new java.awt.Color(38, 55, 73));

        jButton1.setBackground(new java.awt.Color(107, 122, 139));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add ferramenta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(107, 122, 139));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Gerencia ferramenta");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(107, 122, 139));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Relatorio de ferramentas");

        jButton4.setBackground(new java.awt.Color(107, 122, 139));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Custo total");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(148, 148, 148))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83))
        );

        Fechar.setBackground(new java.awt.Color(255, 149, 0));
        Fechar.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        Fechar.setForeground(new java.awt.Color(255, 255, 255));
        Fechar.setText(" X ");
        Fechar.setBorder(null);
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

        Voltar.setBackground(new java.awt.Color(255, 149, 0));
        Voltar.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        Voltar.setForeground(new java.awt.Color(255, 255, 255));
        Voltar.setText(" < ");
        Voltar.setBorder(null);
        Voltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                VoltarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                VoltarMouseExited(evt);
            }
        });
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 329, Short.MAX_VALUE)
                .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        this.setEnabled(false);
        Menu menu = new Menu();
        menu.setVisible(true);
    }//GEN-LAST:event_VoltarActionPerformed

    private void FecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FecharMouseClicked
        JOptionPane optionPane = new JOptionPane("Salvando alterações...", JOptionPane.INFORMATION_MESSAGE);
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(3000); // Aguarda 3 segundos
                optionPane.setVisible(false); // Fecha o JOptionPane após 3 segundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start();
        
        // Cria um JFrame temporário para exibir o JOptionPane
        JOptionPane.showMessageDialog(null, optionPane);
        

        System.exit(0);
    }//GEN-LAST:event_FecharMouseClicked

    private void FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharActionPerformed
        
    }//GEN-LAST:event_FecharActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void FecharMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FecharMouseEntered
        Fechar.setBackground(redColor);
    }//GEN-LAST:event_FecharMouseEntered

    private void FecharMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FecharMouseExited
        Fechar.setBackground(orangeColor);
    }//GEN-LAST:event_FecharMouseExited

    private void VoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoltarMouseEntered
        Voltar.setBackground(whiteColor);
    }//GEN-LAST:event_VoltarMouseEntered

    private void VoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoltarMouseExited
        Voltar.setBackground(orangeColor);
    }//GEN-LAST:event_VoltarMouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nome = JOptionPane.showInputDialog(null, "Nome:");
        String marca = JOptionPane.showInputDialog(null, "Telefone:");
        double custo = Double.parseDouble(JOptionPane.showInputDialog(null, "custo R$:"));
        ferramenta.addFerramenta(nome, marca, custo);        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Ferramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ferramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ferramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ferramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ferramenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Fechar;
    private javax.swing.JButton Voltar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
