package com.yxd.designpattern.structural.adapter.demo03;

public class PowerAdapter implements DC {

    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int output5V() {
        int adapterInput = ac220.outputAC220V();
        int adapterOutput = adapterInput / 44;
        System.out.println("使用 Adapter 输入 AC " + adapterInput + "V，输出 DC " + adapterOutput + "V");
        return adapterOutput;
    }
}
