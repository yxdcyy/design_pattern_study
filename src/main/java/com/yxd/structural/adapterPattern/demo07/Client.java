package com.yxd.structural.adapterPattern.demo07;

public class Client {
    public static void main(String[] args) {
        new DispatchServlet().doDispatch(new SimpleController());
    }
}
