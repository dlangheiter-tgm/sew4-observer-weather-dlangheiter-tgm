package observer.weather;

/**
 * Interface to get weather data
 */
public interface IWeatherData {

    /**
     * Getter for temperature
     * @return current temperature
     */
    public float getTemperature();

    /**
     * Getter for humidity
     * @return current humidity
     */
    public float getHumidity();

    /**
     * Getter for pressure
     * @return current pressure
     */
    public float getPressure();

}
