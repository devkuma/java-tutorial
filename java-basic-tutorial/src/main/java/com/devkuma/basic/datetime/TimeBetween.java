package com.devkuma.basic.datetime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class TimeBetween {
    public static void main(String[] args) {
        LocalDateTime local1 = LocalDateTime.of(
                2021, 1, 1, 3, 30, 0, 0);
        LocalDateTime local2 = LocalDateTime.of(
                2022, 9, 5, 12, 14, 30, 0);
        System.out.println(local1); // 결과: 2021-01-01T03:30
        System.out.println(local2); // 결과: 2022-09-05T12:14:30

        Period period = Period.between(local1.toLocalDate(), local2.toLocalDate());
        System.out.println("날짜 차이: " + period);   // 결과: 날짜 차이: P1Y8M4D

        System.out.println("날짜 차이: " +
                period.getYears() + "년 " + period.getMonths() + "월 " +
                period.getDays() + "일"); // 결과: 날짜 차이: 1년 8월 4일

        Duration duration = Duration.between(local1, local2);
        System.out.println("시간 차이: " + duration);
        // 결과: 시간 차이：PT14696H44M30S

        System.out.println("시간 차이: " + duration.toHours() + "시간");
        // 결과: 시간 차이: 14696시간

        System.out.println("시간 차이: " + duration.toMinutes() + "분");
        // 결과: 시간 차이: 881804분

        System.out.println("시간 차이: " + duration.getSeconds() + "초");
        // 결과: 시간 차이: 52908270초
    }
}