package com.devkuma.basic.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteServer extends Remote {
    boolean isAlive() throws RemoteException;
}
