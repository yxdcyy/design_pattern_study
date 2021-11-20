package com.yxd.designpattern.creational.builder.demo01;

public class HighBuilding implements IHouseBuilder {
    private House house = new House();

    @Override
    public void buildBasic() {
        this.house.setBasic("高楼打地基");
    }

    @Override
    public void buildWalls() {
        this.house.setWall("高楼砌墙");
    }

    @Override
    public void roofed() {
        this.house.setRoofed("高楼封顶");
    }

    @Override
    public House buildHouse() {
        return this.house;
    }
}
