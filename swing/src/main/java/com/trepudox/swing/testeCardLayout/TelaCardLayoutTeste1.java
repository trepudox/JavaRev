package com.trepudox.swing.testeCardLayout;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaCardLayoutTeste1 extends JFrame implements ActionListener {

    // Atributo controlador
    private int tela = 1;

    // JCardLayout
    private static final CardLayout cardLayout = new CardLayout();

    // JPanel
    private static final JPanel panelCardLayout = new JPanel();
    private static final JPanel panel1 = new JPanel();
    private static final JPanel panel2 = new JPanel();
    private static final JPanel panel3 = new JPanel();
    private static final JPanel panel4 = new JPanel();

    // JButton
    private static final JButton buttonEsquerda = new JButton("<");
    private static final JButton buttonDireita = new JButton(">");

    // JLabel
    private static final JLabel southLabel = new JLabel("Teste de CardLayout!");
    private static final JLabel label1 = new JLabel("Tela 1");
    private static final JLabel label2 = new JLabel("Tela 2");
    private static final JLabel label3 = new JLabel("Tela 3");
    private static final JLabel label4 = new JLabel("Tela 4");

    public TelaCardLayoutTeste1() {
        southLabelInit();
        labelInit();
        panelInit();
        buttonInit();
        cardLayoutInit();

        this.setTitle("Teste de CardLayout");
        this.setVisible(true);
        this.setMinimumSize(new Dimension(300, 200));

    }

    private void southLabelInit() {
        label1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 10));
        southLabel.setBorder(new EmptyBorder(15, 10, 15, 10));
        southLabel.setHorizontalAlignment(0);
        this.add(southLabel, BorderLayout.SOUTH);
    }

    private void labelInit() {
        label1.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 25));
        label1.setHorizontalAlignment(0);
        panel1.add(label1);

        label2.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 25));
        label2.setHorizontalAlignment(0);
        panel2.add(label2);

        label3.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 25));
        label3.setHorizontalAlignment(0);
        panel3.add(label3);

        label4.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 25));
        label4.setHorizontalAlignment(0);
        panel4.add(label4);
    }

    private void panelInit() {
        panel1.add(label1);
        panel2.add(label2);
        panel3.add(label3);
        panel4.add(label4);
    }

    private void cardLayoutInit() {
        panelCardLayout.setLayout(cardLayout);
        panelCardLayout.add(panel1, "panel1");
        panelCardLayout.add(panel2, "panel2");
        panelCardLayout.add(panel3, "panel3");
        panelCardLayout.add(panel4, "panel4");
        this.add(panelCardLayout);
    }

    private void buttonInit() {
        buttonEsquerda.setActionCommand("esq");
        buttonEsquerda.addActionListener(this);
        this.add(buttonEsquerda, BorderLayout.WEST);

        buttonDireita.setActionCommand("dir");
        buttonDireita.addActionListener(this);
        this.add(buttonDireita, BorderLayout.EAST);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();

        switch (actionCommand) {
            case "dir":
                if (tela < 4)
                    tela += 1;

                cardLayout.show(panelCardLayout, "panel" + tela);
                break;

            case "esq":
                if (tela > 1)
                    tela -= 1;

                cardLayout.show(panelCardLayout, "panel" + tela);
                break;

            default:
                JOptionPane.showMessageDialog(this, "Nenhum comando disponível");
        }
    }
}
