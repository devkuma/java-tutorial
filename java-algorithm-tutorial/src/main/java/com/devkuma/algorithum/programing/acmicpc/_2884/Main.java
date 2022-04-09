package com.devkuma.algorithum.programing.acmicpc._2884;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            // 시간, 분 입력
            String[] input = br.readLine().split(" ");
            final int inputHour = Integer.parseInt(input[0]);
            final int inputMinute = Integer.parseInt(input[1]);

            int hour;
            int minute;
            if (inputMinute < 45) {  // 입력한 분이 45분이하면,
                if (inputHour == 0) {
                    hour = 23; // 입력한 시간이 0이면 24시를 뜻하고, 24시에서 1시간을 빼서 23시가 된다.
                } else {
                    hour = (inputHour - 1); // 입력한 시간에서 1시간 뺀다.
                }
                minute = inputMinute + 60 - 45; // 입력한 시간에 60분은 더하고, 다시 45분은 뺀다.
            } else { // 입력한 분이 45분이상이면,
                hour = inputHour;
                minute = inputMinute - 45; // 입력한 분에서 45분만 뺀다.
            }
            System.out.println(hour + " " + minute);
        }
    }
}
