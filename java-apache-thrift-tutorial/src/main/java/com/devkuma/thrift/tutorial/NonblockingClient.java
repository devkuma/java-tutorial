package com.devkuma.thrift.tutorial;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;
import org.apache.thrift.transport.layered.TFramedTransport;

public class NonblockingClient {

    private void invoke() {
        TTransport transport = null;
        try {
            transport = new TFramedTransport(new TSocket("localhost", 7911));
            TProtocol protocol = new TBinaryProtocol(transport);

            ArithmeticService.Client client = new ArithmeticService.Client(protocol);
            transport.open();

            long addResult = client.add(100, 200);
            System.out.println("Add result: " + addResult);
            long multiplyResult = client.multiply(20, 40);
            System.out.println("Multiply result: " + multiplyResult);

            transport.close();
        } catch (TTransportException e) {
            e.printStackTrace();
        } catch (TException e) {
            e.printStackTrace();
        } finally {
            if (transport != null) {
                transport.close();
            }
        }
    }

    public static void main(String[] args) {
        NonblockingClient client = new NonblockingClient();
        client.invoke();
    }
}