package observer.weather;

/**
 * Interface for our WeatherDisplays
 */
public interface Observer {
	/**
	 * Called when there is an update in the data
	 * @param temp new temperature
	 * @param humidity new humidity
	 * @param pressure new pressure
	 */
	public void update(float temp, float humidity, float pressure);
}
