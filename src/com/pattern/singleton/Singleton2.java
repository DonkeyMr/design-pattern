package com.pattern.singleton;

/**
 * 改善多线程
 * 同步 getInstance() 方法
 */
public class Singleton2 {

    private static Singleton2 uniqueInstance;

    private Singleton2(){};

    public static synchronized Singleton2 getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton2();
        }
        return uniqueInstance;
    }
}
