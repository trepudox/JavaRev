package com.trepudox.swing.exe1;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

public class TelaMercadinho extends JFrame implements ActionListener {

    // GridLayout
    static GridLayout gridLayoutPrincipal = new GridLayout(2, 1, 1, 1);
    static GridLayout gridLayoutCabecalho = new GridLayout(1, 3, 1, 1);
    static GridLayout gridLayoutProdutos = new GridLayout(6, 3, 1, 1);
    static GridLayout gridLayoutRodape = new GridLayout(2, 1, 1, 1);

    // JPanel
    static JPanel jPanelPrincipal = new JPanel(gridLayoutPrincipal);
    static JPanel jPanelCabecalho = new JPanel(gridLayoutCabecalho);
    static JPanel jPanelProdutos = new JPanel(gridLayoutProdutos);
    static JPanel jPanelRodape = new JPanel(gridLayoutRodape);

    // JLabel
    static JLabel labelCabecalhoProduto = new JLabel("Produto");
    static JLabel labelCabecalhoPreco = new JLabel("Preço (por kg)");
    static JLabel labelCabecalhoQuantidade = new JLabel("Quantidade (kg)");

    static JLabel labelNomeArroz = new JLabel("Arroz");
    static JLabel labelNomeFeijao = new JLabel("Feijao");
    static JLabel labelNomeBanana = new JLabel("Banana");
    static JLabel labelNomeTomate = new JLabel("Tomate");
    static JLabel labelNomeSalame = new JLabel("Salame");
    static JLabel labelNomeCafe = new JLabel("Cafe");

    static JLabel labelPrecoArroz = new JLabel("R$ 5,90");
    static JLabel labelPrecoFeijao = new JLabel("R$ 7,90");
    static JLabel labelPrecoBanana = new JLabel("R$ 6,50");
    static JLabel labelPrecoTomate = new JLabel("R$ 7,99");
    static JLabel labelPrecoSalame = new JLabel("R$ 39,99");
    static JLabel labelPrecoCafe = new JLabel("R$ 8,99");

    static JLabel labelPrecoTotal = new JLabel("teste");

    // JText
    static JTextField txtQntArroz = new JTextField("");
    static JTextField txtQntFeijao = new JTextField("");
    static JTextField txtQntBanana = new JTextField("");
    static JTextField txtQntTomate = new JTextField("");
    static JTextField txtQntSalame = new JTextField("");
    static JTextField txtQntCafe = new JTextField("");

    // JButton
    static JButton buttonComprar = new JButton("Comprar");

    public TelaMercadinho() {
        buttonInit();

        initPanelPrincipal();
        initPanelRodape();

        this.add(jPanelPrincipal, BorderLayout.NORTH);
        this.add(jPanelRodape);

        this.setTitle("Mercadinho");
        this.setSize(400, 400);
        this.setResizable(false);
        this.setVisible(true);
        this.setAlwaysOnTop(true);

    }

    private void initPanelPrincipal() {
        initPanelCabecalho();
        jPanelPrincipal.add(jPanelCabecalho);

        initPanelProdutos();
        jPanelPrincipal.add(jPanelProdutos);

    }

    private void initPanelCabecalho() {
        labelCabecalhoProduto.setHorizontalAlignment(SwingConstants.CENTER);
        labelCabecalhoPreco.setHorizontalAlignment(SwingConstants.CENTER);
        labelCabecalhoQuantidade.setHorizontalAlignment(SwingConstants.CENTER);

        labelCabecalhoProduto.setFont(new Font("Sans Serif", Font.BOLD, 15));
        labelCabecalhoPreco.setFont(new Font("Sans Serif", Font.BOLD, 15));
        labelCabecalhoQuantidade.setFont(new Font("Sans Serif", Font.BOLD, 15));

        jPanelCabecalho.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.LOWERED));

        jPanelCabecalho.add(labelCabecalhoProduto);
        jPanelCabecalho.add(labelCabecalhoPreco);
        jPanelCabecalho.add(labelCabecalhoQuantidade);
    }

    private void initPanelProdutos() {
        labelNomeArroz.setHorizontalAlignment(SwingConstants.CENTER);
        labelPrecoArroz.setHorizontalAlignment(SwingConstants.CENTER);
        txtQntArroz.setHorizontalAlignment(SwingConstants.CENTER);
        jPanelProdutos.add(labelNomeArroz);
        jPanelProdutos.add(labelPrecoArroz);
        jPanelProdutos.add(txtQntArroz);

        labelNomeFeijao.setHorizontalAlignment(SwingConstants.CENTER);
        labelPrecoFeijao.setHorizontalAlignment(SwingConstants.CENTER);
        txtQntFeijao.setHorizontalAlignment(SwingConstants.CENTER);
        jPanelProdutos.add(labelNomeFeijao);
        jPanelProdutos.add(labelPrecoFeijao);
        jPanelProdutos.add(txtQntFeijao);

        labelNomeBanana.setHorizontalAlignment(SwingConstants.CENTER);
        labelPrecoBanana.setHorizontalAlignment(SwingConstants.CENTER);
        txtQntBanana.setHorizontalAlignment(SwingConstants.CENTER);
        jPanelProdutos.add(labelNomeBanana);
        jPanelProdutos.add(labelPrecoBanana);
        jPanelProdutos.add(txtQntBanana);

        labelNomeTomate.setHorizontalAlignment(SwingConstants.CENTER);
        labelPrecoTomate.setHorizontalAlignment(SwingConstants.CENTER);
        txtQntTomate.setHorizontalAlignment(SwingConstants.CENTER);
        jPanelProdutos.add(labelNomeTomate);
        jPanelProdutos.add(labelPrecoTomate);
        jPanelProdutos.add(txtQntTomate);

        labelNomeSalame.setHorizontalAlignment(SwingConstants.CENTER);
        labelPrecoSalame.setHorizontalAlignment(SwingConstants.CENTER);
        txtQntSalame.setHorizontalAlignment(SwingConstants.CENTER);
        jPanelProdutos.add(labelNomeSalame);
        jPanelProdutos.add(labelPrecoSalame);
        jPanelProdutos.add(txtQntSalame);

        labelNomeCafe.setHorizontalAlignment(SwingConstants.CENTER);
        labelPrecoCafe.setHorizontalAlignment(SwingConstants.CENTER);
        txtQntCafe.setHorizontalAlignment(SwingConstants.CENTER);
        jPanelProdutos.add(labelNomeCafe);
        jPanelProdutos.add(labelPrecoCafe);
        jPanelProdutos.add(txtQntCafe);
    }

    private void initPanelRodape() {
        buttonComprar.setMaximumSize(new Dimension(50, 50));
        jPanelRodape.add(buttonComprar);

        labelPrecoTotal.setHorizontalAlignment(SwingConstants.CENTER);
        labelPrecoTotal.setFont(new Font("Sans Serif", Font.BOLD, 15));
        jPanelRodape.add(labelPrecoTotal);

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

            String qntArroz = txtQntArroz.getText();
            String qntFeijao = txtQntFeijao.getText();
            String qntBanana = txtQntBanana.getText();
            String qntTomate = txtQntTomate.getText();
            String qntSalame = txtQntSalame.getText();
            String qntCafe = txtQntCafe.getText();

            if (!valueRegex.matcher(qntArroz.trim()).matches() ||
                    !valueRegex.matcher(qntFeijao.trim()).matches() ||
                    !valueRegex.matcher(qntBanana.trim()).matches() ||
                    !valueRegex.matcher(qntTomate.trim()).matches() ||
                    !valueRegex.matcher(qntSalame.trim()).matches() ||
                    !valueRegex.matcher(qntCafe.trim()).matches()) {
                JOptionPane.showMessageDialog(null, "Valores incorretos");
                return;
            }

            Double qntArrozValue = Double.parseDouble(qntArroz.equals("") ? "0" : qntArroz);
            Double qntFeijaoValue = Double.parseDouble(qntFeijao.equals("") ? "0" : qntFeijao);
            Double qntBananaValue = Double.parseDouble(qntBanana.equals("") ? "0" : qntBanana);
            Double qntTomateValue = Double.parseDouble(qntTomate.equals("") ? "0" : qntTomate);
            Double qntSalameValue = Double.parseDouble(qntSalame.equals("") ? "0" : qntSalame);
            Double qntCafeValue = Double.parseDouble(qntCafe.equals("") ? "0" : qntCafe);



        }
    }
}
