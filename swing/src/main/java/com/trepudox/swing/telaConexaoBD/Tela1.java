package com.trepudox.swing.telaConexaoBD;

import lombok.extern.slf4j.Slf4j;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
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

    // JLabel
    private static final JLabel sqlLabel = new JLabel(" ");

    public Tela1() {
        btnInit();
        textAreaInit();

        this.setTitle("Tela Conexao BD");
        this.setMinimumSize(new Dimension(500, 400));
        this.setVisible(true);
        this.setResizable(false);
    }

    private void btnInit() {
        btn1.setFont(new Font("Sans Serif", Font.BOLD, 15));
        btn1.setActionCommand("executar");
        btn1.addActionListener(this);

        btn2.setFont(new Font("Sans Serif", Font.BOLD, 15));
        btn2.setActionCommand("limpar");
        btn2.addActionListener(this);

        btnJPanel.add(btn1);
        btnJPanel.add(btn2);

        this.add(btnJPanel, BorderLayout.SOUTH);
    }

    private void textAreaInit() {
        txtArea.setFont(new Font("Sans Serif", Font.PLAIN, 25));
        txtArea.setBorder(new EmptyBorder(3, 3, 3, 3));

        sqlLabel.setFont(new Font("Sans Serif", Font.PLAIN, 25));
        sqlLabel.setBorder(new EmptyBorder(3, 3, 3, 3));

        txtJPanel.add(txtArea, sqlLabel);
        this.add(txtJPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();

        switch (actionCommand) {
            case "executar":
                try (Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_jdbc_teste?serverTimezone=UTC", "root", "root");
                     PreparedStatement stmt = c.prepareStatement(txtArea.getText())) {

                    if (txtArea.getText().contains("SELECT")) {
                        ResultSet rs = stmt.executeQuery();

                        if (rs.isLast()) {
                            sqlLabel.setText("N/A");
                            break;
                        }

                        StringBuilder txt = new StringBuilder();

                        while (rs.next()) {
                            txt.append(rs.getInt("id")).append(" ");
                        }

                        sqlLabel.setText(txt.toString());

                    } else {
                        int resultadoUpdate = stmt.executeUpdate();
                        sqlLabel.setText(String.valueOf(resultadoUpdate));
                    }

                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                break;

            case "limpar":
                txtArea.setText("");
                sqlLabel.setText(" a");
                break;

            default:
                log.error("Não há um comando para " + actionCommand);
        }
    }

}
