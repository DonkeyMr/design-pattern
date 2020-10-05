package com.pattern.abstract_factory;

import com.pattern.abstract_factory.ingredient.Cheese;
import com.pattern.abstract_factory.ingredient.Dough;
import com.pattern.abstract_factory.ingredient.Sauce;

public abstract class Pizza {

    String name;

    Dough dough;

    Sauce sauce;

    Cheese cheese;

    abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting hte pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", cheese=" + cheese +
                '}';
    }
}
