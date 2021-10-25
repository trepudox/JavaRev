package com.trepudox.swing.ALPOOexe2;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaPizzaria extends JFrame implements ActionListener {

    // GridLayout
    static GridLayout gridLayoutPrincipal = new GridLayout(4, 1, 1, 1);
    static GridLayout gridLayoutCabecalho = new GridLayout(1, 4, 1, 1);
    static GridLayout gridLayoutCabecalhoExtras = new GridLayout(1, 1, 1, 1);
    static GridLayout gridLayoutPizzas = new GridLayout(3, 4, 1, 1);
    static GridLayout gridLayoutExtras = new GridLayout(2, 3, 1, 1);
    static GridLayout gridLayoutRodape = new GridLayout(1, 1, 1, 1);

    // JPanel
    static JPanel jPanelPrincipal = new JPanel(gridLayoutPrincipal);
    static JPanel jPanelCabecalho = new JPanel(gridLayoutCabecalho);
    static JPanel jPanelCabecalhoExtras = new JPanel(gridLayoutCabecalhoExtras);
    static JPanel jPanelPizzas = new JPanel(gridLayoutPizzas);
    static JPanel jPanelExtras = new JPanel(gridLayoutExtras);
    static JPanel jPanelRodape = new JPanel(gridLayoutRodape);

    // JLabel
    static JLabel labelCabecalhoProduto = new JLabel("Sabor");
    static JLabel labelCabecalhoIndividual = new JLabel("Individual");
    static JLabel labelCabecalhoRegular = new JLabel("Regular");
    static JLabel labelCabecalhoFamilia = new JLabel("Família");

    static JLabel labelCabecalhoExtras = new JLabel("Extras");

    static JLabel labelNomePepperoni = new JLabel("Pepperoni");

    static JLabel labelNomeMussarela = new JLabel("Mussarela");

    static JLabel labelNomeSupreme = new JLabel("Supreme");

    // ButtonGroup
    static ButtonGroup buttonGroup = new ButtonGroup();

    // JRadioButton
    static JRadioButton radioButtonPrecoPepperoniIndividual = new JRadioButton("R$ 15,00");
    static JRadioButton radioButtonPrecoPepperoniRegular = new JRadioButton("R$ 27,00");
    static JRadioButton radioButtonPrecoPepperoniFamilia = new JRadioButton("R$ 33,00");

    static JRadioButton radioButtonPrecoMussarelaIndividual = new JRadioButton("R$ 12,00");
    static JRadioButton radioButtonPrecoMussarelaRegular = new JRadioButton("R$ 21,60");
    static JRadioButton radioButtonPrecoMussarelaFamilia = new JRadioButton("R$ 26,40");

    static JRadioButton radioButtonPrecoSupremeIndividual = new JRadioButton("R$ 17,00");
    static JRadioButton radioButtonPrecoSupremeRegular = new JRadioButton("R$ 30,60");
    static JRadioButton radioButtonPrecoSupremeFamilia = new JRadioButton("R$ 37,40");

    // JCheckBox
    static JCheckBox checkBoxBacon = new JCheckBox("Bacon - R$ 2,00");
    static JCheckBox checkBoxTomate = new JCheckBox("Tomate - R$ 1,00");
    static JCheckBox checkBoxCebola = new JCheckBox("Cebola - R$ 1,50");
    static JCheckBox checkBoxCatupiry = new JCheckBox("Catupiry - R$ 3,00");
    static JCheckBox checkBoxChampignon = new JCheckBox("Champignon - R$ 2,50");
    static JCheckBox checkBoxPresunto = new JCheckBox("Presunto - R$ 2,50");

    // JButton
    static JButton buttonComprar = new JButton("Comprar");

    public TelaPizzaria() {
        buttonInit();

        initPanelPrincipal();
        initPanelRodape();

        this.add(jPanelPrincipal, BorderLayout.NORTH);
        this.add(jPanelRodape, BorderLayout.SOUTH);

        this.setTitle("Pizzaria");
        this.setSize(500, 375);
        this.setResizable(false);
        this.setVisible(true);
        this.setAlwaysOnTop(false);
    }

    private void initPanelPrincipal() {
        initPanelCabecalho();
        jPanelPrincipal.add(jPanelCabecalho);

        initPanelProdutos();
        jPanelPrincipal.add(jPanelPizzas);

        initPanelCabecalhoExtras();
        jPanelPrincipal.add(jPanelCabecalhoExtras);

        initPanelExtras();
        jPanelPrincipal.add(jPanelExtras);
    }

    private void initPanelCabecalho() {
        labelCabecalhoProduto.setHorizontalAlignment(SwingConstants.CENTER);
        labelCabecalhoIndividual.setHorizontalAlignment(SwingConstants.CENTER);
        labelCabecalhoRegular.setHorizontalAlignment(SwingConstants.CENTER);
        labelCabecalhoFamilia.setHorizontalAlignment(SwingConstants.CENTER);

        labelCabecalhoProduto.setFont(new Font("Sans Serif", Font.BOLD, 20));
        labelCabecalhoIndividual.setFont(new Font("Sans Serif", Font.BOLD, 20));
        labelCabecalhoRegular.setFont(new Font("Sans Serif", Font.BOLD, 20));
        labelCabecalhoFamilia.setFont(new Font("Sans Serif", Font.BOLD, 20));

        jPanelCabecalho.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));

        jPanelCabecalho.add(labelCabecalhoProduto);
        jPanelCabecalho.add(labelCabecalhoIndividual);
        jPanelCabecalho.add(labelCabecalhoRegular);
        jPanelCabecalho.add(labelCabecalhoFamilia);
    }

    private void initPanelCabecalhoExtras() {
        labelCabecalhoExtras.setHorizontalAlignment(SwingConstants.CENTER);
        labelCabecalhoExtras.setFont(new Font("Sans Serif", Font.BOLD, 20));

        jPanelCabecalhoExtras.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));

        jPanelCabecalhoExtras.add(labelCabecalhoExtras);
    }

    private void initPanelExtras() {
        jPanelExtras.add(checkBoxBacon);
        jPanelExtras.add(checkBoxTomate);
        jPanelExtras.add(checkBoxCebola);
        jPanelExtras.add(checkBoxCatupiry);
        jPanelExtras.add(checkBoxChampignon);
        jPanelExtras.add(checkBoxPresunto);
    }

    private void initRadioButton() {
        buttonGroup.add(radioButtonPrecoPepperoniIndividual);
        buttonGroup.add(radioButtonPrecoPepperoniRegular);
        buttonGroup.add(radioButtonPrecoPepperoniFamilia);

        buttonGroup.add(radioButtonPrecoMussarelaIndividual);
        buttonGroup.add(radioButtonPrecoMussarelaRegular);
        buttonGroup.add(radioButtonPrecoMussarelaFamilia);

        buttonGroup.add(radioButtonPrecoSupremeIndividual);
        buttonGroup.add(radioButtonPrecoSupremeRegular);
        buttonGroup.add(radioButtonPrecoSupremeFamilia);
    }

    private void initPanelProdutos() {
        initRadioButton();

        labelNomePepperoni.setHorizontalAlignment(SwingConstants.CENTER);
        radioButtonPrecoPepperoniIndividual.setHorizontalAlignment(SwingConstants.CENTER);
        radioButtonPrecoPepperoniRegular.setHorizontalAlignment(SwingConstants.CENTER);
        radioButtonPrecoPepperoniFamilia.setHorizontalAlignment(SwingConstants.CENTER);
        jPanelPizzas.add(labelNomePepperoni);
        jPanelPizzas.add(radioButtonPrecoPepperoniIndividual);
        jPanelPizzas.add(radioButtonPrecoPepperoniRegular);
        jPanelPizzas.add(radioButtonPrecoPepperoniFamilia);

        labelNomeMussarela.setHorizontalAlignment(SwingConstants.CENTER);
        radioButtonPrecoMussarelaIndividual.setHorizontalAlignment(SwingConstants.CENTER);
        radioButtonPrecoMussarelaRegular.setHorizontalAlignment(SwingConstants.CENTER);
        radioButtonPrecoMussarelaFamilia.setHorizontalAlignment(SwingConstants.CENTER);
        jPanelPizzas.add(labelNomeMussarela);
        jPanelPizzas.add(radioButtonPrecoMussarelaIndividual);
        jPanelPizzas.add(radioButtonPrecoMussarelaRegular);
        jPanelPizzas.add(radioButtonPrecoMussarelaFamilia);

        labelNomeSupreme.setHorizontalAlignment(SwingConstants.CENTER);
        radioButtonPrecoSupremeIndividual.setHorizontalAlignment(SwingConstants.CENTER);
        radioButtonPrecoSupremeRegular.setHorizontalAlignment(SwingConstants.CENTER);
        radioButtonPrecoSupremeFamilia.setHorizontalAlignment(SwingConstants.CENTER);
        jPanelPizzas.add(labelNomeSupreme);
        jPanelPizzas.add(radioButtonPrecoSupremeIndividual);
        jPanelPizzas.add(radioButtonPrecoSupremeRegular);
        jPanelPizzas.add(radioButtonPrecoSupremeFamilia);
    }

    private void initPanelRodape() {
        jPanelRodape.setMinimumSize(new Dimension(200, 200));
        jPanelRodape.add(buttonComprar);
    }

    private void buttonInit() {
        buttonComprar.addActionListener(this);
        buttonComprar.setActionCommand("comprar");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (buttonGroup.getSelection() == null) {
            JOptionPane.showMessageDialog(null, "Você precisa selecionar uma pizza!");
            return;
        }

        JRadioButton selectedRadioButton = radioButtonPrecoPepperoniIndividual.isSelected() ? radioButtonPrecoPepperoniIndividual :
                radioButtonPrecoPepperoniRegular.isSelected() ? radioButtonPrecoPepperoniRegular :
                radioButtonPrecoPepperoniFamilia.isSelected() ? radioButtonPrecoPepperoniFamilia :
                radioButtonPrecoMussarelaIndividual.isSelected() ? radioButtonPrecoMussarelaIndividual :
                radioButtonPrecoMussarelaRegular.isSelected() ? radioButtonPrecoMussarelaRegular :
                radioButtonPrecoMussarelaFamilia.isSelected() ? radioButtonPrecoMussarelaFamilia :
                radioButtonPrecoSupremeIndividual.isSelected() ? radioButtonPrecoSupremeIndividual :
                radioButtonPrecoSupremeRegular.isSelected() ? radioButtonPrecoSupremeRegular :
                radioButtonPrecoSupremeFamilia;

        double pizzaValue = parsePrecoDoProduto(selectedRadioButton.getText());

        if (checkBoxBacon.isSelected())
            pizzaValue += parsePrecoDoProduto(getPrecoFromButtonText(checkBoxBacon.getText()));

        if (checkBoxTomate.isSelected())
            pizzaValue += parsePrecoDoProduto(getPrecoFromButtonText(checkBoxTomate.getText()));

        if (checkBoxCebola.isSelected())
            pizzaValue += parsePrecoDoProduto(getPrecoFromButtonText(checkBoxCebola.getText()));

        if (checkBoxCatupiry.isSelected())
            pizzaValue += parsePrecoDoProduto(getPrecoFromButtonText(checkBoxCatupiry.getText()));

        if (checkBoxChampignon.isSelected())
            pizzaValue += parsePrecoDoProduto(getPrecoFromButtonText(checkBoxChampignon.getText()));

        if (checkBoxPresunto.isSelected())
            pizzaValue += parsePrecoDoProduto(getPrecoFromButtonText(checkBoxPresunto.getText()));

        JOptionPane.showMessageDialog(null, String.format("O preço total foi de R$ %.2f e sua pizza " +
                "chegará em até 30 minutos! Obrigado pela preferência.", pizzaValue));
        limpaCampos();
    }

    private String getPrecoFromButtonText(String text) {
        String[] splittedText = text.split(" - ");
        return splittedText[1];

    }

    private double parsePrecoDoProduto(String preco) {
        String precoFinal = preco.replace("R$ ", "").replace(',', '.');
        return Double.parseDouble(precoFinal);
    }

    private void limpaCampos() {
        radioButtonPrecoPepperoniIndividual.setSelected(false);
        radioButtonPrecoPepperoniRegular.setSelected(false);
        radioButtonPrecoPepperoniFamilia.setSelected(false);

        radioButtonPrecoMussarelaIndividual.setSelected(false);
        radioButtonPrecoMussarelaRegular.setSelected(false);
        radioButtonPrecoMussarelaFamilia.setSelected(false);

        radioButtonPrecoSupremeIndividual.setSelected(false);
        radioButtonPrecoSupremeRegular.setSelected(false);
        radioButtonPrecoSupremeFamilia.setSelected(false);

        checkBoxBacon.setSelected(false);
        checkBoxTomate.setSelected(false);
        checkBoxCebola.setSelected(false);
        checkBoxCatupiry.setSelected(false);
        checkBoxChampignon.setSelected(false);
        checkBoxPresunto.setSelected(false);
    }
}
