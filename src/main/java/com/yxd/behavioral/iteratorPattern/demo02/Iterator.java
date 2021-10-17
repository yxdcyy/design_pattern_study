package com.yxd.behavioral.iteratorPattern.demo02;

/**
 * 自定义迭代器接口
 *
 * @param <E>
 */
public interface Iterator<E> {
    E next();

    boolean hasNext();
}
