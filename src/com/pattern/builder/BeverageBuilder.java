package com.pattern.builder;

public class BeverageBuilder implements Builder {

    private Beverage beverage = new Beverage();

    @Override
    public void addDescription(String description) {
        this.beverage.description = description;
    }

    @Override
    public void addCost(double cost) {
        this.beverage.cost = cost;
    }

    @Override
    public void addMilk(boolean milk) {
        this.beverage.milk = milk;
    }

    @Override
    public void addSoy(boolean soy) {
        this.beverage.soy = soy;
    }

    @Override
    public Beverage getBeverage() {
        return beverage;
    }
}
