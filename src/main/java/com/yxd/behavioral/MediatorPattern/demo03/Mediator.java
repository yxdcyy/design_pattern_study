package com.yxd.behavioral.MediatorPattern.demo03;

/**
 * 抽象中介者类
 */
public abstract class Mediator {

    /**
     * 将同事对象加入到集合中
     * @param colleagueName
     * @param colleague
     */
    public abstract void register(String colleagueName,Colleague colleague);

    /**
     * 接收 具体的同事对象 发出的消息
     * @param stateChange
     * @param colleagueName
     */
    public abstract void getMessage(int stateChange,String colleagueName);

    /**
     * 发送消息
     */
    public abstract void sendMessage();
}
