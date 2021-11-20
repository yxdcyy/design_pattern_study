package com.yxd.designpattern.structural.proxy.demo06;

public class TeacherDao {
    public String teach() {
        System.out.println("老师授课中，我是 Cglib代理，不需要实现接口");
        return "hello";
    }
}
