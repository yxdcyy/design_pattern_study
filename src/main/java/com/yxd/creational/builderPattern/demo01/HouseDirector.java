package com.yxd.creational.builderPattern.demo01;

public class HouseDirector {
    private IHouseBuilder houseBuilder;

    public HouseDirector(IHouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void setHouseBuilder(IHouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    // 如何处理建造房子的流程，交给指挥者
    public House constructHouse() {
        this.houseBuilder.buildBasic();
        this.houseBuilder.buildWalls();
        this.houseBuilder.roofed();
        return this.houseBuilder.buildHouse();
    }
}
