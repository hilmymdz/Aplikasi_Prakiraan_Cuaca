package weatherapp.service;

import com.google.gson.Gson;
import weatherapp.model.WeatherRespone;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import weatherapp.model.ForecastRespone;

/**
 *
 * @author HYMDZ
 */
public class WeatherService {
    private static final String API_KEY = "690ff40880ff8d9c7428dd889dc7569f";
    private static final String BASE_URL = "https://api.openweathermap.org/data/2.5/weather";
    private static final String FORECAST_URL = "https://api.openweathermap.org/data/2.5/forecast";
    
    private HttpClient httpClient;
    private Gson gson;
    
    public WeatherService() {
        httpClient = HttpClient.newHttpClient();
        gson = new Gson();
    }
    
    public WeatherRespone getWeatherByCity(String cityName) throws IOException, InterruptedException {
        String url = BASE_URL + "?q=" + cityName + "&appid=" + API_KEY + "&units=metric";
        
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();
        
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        
        if (response.statusCode() == 200) {
            return gson.fromJson(response.body(), WeatherRespone.class);
        } else {
            throw new IOException("Error: " + response.statusCode());
        }
    }
    
    public ForecastRespone getForecastByCity(String cityName) throws IOException, InterruptedException {
        String url = FORECAST_URL + "?q=" + cityName + "&appid=" + API_KEY + "&units=metric";
        
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();
        
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        
        if (response.statusCode() == 200) {
            return gson.fromJson(response.body(), ForecastRespone.class);
        } else {
            throw new IOException("Error: " + response.statusCode());
        }
    }
}
