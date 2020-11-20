package com.pattern.builder;

public class BuilderPatternDemo {

    public static void main(String[] args) {
        Builder builder = new BeverageBuilder();
        Director director = new Director(builder);
        Beverage beverage = director.constructBeverage();
        System.out.println(beverage);
    }
}
