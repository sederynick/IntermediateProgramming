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
	private int answer;
	
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
		textField1=new JTextField(mod);
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
	
	public int getAnswer() {
		return answer;
	}
	public void setAnswer(int answer) {
		this.answer = answer;
	}
	
	
	@Override
	public String toString() {
		return "ModularCalculatorGUI [mod=" + mod + ", input=" + input + ", answer=" + answer + "]";
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		try{
			if(arg0.getSource()==calculate){
		input= Integer.parseInt(textField.getText());
		mod= Integer.parseInt(textField1.getText());
		modCalculation(mod,input);
		
		outputLabel.setText(String.format("Output: " + answer));
			}
			else if(mod==0){
				outputLabel.setText("No/Wrong Input");
			}
		}
		catch(NumberFormatException e) {
			//handling the case when the textField has an empty string or a non numeric character
			textField.grabFocus();
			textField1.grabFocus();
			answer = 0;
			outputLabel.setText("No/Wrong Input");
		}
	}

	@Override
	public double modCalculation(int mod, int input) {
	 answer=input%mod;
	 return answer;
	}

}
