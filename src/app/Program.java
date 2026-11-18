package app;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Program extends JFrame {

    private static final long serialVersionUID = 1L;

    public Program() {
        initUI();
    }

    private void initUI() {
        JButton quitButton = new JButton("Quit");
        quitButton.addActionListener((event) -> confirmAndExit());

        // Use simple FlowLayout for a clean, minimal layout
        setLayout(new FlowLayout());
        add(quitButton);

        setTitle("Quit Button App");
        setSize(300, 200);
        setLocationRelativeTo(null);
        
        // Handle close operation via window listener instead of immediate exit
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                confirmAndExit();
            }
        });
    }

    private void confirmAndExit() {
        int resp = JOptionPane.showConfirmDialog(
                this, 
                "Are you sure you want to exit?",
                "Exit?", 
                JOptionPane.YES_NO_OPTION
        );

        if (resp == JOptionPane.YES_OPTION) {
            dispose();
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            Program program = new Program();
            program.setVisible(true);
        });
    }
}