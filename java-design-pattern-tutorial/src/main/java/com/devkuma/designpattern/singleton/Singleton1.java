package com.devkuma.designpattern.singleton;

public class Singleton1 {

    private static Singleton1 instance;

    /**
     * 접근할 수 없는 생성자
     */
    private Singleton1() {
    }

    public static synchronized Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }

    public static void main(String[] args) {

        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton1 singleton2 = Singleton1.getInstance();

        System.out.println(singleton1);
        System.out.println(singleton2);
    }
}
