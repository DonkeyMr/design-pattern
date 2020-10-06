package com.pattern.singleton;

/**
 * 改善多线程
 * 使用 饿汉式
 */
public class Singleton3 {

    private static Singleton3 uniqueSingleton = new Singleton3();

    private Singleton3(){

    }

    public static Singleton3 getInstance() {
        return uniqueSingleton;
    }
}
