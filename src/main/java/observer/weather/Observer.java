package observer.weather;

/**
 * Interface for our WeatherDisplays
 */
public interface Observer {
	/**
	 * Called when there is an update in the data
	 */
	public void update();
}
