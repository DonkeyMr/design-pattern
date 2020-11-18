package com.pattern.flyweight.composite;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @author liupeng
 * @date 2020/11/12
 */
public class Client {

    public static void main(String[] args) {
        List<String> compositeState = new ArrayList<>();
        compositeState.add("辣椒炒肉");
        compositeState.add("牛肉");
        compositeState.add("鸡肉");
        compositeState.add("辣椒炒肉");
        compositeState.add("牛肉");

        FlyweightFactory factory = new FlyweightFactory();
        Flyweight compositeFly1 = factory.factory(compositeState);
        Flyweight compositeFly2 = factory.factory(compositeState);
        compositeFly1.operation("汤高点菜");
        System.out.println();
        compositeFly2.operation("周思远点菜");

        System.out.println("------------------------------------------------------------");
        System.out.println("复合享元模式是否可以共享对象：" + (compositeFly1 == compositeFly2));

        String state = "牛肉";
        Flyweight fly1 = factory.factory(state);
        Flyweight fly2 = factory.factory(state);
        System.out.println("单纯享元模式是否可以共享对象：" + (fly1 == fly2));
    }
}
