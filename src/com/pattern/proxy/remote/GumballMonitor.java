package com.pattern.proxy.remote;

import com.pattern.state.GumballMachine;

import java.rmi.RemoteException;

/**
 * @author liupeng
 * @date 2020/10/29
 */
public class GumballMonitor {

    GumballMachineRemote gumballMachine;

    public GumballMonitor(GumballMachineRemote gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report() {
        try {
            System.out.println("Gumball Machine: " + gumballMachine.getLocation());
            System.out.println("Current inventory: " + gumballMachine.getCount() + " gumballs");
            System.out.println("Current state: " + gumballMachine.getState());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
