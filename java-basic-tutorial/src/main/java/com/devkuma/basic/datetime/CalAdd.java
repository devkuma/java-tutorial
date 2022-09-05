package com.devkuma.basic.datetime;

import java.util.Calendar;

public class CalAdd {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());  // 결과: Mon Sep 05 11:43:44 KST 2022

        cal.add(Calendar.YEAR, 3);
        System.out.println(cal.getTime());  // 결과: Fri Sep 05 11:43:44 KST 2025

        cal.add(Calendar.YEAR, -5);
        System.out.println(cal.getTime());  // 결과: Sat Sep 05 11:43:44 KST 2020
    }
}
