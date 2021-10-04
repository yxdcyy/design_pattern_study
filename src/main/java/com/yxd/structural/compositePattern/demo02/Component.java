package com.yxd.structural.compositePattern.demo02;

public abstract class Component {
    private String name;

    public Component(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String operation();
}
