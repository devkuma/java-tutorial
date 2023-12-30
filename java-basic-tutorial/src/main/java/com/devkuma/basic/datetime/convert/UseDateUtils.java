package com.devkuma.basic.datetime.convert;

import java.time.LocalDateTime;
import java.util.Date;

public final class UseDateUtils {

    public static void main(String[] args) {
        Date date = DateUtils.toDate(LocalDateTime.now());

        System.out.println(date);

        LocalDateTime localDateTime = DateUtils.toLocalDateTime(date);

        System.out.println(localDateTime);
    }
}
