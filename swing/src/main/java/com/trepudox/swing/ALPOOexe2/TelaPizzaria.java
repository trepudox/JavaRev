package com.trepudox.swing.ALPOOexe2;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

public class TelaPizzaria extends JFrame implements ActionListener {

    // GridLayout
    static GridLayout gridLayoutPrincipal = new GridLayout(4, 1, 1, 1);
    static GridLayout gridLayoutCabecalho = new GridLayout(1, 4, 1, 1);
    static GridLayout gridLayoutCabecalhoExtras = new GridLayout(1, 1, 1, 1);
    static GridLayout gridLayoutPizzas = new GridLayout(3, 4, 1, 1);
    static GridLayout gridLayoutExtras = new GridLayout(2, 4, 1, 1);
    static GridLayout gridLayoutRodape = new GridLayout(1, 1, 1, 1);

    // JPanel
    static JPanel jPanelPrincipal = new JPanel(gridLayoutPrincipal);
    static JPanel jPanelCabecalho = new JPanel(gridLayoutCabecalho);
    static JPanel jPanelCabecalhoExtras = new JPanel(gridLayoutCabecalho);
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
    static JLabel labelPrecoPepperoniIndividual = new JLabel("R$ 15,00");
    static JLabel labelPrecoPepperoniRegular = new JLabel("R$ 27,00");
    static JLabel labelPrecoPepperoniFamilia = new JLabel("R$ 33,00");

    static JLabel labelNomeMussarela = new JLabel("Mussarela");
    static JLabel labelPrecoMussarelaIndividual = new JLabel("R$ 12,00");
    static JLabel labelPrecoMussarelaRegular = new JLabel("R$ 21,60");
    static JLabel labelPrecoMussarelaFamilia = new JLabel("R$ 26,40");

    static JLabel labelNomeSupreme = new JLabel("Supreme");
    static JLabel labelPrecoSupremeIndividual = new JLabel("R$ 12,00");
    static JLabel labelPrecoSupremeRegular = new JLabel("R$ 21,60");
    static JLabel labelPrecoSupremeFamilia = new JLabel("R$ 26,40");

    // JButton
    static JButton buttonComprar = new JButton("Comprar");

    public TelaPizzaria() {
        buttonInit();

        initPanelPrincipal();
        initPanelRodape();

        this.add(jPanelPrincipal, BorderLayout.NORTH);
        this.add(jPanelRodape, BorderLayout.SOUTH);

        this.setTitle("Pizzaria");
        this.setSize(500, 300);
        this.setResizable(false);
        this.setVisible(true);
        this.setAlwaysOnTop(true);

    }

    private void initPanelPrincipal() {
        initPanelCabecalho();
        jPanelPrincipal.add(jPanelCabecalho);

        initPanelProdutos();
        jPanelPrincipal.add(jPanelPizzas);

        initPanelCabecalhoExtras();
        jPanelPrincipal.add(jPanelCabecalhoExtras);
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

    private void initPanelProdutos() {
        labelNomePepperoni.setHorizontalAlignment(SwingConstants.CENTER);
        labelPrecoPepperoniIndividual.setHorizontalAlignment(SwingConstants.CENTER);
        labelPrecoPepperoniRegular.setHorizontalAlignment(SwingConstants.CENTER);
        labelPrecoPepperoniFamilia.setHorizontalAlignment(SwingConstants.CENTER);
        jPanelPizzas.add(labelNomePepperoni);
        jPanelPizzas.add(labelPrecoPepperoniIndividual);
        jPanelPizzas.add(labelPrecoPepperoniRegular);
        jPanelPizzas.add(labelPrecoPepperoniFamilia);

        labelNomeMussarela.setHorizontalAlignment(SwingConstants.CENTER);
        labelPrecoMussarelaIndividual.setHorizontalAlignment(SwingConstants.CENTER);
        labelPrecoMussarelaRegular.setHorizontalAlignment(SwingConstants.CENTER);
        labelPrecoMussarelaFamilia.setHorizontalAlignment(SwingConstants.CENTER);
        jPanelPizzas.add(labelNomeMussarela);
        jPanelPizzas.add(labelPrecoMussarelaIndividual);
        jPanelPizzas.add(labelPrecoMussarelaRegular);
        jPanelPizzas.add(labelPrecoMussarelaFamilia);

        labelNomeSupreme.setHorizontalAlignment(SwingConstants.CENTER);
        labelPrecoSupremeIndividual.setHorizontalAlignment(SwingConstants.CENTER);
        labelPrecoSupremeRegular.setHorizontalAlignment(SwingConstants.CENTER);
        labelPrecoSupremeFamilia.setHorizontalAlignment(SwingConstants.CENTER);
        jPanelPizzas.add(labelNomeSupreme);
        jPanelPizzas.add(labelPrecoSupremeIndividual);
        jPanelPizzas.add(labelPrecoSupremeRegular);
        jPanelPizzas.add(labelPrecoSupremeFamilia);
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
        String actionCommand = e.getActionCommand();
        Pattern valueRegex = Pattern.compile("[+]?([0-9]*\\.[0-9]+|[0-9]+)|^$");

        if (actionCommand.equals("comprar")) {
        }
    }
}
