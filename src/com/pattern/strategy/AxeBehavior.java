package com.pattern.strategy;

public class AxeBehavior implements WeaponBehavior {

    @Override
    public void useWeapon() {
        System.out.println("用斧头砍劈");
    }
}
