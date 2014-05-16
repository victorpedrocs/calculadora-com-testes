package src.view;

import src.controller.CalcController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraGUI extends JDialog {
    private JPanel contentPane;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btnSub;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btnAdd;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btnMult;
    private JButton btn0;
    private JButton btnEqual;
    private JButton btnDiv;
    private JTextField textField;

    private static final String d0 = "0";
    private static final String d1 = "1";
    private static final String d2 = "2";
    private static final String d3 = "3";
    private static final String d4 = "4";
    private static final String d5 = "5";
    private static final String d6 = "6";
    private static final String d7 = "7";
    private static final String d8 = "8";
    private static final String d9 = "9";
    private static final String add = "+";
    private static final String sub = "-";
    private static final String mult = "x";
    private static final String div = "/";

    public CalculadoraGUI() {
        setContentPane(contentPane);
        setModal(true);

        this.btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String text = textField.getText();
                if(!text.equals(d0)) {
                    text = text.concat(d0);
                }
                textField.setText(text);
            }
        });

        this.btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String text = textField.getText();
                if(text.equals(d0)) {
                    textField.setText(d1);
                }
                else{
                    text = text.concat(d1);
                    textField.setText(text);
                }
            }
        });

        this.btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String text = textField.getText();
                if(text.equals(d0)) {
                    textField.setText(d2);
                }
                else{
                    text = text.concat(d2);
                    textField.setText(text);
                }
            }
        });

        this.btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String text = textField.getText();
                if(text.equals(d0)) {
                    textField.setText(d3);
                }
                else{
                    text = text.concat(d3);
                    textField.setText(text);
                }
            }
        });

        this.btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String text = textField.getText();
                if(text.equals(d0)) {
                    textField.setText(d4);
                }
                else{
                    text = text.concat(d4);
                    textField.setText(text);
                }
            }
        });

        this.btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String text = textField.getText();
                if(text.equals(d0)) {
                    textField.setText(d5);
                }
                else{
                    text = text.concat(d5);
                    textField.setText(text);
                }
            }
        });

        this.btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String text = textField.getText();
                if(text.equals(d0)) {
                    textField.setText(d6);
                }
                else{
                    text = text.concat(d6);
                    textField.setText(text);
                }
            }
        });

        this.btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String text = textField.getText();
                if(text.equals(d0)) {
                    textField.setText(d7);
                }
                else{
                    text = text.concat(d7);
                    textField.setText(text);
                }
            }
        });

        this.btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String text = textField.getText();
                if(text.equals(d0)) {
                    textField.setText(d8);
                }
                else{
                    text = text.concat(d8);
                    textField.setText(text);
                }
            }
        });

        this.btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String text = textField.getText();
                if(text.equals(d0)) {
                    textField.setText(d9);
                }
                else{
                    text = text.concat(d9);
                    textField.setText(text);
                }
            }
        });

        this.btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String text = textField.getText();
                if (!text.contains(add) || !text.contains(sub) || !text.contains(mult) || !text.contains(div)){
                    text = text.concat(add);
                    textField.setText(text);
                }
            }
        });

        this.btnSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String text = textField.getText();
                if (!text.contains(add) || !text.contains(sub) || !text.contains(mult) || !text.contains(div)){
                    text = text.concat(sub);
                    textField.setText(text);
                }
            }
        });

        this.btnMult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String text = textField.getText();
                if (!text.contains(add) || !text.contains(sub) || !text.contains(mult) || !text.contains(div)){
                    text = text.concat(mult);
                    textField.setText(text);
                }
            }
        });

        this.btnDiv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String text = textField.getText();
                if (!text.contains(add) || !text.contains(sub) || !text.contains(mult) || !text.contains(div)){
                    text = text.concat(div);
                    textField.setText(text);
                }
            }
        });

        this.btnEqual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String text = textField.getText();
                if (text.contains(add) || text.contains(sub) || text.contains(mult) || text.contains(div)){
                    textField.setText(CalcController.getInstance().newOperation(text));
                }
            }
        });
    }

    public static void main(String[] args) {
        CalculadoraGUI dialog = new CalculadoraGUI();
        dialog.pack();
        dialog.setVisible(true);
        dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}
