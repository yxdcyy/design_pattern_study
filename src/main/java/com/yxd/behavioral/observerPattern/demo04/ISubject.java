package com.yxd.behavioral.observerPattern.demo04;

/**
 * 抽象主题类
 */
public interface ISubject<Weather> {
    /**
     * 注册观察者
     * @param observer
     */
    public void registerObserver(IObserver<Weather> observer);

    /**
     * 移除观察者
     * @param observer
     */
    public void removeObserver(IObserver<Weather> observer);

    /**
     * 通知所有观察者
     */
    public void notifyObservers(Weather weather);
}
