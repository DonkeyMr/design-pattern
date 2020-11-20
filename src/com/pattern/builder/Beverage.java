package com.pattern.builder;

public class Beverage {

    String description;

    double cost;

    boolean milk;

    boolean soy;

    @Override
    public String toString() {
        return "Beverage{" +
                "description='" + description + '\'' +
                ", cost=" + cost +
                ", milk=" + milk +
                ", soy=" + soy +
                '}';
    }
}
