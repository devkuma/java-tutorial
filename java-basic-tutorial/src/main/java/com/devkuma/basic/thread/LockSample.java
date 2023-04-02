package com.devkuma.basic.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockSample {
    private int count;
    private final Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        LockSample ls = new LockSample();
        ls.execute();
    }

    public void execute() {
        final int THREAD_MAX = 300000;
        Thread[] ts = new Thread[THREAD_MAX];
        for (int i = 0; i < THREAD_MAX; i++) {
            ts[i] = new Thread(new MyThread(this));
            ts[i].start();
        }
        for (int i = 0; i < THREAD_MAX; i++) {
            try {
                ts[i].join();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println(count);
    }

    public void increment() {
        lock.lock();
        try {
            this.count++;
        } finally {
            lock.unlock();
        }
    }

    private static class MyThread implements Runnable {
        private LockSample _counter;

        public MyThread(LockSample counter) {
            this._counter = counter;
        }

        @Override
        public void run() {
            _counter.increment();
        }
    }
}
