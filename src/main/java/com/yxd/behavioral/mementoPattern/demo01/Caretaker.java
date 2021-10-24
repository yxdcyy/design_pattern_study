package com.yxd.behavioral.mementoPattern.demo01;

/**
 * 备忘录管理者角色
 */
public class Caretaker {
    // 备忘录对象
    private IMemento memento;

    public IMemento getMemento() {
        return memento;
    }

    public void storeMemento(IMemento memento) {
        this.memento = memento;
    }
}
