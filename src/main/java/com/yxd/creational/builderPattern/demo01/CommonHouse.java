package com.yxd.creational.builderPattern.demo01;

public class CommonHouse implements IHouseBuilder {
    private House house = new House();

    @Override
    public void buildBasic() {
        this.house.setBasic("普通房子打地基");
    }

    @Override
    public void buildWalls() {
        this.house.setWall("普通房子砌墙");
    }

    @Override
    public void roofed() {
        this.house.setRoofed("普通房子封顶");
    }

    @Override
    public House buildHouse() {
        return this.house;
    }
}
