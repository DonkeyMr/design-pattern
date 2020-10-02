package com.pattern.strategy;

public class Knight extends Character {

    public Knight(String name, WeaponBehavior weaponBehavior) {
        this.name = name;
        this.weaponBehavior = weaponBehavior;
    }
}
