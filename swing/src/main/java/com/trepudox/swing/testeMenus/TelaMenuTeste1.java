package com.trepudox.swing.testeMenus;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaMenuTeste1 extends JFrame implements ActionListener {

    // JMenuBar
    private static final JMenuBar jMenuBarr = new JMenuBar();

    // JMenu
    private static final JMenu jMenu1 = new JMenu("jMenu1");
    private static final JMenu jMenu2 = new JMenu("jMenu2");

    // JMenuItem
    private static final JMenuItem jMenuItem1 = new JMenuItem("JMenuItem1");
    private static final JMenuItem jMenuItem2 = new JMenuItem("JMenuItem2");
    private static final JMenuItem jMenuItem3 = new JMenuItem("JMenuItem3");
    private static final JMenuItem jMenuItem4 = new JMenuItem("JMenuItem4");
    private static final JMenuItem jMenuItem5 = new JMenuItem("JMenuItem5");
    private static final JMenuItem jMenuItem6 = new JMenuItem("JMenuItem6");

    // JLabel
    private static final JLabel jLabel = new JLabel("Teste de menus!");

    public TelaMenuTeste1() {
        this.setJMenuBar(jMenuBarr);
        initJMenu();

        jLabel.setHorizontalAlignment(0);
        jLabel.setBorder(new EmptyBorder(5, 0, 5, 0));
        this.add(jLabel, BorderLayout.SOUTH);

        this.setTitle("Teste de Menus");
        this.setVisible(true);
        this.setMinimumSize(new Dimension(300, 200));

    }

    private void initJMenu() {
        jMenuItem1.setActionCommand("jMenuItem1");
        jMenuItem1.addActionListener(this);
        jMenu1.add(jMenuItem1);

        jMenuItem2.setActionCommand("jMenuItem2");
        jMenuItem2.addActionListener(this);
        jMenu1.add(jMenuItem2);

        jMenuBarr.add(jMenu1);

        jMenuItem3.setActionCommand("jMenuItem3");
        jMenuItem3.addActionListener(this);
        jMenu2.add(jMenuItem3);

        jMenuItem4.setActionCommand("jMenuItem4");
        jMenuItem4.addActionListener(this);
        jMenu2.add(jMenuItem4);

        jMenuItem5.setActionCommand("jMenuItem5");
        jMenuItem5.addActionListener(this);
        jMenu2.add(jMenuItem5);

        jMenuItem6.setActionCommand("jMenuItem6");
        jMenuItem6.addActionListener(this);
        jMenu2.add(jMenuItem6);

        jMenuBarr.add(jMenu2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this, e.getActionCommand());
    }
}
