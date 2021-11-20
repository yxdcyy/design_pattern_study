package com.yxd.designpattern.behavioral.iterator.demo02;

public class Client {
    public static void main(String[] args) {
        Course java = new Course("Java 架构");
        Course javaBase = new Course("Java入门");
        Course design = new Course("Java 设计模式精讲");
        Course ai = new Course("人工智能");

        CourseAggregate courseAggregate = new CourseAggregateImpl();

        courseAggregate.add(java);
        courseAggregate.add(javaBase);
        courseAggregate.add(design);
        courseAggregate.add(ai);

        System.out.println("------------课程列表-------------");
        printCourses(courseAggregate);

        courseAggregate.remove(ai);

        System.out.println("-------------删除操作之后的课程列表----------------");
        printCourses(courseAggregate);
    }

    public static void printCourses(CourseAggregate courseAggregate) {
        Iterator<Course> iterator = courseAggregate.iterator();
        while (iterator.hasNext()) {
            Course course = iterator.next();
            System.out.println(" 《" + course.getName() + "》 ");
        }
    }
}
