package com.yxd.behavioral.observerPattern.demo04;

public class Client {
    public static void main(String[] args) {
        // 创建天气主题类
        WeatherSubject<Weather> subject = new WeatherSubject<>();

        // 创建观察者
        CurrentConditions<Weather> currentConditions = new CurrentConditions<>();
        Baidu<Weather> baidu = new Baidu<>();

        // 注册到 subject
        subject.registerObserver(currentConditions);
        subject.registerObserver(baidu);

        // 设置最新天气并通知所有观察者
        subject.setWeather(new Weather("20","10", "15.0"));

        System.out.println("移除观察者 【百度】");
        subject.removeObserver(baidu);

        // 设置最新天气并通知所有观察者
        subject.setWeather(new Weather("21","11", "16.0"));
    }
}
