package observer.weather;

import java.util.*;

/**
 * Implementation of an Subject(Observable) in form of weather data
 */
public class WeatherData implements Subject {
	private ArrayList observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList();
	}

	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.update();
		}
	}

	/**
	 * Called when the measurements have changed
	 * Calls notifyObservers
	 */
	public void measurementsChanged() {
		notifyObservers();
	}

	/**
	 * Public method to update measurements. Calls measurementsChanged
	 * @param temperature new temperature
	 * @param humidity new humidity
	 * @param pressure new pressure
	 */
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	/**
	 * Getter for temperature
	 * @return current temperature
	 */
	public float getTemperature() {
		return temperature;
	}

	/**
	 * Getter for humidity
	 * @return current humidity
	 */
	public float getHumidity() {
		return humidity;
	}

	/**
	 * Getter for pressure
	 * @return current pressure
	 */
	public float getPressure() {
		return pressure;
	}
}
