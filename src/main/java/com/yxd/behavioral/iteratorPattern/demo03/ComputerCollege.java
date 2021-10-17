package com.yxd.behavioral.iteratorPattern.demo03;

import java.util.Iterator;

/**
 * 计算机学院
 */
public class ComputerCollege implements College {

    private Department[] departments;

    private int numOfDepartment = 0; // 保存当前数组的对象个数

    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("Java专业","Java专业");
        addDepartment("PHP专业","PHP专业");
        addDepartment("大数据专业","大数据专业");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[numOfDepartment++] = department;
    }

    @Override
    public Iterator<Department> createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
