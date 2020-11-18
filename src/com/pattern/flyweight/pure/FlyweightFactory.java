package com.pattern.flyweight.pure;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂角色类
 * @author liupeng
 * @date 2020/11/12
 */
public class FlyweightFactory {

    /**
     * 一个用来存所有享元对象的集合
     * String 表示对象的键的类型 -> 内蕴状态
     * Flyweight 表示对象值的类型
     */
    private Map<String, Flyweight> files = new HashMap<>();

    public Flyweight factory(String intrinsicState) {
        // 先从缓存中查找对象
        Flyweight flyweight = files.get(intrinsicState);
        if (flyweight == null) {
            flyweight = new ConcreteFlyweight(intrinsicState);
            // 把这个新的Flyweight对象添加到缓存中
            files.put(intrinsicState, flyweight);
        }
        return flyweight;
    }

    /**
     * 得到存对象的集合的长度
     */
    public int getFlyweightSize() {
        return files.size();
    }
}
