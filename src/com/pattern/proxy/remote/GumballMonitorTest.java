package com.pattern.proxy.remote;

import com.pattern.state.GumballMachine;

import java.rmi.Naming;
import java.rmi.Remote;

/**
 * @author liupeng
 * @date 2020/10/29
 */
public class GumballMonitorTest {

    public static void main(String[] args) {
     //  String[] locations = {"rmi://aaa/gumballmachine", "rmi://bbb/gumballmachine", "rmi://ccc/gumballmachine"};
       String[] locations = {"rmi://127.0.0.1/gumballmachine"};

       GumballMonitor[] monitors= new GumballMonitor[locations.length];

        for (int i = 0; i < locations.length; i++) {
            try {
                GumballMachineRemote machine = (GumballMachineRemote) Naming.lookup(locations[i]);
                monitors[i] = new GumballMonitor(machine);
                System.out.println(monitors[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < monitors.length; i++) {
            monitors[i].report();
        }
    }
}
