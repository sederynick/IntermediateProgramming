package modularCalculator;

import java.awt.event.ActionEvent;

import javax.swing.JFrame;

public class ModularCalculatorGUI implements ModualrCalculatorInterface {
	
	private int mod;
	private int input;
	
	private JFrame frame;
	private JPanel panel;
	private JLabel inputLabel;
	private JLabel outputLabel;
	private

	public ModularCalculatorGUI(int mod, int input) {
		this.mod=mod;
		this.input=input
				
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
