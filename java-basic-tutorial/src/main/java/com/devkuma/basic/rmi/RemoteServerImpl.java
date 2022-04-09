package com.devkuma.basic.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class RemoteServerImpl extends UnicastRemoteObject implements RemoteServer {

    public RemoteServerImpl(String name, int port) throws RemoteException {
        System.setSecurityManager(new SecurityManager());
        LocateRegistry.createRegistry(port);
        try {
            Naming.rebind(new StringBuffer(64).append("//:").append(port)
                    .append('/').append(name).toString(), this);
        } catch (MalformedURLException e) {
            throw new RemoteException(e.getMessage(), e);
        }
    }

    public boolean isAlive() throws RemoteException {
        return true;
    }

    public static void main(String[] args) {
        try {
            String serviceName = "devkuma";
            int port = 1234;
            new RemoteServerImpl(serviceName, port);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
