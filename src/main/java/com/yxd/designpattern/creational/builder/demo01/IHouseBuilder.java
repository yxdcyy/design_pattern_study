package com.yxd.designpattern.creational.builder.demo01;

public interface IHouseBuilder {
    void buildBasic();

    void buildWalls();

    void roofed();

    default House buildHouse() {
        return new House();
    }
}
