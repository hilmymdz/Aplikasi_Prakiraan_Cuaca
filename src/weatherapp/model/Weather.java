package weatherapp.model;

/**
 *
 * @author HYMDZ
 */
public class Weather {
    private String main;
    private String description;
    private String icon;
    
    // Constructors, getters, setters
    public Weather() {}
    
    public String getMain() { return main; }
    public void setMain(String main) { this.main = main; }
    
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    
    public String getIcon() { return icon; }
    public void setIcon(String icon) { this.icon = icon; }
}
