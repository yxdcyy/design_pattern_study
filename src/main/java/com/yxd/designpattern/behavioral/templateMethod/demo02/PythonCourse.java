package com.yxd.designpattern.behavioral.templateMethod.demo02;

public class PythonCourse extends AbstractCourse {
    @Override
    protected void checkHomework() {
        System.out.println("检查Python作业");
    }
}
