package app;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author HuszárFruzsinaAnna(S
 */
public class KilepesProgram extends javax.swing.JFrame {

    public KilepesProgram() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnKilepes = new javax.swing.JButton();
        lblKijeloles = new javax.swing.JLabel();
        checkKijeloles = new javax.swing.JCheckBox();
        btnCheck = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        btnKilepes.setText("Kilépés");
        btnKilepes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKilepesActionPerformed(evt);
            }
        });

        lblKijeloles.setText("Nincs kijelölve");

        checkKijeloles.setText("Kijelölés");
        checkKijeloles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkKijelolesMouseClicked(evt);
            }
        });

        btnCheck.setText("Check");
        btnCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCheck)
                    .addComponent(checkKijeloles)
                    .addComponent(lblKijeloles)
                    .addComponent(btnKilepes))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addComponent(lblKijeloles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checkKijeloles)
                .addGap(25, 25, 25)
                .addComponent(btnCheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnKilepes)
                .addGap(112, 112, 112))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnKilepesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKilepesActionPerformed
        megerosites();
    }//GEN-LAST:event_btnKilepesActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        megerosites();
    }//GEN-LAST:event_formWindowClosing

    private void checkKijelolesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkKijelolesMouseClicked
        //lblKijeloles.setText("Kijelölve");
    }//GEN-LAST:event_checkKijelolesMouseClicked

    private void btnCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckActionPerformed
        ellenorzesEsLabelSzoveg();
    }//GEN-LAST:event_btnCheckActionPerformed

    private void megerosites() {
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // alapból ne csináljon semmit
                
        int valasz = JOptionPane.showConfirmDialog(
                this, //ennek az elemnek a közepébe kerül
                "Biztosan ki akarsz lépni?", //A középen megjelenő kérdés
                "Kilépés?", //Az ablak címe (bal felső sarok)
                JOptionPane.YES_NO_OPTION
        );

        if (valasz == JOptionPane.YES_OPTION) {
            dispose(); //tells Java to immediately free up those native screen resources and hide the window. If your application has multiple windows open, calling dispose() on one window just closes that specific window while the rest of the application keeps running. It only terminates the app if it was the last visible window and there are no active non-daemon threads keeping the Java Virtual Machine (JVM) alive.
            System.exit(0); //ez a kilépés maga, (nothing to do with swing) 0 = Hiba nélkül lett vége a programnak
        }
    }
    
    private void ellenorzesEsLabelSzoveg() {
        if (checkKijeloles.isSelected()){
            lblKijeloles.setText("Kijelölve");
        } else {
            lblKijeloles.setText("Nincs Kijelölve");
        }
    }
    
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
            java.util.logging.Logger.getLogger(KilepesProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KilepesProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KilepesProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KilepesProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KilepesProgram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheck;
    private javax.swing.JButton btnKilepes;
    private javax.swing.JCheckBox checkKijeloles;
    private javax.swing.JLabel lblKijeloles;
    // End of variables declaration//GEN-END:variables

}
