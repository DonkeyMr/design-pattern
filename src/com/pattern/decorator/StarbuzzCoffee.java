package com.pattern.decorator;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new HouseBlend();
        System.out.println(beverage.getDescription() + "：" + beverage.cost());
        System.out.println("------------");

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription() + ": " + beverage2.cost());
        System.out.println("-----------------");

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Mocha(beverage3);
        beverage3 = new Soy(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription() + ": " + beverage3.cost());
    }
}
