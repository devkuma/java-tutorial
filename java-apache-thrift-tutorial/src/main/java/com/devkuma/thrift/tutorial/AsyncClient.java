package com.devkuma.thrift.tutorial;

import java.io.IOException;

import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.async.TAsyncClientManager;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.transport.TNonblockingSocket;
import org.apache.thrift.transport.TTransportException;

public class AsyncClient {

    private void invoke() {
        try {
            ArithmeticService.AsyncClient client = new ArithmeticService.AsyncClient(new TBinaryProtocol.Factory(),
                                                                                     new TAsyncClientManager(),
                                                                                     new TNonblockingSocket("localhost", 7911));
            client.add(200, 400, new AddMethodCallback());

            client = new ArithmeticService.AsyncClient(new TBinaryProtocol.Factory(),
                                                       new TAsyncClientManager(),
                                                       new TNonblockingSocket("localhost", 7911));
            client.multiply(20, 50, new MultiplyMethodCallback());
        } catch (TTransportException e) {
            e.printStackTrace();
        } catch (TException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        AsyncClient client = new AsyncClient();
        client.invoke();
        Thread.sleep(50);
    }

    class AddMethodCallback implements AsyncMethodCallback<Long> {
        public void onComplete(Long response) {
            System.out.println("Add from server: " + response);
        }

        public void onError(Exception e) {
            System.out.println("Error : ");
            e.printStackTrace();
        }
    }

    class MultiplyMethodCallback implements AsyncMethodCallback<Long> {
        public void onComplete(Long response) {
            System.out.println("Multiply from server: " + response);
        }

        public void onError(Exception e) {
            System.out.println("Error : ");
            e.printStackTrace();
        }
    }
}