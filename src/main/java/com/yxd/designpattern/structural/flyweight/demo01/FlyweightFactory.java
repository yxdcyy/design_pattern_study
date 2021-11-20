package com.yxd.designpattern.structural.flyweight.demo01;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂
 */
public class FlyweightFactory {
    private Map<String, IFlyweight> pool = new HashMap<>();

    // 因为内部状态具备不变性，所以作为缓存的键
    public IFlyweight getFlyweight(String intrinsicState) {
        if (!pool.containsKey(intrinsicState)) {
            IFlyweight flyweight = new ConcreteFlyweight(intrinsicState);
            pool.put(intrinsicState, flyweight);
        }
        return pool.get(intrinsicState);
    }
}
