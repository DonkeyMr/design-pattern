package com.pattern.bridge;

public class GreenCircle implements DrawApi {

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("color: green，radius：" + radius + "，x: " + x + ", y: " + y);
    }
}
