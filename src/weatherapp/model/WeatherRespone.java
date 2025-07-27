package weatherapp.model;

/**
 *
 * @author HYMDZ
 */
public class WeatherRespone {
    private Weather[] weather;
    private Main main;
    private Wind wind;
    private String name;
    private int cod;
    
    // Constructors, getters, setters
    public WeatherRespone() {}
    
    public Weather[] getWeather() { return weather; }
    public void setWeather(Weather[] weather) { this.weather = weather; }
    
    public Main getMain() { return main; }
    public void setMain(Main main) { this.main = main; }
    
    public Wind getWind() { return wind; }
    public void setWind(Wind wind) { this.wind = wind; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public int getCod() { return cod; }
    public void setCod(int cod) { this.cod = cod; }
}
