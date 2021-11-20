package com.yxd.designpattern.behavioral.observer.demo01;

/**
 * 抽象主题者
 */
public interface ISubject<E> {
    boolean attach(IObserver<E> observer);

    boolean detach(IObserver<E> observer);

    void notify(E event);
}
