package com.yxd.designpattern.behavioral.iterator.demo02;

import java.util.ArrayList;
import java.util.List;

/**
 * 课程集合实现类
 */
public class CourseAggregateImpl implements CourseAggregate {

    private List<Course> courseList;

    public CourseAggregateImpl() {
        this.courseList = new ArrayList();
    }

    @Override
    public void add(Course course) {
        this.courseList.add(course);
    }

    @Override
    public void remove(Course course) {
        this.courseList.remove(course);
    }

    @Override
    public Iterator<Course> iterator() {
        return new IteratorImpl<>(courseList);
    }
}
