package com.yxd.designpattern.behavioral.Mediator.demo03;

import java.util.HashMap;

/**
 * 具体中介者类
 */
public class ConcreteMediator extends Mediator {

    // 放入所有的同事
    private HashMap<String,Colleague> colleagueMap;

    private HashMap<String, String> interMap;

    public ConcreteMediator() {
        colleagueMap = new HashMap<>();
        interMap = new HashMap<>();
    }

    @Override
    public void register(String colleagueName, Colleague colleague) {
        this.colleagueMap.put(colleagueName, colleague);
        if (colleague instanceof Alarm) {
            interMap.put("Alarm", colleagueName);
        } else if (colleague instanceof CoffeeMachine) {
            interMap.put("CoffeeMachine", colleagueName);
        } else if (colleague instanceof TV) {
            interMap.put("TV", colleagueName);
        } else if (colleague instanceof Curtains) {
            interMap.put("Curtains", colleagueName);
        }
    }

    /**
     * 具体中介者的核心方法
     * 1. 根据得到消息，完成对应任务
     * 2. 中介者在这个方法，协调各个具体的同事对象，完成任务
     * @param stateChange
     * @param colleagueName
     */
    @Override
    public void getMessage(int stateChange, String colleagueName) {
        // 处理闹钟发出的消息
        if (colleagueMap.get(colleagueName) instanceof Alarm) {
            if (stateChange == 0) {
                ((CoffeeMachine)(colleagueMap.get(interMap.get("CoffeeMachine")))).startCoffee();
                ((TV)(colleagueMap.get(interMap.get("TV")))).startTV();
            } else if (stateChange == 1) {
                ((TV)(colleagueMap.get(interMap.get("TV")))).stopTV();
            }
        } else if (colleagueMap.get(colleagueName) instanceof CoffeeMachine) {
            ((Curtains)(colleagueMap.get(interMap.get("Curtains")))).upCurtains();
        } else if (colleagueMap.get(colleagueName) instanceof TV) {

        } else if (colleagueMap.get(colleagueName) instanceof Curtains) {

        }
    }

    @Override
    public void sendMessage() {

    }
}
