package com.yxd.structural.adapterPattern.demo01;

public class Client {
    public static void main(String[] args) {
        DC5 adapter = new PowerAdapter();
        adapter.output5V();
    }
}
