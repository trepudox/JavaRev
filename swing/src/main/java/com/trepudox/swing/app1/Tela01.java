package com.trepudox.swing.app1;

import javax.swing.*;
import java.awt.*;

public class Tela01 extends JFrame {

    private final JPanel pn1 = new JPanel(new FlowLayout());
    private final JPanel pn2 = new JPanel(new FlowLayout());

    private final JButton bt1 = new JButton("Botão 1");
    private final JButton bt2 = new JButton("Botão 2");
    private final JButton bt3 = new JButton("Botão 3");
    private final JButton bt4 = new JButton("Botão 4");

    public Tela01() {
        tela();
    }

    private void tela() {
        this.setLayout(new FlowLayout());

        pn1.add(bt1);
        pn1.add(bt2);

        pn1.setBackground(Color.ORANGE);
        this.add(pn1);

        pn2.add(bt3);
        pn2.add(bt4);

        pn2.setBackground(Color.GREEN);
        this.add(pn2);


        this.setBounds(0, 0, 400, 300);
        this.setMinimumSize(new Dimension(200, 150));
        this.setAlwaysOnTop(true);
        this.setVisible(true);
    }

}
