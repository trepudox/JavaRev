package com.trepudox.swing.calculadora3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCalculadora3 extends JFrame implements ActionListener {

    static Font sansSerif15 = new Font("Sans Serif", Font.BOLD, 15);
    static Font sansSerif20 = new Font("Sans Serif", Font.BOLD, 20);
    String stringResult = "";
    String savedNumber = "";
    String lastOperation = "";

    // GridLayout
    static GridLayout gridLayout = new GridLayout(4, 4, 2, 2);

    // JPanel
    static JPanel jPanelTeclado = new JPanel(gridLayout);

    // JLabel
    static JLabel jLabel = new JLabel(" ");

    // JButton
    static JButton btn7 = new JButton("7");
    static JButton btn8 = new JButton("8");
    static JButton btn9 = new JButton("9");
    static JButton btnDiv = new JButton("/");

    static JButton btn4 = new JButton("4");
    static JButton btn5 = new JButton("5");
    static JButton btn6 = new JButton("6");
    static JButton btnMult = new JButton("*");

    static JButton btn1 = new JButton("1");
    static JButton btn2 = new JButton("2");
    static JButton btn3 = new JButton("3");
    static JButton btnSub = new JButton("-");

    static JButton btnC = new JButton("C");
    static JButton btn0 = new JButton("0");
    static JButton btnPonto = new JButton(".");
    static JButton btnSom = new JButton("+");

    static JButton btnIgual = new JButton("=");

    public TelaCalculadora3() {
        jLabelInit();
        this.add(btnIgual, BorderLayout.SOUTH);

        botaoInit();
        tecladoInit();

        this.add(jPanelTeclado);

        this.setTitle("Calculadora 3");
        this.setVisible(true);
        this.setAlwaysOnTop(true);

        this.setSize(250, 250);
        this.setResizable(false);
    }

    private void jLabelInit() {
        jLabel.setFont(sansSerif20);
        jLabel.setHorizontalAlignment(4);

        this.add(jLabel, BorderLayout.NORTH);
    }

    private void botaoInit() {
        // PRIMEIRA LINHA
        btn7.addActionListener(this);
        btn7.setActionCommand("7");
        btn7.setFont(sansSerif15);

        btn8.addActionListener(this);
        btn8.setActionCommand("8");
        btn8.setFont(sansSerif15);

        btn9.addActionListener(this);
        btn9.setActionCommand("9");
        btn9.setFont(sansSerif15);

        btnDiv.addActionListener(this);
        btnDiv.setActionCommand("/");
        btnDiv.setFont(sansSerif15);

        // SEGUNDA LINHA
        btn4.addActionListener(this);
        btn4.setActionCommand("4");
        btn4.setFont(sansSerif15);

        btn5.addActionListener(this);
        btn5.setActionCommand("5");
        btn5.setFont(sansSerif15);

        btn6.addActionListener(this);
        btn6.setActionCommand("6");
        btn6.setFont(sansSerif15);

        btnMult.addActionListener(this);
        btnMult.setActionCommand("*");
        btnMult.setFont(sansSerif15);

        // TERCEIRA LINHA
        btn1.addActionListener(this);
        btn1.setActionCommand("1");
        btn1.setFont(sansSerif15);

        btn2.addActionListener(this);
        btn2.setActionCommand("2");
        btn2.setFont(sansSerif15);

        btn3.addActionListener(this);
        btn3.setActionCommand("3");
        btn3.setFont(sansSerif15);

        btnSub.addActionListener(this);
        btnSub.setActionCommand("-");
        btnSub.setFont(sansSerif15);

        // QUARTA LINHA
        btnC.addActionListener(this);
        btnC.setActionCommand("C");
        btnC.setFont(sansSerif15);

        btn0.addActionListener(this);
        btn0.setActionCommand("0");
        btn0.setFont(sansSerif15);

        btnPonto.addActionListener(this);
        btnPonto.setActionCommand(".");
        btnPonto.setFont(sansSerif15);

        btnSom.addActionListener(this);
        btnSom.setActionCommand("+");
        btnSom.setFont(sansSerif15);

        // IGUAL
        btnIgual.addActionListener(this);
        btnIgual.setActionCommand("=");
        btnIgual.setFont(sansSerif15);
    }

    private void tecladoInit() {
        jPanelTeclado.add(btn7);
        jPanelTeclado.add(btn8);
        jPanelTeclado.add(btn9);
        jPanelTeclado.add(btnDiv);

        jPanelTeclado.add(btn4);
        jPanelTeclado.add(btn5);
        jPanelTeclado.add(btn6);
        jPanelTeclado.add(btnMult);

        jPanelTeclado.add(btn1);
        jPanelTeclado.add(btn2);
        jPanelTeclado.add(btn3);
        jPanelTeclado.add(btnSub);

        jPanelTeclado.add(btnC);
        jPanelTeclado.add(btn0);
        jPanelTeclado.add(btnPonto);
        jPanelTeclado.add(btnSom);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();

        switch (actionCommand) {
            case "0":
                stringResult += "0";
                setJLabelText();
                break;
            case "1":
                stringResult += "1";
                setJLabelText();
                break;
            case "2":
                stringResult += "2";
                setJLabelText();
                break;
            case "3":
                stringResult += "3";
                setJLabelText();
                break;
            case "4":
                stringResult += "4";
                setJLabelText();
                break;
            case "5":
                stringResult += "5";
                setJLabelText();
                break;
            case "6":
                stringResult += "6";
                setJLabelText();
                break;
            case "7":
                stringResult += "7";
                setJLabelText();
                break;
            case "8":
                stringResult += "8";
                setJLabelText();
                break;
            case "9":
                stringResult += "9";
                setJLabelText();
                break;
            case "/":
                savedNumber = stringResult;
                lastOperation = "/";
                stringResult = " ";
                setJLabelText();
                break;
            case "*":
                savedNumber = stringResult;
                lastOperation = "*";
                stringResult = " ";
                setJLabelText();
                break;
            case "-":
                savedNumber = stringResult;
                lastOperation = "-";
                stringResult = " ";
                setJLabelText();
                break;
            case "+":
                savedNumber = stringResult;
                lastOperation = "+";
                stringResult = " ";
                setJLabelText();
                break;
            case ".":
                if (stringResult.contains(".") || stringResult.isBlank())
                    break;

                stringResult += ".";
                setJLabelText();
                break;
            case "C":
                stringResult = " ";
                jLabel.setText(stringResult);
                break;
            case "=":
                switch (lastOperation) {
                    case "/":
                        stringResult = String.valueOf(Double.parseDouble(savedNumber) / Double.parseDouble(stringResult));
                        setJLabelText();
                        lastOperation = " ";
                        break;
                    case "*":
                        stringResult = String.valueOf(Double.parseDouble(savedNumber) * Double.parseDouble(stringResult));
                        setJLabelText();
                        lastOperation = " ";
                        break;
                    case "-":
                        stringResult = String.valueOf(Double.parseDouble(savedNumber) - Double.parseDouble(stringResult));
                        setJLabelText();
                        lastOperation = " ";
                        break;
                    case "+":
                        stringResult = String.valueOf(Double.parseDouble(savedNumber) + Double.parseDouble(stringResult));
                        setJLabelText();
                        lastOperation = " ";
                        break;
                    default:
                        System.out.println("NENHUMA OPERAÇÃO DEFINIDA PARA " + lastOperation);
                }

                break;
            default:
                break;
        }

    }

    private void setJLabelText() {
        jLabel.setText(stringResult);
    }

}
