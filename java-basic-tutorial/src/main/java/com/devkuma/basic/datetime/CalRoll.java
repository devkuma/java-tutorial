package com.devkuma.basic.datetime;

import java.util.Calendar;

public class CalRoll {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());  // 결과: Mon Sep 05 11:46:43 KST 2022

        cal.roll(Calendar.MINUTE, true);
        System.out.println(cal.getTime());  // 결과: Mon Sep 05 11:47:43 KST 2022
    }
}