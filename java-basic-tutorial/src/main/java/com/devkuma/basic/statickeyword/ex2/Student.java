package com.devkuma.basic.statickeyword.ex2;

public class Student {
    static int number = 100;
    String name;

    Student(String name) {
        this.name = name;
    }

    public static void printNumber() {
        int localVariable = 100;
        // name = "a"; // error
        System.out.println("지금 Student의 number는 " + number + "입니다.");
    }
}
