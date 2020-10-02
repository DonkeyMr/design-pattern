package com.pattern.observer;

public class Test {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(60, 80, 76.4f);
        weatherData.setMeasurements(30.9f, 43, 23.4f);
    }
}
