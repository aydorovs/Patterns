package second_watcher.weather.intf;

public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
