package com.devkuma.basic.rmi;

import java.rmi.Naming;

public class RemoteServerClient {

    public static void main(String[] args) {
        try {
            RemoteServer server = (RemoteServer) Naming.lookup("rmi:/localhost:1234/devkuma");
            System.out.println(server.isAlive());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
