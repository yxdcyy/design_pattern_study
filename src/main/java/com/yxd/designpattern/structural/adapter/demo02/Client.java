package com.yxd.designpattern.structural.adapter.demo02;

public class Client {
    public static void main(String[] args) {
        DC5 adapter = new PowerAdapter(new AC220());
        adapter.output5V();
    }
}
