package weatherapp.model;

/**
 *
 * @author HYMDZ
 */
public class ForecastRespone {
    private String cod;
    private int message;
    private int cnt;           // Number of forecasts
    private Forecast[] list;   // Array of forecast data
    private City city;         // City information
    
    public ForecastRespone() {}
    
    public String getCod() { return cod; }
    public void setCod(String cod) { this.cod = cod; }
    
    public int getMessage() { return message; }
    public void setMessage(int message) { this.message = message; }
    
    public int getCnt() { return cnt; }
    public void setCnt(int cnt) { this.cnt = cnt; }
    
    public Forecast[] getList() { return list; }
    public void setList(Forecast[] list) { this.list = list; }
    
    public City getCity() { return city; }
    public void setCity(City city) { this.city = city; }
}
