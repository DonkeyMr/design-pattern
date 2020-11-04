package com.pattern.bridge;

public abstract class Shape {

    protected DrawApi drawApi;

    protected Shape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    abstract void draw();
}
