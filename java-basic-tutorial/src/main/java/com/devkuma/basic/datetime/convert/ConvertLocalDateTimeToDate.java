package com.devkuma.basic.datetime.convert;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class ConvertLocalDateTimeToDate {

    public static void main(String[] args) {
        Date todayDate = new Date();

        LocalDateTime localDateTime = Instant.ofEpochMilli(todayDate.getTime())
                                             .atZone(ZoneId.systemDefault())
                                             .toLocalDateTime();

        System.out.println(localDateTime);
    }
}
