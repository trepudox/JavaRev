package com.trepudox.swing.calculadora2;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaCalculadora2 extends JFrame {
	
	// Layout
	protected static final GridLayout frameGridLayout = new GridLayout(2, 1, 5, 5);
	protected static final GridLayout buttonPanelGridLayout = new GridLayout(6, 4);
	
	// JPanel
	protected static final JPanel buttonPanel = new JPanel();
	
	// JButton
	
	protected static final JButton buttonPorcento = new JButton("%");
	protected static final JButton buttonCE = new JButton("CE");
	protected static final JButton buttonC = new JButton("C");
	protected static final JButton buttonBack = new JButton("Back");
	
	protected static final JButton buttonh1 = new JButton("1/2");
	protected static final JButton buttonh2 = new JButton("x^2");
	protected static final JButton buttonRaiz = new JButton("Raiz");
	protected static final JButton buttonDiv = new JButton("/");
	
	protected static final JButton button7 = new JButton("7");
	protected static final JButton button8 = new JButton("8");
	protected static final JButton button9 = new JButton("9");
	protected static final JButton buttonMult = new JButton("*");
	
	protected static final JButton button4 = new JButton("4");
	protected static final JButton button5 = new JButton("5");
	protected static final JButton button6 = new JButton("6");
	protected static final JButton buttonSubt = new JButton("-");

	protected static final JButton button1 = new JButton("1");
	protected static final JButton button2 = new JButton("2");
	protected static final JButton button3 = new JButton("3");
	protected static final JButton buttonSoma = new JButton("+");
	
	protected static final JButton buttonNsei = new JButton("/-");
	protected static final JButton button0 = new JButton("0");
	protected static final JButton buttonVirgula = new JButton(",");
	protected static final JButton buttonIgual = new JButton("=");
	
	
	// JLabel
	protected static final JLabel resultLabel = new JLabel();
	
	// JTextField
	protected static final JTextField num = new JTextField();
	
	
	public TelaCalculadora2() {
		setLayout(frameGridLayout);
		setTitle("Calculadora 2");
		setSize(400, 300);
		
		init();
		
		add(BorderLayout.NORTH, num);
		add(BorderLayout.CENTER, buttonPanel);
		
		setVisible(true);
		setAlwaysOnTop(true);
	}
	
	private void init() {
		numInit();
		buttonPanelInit();
		
		add(num);
		add(buttonPanel);
	}
	
	private void buttonPanelInit() {
		buttonPanel.setLayout(buttonPanelGridLayout);
		
		buttonPanel.add(buttonPorcento);
		buttonPanel.add(buttonCE);
		buttonPanel.add(buttonC);
		buttonPanel.add(buttonBack);
		
		buttonPanel.add(buttonh1);
		buttonPanel.add(buttonh2);
		buttonPanel.add(buttonRaiz);
		buttonPanel.add(buttonDiv);
		
		buttonPanel.add(button7);
		buttonPanel.add(button8);
		buttonPanel.add(button9);
		buttonPanel.add(buttonMult);
		
		buttonPanel.add(button4);
		buttonPanel.add(button5);
		buttonPanel.add(button6);
		buttonPanel.add(buttonSubt);

		buttonPanel.add(button1);
		buttonPanel.add(button2);
		buttonPanel.add(button3);
		buttonPanel.add(buttonSoma);

		buttonPanel.add(buttonNsei);
		buttonPanel.add(button0);
		buttonPanel.add(buttonVirgula);
		buttonPanel.add(buttonIgual);
	}
	
	private void numInit() {
		num.setAlignmentX(RIGHT_ALIGNMENT);
		num.setFont(new Font("Arial", Font.PLAIN, 50));
	}
	
}
