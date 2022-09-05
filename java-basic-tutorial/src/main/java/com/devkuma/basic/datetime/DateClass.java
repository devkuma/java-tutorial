package com.devkuma.basic.datetime;

import java.util.Date;

public class DateClass {

    public static void main(String[] args) {
        Date now = new Date();
        System.out.println("Now : " + now);

        Date old = new Date(0);
        System.out.println("old : " + old);

        System.out.println("before : " + old.before(now));
        System.out.println("after : " + old.after(now));
    }
}
