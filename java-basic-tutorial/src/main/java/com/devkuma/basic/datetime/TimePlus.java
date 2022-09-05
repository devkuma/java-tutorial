package com.devkuma.basic.datetime;

import java.time.LocalDateTime;

public class TimePlus {
    public static void main(String[] args) {
        LocalDateTime local = LocalDateTime.parse("2022-09-05T12:30");
        System.out.println(local);  // 결과: 2022-09-05T12:30
        System.out.println(local.plusMonths(3));    // 결과: 2022-12-05T12:30
        System.out.println(local.minusDays(10));    // 결과: 2022-08-26T12:30
    }
}