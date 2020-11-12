package com.pattern.flyweight.pure;

/**
 * @author liupeng
 * @date 2020/11/12
 */
public class Client {

    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight fly1 = factory.factory("辣椒炒肉");
        fly1.operation("汤高点菜");

        Flyweight fly2 = factory.factory("牛肉");
        fly2.operation("周思远点菜");

        Flyweight fly3 = factory.factory("辣椒炒肉");
        fly3.operation("汤高点菜");

        System.out.println(fly1 == fly3);
        System.out.println("不同菜的个数：" + factory.getFlyweightSize());
    }
}
