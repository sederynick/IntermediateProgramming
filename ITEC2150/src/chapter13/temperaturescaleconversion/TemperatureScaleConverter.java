package chapter13.temperaturescaleconversion;

import java.awt.event.ActionListener;

public interface TemperatureScaleConverter 
extends ActionListener {
	
	//public static final keywords are optional
	int WINDOW_WIDTH=350;
	int WINDOW_HEIGHT=250;
	
	//by default all methods are abstract in an interface
	double celciusToFahrenheit(double temperature);
	double celciusToKelvin(double temperature);
	double fahrenheitToCelcius(double temperature);
	double fahrenheitToKelvin(double temperature);
	double kelvinToCelcius(double temperature);
	double kelvinToFahrenheit(double temperature);
	
	
	
}
