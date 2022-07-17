package com.boostmytool;

import javax.swing.*;

public class WelcomeFrame extends JFrame {
    private JPanel mainPanel;

    public WelcomeFrame() {
        add(mainPanel);

        setTitle("Welcome");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        WelcomeFrame myFrame = new WelcomeFrame();
    }
}
