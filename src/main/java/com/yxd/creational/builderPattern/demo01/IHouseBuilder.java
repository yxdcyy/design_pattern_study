package com.yxd.creational.builderPattern.demo01;

public interface IHouseBuilder {
    void buildBasic();

    void buildWalls();

    void roofed();

    default House buildHouse() {
        return new House();
    }
}
