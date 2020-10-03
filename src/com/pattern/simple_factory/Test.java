package com.pattern.simple_factory;

public class Test {

    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();

        PizzaStore pizzaStore = new PizzaStore(pizzaFactory);

        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println(pizza.money);
    }
}
