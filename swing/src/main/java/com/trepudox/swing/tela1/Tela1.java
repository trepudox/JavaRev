package com.trepudox.swing.tela1;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;

@Slf4j
public class Tela1 extends JFrame implements ActionListener {

    // GridLayout
    private static final GridLayout centerJPanelGridLayout = new GridLayout(1, 2);
    private static final GridLayout jPanelGridLayout = new GridLayout(3, 1);
    private static final GridLayout buttonGridLayout = new GridLayout(1, 2);

    // JPanel
    private static final JPanel centerJPanel = new JPanel(centerJPanelGridLayout);
    private static final JPanel checkBoxJPanel = new JPanel(jPanelGridLayout);
    private static final JPanel buttonJPanel = new JPanel(buttonGridLayout);
    private static final JPanel comboBoxJPanel = new JPanel();

    // JComboBox
    private static final JComboBox<String> paisesComboBox = new JComboBox<>(new String[]{"Azul", "Vermelho", "Verde"});

    // JCheckBox
    private static final JCheckBox jCheckBox1 = new JCheckBox("Programação");
    private static final JCheckBox jCheckBox2 = new JCheckBox("Banco de dados");
    private static final JCheckBox jCheckBox3 = new JCheckBox("Arquitetura de sistema");

    // JButton
    private static final JButton jButtonOK = new JButton("OK");
    private static final JButton jButtonLimpar = new JButton("Limpar");

    public Tela1() {
        buttonJPanelInit();
        centerJPanelInit();

        this.add(centerJPanel, BorderLayout.CENTER);
        this.add(buttonJPanel, BorderLayout.SOUTH);

        this.setTitle("Aplicativo");
        this.setMinimumSize(new Dimension(200, 150));
        this.pack();
        this.setVisible(true);
        this.setAlwaysOnTop(true);
    }

    private void centerJPanelInit() {
        checkBoxJPanelInit();
        paisesComboBoxInit();

        centerJPanel.add(checkBoxJPanel);
        centerJPanel.add(comboBoxJPanel);
    }

    private void paisesComboBoxInit() {
        TitledBorder titledBorder = BorderFactory.createTitledBorder("JComboBox");
        comboBoxJPanel.setBorder(titledBorder);

        comboBoxJPanel.add(paisesComboBox);
    }

    private void checkBoxJPanelInit() {
        TitledBorder titledBorder = BorderFactory.createTitledBorder("JCheckBox");
        checkBoxJPanel.setBorder(titledBorder);

        checkBoxJPanel.add(jCheckBox1);
        checkBoxJPanel.add(jCheckBox2);
        checkBoxJPanel.add(jCheckBox3);
    }

    private void buttonJPanelInit() {
        jButtonOK.addActionListener(this);
        jButtonOK.setActionCommand("ok");

        jButtonLimpar.addActionListener(this);
        jButtonLimpar.setActionCommand("limpar");

        buttonJPanel.add(jButtonOK);
        buttonJPanel.add(jButtonLimpar);
    }

    @SneakyThrows
    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();

        switch (actionCommand) {
            case "ok":
                String jCheckBoxes = returnSelectedCheckBoxes();

                if (jCheckBoxes.isBlank())
                    break;

                JOptionPane.showMessageDialog(this, String.format("Você selecionou: %s", jCheckBoxes));
                limparJCheckBoxes();
                break;

            case "limpar":
                limparJCheckBoxes();
                break;

            default:
                log.warn("Não há nenhum comando com o actionCommand '{}'", actionCommand);
        }
    }

    private void limparJCheckBoxes() {
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jCheckBox3.setSelected(false);
    }

    private String returnSelectedCheckBoxes() {
        Set<JCheckBox> jCheckBoxes = Set.of(jCheckBox1, jCheckBox2, jCheckBox3);

        StringBuilder retorno = new StringBuilder();

        for (JCheckBox box : jCheckBoxes) {
            if (box.isSelected()) {
                if (retorno.toString().equals("")) {
                    retorno.append(box.getText());
                } else {
                    retorno.append(", ").append(box.getText());
                }
            }
        }

        return retorno.toString();
    }
}
