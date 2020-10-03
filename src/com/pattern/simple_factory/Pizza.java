package com.pattern.simple_factory;

public abstract class Pizza {

    float money;

    public void prepare() {
        System.out.println("准备工作");
    }

    public void bake() {
        System.out.println("烘焙");
    }

    public void cut() {
        System.out.println("把披萨切块");
    }

    public void box() {
        System.out.println("把披萨装盒");
    }

}
