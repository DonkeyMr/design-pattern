package com.pattern.state;

import java.rmi.RemoteException;

public class StateTest {

    public static void main(String[] args) throws RemoteException {
        GumballMachine gumballMachine = new GumballMachine("New York", 5);

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);
    }
}
