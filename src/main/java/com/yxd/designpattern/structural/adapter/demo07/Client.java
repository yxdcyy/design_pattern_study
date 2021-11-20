package com.yxd.designpattern.structural.adapter.demo07;

public class Client {
    public static void main(String[] args) {
        new DispatchServlet().doDispatch(new SimpleController());
    }
}
