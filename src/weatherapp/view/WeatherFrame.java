package weatherapp.view;

import java.awt.*;
import javax.swing.*;
import weatherapp.controller.WeatherController;
import weatherapp.model.WeatherRespone;
import java.awt.event.ActionEvent;
import java.util.Calendar;
import javax.swing.border.EmptyBorder;
import weatherapp.model.Forecast;
import weatherapp.model.ForecastRespone;
import java.util.List;

/**
 *
 * @author HYMDZ
 */
public class WeatherFrame extends javax.swing.JFrame {
    private WeatherController controller;
    
    public WeatherFrame() {
        controller = new WeatherController();
        initComponents();
        setupEventHandlers();
        updateFavoritesDropdown();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cityTextField = new javax.swing.JTextField();
        cuacaLabel = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        locationLabel = new javax.swing.JLabel();
        weatherIconLabel = new javax.swing.JLabel();
        temperaturLabel = new javax.swing.JLabel();
        unitLabel = new javax.swing.JLabel();
        detailsPanel = new javax.swing.JPanel();
        windLabel = new javax.swing.JLabel();
        humidLabel = new javax.swing.JLabel();
        pressureLabel = new javax.swing.JLabel();
        forecastPanel = new javax.swing.JPanel();
        day1Panel = new javax.swing.JPanel();
        day2Panel = new javax.swing.JPanel();
        day3Panel = new javax.swing.JPanel();
        day4Panel = new javax.swing.JPanel();
        day5Panel = new javax.swing.JPanel();
        favoritesComboBox = new javax.swing.JComboBox<>();
        addFavoriteButton = new javax.swing.JButton();
        removeFavoriteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Weather App");
        setBackground(new java.awt.Color(255, 255, 255));

        cityTextField.setText("Enter city name");
        cityTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityTextFieldActionPerformed(evt);
            }
        });

        cuacaLabel.setFont(new java.awt.Font("Helvetica", 1, 36)); // NOI18N
        cuacaLabel.setText("Weather Info");

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        locationLabel.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        locationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        locationLabel.setText("Enter a city name to get weather information");
        locationLabel.setToolTipText("");
        locationLabel.setPreferredSize(new java.awt.Dimension(100, 25));

        weatherIconLabel.setFont(new java.awt.Font("Segoe UI Emoji", 0, 60)); // NOI18N
        weatherIconLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        weatherIconLabel.setText("🌤️");
        weatherIconLabel.setPreferredSize(new java.awt.Dimension(120, 80));

        temperaturLabel.setFont(new java.awt.Font("Poppins", 1, 65)); // NOI18N
        temperaturLabel.setText("--");

        unitLabel.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        unitLabel.setText("--°/--°");

        detailsPanel.setRequestFocusEnabled(false);

        windLabel.setText("💨 -- kmh");

        humidLabel.setText("💧 --%");

        pressureLabel.setText("🌡️ -- hPa");

        javax.swing.GroupLayout detailsPanelLayout = new javax.swing.GroupLayout(detailsPanel);
        detailsPanel.setLayout(detailsPanelLayout);
        detailsPanelLayout.setHorizontalGroup(
            detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(windLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                    .addComponent(humidLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pressureLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        detailsPanelLayout.setVerticalGroup(
            detailsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailsPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(windLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(humidLabel)
                .addGap(12, 12, 12)
                .addComponent(pressureLabel)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        forecastPanel.setForeground(new java.awt.Color(204, 204, 204));
        forecastPanel.setRequestFocusEnabled(false);

        javax.swing.GroupLayout day1PanelLayout = new javax.swing.GroupLayout(day1Panel);
        day1Panel.setLayout(day1PanelLayout);
        day1PanelLayout.setHorizontalGroup(
            day1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
        );
        day1PanelLayout.setVerticalGroup(
            day1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 131, Short.MAX_VALUE)
        );

        day2Panel.setAutoscrolls(true);

        javax.swing.GroupLayout day2PanelLayout = new javax.swing.GroupLayout(day2Panel);
        day2Panel.setLayout(day2PanelLayout);
        day2PanelLayout.setHorizontalGroup(
            day2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
        );
        day2PanelLayout.setVerticalGroup(
            day2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 131, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout day3PanelLayout = new javax.swing.GroupLayout(day3Panel);
        day3Panel.setLayout(day3PanelLayout);
        day3PanelLayout.setHorizontalGroup(
            day3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
        );
        day3PanelLayout.setVerticalGroup(
            day3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 131, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout day4PanelLayout = new javax.swing.GroupLayout(day4Panel);
        day4Panel.setLayout(day4PanelLayout);
        day4PanelLayout.setHorizontalGroup(
            day4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
        );
        day4PanelLayout.setVerticalGroup(
            day4PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 131, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout day5PanelLayout = new javax.swing.GroupLayout(day5Panel);
        day5Panel.setLayout(day5PanelLayout);
        day5PanelLayout.setHorizontalGroup(
            day5PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
        );
        day5PanelLayout.setVerticalGroup(
            day5PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 131, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout forecastPanelLayout = new javax.swing.GroupLayout(forecastPanel);
        forecastPanel.setLayout(forecastPanelLayout);
        forecastPanelLayout.setHorizontalGroup(
            forecastPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(forecastPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(day1Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(day2Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(day3Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(day4Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(day5Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        forecastPanelLayout.setVerticalGroup(
            forecastPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(forecastPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(forecastPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(forecastPanelLayout.createSequentialGroup()
                        .addGroup(forecastPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(day4Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(day5Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(forecastPanelLayout.createSequentialGroup()
                        .addGroup(forecastPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(day3Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(forecastPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(day1Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(day2Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        favoritesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "List Favorites" }));
        favoritesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                favoritesComboBoxActionPerformed(evt);
            }
        });

        addFavoriteButton.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        addFavoriteButton.setText("⭐ ");
        addFavoriteButton.setPreferredSize(new java.awt.Dimension(72, 25));
        addFavoriteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFavoriteButtonActionPerformed(evt);
            }
        });

        removeFavoriteButton.setFont(new java.awt.Font("Segoe UI Emoji", 0, 12)); // NOI18N
        removeFavoriteButton.setText("🗑️ ");
        removeFavoriteButton.setPreferredSize(new java.awt.Dimension(72, 25));
        removeFavoriteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeFavoriteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(weatherIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(unitLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(temperaturLabel)))
                        .addGap(93, 93, 93)
                        .addComponent(detailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(103, Short.MAX_VALUE))
                    .addComponent(locationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(favoritesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cuacaLabel)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(51, 51, 51)
                                        .addComponent(searchButton)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(addFavoriteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeFavoriteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(forecastPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addFavoriteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(removeFavoriteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cuacaLabel)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(searchButton)
                            .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(favoritesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(locationLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(detailsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(temperaturLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(weatherIconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(unitLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(forecastPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setupForecastDayPanel(JPanel panel, String day, String temp, String icon) {
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBackground(Color.WHITE);
        panel.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(230, 230, 230), 1),
            BorderFactory.createEmptyBorder(15, 15, 15, 15)
        ));
        panel.setPreferredSize(new Dimension(100, 130));
        
        JLabel dayLabel = new JLabel(day);
        dayLabel.setFont(new Font("Arial", Font.BOLD, 12));
        dayLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        JLabel iconLabel = new JLabel(icon);
        iconLabel.setFont(new Font("Apple Color Emoji", Font.PLAIN, 30));
        iconLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        JLabel tempLabel = new JLabel(temp);
        tempLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        tempLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        
        panel.removeAll(); // Clear existing components
        panel.add(dayLabel);
        panel.add(Box.createVerticalStrut(8));
        panel.add(iconLabel);
        panel.add(Box.createVerticalStrut(8));
        panel.add(tempLabel);
        panel.revalidate();
        panel.repaint();
    }
    
    private void setupEventHandlers(){
        searchButton.addActionListener(this::searchButtonActionPerformed);
        cityTextField.addActionListener(this::cityTextFieldActionPerformed);
        addFavoriteButton.addActionListener(this::addFavoriteButtonActionPerformed);
        removeFavoriteButton.addActionListener(this::removeFavoriteButtonActionPerformed);
        favoritesComboBox.addActionListener(this::favoritesComboBoxActionPerformed);
        
    }
    
    private void updateFavoritesDropdown() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        model.addElement("--- Select a Favorite ---");
        for (String city : controller.getFavoriteCities()) {
            model.addElement(city);
        }
        favoritesComboBox.setModel(model);
    }
    
    private void cityTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityTextFieldActionPerformed
        searchWeather();
    }//GEN-LAST:event_cityTextFieldActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        searchWeather();
    }//GEN-LAST:event_searchButtonActionPerformed

    private void removeFavoriteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeFavoriteButtonActionPerformed
        String selectedCity = (String) favoritesComboBox.getSelectedItem();
        if (selectedCity != null && !selectedCity.equals("--- Select a Favorite ---")) {
            controller.removeFavoriteCity(selectedCity);
            updateFavoritesDropdown(); // Refresh the list
            JOptionPane.showMessageDialog(this, selectedCity + " has been removed from favorites.");
        } else {
            JOptionPane.showMessageDialog(this, "Please select a favorite from the list to remove.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_removeFavoriteButtonActionPerformed

    private void addFavoriteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFavoriteButtonActionPerformed
        String currentCity = locationLabel.getText();
        if (currentCity.startsWith("Right now in ")) {
            // Extract city name from the label
            currentCity = currentCity.split(",")[0].substring(13).trim();
            controller.addFavoriteCity(currentCity);
            updateFavoritesDropdown(); // Refresh the list
            JOptionPane.showMessageDialog(this, currentCity + " has been added to favorites!");
        } else {
            JOptionPane.showMessageDialog(this, "Please search for a city before adding it to favorites.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addFavoriteButtonActionPerformed

    private void favoritesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_favoritesComboBoxActionPerformed
        String selectedCity = (String) favoritesComboBox.getSelectedItem();
        if (selectedCity != null && !selectedCity.equals("--- Select a Favorite ---")) {
            cityTextField.setText(selectedCity);
            searchWeather(); // Trigger a weather search for the selected city
        }
    }//GEN-LAST:event_favoritesComboBoxActionPerformed
    
    private void searchWeather(){
        String cityName = cityTextField.getText().trim();
        
        if (cityName.isEmpty()){
            JOptionPane.showMessageDialog(this, "Masukan nama kota!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        locationLabel.setText("Mencari data cuaca....");
        temperaturLabel.setText("--");
        searchButton.setEnabled(false);
        
        clearForecastPanels();
        
        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
            private WeatherRespone currentWeather;
            private ForecastRespone forecastData;
            
            @Override
            protected Void doInBackground() throws Exception {
                currentWeather = controller.getWeatherData(cityName);
                forecastData = controller.getForecastData(cityName);
                return null;
            }
            
            @Override
            protected void done() {
                try {
                    updateWeatherDisplay(currentWeather, forecastData);
                    updateForecastDisplay(forecastData);
                } catch (Exception e) {
                    locationLabel.setText("Error: Tidak dapat mengambil data cuaca");
                    temperaturLabel.setText("--");
                    e.printStackTrace();
                } finally {
                    searchButton.setEnabled(true);
                }
            }
        };
        
        worker.execute();
    }
    
    private void clearForecastPanels(){
        JPanel[] panels = {day1Panel, day2Panel, day3Panel, day4Panel, day5Panel};
        for (JPanel panel : panels) {
            panel.removeAll();
            panel.revalidate();
            panel.repaint();
        }
    }
    
    private void updateForecastDisplay(ForecastRespone forecastRespone) {
        if (forecastRespone == null){
            return;
        }
        
        List<Forecast> dailyForecasts = controller.getDailyForecast(forecastRespone);
        JPanel[] panels = {day1Panel, day2Panel, day3Panel, day4Panel, day5Panel};
    
    // Array nama hari dalam bahasa Indonesia
        String[] dayNames = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
    
    // Mendapatkan hari ini
        Calendar today = Calendar.getInstance();
        int currentDayOfWeek = today.get(Calendar.DAY_OF_WEEK); // 1=Sunday, 2=Monday, etc
    
        int maxItems = Math.min(dailyForecasts.size(), panels.length);
        for (int i = 0; i < maxItems; i++) {
        Forecast forecast = dailyForecasts.get(i);
        
        // Hitung hari secara berurutan dari hari ini
        int dayIndex = (currentDayOfWeek - 2 + i + 1) % 7; // -2 karena Calendar: 1=Sun, kita mulai dari Mon=0
        if (dayIndex < 0) dayIndex += 7;
        
        String dayName = dayNames[dayIndex];

        int minTemp = (int) Math.round(forecast.getMain().getTemp_min());
        int maxTemp = (int) Math.round(forecast.getMain().getTemp_max());
        String tempRange = minTemp + "°/" + maxTemp + "°";
        
        String weatherIcon = getWeatherIcon(forecast.getWeather()[0].getIcon());
        String description = forecast.getWeather()[0].getMain();
        
        setupForecastDayPanel(panels[i], dayName, tempRange, weatherIcon);
    }
    }
    
    private void updateWeatherDisplay(WeatherRespone respone, ForecastRespone forecastRespone){
        if (respone == null){
            locationLabel.setText("Data cuaca tidak tersedia");
            return;
        }
        
        locationLabel.setText("Right now in " + respone.getName() + ", It's " + respone.getWeather()[0].getDescription());
        
        int temp = (int) Math.round(respone.getMain().getTemp());
        temperaturLabel.setText(String.valueOf(temp) + "°");
        
        // --- START OF FIX for Main Min/Max Temperature ---
        // Get the calculated daily forecast list
        List<Forecast> dailyForecasts = controller.getDailyForecast(forecastRespone);
        if (dailyForecasts != null && !dailyForecasts.isEmpty()) {
            // Use the min/max from the first day of the forecast (which is Today)
            Forecast todayForecast = dailyForecasts.get(0);
            int temp_min = (int) Math.round(todayForecast.getMain().getTemp_min());
            int temp_max = (int) Math.round(todayForecast.getMain().getTemp_max());
            unitLabel.setText(temp_min + "°" + " / " + temp_max + "°");
        } else {
            // Fallback to the old method if forecast data is unavailable for any reason
            int temp_min = (int) Math.round(respone.getMain().getTemp_min());
            int temp_max = (int) Math.round(respone.getMain().getTemp_max());
            unitLabel.setText(temp_min + "°" + " / " + temp_max + "°");
        }
        
        String windSpeed = "0 kmh";
        if (respone.getWind() != null){
            double speedKmph = respone.getWind().getSpeedInKmh();
            windSpeed = String.format("%.0f kmh", speedKmph);
        }
        windLabel.setText(" 💨 " + windSpeed);
        
        humidLabel.setText(" 💧 " + respone.getMain().getHumidity() + " % ");
        pressureLabel.setText(" 🌡 ️" + respone.getMain().getPressure() + " hPa ");
        
        String weatherIcon = getWeatherIcon(respone.getWeather()[0].getIcon());
        weatherIconLabel.setText(weatherIcon);
    }
    
    private String getWeatherIcon(String iconCode){
        switch (iconCode) {
            // Clear Sky
            case "01d": return "☀️"; // Day
            case "01n": return "🌙"; // Night

            // Few Clouds
            case "02d": return "🌤️"; // Day
            case "02n": return "☁️"; // Night 

            // Scattered Clouds
            case "03d":
            case "03n":
                return "☁️";

            // Broken Clouds / Overcast Clouds
            case "04d":
            case "04n":
                return "☁️";

            // Shower Rain
            case "09d":
            case "09n":
                return "🌦️";

            // Rain
            case "10d": return "🌦️"; // Day
            case "10n": return "🌧️"; // Night

            // Thunderstorm
            case "11d":
            case "11n":
                return "⛈️";

            // Snow
            case "13d":
            case "13n":
                return "❄️";

            // Mist / Fog
            case "50d":
            case "50n":
                return "🌫️";

            // Default fallback icon
            default:
                return "❔";
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WeatherFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WeatherFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WeatherFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WeatherFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WeatherFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addFavoriteButton;
    private javax.swing.JTextField cityTextField;
    private javax.swing.JLabel cuacaLabel;
    private javax.swing.JPanel day1Panel;
    private javax.swing.JPanel day2Panel;
    private javax.swing.JPanel day3Panel;
    private javax.swing.JPanel day4Panel;
    private javax.swing.JPanel day5Panel;
    private javax.swing.JPanel detailsPanel;
    private javax.swing.JComboBox<String> favoritesComboBox;
    private javax.swing.JPanel forecastPanel;
    private javax.swing.JLabel humidLabel;
    private javax.swing.JLabel locationLabel;
    private javax.swing.JLabel pressureLabel;
    private javax.swing.JButton removeFavoriteButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel temperaturLabel;
    private javax.swing.JLabel unitLabel;
    private javax.swing.JLabel weatherIconLabel;
    private javax.swing.JLabel windLabel;
    // End of variables declaration//GEN-END:variables
}
