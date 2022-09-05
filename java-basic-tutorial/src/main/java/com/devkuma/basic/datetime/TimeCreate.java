package com.devkuma.basic.datetime;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class TimeCreate {
    public static void main(String[] args) {
        LocalDateTime local = LocalDateTime.now();
        System.out.println(local);
        // 결과: 2022-09-05T12:03:34.123041

        OffsetDateTime offset = OffsetDateTime.of(
                2022, 9, 5, 12, 3, 29, 0, ZoneOffset.of("+09:00"));
        System.out.println(offset);
        // 결과: 2022-09-05T12:03:29+09:00

        ZonedDateTime zoned = ZonedDateTime.parse("2022-09-05T12:03:29+09:00[Asia/Seoul]");
        System.out.println(zoned);
        // 결과: 2022-09-05T12:03:29+09:00[Asia/Seoul]
    }
}