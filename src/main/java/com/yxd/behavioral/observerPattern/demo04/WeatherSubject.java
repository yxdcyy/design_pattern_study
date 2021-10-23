package com.yxd.behavioral.observerPattern.demo04;

import java.util.ArrayList;
import java.util.List;

/**
 * 天气主题类
 * @param <Weather>
 */
public class WeatherSubject<Weather> implements ISubject<Weather> {

    /**
     * 观察者集合
     */
    private List<IObserver<Weather>> observers;

    private Weather weather;

    public WeatherSubject() {
        observers = new ArrayList<IObserver<Weather>>();
    }

    public void dataChanged() {
        notifyObservers(this.getWeather());
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
        dataChanged();
    }

    @Override
    public void registerObserver(IObserver<Weather> observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void removeObserver(IObserver<Weather> observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers(Weather weather) {
        for (IObserver<Weather> observer : observers) {
            observer.update(weather);
        }
    }
}
