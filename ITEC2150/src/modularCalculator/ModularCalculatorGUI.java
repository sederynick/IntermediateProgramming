package modularCalculator;

import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ModularCalculatorGUI implements ModualrCalculatorInterface {
	
	private int mod;
	private int input;
	private int answer;
	
	private JFrame frame;
	private JPanel panel;
	private JLabel inputLabel;
	private JLabel outputLabel;
	private JTextField textField;

	public ModularCalculatorGUI(int mod,int input) {
		this.mod=mod;
		this.input=input;
		answer=input%mod;
		return;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public double modCalculation(int mod, int input) {
		// TODO Auto-generated method stub
		return 0;
	}

}
