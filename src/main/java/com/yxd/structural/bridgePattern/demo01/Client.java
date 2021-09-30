package com.yxd.structural.bridgePattern.demo01;

public class Client {
    public static void main(String[] args) {
        // 创建一个具体角色
        IImplementor imp = new ConcreteImplementorA();

        // 创建一个抽象角色
        Abstraction abs = new RefinedAbstraction(imp);

        // 执行操作
        abs.operation();
    }
}
