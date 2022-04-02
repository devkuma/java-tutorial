package com.devkuma.algorithum.programing.acmicpc._2739;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            // 구구단을 구할 입력 변수 선언
            int input = Integer.parseInt(br.readLine());

            // for문으로 구구단 실행
            for (int i = 1; i < 10; i++) {
                System.out.println(input + " * " + i + " = " + (input * i));
            }
        }
    }
}