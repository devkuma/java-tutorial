package com.devkuma.basic.datetime;

import java.util.Calendar;

public class CalSet {

    public static void main(String[] args) {
        Calendar cal1 = Calendar.getInstance();
        cal1.set(2022, 8, 1, 15, 20, 10);
        System.out.println(cal1.getTime()); // 결과: Thu Sep 01 15:20:10 KST 2022

        Calendar cal2 = Calendar.getInstance();
        cal2.set(Calendar.YEAR, 2022);
        System.out.println(cal2.getTime()); // 결과: Mon Sep 05 11:41:55 KST 2022
    }
}