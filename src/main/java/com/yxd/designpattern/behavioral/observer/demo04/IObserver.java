package com.yxd.designpattern.behavioral.observer.demo04;

/**
 * 抽象观察者
 */
public interface IObserver<Weather> {

    public void update(Weather weather);
}
