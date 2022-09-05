package com.devkuma.basic.datetime;

import java.util.Calendar;

public class CalTime {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());  // 결과：Mon Sep 05 11:34:21 KST 2022
    }
}