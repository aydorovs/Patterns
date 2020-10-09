package second_watcher.java_weather.elements;


import second_watcher.java_weather.WeatherData;
import second_watcher.weather.intf.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temp;
    private float humidity;

    public StatisticsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temp = weatherData.getTemp();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("StatisticsDisplay! " +
                "temp:" + temp +
                ",humidity: " + humidity
                );
    }
}
