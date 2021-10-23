package com.yxd.behavioral.observerPattern.demo04;

public class CurrentConditions<Weather> implements IObserver<Weather> {

    /**
     * 更新天气情况
     * @param weather
     */
    @Override
    public void update(Weather weather) {
        System.out.println("观察者 CurrentConditions 收到最新的天气为：" + weather.toString());
    }

}
