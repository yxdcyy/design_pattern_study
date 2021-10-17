package com.yxd.behavioral.iteratorPattern.demo01;

/**
 * 抽象迭代器
 * @param <E>
 */
public interface Iterator<E> {
    E next();

    boolean hasNext();
}
