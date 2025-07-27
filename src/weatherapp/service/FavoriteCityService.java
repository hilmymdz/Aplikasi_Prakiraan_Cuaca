package weatherapp.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HYMDZ
 */
public class FavoriteCityService {
    private static final Path FILE_PATH = Paths.get("favorites.txt");
    
    public List<String> loadFavorites() {
        if (!Files.exists(FILE_PATH)) {
            return new ArrayList<>(); // Return an empty list if the file isn't found
        }
        try {
            return Files.readAllLines(FILE_PATH);
        } catch (IOException e) {
            System.err.println("Error loading favorites: " + e.getMessage());
            return new ArrayList<>(); // Return an empty list in case of an error
        }
    }
    
    public void saveFavorites(List<String> cities) {
        try {
            Files.write(FILE_PATH, cities, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        } catch (IOException e) {
            System.err.println("Error saving favorites: " + e.getMessage());
        }
    }
}
