package com.pattern.mediator;

public abstract class People {

    protected String name;
    protected Mediator mediator;

    public People(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
