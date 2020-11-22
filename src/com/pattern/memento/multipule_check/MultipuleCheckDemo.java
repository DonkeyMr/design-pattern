package com.pattern.memento.multipule_check;

public class MultipuleCheckDemo {

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker(originator);

        originator.setState("state 0");
        careTaker.createMemeto();

        originator.setState("state 1");
        careTaker.createMemeto();

        originator.setState("state 2");
        careTaker.createMemeto();

        originator.setState("state 3");
        careTaker.createMemeto();

        originator.setState("state 4");
        careTaker.createMemeto();

        originator.printStates();
        System.out.println("---------------- 恢复状态到某一个检查点------------------");
        // 恢复到第二个检查点
        careTaker.restoreMemeto(1);
        originator.printStates();
    }
}
