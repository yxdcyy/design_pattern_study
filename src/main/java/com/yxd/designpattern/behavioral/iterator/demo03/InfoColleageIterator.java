package com.yxd.designpattern.behavioral.iterator.demo03;

import java.util.Iterator;
import java.util.List;

/**
 * 信息学院
 */
public class InfoColleageIterator implements Iterator<Department> {

    private List<Department> departmentList; // 信息工程学院是以List方式存放系

    private int index = -1; // 索引

    public InfoColleageIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    // 判断 list 中还有没有下一个元素
    @Override
    public boolean hasNext() {
        if (index >= departmentList.size() - 1) {
            return false;
        } else {
            index ++;
            return true;
        }
    }

    @Override
    public Department next() {
        return departmentList.get(index);
    }

    // 这里空实现
    @Override
    public void remove() {

    }
}
