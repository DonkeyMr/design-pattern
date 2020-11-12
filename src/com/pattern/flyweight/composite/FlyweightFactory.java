package com.pattern.flyweight.composite;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author liupeng
 * @date 2020/11/12
 */
public class FlyweightFactory {

    private Map<String, Flyweight> files = new HashMap<>();

    /**
     * 复合享元工厂方法
     */
    public Flyweight factory(List<String> compositeState) {
        ConcreteCompositeFlyweight compositeFlyweight = new ConcreteCompositeFlyweight();

        compositeState.forEach(intrinsicState -> compositeFlyweight.add(intrinsicState, this.factory(intrinsicState)));

        return compositeFlyweight;
    }

    /**
     * 单纯享元工厂方法
     */
    public Flyweight factory(String intrinsicState) {
        Flyweight flyweight = files.get(intrinsicState);
        if (flyweight == null) {
            flyweight = new ConcreteFlyweight(intrinsicState);
            files.put(intrinsicState, flyweight);
        }
        return flyweight;
    }

    public int getFlyweightSize() {
        return files.size();
    }
}
