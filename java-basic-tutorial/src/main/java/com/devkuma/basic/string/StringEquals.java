package com.devkuma.basic.string;

public class StringEquals {
    public static void main(String[] args) {
        String a = "devkuma";
        String b = "devkuma";

        String c = new String("devkuma");
        String d = new String("devkuma");

        System.out.println(a == b);  // true
        System.out.println(b == c);  // false
        System.out.println(c == d);  // false

        System.out.println(a.equals(b));  // true
        System.out.println(b.equals(c));  // true
        System.out.println(c.equals(d));  // true
    }
}
