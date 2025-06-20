package view;

import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import view.ViewPesquisar;
import view.ViewTarefas;

/**
 *
 * @author Senac
 */
public class ViewPrincipal extends javax.swing.JFrame {
    ViewPesquisar vPesquisar = new ViewPesquisar();
    ViewTarefas vTarefas = new ViewTarefas();
    
    public ViewPrincipal() {
        initComponents();
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/aniyuki-anime-gif-kiss-58.gif"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 153));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                windowFechar(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 153, 204));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ff.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(235, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 102, 255));
        jMenuBar1.setForeground(new java.awt.Color(51, 0, 102));

        jMenu1.setText("Arquivos");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-search-in-cloud-24.png"))); // NOI18N
        jMenuItem3.setText("Pesquisar Tarefas");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionViewPesquisar(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-add-properties-24.png"))); // NOI18N
        jMenuItem4.setText("Adicionar Tarefas");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionViewTarefas(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sobre");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-face-with-symbols-on-mouth-24.png"))); // NOI18N
        jMenuItem2.setText("Ajuda");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionAjudar(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F6, 0));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-front-desk-24.png"))); // NOI18N
        jMenuItem5.setText("Sobre");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionSobre(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Sair");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8-exit-24.png"))); // NOI18N
        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionSair(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void actionSair(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionSair
        
       
      UIManager.put("OptionPane.yesButtonText", "Sim");
      UIManager.put("OptionPane.noButtonText", "Não");
      
       int op = JOptionPane.showConfirmDialog(null, "Você desejar encerrar a sua sessão?", "Atenção", JOptionPane.YES_NO_OPTION);
       
        if (op == 0){
        
         System.exit(0);
    
        }      
       
    }//GEN-LAST:event_actionSair

    private void actionSobre(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionSobre
        JOptionPane.showMessageDialog(null, "Controle da tarefa 1.0.\n"
                + "Desenvolvido em java em MYSQL.\n" 
                + "Desenvolvedor Humanix.", "Informação", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_actionSobre

    private void actionAjudar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionAjudar
     JOptionPane.showMessageDialog(null, "Email: humanix@gmail.com\n"
                + "Inserir print(s) do(s) erro(s).\n" 
                + "Desenvolvedor: Humanix.", "Ajuda", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_actionAjudar

    private void windowFechar(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_windowFechar
      UIManager.put("OptionPane.yesButtonText", "Sim");
      UIManager.put("OptionPane.noButtonText", "Não");
      
       int op = JOptionPane.showConfirmDialog(null, "Você desejar encerrar a sua sessão?", "Atenção", JOptionPane.YES_NO_OPTION);
       
        if (op == 0){
        
         System.exit(0);
        }
    }//GEN-LAST:event_windowFechar

    private void actionViewPesquisar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionViewPesquisar
        ViewPesquisar vPesquisar = new ViewPesquisar();
        vPesquisar.setVisible(true);
           
    }//GEN-LAST:event_actionViewPesquisar

    private void actionViewTarefas(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionViewTarefas
       ViewTarefas vTarefas = new ViewTarefas();
        vTarefas.setVisible(true); 
                                   
    }//GEN-LAST:event_actionViewTarefas
    
    /**
     * @param args the command line arguments
     */
   public static void main(String args[]){
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
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
           // @Override
            public void run() {
                new ViewPrincipal().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
 private void ViewPesquisar() {
      ViewPesquisar viewPesquisar = new ViewPesquisar();
      
      this.dispose();
      
      int op = 0;
      if (op == 0) {
      viewPesquisar.setVisible(true);
      viewPesquisar.setLocationRelativeTo(this);
      }
    }
  private void ViewTarefas() {
      ViewPesquisar viewPesquisar = new ViewPesquisar();
      
      this.dispose();
      
      int op = 0;
      if (op == 0) {
      viewPesquisar.setVisible(true);
      viewPesquisar.setLocationRelativeTo(this);
      }
    }
}

