package com.devkuma.basic.datetime;

import java.util.Calendar;

public class CalClear {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());  // 결과: Mon Sep 05 11:52:06 KST 2022

        cal.clear(Calendar.SECOND);
        System.out.println(cal.getTime());  // 결과: Mon Sep 05 11:52:00 KST 2022

        cal.clear();
        System.out.println(cal.getTime());  // 결과: Thu Jan 01 00:00:00 KST 1970
    }
}