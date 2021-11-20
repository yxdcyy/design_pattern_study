package com.yxd.designpattern.structural.adapter.demo01;

public class PowerAdapter extends AC220 implements DC5 {
    @Override
    public int output5V() {
        int adapterInput = super.outputAC220V();
        int adapterOutput = adapterInput / 44;
        System.out.println("使用 Adapter 输入 AC " + adapterInput + "V，输出 DC " + adapterOutput + "V");
        return adapterOutput;
    }
}
