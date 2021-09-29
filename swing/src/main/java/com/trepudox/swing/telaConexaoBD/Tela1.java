package com.trepudox.swing.telaConexaoBD;

import com.mysql.cj.exceptions.WrongArgumentException;
import lombok.extern.slf4j.Slf4j;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

@Slf4j
public class Tela1 extends JFrame implements ActionListener {

    // GridLayout
    private static final GridLayout gridLayout1 = new GridLayout(1, 2);
    private static final GridLayout gridLayout2 = new GridLayout(2, 1);

    // JPanel
    private static final JPanel btnJPanel = new JPanel(gridLayout1);
    private static final JPanel txtJPanel = new JPanel(gridLayout2);

    // JButton
    private static final JButton btn1 = new JButton("EXECUTAR");
    private static final JButton btn2 = new JButton("LIMPAR");

    // JTextArea
    private static final JTextArea txtArea = new JTextArea(2, 5);

    // TituloColunas
    private static final String[] tituloColunas = {"id", "nome", "data_nasc", "profissao_id"};

    // DefaultTableModel - manipulação dos dados
    private static final DefaultTableModel defaultTableModel = new DefaultTableModel(tituloColunas, 0);

    // JTable - estrutura
    private static final JTable jTable = new JTable(defaultTableModel);

    // JScrollPane - painel com barra de rolagem
    private static final JScrollPane jScrollPane = new JScrollPane();

    public Tela1() {
        initJScrollPane();
        btnInit();
        textAreaInit();

        this.setTitle("Tela Conexao BD");
        this.setMinimumSize(new Dimension(800, 600));
        this.setVisible(true);
        this.setResizable(false);
    }

    private void initJScrollPane() {
        jScrollPane.setViewportView(jTable);
        this.add(jScrollPane);
    }

    private void btnInit() {
        btn1.setFont(new Font("Sans Serif", Font.BOLD, 20));
        btn1.setActionCommand("executar");
        btn1.addActionListener(this);

        btn2.setFont(new Font("Sans Serif", Font.BOLD, 20));
        btn2.setActionCommand("limpar");
        btn2.addActionListener(this);

        btnJPanel.add(btn1);
        btnJPanel.add(btn2);

        this.add(btnJPanel, BorderLayout.SOUTH);
    }

    private void textAreaInit() {
        txtArea.setFont(new Font("Sans Serif", Font.PLAIN, 25));
        txtArea.setBorder(new EmptyBorder(3, 3, 3, 3));

        txtJPanel.add(txtArea);
        txtJPanel.add(jScrollPane);
        this.add(txtJPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();

        switch (actionCommand) {
            case "executar":
                defaultTableModel.setRowCount(0);

                try (Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_jdbc_teste?serverTimezone=UTC", "root", "root");
                     PreparedStatement stmt = c.prepareStatement(txtArea.getText())) {

                    if (txtArea.getText().contains("SELECT")) {
                        ResultSet rs = stmt.executeQuery();

                        while (rs.next()) {
                            String[] linha = {String.valueOf(rs.getInt("id")),
                                    rs.getString("nome"),
                                    String.valueOf(rs.getDate("data_nasc")),
                                    String.valueOf(rs.getInt("profissao_id"))};
                            defaultTableModel.addRow(linha);
                        }

                    }

                } catch (SQLException ex) {
                    log.error(ex.getMessage());
                }
                break;

            case "limpar":
                txtArea.setText("");

                defaultTableModel.setRowCount(0);

                break;

            default:
                log.error("Não há um comando para " + actionCommand);
        }
    }

}
