package com.devkuma.designpattern.singleton;

public class Singleton2 {

    private volatile static Singleton2 instance;

    /**
     * 접근할 수 없는 생성자
     */
    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        if (instance == null) {
            // 처음 한번만 인스턴스가 생성된다.
            synchronized (Singleton2.class) {
                if (instance == null) {
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {

        Singleton2 singleton1 = Singleton2.getInstance();
        Singleton2 singleton2 = Singleton2.getInstance();

        System.out.println(singleton1);
        System.out.println(singleton2);
    }
}