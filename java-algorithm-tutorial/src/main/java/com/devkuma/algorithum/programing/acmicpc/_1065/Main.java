package com.devkuma.algorithum.programing.acmicpc._1065;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            // 입력값: 1~1000
            int n = Integer.parseInt(br.readLine());

            int count = 0;
            if (n < 100) {
                count = n; // 1~99는 무조건 한수: 1,2,3...10,11.....99
            } else {
                count = 99; // 1~99까지는 무조건 한수 이기에 카운터에 포함한다.

                // n이 1000인 경우, 루프는 999까지만 돌어야 한다.
                int loop = n;
                if (n == 1000)
                    loop = 999;

                for (int i = 100; i <= loop; i++) {

                    int a = i % 10; // 첫번째 자리수
                    int b = (i / 10) % 10; // 두번째 자리수
                    int c = (i / 100) % 10; // 두번째 자리수

                    if (a - b == b - c) {
                        count++; // 한수인 경우 : 111,123,357,567,975
                        //System.out.println("i=" + i + ", count=" + count + ", a=" + a + ", b=" + b + ", c=" + c + ", result=" + (a - b == b - c));
                    }

                }
            }

            System.out.println(count);
        }
    }
}
