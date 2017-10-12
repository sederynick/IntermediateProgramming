package modularCalculator;

import java.awt.BorderLayout;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ModularCalculatorGUI implements ModualrCalculatorInterface {
	
	private int mod;
	private int input;
	
	private JFrame frame;
	private JPanel panel;
	private JLabel inputLabel;
	private JLabel inputLabel1;
	private JLabel outputLabel;
	private JButton calculate;
	private JTextField textField;
	private JTextField textField1;

	public ModularCalculatorGUI(int mod,int input) {
		this.mod=mod;
		this.input=input;
		
		inputLabel= new JLabel("Input: ");
		inputLabel1= new JLabel("Mod: ");
		outputLabel= new JLabel("Output: ");
		textField= new JTextField(input);
		textField.setText(input+ "");
		textField1=new JTextField(mod);
		textField.setText(mod+ "");
		calculate = new JButton("Calculate");
		
		frame = new JFrame();
		
		panel = new JPanel(new GridLayout(0,3));
		JPanel panel1 = new JPanel(new BorderLayout());
		panel1.add(inputLabel, BorderLayout.WEST);
		panel1.add(textField, BorderLayout.CENTER);
		panel.add(panel1);
		panel.add(new JPanel());
		JPanel panel2 = new JPanel(new BorderLayout());
		panel2.add(inputLabel1,BorderLayout.EAST);
		panel2.add(textField1,BorderLayout.CENTER);
		panel.add(panel2);
		panel.add(new JPanel());
		panel.add(calculate);
		panel.add(new JPanel());
		outputLabel.setHorizontalAlignment(JLabel.CENTER);
		panel.add(outputLabel);
		panel.add(new JPanel());
		
		frame.add(panel);
		frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		int x =GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().x;
		int y =GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().y;
		frame.setLocation(x-WINDOW_HEIGHT/2,y-WINDOW_HEIGHT/2);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
		
		calculate.addActionListener(this);
		
	}
	public int getMod() {
		return mod;
	}
	public void setMod(int mod) {
		this.mod = mod;
	}
	public int getInput() {
		return input;
	}
	public void setInput(int input) {
		this.input = input;
	}
	
	@Override
	public String toString() {
		return "ModularCalculatorGUI [mod=" + mod + ", input=" + input + "]";
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		input = Integer.parseInt(textField.getText());
		mod = Integer.parseInt(textField1.getText());
		if(arg0.getSource()==calculate){
			
			
		}

	}

	@Override
	public double modCalculation(int mod, int input) {
		return input%mod;
	}

}
