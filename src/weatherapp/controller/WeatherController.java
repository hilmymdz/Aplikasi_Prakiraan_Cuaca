package weatherapp.controller;

import weatherapp.model.Forecast;
import weatherapp.model.ForecastRespone;
import weatherapp.model.WeatherRespone;
import weatherapp.service.WeatherService;
import java.io.IOException;
import java.util.*;
import weatherapp.service.FavoriteCityService;

/**
 *
 * @author HYMDZ
 */
public class WeatherController {
    private WeatherService weatherService;
    private FavoriteCityService favoriteCityService; 
    private List<String> favoriteCities; 

    
    public WeatherController() {
        weatherService = new WeatherService();
        favoriteCityService = new FavoriteCityService();
        favoriteCities = favoriteCityService.loadFavorites(); 
    }
    
    public List<String> getFavoriteCities() {
        return favoriteCities;
    }
    
    public void addFavoriteCity(String cityName) {
        if (!favoriteCities.contains(cityName)) {
            favoriteCities.add(cityName);
            favoriteCityService.saveFavorites(favoriteCities); 
        }
    }
    
    public void removeFavoriteCity(String cityName) {
        favoriteCities.remove(cityName);
        favoriteCityService.saveFavorites(favoriteCities); 
    }
    
    public WeatherRespone getWeatherData(String cityName) {
        try {
            return weatherService.getWeatherByCity(cityName);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public ForecastRespone getForecastData(String cityName) {
        try {
            return weatherService.getForecastByCity(cityName);
        } catch (IOException | InterruptedException e){
            e.printStackTrace();
            return null;
        }
    }
    
    public List<Forecast> getDailyForecast(ForecastRespone forecastResponse) {
        if (forecastResponse == null || forecastResponse.getList() == null) {
            return new ArrayList<>();
        }

        // Use LinkedHashMap to group forecasts by date while preserving order
        Map<String, List<Forecast>> forecastsByDay = new LinkedHashMap<>();
        for (Forecast forecast : forecastResponse.getList()) {
            String dateStr = forecast.getDt_txt().split(" ")[0];
            forecastsByDay.computeIfAbsent(dateStr, k -> new ArrayList<>()).add(forecast);
        }

        List<Forecast> dailySummaryList = new ArrayList<>();
        for (List<Forecast> dayForecasts : forecastsByDay.values()) {
            if (dayForecasts.isEmpty()) continue;

            double minTemp = Double.MAX_VALUE;
            double maxTemp = Double.MIN_VALUE;

            // Iterate through all 3-hour blocks for the day to find the true min and max
            for (Forecast f : dayForecasts) {
                if (f.getMain().getTemp_min() < minTemp) {
                    minTemp = f.getMain().getTemp_min();
                }
                if (f.getMain().getTemp_max() > maxTemp) {
                    maxTemp = f.getMain().getTemp_max();
                }
            }

            // Pick a representative forecast for the day (e.g., the one at noon) for icon and description
            Forecast representativeForecast = dayForecasts.stream()
                    .filter(f -> f.getDt_txt().contains("12:00:00"))
                    .findFirst()
                    .orElse(dayForecasts.get(0));

            // Overwrite the min/max temp in the representative forecast with our calculated values
            representativeForecast.getMain().setTemp_min(minTemp);
            representativeForecast.getMain().setTemp_max(maxTemp);

            dailySummaryList.add(representativeForecast);
        }

        // Return the list, limited to 5 days
        return dailySummaryList.size() > 5 ? dailySummaryList.subList(0, 5) : dailySummaryList;
    }
    
    public String formatWeatherInfo(WeatherRespone response) {
        if (response == null) {
            return "Data cuaca tidak tersedia";
        }
        
        StringBuilder info = new StringBuilder();
        info.append("Kota: ").append(response.getName()).append("\n");
        info.append("Suhu: ").append(response.getMain().getTemp()).append("°C\n");
        info.append("Kelembaban: ").append(response.getMain().getHumidity()).append("%\n");
        info.append("Kondisi: ").append(response.getWeather()[0].getDescription());
        
        return info.toString();
    }
    
    public String formatForecastInfo(Forecast forecast) {
        if (forecast == null) {
            return "No data";
        }
        
        int temp = (int) Math.round(forecast.getMain().getTemp());
        String condition = forecast.getWeather()[0].getMain();
        String day = forecast.getDayName();
        
        return day + "\n" + temp + "°C\n" + condition;
    }
}
