package com.yxd.creational.builderPattern.demo03;

public class Client {
    public static void main(String[] args) {
        Course course = new Course.Builder()
                .addName("设计模式")
                .addPpt("【PPT课件】")
                .addVideo("【回放视频】")
                .addNote("【课堂笔记】")
                .addHomework("【课后作业】")
                .builder();

        System.out.println(course);
    }
}
