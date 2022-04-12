package com.devkuma.algorithum.programing.acmicpc._11720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            // 갑 입력
            final int n = Integer.parseInt(br.readLine());
            final String nums = br.readLine();

            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += nums.charAt(i) - 48; // 아스키 코드 48 이후로 0 1 2...9 숫자이다.
            }

            // 결과 출력
            System.out.println(sum);
        }
    }
}