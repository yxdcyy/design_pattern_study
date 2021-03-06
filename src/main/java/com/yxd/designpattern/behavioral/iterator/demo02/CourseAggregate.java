package com.yxd.designpattern.behavioral.iterator.demo02;

/**
 * 自定义的课程集合
 */
public interface CourseAggregate {
    void add(Course course);

    void remove(Course course);

    Iterator<Course> iterator();
}
