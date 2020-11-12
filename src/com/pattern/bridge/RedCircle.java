package com.pattern.bridge;

public class RedCircle implements DrawApi {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("color: red，radius：" + radius + "，x: " + x + ", y: " + y);
    }
}
