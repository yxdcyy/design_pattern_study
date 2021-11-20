package com.yxd.designpattern.structural.adapter.demo06;

public class Client {
    public static void main(String[] args) {
        DC adapter = new PowerAdapter(){
            @Override
            public int output5V() {
                int adapterInput = new AC220().outputAC220V();
                int adapterOutput = adapterInput / 44;
                System.out.println("使用 Adapter 输入 AC " + adapterInput + "V，输出 DC " + adapterOutput + "V");
                return adapterOutput;
            }
        };
        adapter.output5V();
    }
}
