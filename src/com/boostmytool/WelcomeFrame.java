package com.boostmytool;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomeFrame extends JFrame {
    private JPanel mainPanel;
    private JTextField tfFirstname;
    private JTextField tfLastname;
    private JButton btnOK;
    private JButton btnClear;
    private JLabel lbWelcome;

    public WelcomeFrame() {
//        add(mainPanel);
        setContentPane(mainPanel);
        setTitle("Welcome");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        btnOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstname = tfFirstname.getText();
                String lastname = tfLastname.getText();
                lbWelcome.setText("Welcome " + firstname + " " + lastname);
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfFirstname.setText("");
                tfLastname.setText("");
                lbWelcome.setText("");
            }
        });
    }

    public static void main(String[] args) {
        WelcomeFrame myFrame = new WelcomeFrame();
    }
}
