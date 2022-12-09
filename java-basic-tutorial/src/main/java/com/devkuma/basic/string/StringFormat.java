package com.devkuma.basic.string;

public class StringFormat {
    public static void main(String[] args) {
        System.out.println("0으로 채우기");
        System.out.println(String.format("%03d", 123));
        System.out.println(String.format("%04d", 123));
        System.out.println(String.format("%05d", 123));

        System.out.println("공백으로 채우기");
        System.out.println(String.format("%3s", "ABC"));
        System.out.println(String.format("%4s", "ABC"));
        System.out.println(String.format("%5s", "ABC"));
    }
}
