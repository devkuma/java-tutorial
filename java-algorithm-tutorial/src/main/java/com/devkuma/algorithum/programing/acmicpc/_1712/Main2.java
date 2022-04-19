package com.devkuma.algorithum.programing.acmicpc._1712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            // 입력
            StringTokenizer input = new StringTokenizer(br.readLine(), " ");
            final long a = Long.parseLong(input.nextToken()); // 고정 비용
            final long b = Long.parseLong(input.nextToken()); // 가변 비용
            final long c = Long.parseLong(input.nextToken()); // 1대 가격

            // 계산
            int count = -1; // 판매 대수
            if (b < c) {
                // 판매 대수 = 고정 비용 / (1대 가격 - 가변 비용) + 1
                count = (int) ((a / (c - b)) + 1);
            }

            // 출력
            System.out.println(count);
        }
    }
}