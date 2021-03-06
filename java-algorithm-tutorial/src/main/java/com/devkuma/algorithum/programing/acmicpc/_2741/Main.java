package com.devkuma.algorithum.programing.acmicpc._2741;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            // 1부터 N까지 입력할 변수 선언
            int n = Integer.parseInt(br.readLine());

            // 반복문을 사용해서 i부터 N까지 출력
            for (int i = 1; i <= n; i++) {
                System.out.println(i);
            }
        }
    }
}
