package javaswing.calculadora;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaCalculadora extends JFrame {
	
	// Layout
	protected static final GridLayout frameGridLayout = new GridLayout(4, 1, 5, 5);
	protected static final GridLayout buttonPanelGridLayout = new GridLayout(1, 4);
	
	// JPanel
	protected static final JPanel buttonPanel = new JPanel();
	
	// JButton
	protected static final JButton button1 = new JButton("+");
	protected static final JButton button2 = new JButton("-");
	protected static final JButton button3 = new JButton("*");
	protected static final JButton button4 = new JButton("/");
	
	// JLabel
	protected static final JLabel resultLabel = new JLabel();
	
	// JTextField
	protected static final JTextField num1 = new JTextField();
	protected static final JTextField num2 = new JTextField();
	
	
	public TelaCalculadora() {
		setName("Calculadora");
		setLayout(frameGridLayout);
		setSize(new Dimension(300, 200));
		
		init();
		
		setVisible(true);
		setAlwaysOnTop(true);
	}
	
	private void init() {
		add(num1);
		add(num2);
		add(resultLabel);
		buttonPanelInit();
		add(buttonPanel);
	}
	
	private void buttonPanelInit() {
		buttonPanel.setLayout(buttonPanelGridLayout);
		
		buttonPanel.add(button1);
		buttonPanel.add(button2);
		buttonPanel.add(button3);
		buttonPanel.add(button4);
	}

}
