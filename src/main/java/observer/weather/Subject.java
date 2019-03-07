package observer.weather;

/**
 * Interface for our WeatherStation (observable)
 */
public interface Subject {
	/**
	 * Register new observer
	 * @param o Observer to register
	 */
	public void registerObserver(Observer o);

	/**
	 * Remove registered observer
	 * @param o Observer to remove
	 */
	public void removeObserver(Observer o);

	/**
	 * Function to notify the registered observers
	 */
	public void notifyObservers();
}
