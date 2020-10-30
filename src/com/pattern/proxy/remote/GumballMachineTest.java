package com.pattern.proxy.remote;

import com.pattern.state.GumballMachine;

import java.rmi.Naming;

/**
 * @author liupeng
 * @date 2020/10/29
 */
public class GumballMachineTest {

    public static void main(String[] args) {
        GumballMachineRemote gumballMachine;
        int count;
        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        try {
            count = Integer.parseInt(args[1]);

            gumballMachine = new GumballMachine(args[0], count);
            Naming.rebind("//127.0.0.1" + "/gumballmachine", gumballMachine);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
