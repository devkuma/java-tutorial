package com.devkuma.designpattern.creational.singleton.ex1;

public class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        if (obj1 == obj2) {
            System.out.println("obj1와 obj2는 동일한 인스턴스입니다.");
        } else {
            System.out.println("obj1와 obj2는 동일한 인스턴스가 아닙니다.");
        }
    }
}
