package com.pattern.strategy;

public class Test {

    public static void main(String[] args) {
        Character king = new King("理查德十六世", new SwordBehavior());
        king.fight();
        king.setWeapon(new BowAndArrowBehavior());
        king.fight();

        System.out.println("--------------");

        Character James = new Knight("James", new SwordBehavior());
        James.fight();
    }
}
