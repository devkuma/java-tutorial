package com.devkuma.basic.thread;

public class SynchronizedSample {
    private int count;
    private static int THREAD_MAX = 300000;

    private static class MyThread implements Runnable {
        private SynchronizedSample _count;

        public MyThread(SynchronizedSample count) {
            this._count = count;
        }

        @Override
        public void run() {
            _count.increment();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizedSample ss = new SynchronizedSample();
        Thread[] ts = new Thread[THREAD_MAX];
        for (int i = 0; i < THREAD_MAX; i++) {
            ts[i] = new Thread(new MyThread(ss));
            ts[i].start();
        }
        for (int i = 0; i < THREAD_MAX; i++) {
            ts[i].join();
        }
        System.out.println(ss.count);   // 결과：299944（매번 결과가 다르다.）
    }

//    public void increment() {
//        this.count++;
//    }

//    public synchronized void increment() {
//        this.count++;
//    }

    public void increment() {
        synchronized(this) {
            this.count++;
        }
    }
}