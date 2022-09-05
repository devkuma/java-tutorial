package com.devkuma.basic.datetime;

import java.util.Calendar;

public class CalEquals {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2020);
        cal2.set(Calendar.YEAR, 2015);
        System.out.println(cal.before(cal2));   // 결과: false
        System.out.println(cal.equals(cal2));   // 결과: false
        System.out.println(cal.after(cal2));    // 결과: true
    }
}