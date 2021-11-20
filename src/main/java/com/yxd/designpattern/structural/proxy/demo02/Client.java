package com.yxd.designpattern.structural.proxy.demo02;

public class Client {
    public static void main(String[] args) {
        JdkMeipo jdkMeipo = new JdkMeipo();
        IPerson zhangSan = jdkMeipo.getInstance(new ZhangSan());
        zhangSan.findLove();
    }
}
