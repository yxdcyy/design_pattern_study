package com.yxd.designpattern.behavioral.observer.demo03;

import java.lang.reflect.Method;

/**
 * 标准事件源格式的定义
 */
public class Event {
    // 事件源，动作是由谁发出的
    private Object source;

    // 事件触发，要通知谁（观察者）
    private EventListener target;

    // 观察者的回应
    private Method callback;

    // 事件的名称
    private String trigger;

    // 事件的触发时间
    private long time;

    public Event(EventListener target, Method callback) {
        this.target = target;
        this.callback = callback;
    }

    public Object getSource() {
        return source;
    }

    public Event setSource(Object source) {
        this.source = source;
        return this;
    }

    public Method getCallback() {
        return callback;
    }

    public EventListener getTarget() {
        return target;
    }

    public String getTrigger() {
        return trigger;
    }

    public Event setTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }

    public long getTime() {
        return time;
    }

    public Event setTime(long time) {
        this.time = time;
        return this;
    }

    @Override
    public String toString() {
        return "Event{" +
                "source=" + source +
                ", target=" + target +
                ", callback=" + callback +
                ", trigger='" + trigger + '\'' +
                ", time=" + time +
                '}';
    }
}
