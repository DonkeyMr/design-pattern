package com.pattern.builder;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Beverage constructBeverage() {
        this.builder.addDescription("Mocha");
        this.builder.addCost(3.89);
        this.builder.addMilk(true);
        this.builder.addSoy(false);
        return this.builder.getBeverage();
    }
}
