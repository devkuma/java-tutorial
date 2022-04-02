package com.devkuma.algorithum.programing.acmicpc._2438;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            // 반복 횟수를 입력
            int input = Integer.parseInt(br.readLine());

            // 별 출력
            String star = "";
            for (int i = 0; i < input; i++) {
                star = star + "*";
                System.out.println(star);
            }
        }
    }
}
