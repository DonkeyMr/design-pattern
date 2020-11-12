package com.pattern.flyweight.composite;

import java.util.HashMap;
import java.util.Map;

/**
 * @author liupeng
 * @date 2020/11/12
 */
public class ConcreteCompositeFlyweight implements Flyweight {

    private Map<String, Flyweight> files = new HashMap<>();

    public void add(String intrinsicState, Flyweight flyWeight) {
        files.put(intrinsicState, flyWeight);
    }

    @Override
    public void operation(String state) {
        files.forEach((intrinsicState, flyweight) -> flyweight.operation(state));
    }
}
