package com.yxd.designpattern.behavioral.observer.demo02;

import java.util.Observable;

/**
 * JDK 提供的一种观察者的实现方式，被观察者
 */
public class GPer extends Observable {
    private String name = "GPer生态圈";
    private static GPer gPer = null;

    private GPer(){}

    public static GPer getInstance() {
        if (null == gPer) {
            gPer = new GPer();
        }
        return gPer;
    }

    public String getName() {
        return name;
    }

    public void publishQuestion(Question question) {
        System.out.println(question.getUserName() + "在" + this.name + "上提交了一个问题。");
        setChanged();
        notifyObservers(question);
    }
}
