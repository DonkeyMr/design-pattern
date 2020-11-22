package com.pattern.mediator;

public class HouseOwner extends People {

    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    /**
     * 与中介者联络
     */
    public void constact(String message) {
        mediator.constact(message, this);
    }

    /**
     * 获取信息
     */
    public void getMessage(String message) {
        System.out.println("房主：" + name + ",获取信息：" + message);
    }
}
