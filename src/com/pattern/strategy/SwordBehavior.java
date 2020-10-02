package com.pattern.strategy;

public class SwordBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("使用宝剑挥舞");
    }
}
