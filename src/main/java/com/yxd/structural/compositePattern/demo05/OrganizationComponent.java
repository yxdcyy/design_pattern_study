package com.yxd.structural.compositePattern.demo05;

public abstract class OrganizationComponent {
    private String name; // 名字

    private String des; // 描述

    public OrganizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    protected void add(OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException("不支持添加操作！");
    }

    protected void remove(OrganizationComponent organizationComponent) {
        throw new UnsupportedOperationException("不支持删除操作！");
    }

    // 子类都需要实现
    protected abstract void print();
}
