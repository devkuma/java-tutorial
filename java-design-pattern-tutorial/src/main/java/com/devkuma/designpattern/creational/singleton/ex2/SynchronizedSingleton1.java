package com.devkuma.designpattern.creational.singleton.ex2;

public class SynchronizedSingleton1 {

    private static SynchronizedSingleton1 instance;

    /**
     * 접근할 수 없는 생성자
     */
    private SynchronizedSingleton1() {
    }

    public static synchronized SynchronizedSingleton1 getInstance() {
        if (instance == null) {
            instance = new SynchronizedSingleton1();
        }
        return instance;
    }

    public static void main(String[] args) {

        SynchronizedSingleton1 synchronizedSingleton1 = SynchronizedSingleton1.getInstance();
        SynchronizedSingleton1 singleton2 = SynchronizedSingleton1.getInstance();

        System.out.println(synchronizedSingleton1);
        System.out.println(singleton2);
    }
}
