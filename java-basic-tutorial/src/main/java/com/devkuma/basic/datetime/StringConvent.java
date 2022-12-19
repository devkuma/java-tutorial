package com.devkuma.basic.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class StringConvent {
    public static void main(String[] args) {
        String strDate = "2022/12/12";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");

        LocalDate localDate = LocalDate.parse(strDate, dateTimeFormatter);
        System.out.println(localDate);

        LocalDateTime ldt = LocalDateTime.of(localDate, LocalTime.of(0, 0));
        System.out.println(ldt);
    }
}
