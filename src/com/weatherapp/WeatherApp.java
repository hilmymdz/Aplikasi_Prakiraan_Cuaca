package com.weatherapp;

import javax.swing.SwingUtilities;
import weatherapp.view.WeatherFrame;


/**
 *
 * @author HYMDZ
 */
public class WeatherApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new WeatherFrame().setVisible(true);
        });

    }
    
}
