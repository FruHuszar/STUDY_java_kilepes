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
        kilepesBeallitasok();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnKilepes = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnKilepes.setText("Kilépés");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(btnKilepes)
                .addContainerGap(168, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(btnKilepes)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kilepesBeallitasok() {
        // Saját kilépés Gomb
        btnKilepes.addActionListener(e -> megerosites());

        // Windows X gombja
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // alapból ne csináljon semmit
        addWindowListener(new WindowAdapter() { // Window adapter mert a sima window listenernél 7 metódust ki kellene tölteni
            @Override
            public void windowClosing(WindowEvent evt) {
                megerosites();
            }
        });
    }

    private void megerosites() {
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
    private javax.swing.JButton btnKilepes;
    // End of variables declaration//GEN-END:variables
}
