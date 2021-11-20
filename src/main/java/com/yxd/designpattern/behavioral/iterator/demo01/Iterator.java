package com.yxd.designpattern.behavioral.iterator.demo01;

/**
 * 抽象迭代器
 * @param <E>
 */
public interface Iterator<E> {
    E next();

    boolean hasNext();
}
