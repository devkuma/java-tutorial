package com.devkuma.basic.datatype.ex1;

public class MyObjectMain {
    public static void main(String[] args) {
        MyObject a = new MyObject("a");
        MyObject b = new MyObject("b");

        // 초기값 표시
        System.out.println(a.getStr()); // a
        System.out.println(b.getStr()); // b

        // a를 b에 대입
        a = b;
        System.out.println(a.getStr()); // b

        // b의 str에 값 "c"를 대입
        b.setStr("c");
        System.out.println(a.getStr()); // c
    }
}