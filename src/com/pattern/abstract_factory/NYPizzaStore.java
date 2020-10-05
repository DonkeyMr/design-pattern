package com.pattern.abstract_factory;


public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
        }

        return pizza;
    }
}
