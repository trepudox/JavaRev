package com.trepudox.swing.calculadora;

import lombok.extern.slf4j.Slf4j;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

@Slf4j
public class TelaCalculadora extends JFrame implements ActionListener, KeyListener {
	
	// Layout
	protected static final GridLayout frameGridLayout = new GridLayout(4, 1, 5, 5);
	protected static final GridLayout buttonPanelGridLayout = new GridLayout(1, 5);
	
	// JPanel
	protected static final JPanel buttonPanel = new JPanel();
	
	// JButton
	protected static final JButton button1 = new JButton("+");
	protected static final JButton button2 = new JButton("-");
	protected static final JButton button3 = new JButton("*");
	protected static final JButton button4 = new JButton("/");
	protected static final JButton button5 = new JButton("C");

	// JLabel
	protected static final JLabel resultLabel = new JLabel("0");
	
	// JTextField
	protected static final JTextField num1 = new JTextField("0");
	protected static final JTextField num2 = new JTextField("0");
	
	
	public TelaCalculadora() {
		setTitle("Calculadora");
		setLayout(frameGridLayout);
		setSize(new Dimension(350, 500));

		init();
		this.addKeyListener(this);

		setVisible(true);
		setAlwaysOnTop(true);
	}
	
	private void init() {
		numsInit();
		add(num1);
		add(num2);

		resultLabelInit();
		add(resultLabel);

		buttonPanelInit();
		add(buttonPanel);
	}

	private void numsInit() {
		num1.setFont(new Font("Arial", Font.PLAIN, 40));
		num2.setFont(new Font("Arial", Font.PLAIN, 40));
	}

	private void resultLabelInit() {
		resultLabel.setFont(new Font("Arial", Font.BOLD, 40));
	}

	private void buttonPanelInit() {
		buttonPanel.setLayout(buttonPanelGridLayout);

		button1.setFont(new Font("Arial", Font.PLAIN, 25));
		button1.addActionListener(this);
		button1.setActionCommand("+");
		buttonPanel.add(button1);

		button2.setFont(new Font("Arial", Font.PLAIN, 25));
		button2.addActionListener(this);
		button2.setActionCommand("-");
		buttonPanel.add(button2);

		button3.setFont(new Font("Arial", Font.PLAIN, 25));
		button3.addActionListener(this);
		button3.setActionCommand("*");
		buttonPanel.add(button3);

		button4.setFont(new Font("Arial", Font.PLAIN, 25));
		button4.addActionListener(this);
		button4.setActionCommand("/");
		buttonPanel.add(button4);

		button5.setFont(new Font("Arial", Font.PLAIN, 25));
		button5.addActionListener(this);
		button5.setActionCommand("C");
		buttonPanel.add(button5);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();

		try {

			double n1 = Double.parseDouble(TelaCalculadora.num1.getText());
			double n2 = Double.parseDouble(TelaCalculadora.num2.getText());
			double result = 0;

			switch (actionCommand) {
				case "+":
					result = n1 + n2;
               		TelaCalculadora.resultLabel.setText(String.valueOf(result));
					limpaNums();
                	break;

				case "-":
					result = n1 - n2;
					TelaCalculadora.resultLabel.setText(String.valueOf(result));
					limpaNums();
					break;

				case "*":
					result = n1 * n2;
					TelaCalculadora.resultLabel.setText(String.valueOf(result));
					limpaNums();
					break;

				case "/":
					result = n1 / n2;
					TelaCalculadora.resultLabel.setText(String.valueOf(result));
					limpaNums();
					break;

				case "C":
					TelaCalculadora.resultLabel.setText("0.0");
					limpaNums();
					break;

				default:
					log.error("Nenhuma ação definida para '{}'", actionCommand);
					break;
			}
		} catch (NumberFormatException exception) {
			log.error("Erro na conversão dos números: {}", exception.getMessage());

			limpaNums();

			JOptionPane.showMessageDialog(this, exception.getMessage());
		} catch (RuntimeException exception) {
			JOptionPane.showMessageDialog(this, exception.getMessage());

			limpaNums();

			log.error("Erro: {}", exception.getMessage());
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		char keyChar = e.getKeyChar();
		System.out.println("chegou");
		switch (keyChar) {
			case 'a':
				JOptionPane.showMessageDialog(this, "a");
				break;
			case 'A':
				JOptionPane.showMessageDialog(this, "A");
				break;
			default:
				log.info("nenhuma ação definida para a tecla '{}'", keyChar);
				break;
		}
	}

	private void limpaNums() {
		TelaCalculadora.num1.setText("0");
		TelaCalculadora.num2.setText("0");
	}

	@Override
	public void keyPressed(KeyEvent e) {

	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

}
