package observer.weather;

import java.util.*;

public class WeatherStation {

	public static void main(String[] args) {
		// Make a new observable object
		WeatherData weatherData = new WeatherData();

		// Create new observers and give them the observable so they can register themself
		CurrentConditionsDisplay currentDisplay = 
			new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

		// Simulate changing data
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
