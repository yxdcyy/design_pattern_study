package com.yxd.designpattern.behavioral.visitor.demo03;

import java.util.LinkedList;
import java.util.List;

/**
 * 数据结构，管理很多人（Man , Woman）
 */
public class ObjectStructure {
    // 维护了一个集合
    private List<Person> persons = new LinkedList<>();

    // 增加 Person
    public void attach(Person person) {
        this.persons.add(person);
    }

    // 移除 Person
    public void detach(Person person) {
        this.persons.remove(person);
    }

    // 显示测评情况
    public void display(Action action) {
        for (Person person : persons) {
            person.accept(action);
        }
    }
}
