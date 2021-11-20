package com.yxd.designpattern.behavioral.iterator.demo03;

import java.util.Iterator;

/**
 * 计算机学院迭代器
 */
public class ComputerCollegeIterator implements Iterator<Department> {

    // 这里我们需要 Department 是以怎样的方式存放 => 数组
    private Department[] departments;
    private int position = 0; // 遍历的位置

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    // 判断是否还有下一个元素
    @Override
    public boolean hasNext() {
        if (position >= departments.length || departments[position] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Department next() {
        return departments[position++];
    }

    // 这里空实现
    @Override
    public void remove() {

    }
}
