package com.designpattern.observer;

/**
 * Created by chenwinfred on 1/10/16.
 */
public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        GeneralDisplay generalDisplay = new GeneralDisplay(weatherData);

        weatherData.setMeasurements(10, 20, 30);


        weatherData.setMeasurements(11, 21, 31);
    }
}
