package com.devkuma.algorithum.programing.acmicpc._1712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            // 입력
            StringTokenizer input = new StringTokenizer(br.readLine(), " ");
            final long a = Long.parseLong(input.nextToken()); // 고정 비용
            final long b = Long.parseLong(input.nextToken()); // 가변 비용
            final long c = Long.parseLong(input.nextToken()); // 1대 가격

            // 계산
            if (b >= c) { // 가변 비용이 1대 가격보다 같거나 크면, 손기분기점이 없다. 3 2 1 인 경우, 2 >= 1
                System.out.println(-1);
                return;
            }

            int n = 0; // 판매 대수
            long cost = 0; // 총 비용(=고정 비용+가변 비용)
            long income = 0; // 총 수입(판매 비용)

            do {
                n++;

                cost = a + (b * n);
                income = c * n;

                // 디버그용
                //System.out.println("n=" + n + ", cost=" + cost + ", income=" + income);
            } while (cost >= income);

            // 출력
            System.out.println(n);
        }
    }
}