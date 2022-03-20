package com.devkuma.designpattern.creational.singleton.ex2;

public class SynchronizedSingleton2 {

    private volatile static SynchronizedSingleton2 instance;

    /**
     * 접근할 수 없는 생성자
     */
    private SynchronizedSingleton2() {
    }

    public static SynchronizedSingleton2 getInstance() {
        if (instance == null) {
            // 처음 한번만 인스턴스가 생성된다.
            synchronized (SynchronizedSingleton2.class) {
                if (instance == null) {
                    instance = new SynchronizedSingleton2();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {

        SynchronizedSingleton2 singleton1 = SynchronizedSingleton2.getInstance();
        SynchronizedSingleton2 synchronizedSingleton2 = SynchronizedSingleton2.getInstance();

        System.out.println(singleton1);
        System.out.println(synchronizedSingleton2);
    }
}