package com.yxd.behavioral.visitorPattern.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * 结构对象
 */
public class ObjectStructure {
    private List<IElement> list = new ArrayList<>();
    {
        this.list.add(new ConcreteElementA());
        this.list.add(new ConcreteElementB());
    }

    public void accept(IVisitor visitor) {
        for (IElement element : this.list) {
            element.accept(visitor);
        }
    }
}
