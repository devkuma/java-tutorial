package com.devkuma.algorithum.programing.acmicpc._8393;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int input = Integer.parseInt(br.readLine());

            // 반복문 실행 : i부터 input까지 합을 구한다.
            int sum = 0;
            for (int i = 1; i <= input; i++) {
                sum = sum + i;
            }

            // 결과 출력
            System.out.print(sum);
        }
    }
}
