package com.devkuma.basic.datetime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;

public class TimeTrans {
    public static void main(String[] args) {
        LocalDateTime local = LocalDateTime.now();
        System.out.println(local);  // 결과: 2022-09-05T14:32:05.526238

        Instant instant = local.toInstant(ZoneOffset.of("+09:00"));
        Date date = Date.from(instant);
        System.out.println(date);   // 결과: Mon Sep 05 14:32:05 KST 2022

        Calendar cal = Calendar.getInstance();
        Instant instant2 = cal.toInstant();
        LocalDateTime local2 = LocalDateTime.ofInstant(instant2, ZoneId.of("Asia/Seoul"));
        System.out.println(local2); // 결과: 2022-09-05T14:32:05.542
    }
}
