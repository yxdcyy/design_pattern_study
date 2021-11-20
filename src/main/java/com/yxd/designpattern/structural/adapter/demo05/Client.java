package com.yxd.designpattern.structural.adapter.demo05;

public class Client {
    public static void main(String[] args) {
        IPassportForThird adapter = new PassportForThirdAdapter();
        adapter.loginForQQ("abcd1234");
    }
}
