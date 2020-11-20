package com.pattern.builder;

public interface Builder {

    void addDescription(String description);

    void addCost(double cost);

    void addMilk(boolean milk);

    void addSoy(boolean soy);

    Beverage getBeverage();
}
