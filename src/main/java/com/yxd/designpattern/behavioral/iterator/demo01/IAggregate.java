package com.yxd.designpattern.behavioral.iterator.demo01;

/**
 * 抽象容器
 * @param <E>
 */
public interface IAggregate<E> {
    boolean add(E element);

    boolean remove(E element);

    Iterator<E> iterator();
}
