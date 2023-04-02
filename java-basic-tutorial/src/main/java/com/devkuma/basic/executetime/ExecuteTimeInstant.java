package com.devkuma.basic.executetime;

import java.time.Duration;
import java.time.Instant;

public class ExecuteTimeInstant {
    public static void main(String[] args) {
        Instant beforeTime = Instant.now();  // 코드 실행 전에 시간 받아오기

        int sum = 0;
        for (int i = 0; i < 100000; i++) {
            for (int j = 0; j < 50000; j++) {
                sum += i * j;
            }
        }
        System.out.println(sum);

        Instant afterTime = Instant.now();
        long diffTimeSec = Duration.between(beforeTime, afterTime).toMillis() / 1000; // 두 개의 실행 시간
        System.out.println("실행 시간(ms): " + diffTimeSec);
    }
}
