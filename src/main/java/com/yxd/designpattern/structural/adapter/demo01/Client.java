package com.yxd.designpattern.structural.adapter.demo01;

public class Client {
    public static void main(String[] args) {
        DC5 adapter = new PowerAdapter();
        adapter.output5V();
    }
}
