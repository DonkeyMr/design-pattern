package com.pattern.strategy;

public class King extends Character {

    public King(String name, WeaponBehavior weaponBehavior) {
        this.name = name;
        this.weaponBehavior = weaponBehavior;
    }
}
