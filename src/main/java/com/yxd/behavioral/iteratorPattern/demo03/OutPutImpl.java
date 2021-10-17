package com.yxd.behavioral.iteratorPattern.demo03;

import java.util.Iterator;
import java.util.List;

/**
 * 输出类
 */
public class OutPutImpl {
    // 学院集合
    List<College> collegeList;

    public OutPutImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    // 输出具体学院对应的系
    public void printDepartment(Iterator<Department> iterator) {
        while (iterator.hasNext()) {
            Department department = iterator.next();
            System.out.println(department.getName());
        }
    }

    // 输出所有学院对应的系
    public void printCollege() {
        Iterator<College> collegeIterator = collegeList.iterator();
        while (collegeIterator.hasNext()) {
            College college = collegeIterator.next();
            System.out.println("--------" + college.getName() + "----------");
            printDepartment(college.createIterator());
        }
    }
}
