package com.yxd.designpattern.creational.builder.demo02;

public class Client {
    public static void main(String[] args) {
        CourseBuilder builder = new CourseBuilder()
                .addName("设计模式")
                .addPpt("【PPT课件】")
                .addVideo("【回放视频】")
                .addNote("【课堂笔记】")
                .addHomework("【课后作业】");
        System.out.println(builder.builder());
    }
}
