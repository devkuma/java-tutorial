package com.devkuma.basic.datetime;

import java.util.Calendar;

public class CalGet {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.get(Calendar.YEAR)); // 결과: 2022
        System.out.println(cal.get(Calendar.MONTH)); // 결과: 8
        System.out.println(cal.get(Calendar.DATE)); // 결과: 5
    }
}
