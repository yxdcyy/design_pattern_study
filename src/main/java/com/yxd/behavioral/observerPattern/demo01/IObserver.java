package com.yxd.behavioral.observerPattern.demo01;

/**
 * 抽象观察者
 */
public interface IObserver<E> {
    void update(E event);
}
