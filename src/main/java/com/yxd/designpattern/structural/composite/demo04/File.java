package com.yxd.designpattern.structural.composite.demo04;

public class File extends Directory {
    public File(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println(this.name);
    }
}
