package com.trepudox.swing.testeJTable;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class Tela1 extends JFrame {

    // Titulo
    private static final String[] tituloColunas = {"Col1", "Col2", "Col3"};

    // DefaultTableModel - manipulação dos dados
    private static final DefaultTableModel defaultTableModel = new DefaultTableModel(tituloColunas, 0);

    // JTable - estrutura
    private static final JTable jTable = new JTable(defaultTableModel);

    // JScrollPane - painel com barra de rolagem
    private static final JScrollPane jScrollPane = new JScrollPane();

    public Tela1() {

        initJScrollPane();
        initDefaultTableModel();

        this.setMinimumSize(new Dimension(400, 300));
        this.setTitle("Teste JTable");
        this.setVisible(true);

    }

    private void initJScrollPane() {
        jScrollPane.setViewportView(jTable);
        this.add(jScrollPane);
    }

    private void initDefaultTableModel() {
        String[] dadosColunas = {"Valor ", "Valor ", "Valor ", "Valor ", "Valor "};
        for (int i = 0; i < 20; i++) {
            dadosColunas[0] += i;
            dadosColunas[1] += i;
            dadosColunas[2] += i;
            dadosColunas[3] += i;
            dadosColunas[4] += i;
            defaultTableModel.addRow(dadosColunas);
        }

    }

}
