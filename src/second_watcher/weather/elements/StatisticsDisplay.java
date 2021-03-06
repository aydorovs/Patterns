package second_watcher.weather.elements;

import second_watcher.weather.intf.DisplayElement;
import second_watcher.weather.intf.Observer;
import second_watcher.weather.intf.Subject;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float temp;
    private float humidity;
    private Subject weatherData;


    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("StatisticsDisplay! " +
                "temp:" + temp +
                ",humidity: " + humidity
                );
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        display();
    }
}
