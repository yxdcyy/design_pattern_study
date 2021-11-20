package com.yxd.designpattern.structural.adapter.demo03;

public class Client {
    public static void main(String[] args) {
        DC adapter = new PowerAdapter(new AC220());
        adapter.output5V();
    }
}
