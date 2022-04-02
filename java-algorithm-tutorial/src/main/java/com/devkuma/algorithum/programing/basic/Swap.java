package com.devkuma.algorithum.programing.basic;

public class Swap {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a:" + a); // 2
        System.out.println("b:" + b); // 1
    }
}
