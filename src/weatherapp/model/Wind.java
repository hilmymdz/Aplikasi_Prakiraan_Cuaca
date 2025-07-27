package weatherapp.model;

/**
 *
 * @author HYMDZ
 */
public class Wind {
    private double speed;  // Kecepatan angin dalam m/s
    private int deg;       // Arah angin dalam derajat
    
    public Wind() {}
    
    public double getSpeed() { return speed; }
    public void setSpeed(double speed) { this.speed = speed; }
    
    public int getDeg() { return deg; }
    public void setDeg(int deg) { this.deg = deg; }
    
    // Convert m/s to mph
    public double getSpeedInMph() {
        return speed * 2.237;  // 1 m/s = 2.237 mph
    }
    
    // Convert m/s to km/h
    public double getSpeedInKmh() {
        return speed * 3.6;    // 1 m/s = 3.6 km/h
    }
}
