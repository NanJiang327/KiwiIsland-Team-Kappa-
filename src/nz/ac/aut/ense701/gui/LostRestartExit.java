/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nz.ac.aut.ense701.gui;

import static java.time.Clock.system;
import nz.ac.aut.ense701.gameModel.Game;
import nz.ac.aut.ense701.gameModel.GameState;

/**
 *
 * @author dyd2298
 */
public class LostRestartExit extends javax.swing.JFrame {

    private Game game;
    private GameState GameState;
    private MainPage MainPage;

    /**
     * Creates new form LostRestartExit
     */
    public LostRestartExit(Game game) {

        initComponents();
        this.setLocationRelativeTo(null);
        // this.pack();
        this.setSize(620, 380);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.game = game;
        this.GameState = game.getState();
        setVisible(true);
        writeMessage();
    }

    private void writeMessage() {
        if (GameState == GameState.LOST) {

            dispMsg.setText(game.getPlayerName() + " " + game.getLoseMessage());
            dispMsg.setForeground(new java.awt.Color(0, 0, 0));
            dispMsg.setFont(new java.awt.Font("Tandysoft", 1, 12));
            dispMsg.setOpaque(false);

        } else if (GameState == GameState.WON) {
            dispMsg.setText(game.getPlayerName() + " " + game.getWinMessage());
            dispMsg.setForeground(new java.awt.Color(0, 0, 0));
            dispMsg.setFont(new java.awt.Font("Tandysoft", 1, 16));
            dispMsg.setOpaque(false);
        }
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
        MainPageButton = new javax.swing.JButton();
        RestartButton = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        dispMsg = new javax.swing.JLabel();
        NewGame = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPageButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/Main Page.png"))); // NOI18N
        MainPageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainPageButtonActionPerformed(evt);
            }
        });

        RestartButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/Restart.png"))); // NOI18N
        RestartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestartButtonActionPerformed(evt);
            }
        });

        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/New Exit.png"))); // NOI18N
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        NewGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon/New Game.png"))); // NOI18N
        NewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewGameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dispMsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 106, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RestartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MainPageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NewGame, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(88, 88, 88))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(dispMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(MainPageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(RestartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(NewGame, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MainPageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainPageButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();

        MainPage = new MainPage(game.getPlayerName());

    }//GEN-LAST:event_MainPageButtonActionPerformed

    private void RestartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestartButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        String player = game.getPlayerName();
        game = new Game(player, "1");
        // create the GUI for the game
        final KiwiCountUI gui = new KiwiCountUI(game);
        gui.requestFocus();
        // make the GUI visible
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                gui.setVisible(true);
            }
        });
    }//GEN-LAST:event_RestartButtonActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        System.exit(2);
    }//GEN-LAST:event_ExitActionPerformed

    private void NewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewGameActionPerformed
        // TODO add your handling code here:
        this.dispose();
        String player = game.getPlayerName();

        // create the GUI for the game
        new StartPage(player);


    }//GEN-LAST:event_NewGameActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit;
    private javax.swing.JButton MainPageButton;
    private javax.swing.JButton NewGame;
    private javax.swing.JButton RestartButton;
    private javax.swing.JLabel dispMsg;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
