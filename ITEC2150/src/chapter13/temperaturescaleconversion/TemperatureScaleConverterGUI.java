package chapter13.temperaturescaleconversion;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

//Collections class requires that objects implement the Comparable interface. For example, the sort method
// in the Collections class can sort any objects based on the value of their instance variable.
//Collections.sort(list);
public class TemperatureScaleConverterGUI implements TemperatureScaleConverter, Comparable<TemperatureScaleConverterGUI> {
	private double temperature;
	private JFrame frame;
	private JPanel panel;
	private JLabel inputLabel;
	private JLabel outputLabel;
	private JLabel inputScaleLabel;
	private JLabel outputScaleLabel;
	private JTextField textField;
	private JRadioButton radioButtonInputCelsius;
	private JRadioButton radioButtonInputFahrenheit;
	private JRadioButton radioButtonInputKelvin;
	private JRadioButton radioButtonOutputCelsius;
	private JRadioButton radioButtonOutputFahrenheit;
	private JRadioButton radioButtonOutputKelvin;
	private JButton buttonAddToList;
	private JButton buttonClear;
	private JButton buttonSort;
	private ArrayList<TemperatureScaleConverterGUI> list;
	private JRadioButton currentState;
	private ButtonGroup inputScaleRadioButtonGroup;
	private ButtonGroup outputScaleRadioButtonGroup;

	public TemperatureScaleConverterGUI(double temperature) {
		super();
		this.temperature = temperature;
		inputLabel = new JLabel("Input: ");
		outputLabel = new JLabel(String.format("Output: %.2f" + (char)176, temperature));
		inputScaleLabel = new JLabel("Input Scale");
		outputScaleLabel = new JLabel("Output Scale");
		textField = new JTextField(String.format("%.2f", temperature));
		radioButtonInputCelsius = new JRadioButton("Celsius");
		radioButtonInputFahrenheit = new JRadioButton("Fahrenheit");
		radioButtonInputKelvin = new JRadioButton("Kelvin");
		radioButtonOutputCelsius = new JRadioButton("Celsius");
		radioButtonOutputFahrenheit = new JRadioButton("Fahrenheit");
		radioButtonOutputKelvin = new JRadioButton("Kelvin");

		inputScaleRadioButtonGroup = new ButtonGroup();
		outputScaleRadioButtonGroup = new ButtonGroup();

		inputScaleRadioButtonGroup.add(radioButtonInputCelsius);
		inputScaleRadioButtonGroup.add(radioButtonInputFahrenheit);
		inputScaleRadioButtonGroup.add(radioButtonInputKelvin);

		outputScaleRadioButtonGroup.add(radioButtonOutputCelsius);
		outputScaleRadioButtonGroup.add(radioButtonOutputFahrenheit);
		outputScaleRadioButtonGroup.add(radioButtonOutputKelvin);

		buttonAddToList = new JButton("Add to List");
		buttonClear = new JButton("Clear");
		buttonSort = new JButton("Sort");

		frame = new JFrame();
		//Default layout for a panel is FlowLayout
		//FlowLayout sets the components one after another in the order they are added
		panel = new JPanel(new GridLayout(0,3));
		panel.add(new JPanel());
		JPanel panel1 = new JPanel(new BorderLayout());
		panel1.add(inputLabel, BorderLayout.WEST);
		panel1.add(textField, BorderLayout.CENTER);
		panel.add(panel1);
		panel.add(new JPanel());

		panel.add(inputScaleLabel);
		panel.add(new JPanel());
		panel.add(outputScaleLabel);

		panel.add(radioButtonInputCelsius);
		panel.add(new JPanel());
		panel.add(radioButtonOutputCelsius);

		panel.add(radioButtonInputFahrenheit);
		panel.add(new JPanel());
		panel.add(radioButtonOutputFahrenheit);

		panel.add(radioButtonInputKelvin);
		panel.add(new JPanel());
		panel.add(radioButtonOutputKelvin);

		panel.add(buttonAddToList);
		panel.add(buttonClear);
		panel.add(buttonSort);

		//Center outputLable in the column
		outputLabel.setHorizontalAlignment(JLabel.CENTER);

		panel.add(new JPanel());
		panel.add(outputLabel);
		panel.add(new JPanel());

		frame.add(panel);
		frame.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);

		radioButtonInputCelsius.addActionListener(this);
		radioButtonInputFahrenheit.addActionListener(this);
		radioButtonInputKelvin.addActionListener(this);
		radioButtonOutputCelsius.addActionListener(this);
		radioButtonOutputFahrenheit.addActionListener(this);
		radioButtonOutputKelvin.addActionListener(this);
		buttonAddToList.addActionListener(this);
		buttonClear.addActionListener(this);
		buttonSort.addActionListener(this);

		list = new ArrayList<>();

	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	@Override
	public String toString() {
		return temperature + "";
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		//If a user enters a character other than a number in the text box, then as we convert the String from the
		// text box to a Double then there will be a NumberFormatException
		try {
			if(arg0.getSource() == buttonClear) {
				textField.setText("");
				textField.grabFocus();
				temperature = 0;
				//The currentState variable will inform the program what button in the input scale was selected
				currentState = null;
				inputScaleRadioButtonGroup.clearSelection();
				outputScaleRadioButtonGroup.clearSelection();
				outputLabel.setText("No Input");
				return;
			}
			else if(arg0.getSource() == radioButtonInputCelsius || arg0.getSource() == radioButtonInputFahrenheit 
					|| arg0.getSource() == radioButtonInputKelvin) {
				
			}
		}
		catch(NumberFormatException e) {

		}

	}

	@Override
	public double celsiusToFahrenheit(double temperature) {
		// TODO Auto-generated method stub
		return temperature *(9/5) + 32 ;
	}

	@Override
	public double celsiusToKelvin(double temperature) {
		// TODO Auto-generated method stub
		return temperature + 273.15;
	}

	@Override
	public double fahrenheitToCelsius(double temperature) {
		// TODO Auto-generated method stub
		return (temperature - 32) * (5/9);
	}

	@Override
	public double fahrenheitToKelvin(double temperature) {
		// TODO Auto-generated method stub
		return (temperature + 459.67) * (5/9);
	}

	@Override
	public double kelvinToCelsius(double temperature) {
		// TODO Auto-generated method stub
		return temperature - 273.15;
	}

	@Override
	public double kelvinToFahrenheit(double temperature) {
		// TODO Auto-generated method stub
		return temperature * (9/5) - 459.67;
	}

	@Override
	public int compareTo(TemperatureScaleConverterGUI arg0) {
		// TODO Auto-generated method stub
		if (this.temperature > arg0.temperature)
			return 1;
		else if (this.temperature < arg0.temperature)
			return -1;
		else
			return 0;
	}

}
