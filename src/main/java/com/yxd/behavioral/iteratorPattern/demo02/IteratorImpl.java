package com.yxd.behavioral.iteratorPattern.demo02;

import java.util.List;

/**
 * 迭代器接口实现类
 *
 * @param <E>
 */
public class IteratorImpl<E> implements Iterator<E> {
    private List<E> list;

    private int cursor = 0;

    private E element;

    public IteratorImpl(List<E> list) {
        this.list = list;
    }

    @Override
    public E next() {
        System.out.print("当前位置" + this.cursor + ": ");
        return this.list.get(this.cursor++);
    }

    @Override
    public boolean hasNext() {
        return this.cursor < this.list.size();
    }
}
