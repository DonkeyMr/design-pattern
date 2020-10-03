package com.pattern.factory_method;

public class Test {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYStylePizzaStore();
        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println("order a pizza: " + pizza.getName());

        System.out.println("------------------------------------------");

        pizzaStore = new ChicagoStylePizzaStore();
        pizza = pizzaStore.orderPizza("cheese");
        System.out.println("order a pizza: " + pizza.getName());
    }
}
