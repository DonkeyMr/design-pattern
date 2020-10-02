package com.pattern.strategy;

/**
 * 角色基类
 */
public abstract class Character {

    String name;

    WeaponBehavior weaponBehavior;

    void fight() {
        this.weaponBehavior.useWeapon();
    }

    void setWeapon(WeaponBehavior w) {
        this.weaponBehavior = w;
    }

}
