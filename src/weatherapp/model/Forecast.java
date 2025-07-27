package weatherapp.model;

import java.util.Date;
/**
 *
 * @author HYMDZ
 */
public class Forecast {
    private long dt;           // Timestamp
    private Main main;         // Temperature, humidity, etc
    private Weather[] weather; // Weather conditions
    private Wind wind;         // Wind data
    private String dt_txt;     // Date text format
    
    public Forecast() {}
    
    public long getDt() { return dt; }
    public void setDt(long dt) { this.dt = dt; }
    
    public Main getMain() { return main; }
    public void setMain(Main main) { this.main = main; }
    
    public Weather[] getWeather() { return weather; }
    public void setWeather(Weather[] weather) { this.weather = weather; }
    
    public Wind getWind() { return wind; }
    public void setWind(Wind wind) { this.wind = wind; }
    
    public String getDt_txt() { return dt_txt; }
    public void setDt_txt(String dt_txt) { this.dt_txt = dt_txt; }
    
    // Helper method to get Date object
    public Date getDate() {
        return new Date(dt * 1000L); // Convert from Unix timestamp
    }
    
    // Helper method to get day name
    public String getDayName() {
        Date date = getDate();
        String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        return days[date.getDay()];
    }
}
