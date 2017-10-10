package chapter13.temperaturescaleconversion;

import java.awt.event.ActionListener;

public interface TemperatureScaleConverter extends ActionListener {
	//public static final is optional in an interface
	int WINDOW_WIDTH = 350;
	public static final int WINDOW_HEIGHT = 250; 
	
	//all methods in an interface are public abstract by default
	double celsiusToFahrenheit(double temperature);
	public abstract double celsiusToKelvin(double temperature);
	double fahrenheitToCelsius(double temperature);
	double fahrenheitToKelvin(double temperature);
	double kelvinToCelsius(double temperature);
	double kelvinToFahrenheit(double temperature);

}
