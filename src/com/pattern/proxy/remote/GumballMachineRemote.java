package com.pattern.proxy.remote;

import com.pattern.state.State;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @author liupeng
 * @date 2020/10/29
 */
public interface GumballMachineRemote extends Remote {

    int getCount() throws RemoteException;

    String getLocation() throws RemoteException;

    State getState() throws RemoteException;
}
