
package br.com.uniderp.telas;

import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
public class TelaPrincipal extends javax.swing.JFrame {
    public TelaPrincipal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbl_data = new javax.swing.JLabel();
        lbl_usuario = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        menu_cadastrar = new javax.swing.JMenu();
        menu_remover = new javax.swing.JMenu();
        menu_relatorio = new javax.swing.JMenu();
        main_sobre = new javax.swing.JMenu();
        menu_sobre = new javax.swing.JMenuItem();
        menu_sair = new javax.swing.JMenu();
        sair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela principal");
        setBackground(new java.awt.Color(51, 102, 255));
        setPreferredSize(new java.awt.Dimension(900, 600));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 669, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/uniderp/icons/uniderp2.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Bem vindo ");

        lbl_data.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_data.setText("Data");

        lbl_usuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl_usuario.setText("usuario");

        menu_cadastrar.setText("Cadastrar aluno");
        menu_cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_cadastrarMouseClicked(evt);
            }
        });
        menu_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_cadastrarActionPerformed(evt);
            }
        });
        menu.add(menu_cadastrar);

        menu_remover.setText("Remover aluno ");
        menu.add(menu_remover);

        menu_relatorio.setText("Relatório de notas");
        menu.add(menu_relatorio);

        main_sobre.setText("Ajuda");

        menu_sobre.setText("Sobre");
        menu_sobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_sobreActionPerformed(evt);
            }
        });
        main_sobre.add(menu_sobre);

        menu.add(main_sobre);

        menu_sair.setText("Sair");
        menu_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_sairActionPerformed(evt);
            }
        });

        sair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        menu_sair.add(sair);

        menu.add(menu_sair);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_usuario))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lbl_data, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(desktop)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_data)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(lbl_usuario))
                        .addGap(0, 358, Short.MAX_VALUE)))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(959, 612));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menu_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_sairActionPerformed
        
        
    }//GEN-LAST:event_menu_sairActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        /*
            Evento windowActivated 
            carrega o usuario logado e a hora do sistema ao instanciar a tela principal
         */
        Date data = new Date();
        //formatando a data
        DateFormat formatador = DateFormat.getDateInstance(DateFormat.LONG);
        //Trocando a label pela data so sitema
        lbl_data.setText(formatador.format(data));

    }//GEN-LAST:event_formWindowActivated

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        // TODO add your handling code here:
        int sair = JOptionPane.showConfirmDialog(null,"Deseja sair?","Atenção",JOptionPane.YES_NO_OPTION );
        if (sair == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_sairActionPerformed

    private void menu_sobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_sobreActionPerformed
         TelaSobre telaSobre = new TelaSobre();
         telaSobre.setVisible(true);
         telaSobre.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_menu_sobreActionPerformed

    private void menu_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_cadastrarActionPerformed
        // chamando a tela de cadastrar alunos dentro do desktop pane
        TelaCadastrar telaCadastrar = new TelaCadastrar();
        telaCadastrar.setVisible(true);
        desktop.add(telaCadastrar);
        
    }//GEN-LAST:event_menu_cadastrarActionPerformed

    private void menu_cadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_cadastrarMouseClicked
         // chamando a tela de cadastrar alunos dentro do desktop pane
        TelaCadastrar telaCadastrar = new TelaCadastrar();
        telaCadastrar.setVisible(true);
        desktop.add(telaCadastrar);
    }//GEN-LAST:event_menu_cadastrarMouseClicked

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl_data;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JMenu main_sobre;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menu_cadastrar;
    private javax.swing.JMenu menu_relatorio;
    private javax.swing.JMenu menu_remover;
    private javax.swing.JMenu menu_sair;
    private javax.swing.JMenuItem menu_sobre;
    private javax.swing.JMenuItem sair;
    // End of variables declaration//GEN-END:variables
}
