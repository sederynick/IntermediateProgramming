package chapter13.temperaturescaleconversion;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

//Collections class requires that objects implement the comparable interface
//For example, the sort method in the collections class can sort any object based on the value
//of their instance variable.
//Collections.sort(list)'
public class TemperatureScaleConverterGUI implements TemperatureScaleConverter,
Comparable<TemperatureScaleConverterGUI> {
	
	
	private double temperature;
	private JFrame frame;
	private JPanel panel;
	private JLabel inputLabel;
	private JLabel outputLabel;
	private JLabel inputScale;
	private JLabel outputScale;
	private JLabel inputScaleLabel;
	private JLabel outputScaleLabel;
	private JTextField textField;
	private JRadioButton radioButtonInputCelcius;
	private JRadioButton radioButtonInputFahrenheit;
	private JRadioButton radioButtonInputKelvin;
	private JRadioButton radioButtonOutputCelcius;
	private JRadioButton radioButtonOutputFahrenheit;
	private JRadioButton radioButtonOutputKelvin;
	private JButton buttonAddToList; 
	private JButton buttonClear;
	private JButton buttonSort;
	private ArrayList<TemperatureScaleConverterGUI> list;
	private JRadioButton currentState;
	
	public TemperatureScaleConverterGUI(double temperature) {
		this.temperature=temperature;
		inputLabel = new JLabel("Input: ");
		outputLabel = new JLabel(String.format("Output: .%2f" + (char)176, temperature));
		inputScaleLabel = new JLabel("Input Scale");
		outputScaleLabel = new JLabel("Output Scale");
		textField = new JTextField(String.format(".%2f", temperature));
		radioButtonInputCelcius = new JRadioButton("Celcius");
		radioButtonInputFahrenheit = new JRadioButton("Fahrenheit");
		radioButtonInputKelvin = new JRadioButton("Kelvin");
		radioButtonOutputCelcius = new JRadioButton("Celcius");
		radioButtonOutputFahrenheit = new JRadioButton("Fahrenheit");
		radioButtonOutputKelvin = new JRadioButton("Kelvin");
	}
	

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	
	
	@Override
	public String toString() {
		return  temperature + "";
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public double celciusToFahrenheit(double temperature) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double celciusToKelvin(double temperature) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double fahrenheitToCelcius(double temperature) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double fahrenheitToKelvin(double temperature) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double kelvinToCelcius(double temperature) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double kelvinToFahrenheit(double temperature) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int compareTo(TemperatureScaleConverterGUI arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
