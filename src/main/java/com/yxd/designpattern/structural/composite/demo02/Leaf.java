package com.yxd.designpattern.structural.composite.demo02;

public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public String operation() {
        return getName();
    }
}
