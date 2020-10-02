package com.pattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 * 采取‘拉’的方式获取变更信息
 */
public class CurrentConditionsDisplay implements Observer {

    Observable observable;

    private float temperature;

    private float humidity;

    private float pressure;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }
    }

    private void display() {
        System.out.println(temperature + " " + humidity + " " + pressure);
    }
}
