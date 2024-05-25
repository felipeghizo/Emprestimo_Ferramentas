
package visualização;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.Amigo;
import modelo.Emprestimo;
import modelo.Ferramenta;


public class visualizacaoEmprestimo extends javax.swing.JFrame {
    
    // Cores usadas:
    Color orangeColor = Color.decode("#FF9500");
    Color redColor = Color.decode("#FF2424");
    Color whiteColor = Color.decode("#6E6E6E");
    
    Amigo amigo1 = new Amigo();
    Ferramenta ferramenta1 = new Ferramenta();
    Emprestimo emprestimo = new Emprestimo();
    ArrayList minhaLista = new ArrayList();
    
    public visualizacaoEmprestimo() {
        // Configurações do JFrame
        this.setTitle("Emprestimo");
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        emprestar = new javax.swing.JButton();
        Devolver = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        selecionarAmigo = new javax.swing.JButton();
        selecionarFerramenta = new javax.swing.JButton();
        emprestimosAtivos = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        amigoMaisEmprestimos = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Voltar = new javax.swing.JButton();
        Fechar = new javax.swing.JButton();

        jButton3.setBackground(new java.awt.Color(107, 122, 139));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Emprestar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(107, 122, 139));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Relatório histórico de empréstimos");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 149, 0));

        jPanel2.setBackground(new java.awt.Color(39, 56, 75));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Amigo");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ferramenta");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("<-------");

        emprestar.setBackground(new java.awt.Color(107, 122, 139));
        emprestar.setForeground(new java.awt.Color(255, 255, 255));
        emprestar.setText("Emprestar");
        emprestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emprestarActionPerformed(evt);
            }
        });

        Devolver.setBackground(new java.awt.Color(107, 122, 139));
        Devolver.setForeground(new java.awt.Color(255, 255, 255));
        Devolver.setText("Devolver");
        Devolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DevolverActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("------->");

        selecionarAmigo.setBackground(new java.awt.Color(107, 122, 139));
        selecionarAmigo.setForeground(new java.awt.Color(255, 255, 255));
        selecionarAmigo.setText("Selecionar");
        selecionarAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionarAmigoActionPerformed(evt);
            }
        });

        selecionarFerramenta.setBackground(new java.awt.Color(107, 122, 139));
        selecionarFerramenta.setForeground(new java.awt.Color(255, 255, 255));
        selecionarFerramenta.setText("Selecionar");
        selecionarFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionarFerramentaActionPerformed(evt);
            }
        });

        emprestimosAtivos.setBackground(new java.awt.Color(107, 122, 139));
        emprestimosAtivos.setForeground(new java.awt.Color(255, 255, 255));
        emprestimosAtivos.setText("Relatótio empréstimos ativos");
        emprestimosAtivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emprestimosAtivosActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(107, 122, 139));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Relatório histórico de empréstimos");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        amigoMaisEmprestimos.setBackground(new java.awt.Color(107, 122, 139));
        amigoMaisEmprestimos.setForeground(new java.awt.Color(255, 255, 255));
        amigoMaisEmprestimos.setText("Amigo com mais empréstimos");
        amigoMaisEmprestimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amigoMaisEmprestimosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(selecionarFerramenta))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Devolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(emprestar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(49, 49, 49)
                                .addComponent(selecionarAmigo))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel5)
                                .addGap(71, 71, 71)
                                .addComponent(jLabel2))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(emprestimosAtivos)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(amigoMaisEmprestimos)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(emprestar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Devolver))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selecionarFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selecionarAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 28, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emprestimosAtivos)
                            .addComponent(jButton5))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(amigoMaisEmprestimos)
                .addGap(15, 15, 15))
        );

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Empréstimo");

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

        Fechar.setBackground(new java.awt.Color(255, 149, 0));
        Fechar.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        Fechar.setForeground(new java.awt.Color(255, 255, 255));
        Fechar.setText(" X ");
        Fechar.setBorder(null);
        Fechar.addMouseListener(new java.awt.event.MouseAdapter() {
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 378, Short.MAX_VALUE)
                .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Fechar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void emprestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emprestarActionPerformed
        String[] aux = selecionarAmigo.getText().split(" ");
        int amigoid = amigo1.getAmigoid(aux[0], aux[1]);
        String[] ferra = selecionarFerramenta.getText().split(" "); 
        int ferramentaid = ferramenta1.getFerramentaid(ferra[0], ferra[1]);
        if (emprestimo.verificarAmigo(amigoid) != -1){
            emprestimo.addEmprestimo(amigoid, ferramentaid, atualizarData());
        }else{
            String resposta = JOptionPane.showInputDialog(null, "Amigo possui emprestimos ativos, deseja emprestar mesmo assim?\n S/N");
            if ((resposta.compareTo("S") == 0) || (resposta.compareTo("s") == 0)){
                emprestimo.addEmprestimo(amigoid, ferramentaid, atualizarData());
            } else {
                JOptionPane.showMessageDialog(null, "Empréstimo cancelado!");
            }
        }
    }//GEN-LAST:event_emprestarActionPerformed

    private void FecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FecharActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_FecharActionPerformed

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

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        this.setEnabled(false);
        visualizacaoMenu menu = new visualizacaoMenu();
        menu.setVisible(true);
    }//GEN-LAST:event_VoltarActionPerformed

    private void DevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DevolverActionPerformed
        String[] aux = selecionarAmigo.getText().split(" ");
        int amigoid = amigo1.getAmigoid(aux[0], aux[1]);
        String[] ferra = selecionarFerramenta.getText().split(" ");
        int ferramentaid = ferramenta1.getFerramentaid(ferra[0], ferra[1]);
        int emprestimoid = emprestimo.getEmprestimoid(amigoid, ferramentaid);
        emprestimo.addDevolucao(emprestimoid, atualizarData());
    }//GEN-LAST:event_DevolverActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void selecionarAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarAmigoActionPerformed
        String nomeAmigo = JOptionPane.showInputDialog(null, "Nome do amigo: ");
        String telefoneAmigo = JOptionPane.showInputDialog(null, "Telefone do amigo: ");
        selecionarAmigo.setText(nomeAmigo+" "+telefoneAmigo);
    }//GEN-LAST:event_selecionarAmigoActionPerformed

    private void selecionarFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarFerramentaActionPerformed
        String nomeFerramenta = JOptionPane.showInputDialog(null, "Nome da ferramenta: ");
        String marcaFerramenta = JOptionPane.showInputDialog(null, "Marca da ferramenta: ");
        selecionarFerramenta.setText(nomeFerramenta+" "+marcaFerramenta);
    }//GEN-LAST:event_selecionarFerramentaActionPerformed

    private void emprestimosAtivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emprestimosAtivosActionPerformed
        minhaLista.clear();
        minhaLista = emprestimo.getrelatorioAtivos();
         // Verificar se a lista não está vazia
        String tupla = "AMIGO | FERRAMENTA | DATA DO EMPRESTIMO\n";
        int cont = 0;
        while(cont < minhaLista.size()){
            // Verificar o tipo do primeiro objeto na lista
            Object primeiroEmprestimo = minhaLista.get(cont);
            if (primeiroEmprestimo instanceof Emprestimo) {
                // Exibir os dados do amigo atual na lista
                String amigo = ((Emprestimo) primeiroEmprestimo).getAmigo();
                String ferramenta = ((Emprestimo) primeiroEmprestimo).getFerramenta();
                String dataEmprestimo = ((Emprestimo) primeiroEmprestimo).getDataEmprestimo();
                tupla += amigo+"  "+ferramenta+"  "+dataEmprestimo+"\n";
                cont++;
            } else {
                // Tipo de objeto inesperado
                System.out.println("O objeto na lista não é do tipo Emprestimo.");
            }
        } 
        
        if (minhaLista.isEmpty()){
            // Exibir mensagem informando que a lista está vazia
            JOptionPane.showMessageDialog(null, "A lista de empréstimos está vazia.");
        }else{JOptionPane.showMessageDialog(null, tupla);}
    }//GEN-LAST:event_emprestimosAtivosActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Emprestimo emprestimosHist = new Emprestimo();
        minhaLista.clear();
        minhaLista = emprestimosHist.getrelatorioHistorico();
         // Verificar se a lista não está vazia
        String tupla = "AMIGO | FERRAMENTA | DATA EMPRESTIMO | DATA DEVOLUÇÃO\n";
        int cont = 0;
         while(cont < minhaLista.size()){
            // Verificar o tipo do primeiro objeto na lista
            Object atualEmprestimo = minhaLista.get(cont);
            if (atualEmprestimo instanceof Emprestimo) {
                // Exibir os dados da primeira ferramenta na lista
                String amigo = ((Emprestimo) atualEmprestimo).getAmigo();
                String ferramenta = ((Emprestimo) atualEmprestimo).getFerramenta();
                String dataEmprestimo = ((Emprestimo) atualEmprestimo).getDataEmprestimo();
                String dataDevolucao = ((Emprestimo) atualEmprestimo).getDataDevolucao();
                tupla += amigo+"           "+ferramenta+"                 "+dataEmprestimo+"                 "+dataDevolucao+"\n";
                cont++;
            } else {
                // Tipo de objeto inesperado
                System.out.println("O objeto na lista não é do tipo Ferramenta.");
            }
        }
        
        if (minhaLista.isEmpty()){
            // Exibir mensagem informando que a lista está vazia
            JOptionPane.showMessageDialog(null, "A lista de ferramentas está vazia.");
        }else{JOptionPane.showMessageDialog(null, tupla);}
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void amigoMaisEmprestimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amigoMaisEmprestimosActionPerformed
        JOptionPane.showMessageDialog(null, emprestimo.maisEmprestimos());
    }//GEN-LAST:event_amigoMaisEmprestimosActionPerformed
    // Método para atualizar a data
    private String atualizarData() {
        // Obtendo a data atual do dispositivo local
        Date dataAtual = new Date();

        // Formatando a data para exibição
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        String dataFormatada = formatoData.format(dataAtual);

        return dataFormatada;
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
            java.util.logging.Logger.getLogger(visualizacaoEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(visualizacaoEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(visualizacaoEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(visualizacaoEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new visualizacaoEmprestimo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Devolver;
    private javax.swing.JButton Fechar;
    private javax.swing.JButton Voltar;
    private javax.swing.JButton amigoMaisEmprestimos;
    private javax.swing.JButton emprestar;
    private javax.swing.JButton emprestimosAtivos;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton selecionarAmigo;
    private javax.swing.JButton selecionarFerramenta;
    // End of variables declaration//GEN-END:variables
}
