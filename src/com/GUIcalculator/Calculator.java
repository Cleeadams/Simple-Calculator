package com.GUIcalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    private JTextField tfFirstnumber;
    private JTextField tfSeconnumber;
    private JLabel lbsum;
    private JButton btnCalculate;
    private JButton btnClear;
    private JPanel mainPanel;

    public Calculator() {
        add(mainPanel);

        setTitle("Summation Calculator");
        setSize(700,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Float myNum1 = Float.parseFloat(tfFirstnumber.getText());
                    Float myNum2 = Float.parseFloat(tfSeconnumber.getText());

                    Float sumNum = myNum1 + myNum2;

                    lbsum.setText("" + sumNum);

                }
                catch (NumberFormatException ex) {
                    lbsum.setText("ERROR: At least one values is not an acceptable number.");
                }

            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfFirstnumber.setText("");
                tfSeconnumber.setText("");
                lbsum.setText("");
            }
        });
    }

    public static void main(String[] args) {
        Calculator myFrame = new Calculator();
    }

}
