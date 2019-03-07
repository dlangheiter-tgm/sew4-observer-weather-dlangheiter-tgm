package observer.weather;
	
public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private Subject weatherData;

	/**
	 * Constructor
	 * @param weatherData Subject(Observable) to subscribe to
	 */
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		// register ourself as an observer at our observable
		weatherData.registerObserver(this);
	}

	@Override
	public void update() {
		// Get new data from weatherData
		this.temperature = weatherData.getTemperature();
		this.humidity = weatherData.getHumidity();
		// Display changes
		display();
	}

	/**
	 * Display the current conditions
	 */
	public void display() {
		System.out.println("Current conditions: " + temperature 
			+ "F degrees and " + humidity + "% humidity");
	}
}
