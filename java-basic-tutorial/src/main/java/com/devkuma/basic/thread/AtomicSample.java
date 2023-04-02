package com.devkuma.basic.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicSample {
    private AtomicInteger count = new AtomicInteger();

    public static void main(String[] args) {
        AtomicSample as = new AtomicSample();
        as.execute();
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
        count.getAndIncrement();
    }

    private static class MyThread implements Runnable {
        private AtomicSample _counter;

        public MyThread(AtomicSample counter) {
            this._counter = counter;
        }

        @Override
        public void run() {
            _counter.increment();
        }
    }
}