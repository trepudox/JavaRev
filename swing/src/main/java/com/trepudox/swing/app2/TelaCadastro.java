package com.trepudox.swing.app2;

import lombok.extern.slf4j.Slf4j;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@Slf4j
public class TelaCadastro extends JFrame implements ActionListener {

    // Panels
    protected static final JPanel pn01 = new JPanel();
    protected static final JPanel pn02 = new JPanel();
    protected static final JPanel pn03 = new JPanel();

    // Buttons
    protected static final JButton bt01 = new JButton("OK");
    protected static final JButton bt02 = new JButton("Cancelar");

    // Labels
    protected static final JLabel lb01 = new JLabel("Nome");
    protected static final JLabel lb02 = new JLabel("Email");

    // TextFields
    protected static final JTextField txt01 = new JTextField();
    protected static final JTextField txt02 = new JTextField();

    public TelaCadastro() {
        this.setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));
        this.setTitle("Cadastro");
        this.setResizable(false);
        this.setAlwaysOnTop(true);
        this.setBounds(5, 5, 300, 175);

        init();
        this.setVisible(true);
    }

    private void init() {
        txt01.setColumns(15);
        txt02.setColumns(15);

        bt01.setActionCommand("cadastrar");
        bt02.setActionCommand("cancelar");
        bt01.addActionListener(this);
        bt02.addActionListener(this);

        pn01.add(lb01);
        pn01.add(txt01);
        this.add(pn01);

        pn02.add(lb02);
        pn02.add(txt02);
        this.add(pn02);

        pn03.add(bt01);
        pn03.add(bt02);
        this.add(pn03);

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        String evento = event.getActionCommand();

        switch (evento) {
            case "cadastrar":
                String nome = TelaCadastro.txt01.getText();
                String email = TelaCadastro.txt02.getText();

                boolean camposValidos = validaCampos(nome, email);

                if (camposValidos) {
                   log.info(String.format("Cadastro realizado com sucesso. Nome: %s Email: %s%n", nome, email));
                    JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso!");
                    limpaCampos();
                } else {
                   log.info(String.format("Campos inválidos. Nome: %s Email: %s%n", nome, email));
                    JOptionPane.showMessageDialog(this, "Campos inválidos");
                }

                break;
            case "cancelar":
                limpaCampos();
                JOptionPane.showMessageDialog(this, "Os campos foram limpados.");
                break;
            default:
                log.warn("Nenhum ActionCommand com o valor: " + evento);

                break;
        }
    }

    private boolean validaCampos(String nome, String email) {
        boolean camposValidos = true;

        if (nome.isBlank()) {
            log.warn("Campo nome inválido");
            camposValidos = false;
        }

        if (email.isBlank()) {
            log.warn("Campo email inválido");
            camposValidos = false;
        }

        return camposValidos;
    }

    private void limpaCampos() {
        TelaCadastro.txt01.setText("");
        TelaCadastro.txt02.setText("");
    }
}
