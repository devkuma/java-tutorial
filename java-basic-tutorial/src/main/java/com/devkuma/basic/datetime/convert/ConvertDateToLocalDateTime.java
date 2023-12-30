package com.devkuma.basic.datetime.convert;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class ConvertDateToLocalDateTime {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();

        Date date = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());

        System.out.println(date);
    }
}
