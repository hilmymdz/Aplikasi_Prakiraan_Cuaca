package weatherapp.model;

/**
 *
 * @author HYMDZ
 */
public class City {
    private int id;
    private String name;
    private String country;
    private long population;
    private int timezone;
    
    public City() {}
    
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }
    
    public long getPopulation() { return population; }
    public void setPopulation(long population) { this.population = population; }
    
    public int getTimezone() { return timezone; }
    public void setTimezone(int timezone) { this.timezone = timezone; }
}
