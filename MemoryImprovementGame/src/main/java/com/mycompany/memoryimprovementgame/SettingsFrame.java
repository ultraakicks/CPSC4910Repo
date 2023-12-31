/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.memoryimprovementgame;

import java.io.File;

/**
 *
 * @author matt
 */
public class SettingsFrame extends javax.swing.JFrame {

    public musicSelector music = new musicSelector();
    public SetupFrame backgroundMusic = new SetupFrame();

    /**
     * Creates new form SettingsFrame
     */
    public SettingsFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        returnToMain = new javax.swing.JButton();
        resetConfig = new javax.swing.JButton();
        musicSelect = new javax.swing.JButton();
        muteMusic = new javax.swing.JButton();
        resetStatsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        returnToMain.setText("Back");
        returnToMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnToMainActionPerformed(evt);
            }
        });

        resetConfig.setText("Reset Configuration");
        resetConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetConfigActionPerformed(evt);
            }
        });

        musicSelect.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        musicSelect.setText("Music Selector");
        musicSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                musicSelectActionPerformed(evt);
            }
        });

        muteMusic.setText("Mute Music");
        muteMusic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                muteMusicActionPerformed(evt);
            }
        });

        resetStatsButton.setText("Reset Statistics");
        resetStatsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetStatsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(returnToMain)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(resetStatsButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(muteMusic, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(musicSelect, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(resetConfig, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(155, 155, 155))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(musicSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(muteMusic)
                .addGap(18, 18, 18)
                .addComponent(resetStatsButton)
                .addGap(18, 18, 18)
                .addComponent(resetConfig)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(returnToMain)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void returnToMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnToMainActionPerformed
        MainMenuFrame mainFrame = new MainMenuFrame();
        mainFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_returnToMainActionPerformed

    private void resetConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetConfigActionPerformed

        /* Deletes the * config.properties files  */
        String rFilePath = "relationsconfig.properties";
        File rFile = new File(rFilePath);
        if (rFile.delete()) {
            System.out.println("relationsconfig.properties file has been deleted");
        } else {
            System.out.print("relationsconfig.properties file has not been deleted");
        }

        String nFilePath = "namesconfig.properties";
        File nFile = new File(nFilePath);
        if (nFile.delete()) {
            System.out.println("namesconfig.properties file has been deleted");
        } else {
            System.out.print("namesconfig.properties file has not been deleted");
        }

        String pFilePath = "filepathconfig.properties";
        File pFile = new File(nFilePath);
        if (nFile.delete()) {
            System.out.println("filepathconfig.properties file has been deleted");
        } else {
            System.out.print("filepathconfig.properties file has not been deleted");
        }

        /* Reset Back to Main Menu Screen*/
        SetupFrame sFrame = new SetupFrame();
        sFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_resetConfigActionPerformed

    private void musicSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_musicSelectActionPerformed
        music.setVisible(true);
        backgroundMusic.stopSound();
    }//GEN-LAST:event_musicSelectActionPerformed

    private void muteMusicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_muteMusicActionPerformed
        music.stopMusic();
    }//GEN-LAST:event_muteMusicActionPerformed

    private void resetStatsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetStatsButtonActionPerformed
        /* Delete the stats.txt file*/ 
        String statsFilePath = "stats.txt";
        File sFile = new File(statsFilePath);
        if(sFile.delete()){
            System.out.println("stats.txt file has been deleted");
        }
        else {
            System.out.print("stats.txt file has not been deleted");
        }
       
        /* Reset Back to Mian Menu Screen*/ 
        MainMenuFrame mmFrame = new MainMenuFrame ();
        mmFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_resetStatsButtonActionPerformed

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
            java.util.logging.Logger.getLogger(SettingsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SettingsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SettingsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SettingsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SettingsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton musicSelect;
    private javax.swing.JButton muteMusic;
    private javax.swing.JButton resetConfig;
    private javax.swing.JButton resetStatsButton;
    private javax.swing.JButton returnToMain;
    // End of variables declaration//GEN-END:variables
}
