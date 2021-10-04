package com.yxd.structural.compositePattern.demo04;

public abstract class Directory {
    protected String name;

    public Directory(String name) {
        this.name = name;
    }

    public abstract void show();
}
