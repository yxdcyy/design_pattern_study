package com.yxd.designpattern.behavioral.memento.demo01;

/**
 * 发起人角色
 */
public class Originator {
    // 内部状态
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // 创建一个备忘录
    public IMemento createMemento() {
        return new Memento(this.state);
    }

    // 从备忘录恢复
    public void restoreMemento(IMemento memento) {
        this.state = ((Memento)memento).getState();
    }

    /**
     * 备忘录角色
     */
    class Memento implements IMemento {
        private String state;

        public Memento(String state) {
            this.state = state;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
    }
}
