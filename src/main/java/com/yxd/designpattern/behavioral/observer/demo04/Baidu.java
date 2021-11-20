package com.yxd.designpattern.behavioral.observer.demo04;

/**
 *
 * @param <Weather>
 */
public class Baidu<Weather> implements IObserver<Weather>{
    @Override
    public void update(Weather weather) {
        System.out.println("观察者 Baidu 收到最新的天气为：" + weather.toString());
    }
}
