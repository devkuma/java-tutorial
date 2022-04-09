package com.devkuma.algorithum.programing.acmicpc._11021;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ) {
            // 반복횟수 n을 입력 받는다.
            int n = Integer.parseInt(br.readLine());

            // 반복문을 사용해서 i부터 N까지 bw에 입력
            for (int i = 1; i <= n; i++) {
                // 합치는 값을 받는다.
                String[] input = br.readLine().split(" ");
                final int a = Integer.parseInt(input[0]);
                final int b = Integer.parseInt(input[1]);
                bw.write("Case #" + i + ": " + (a + b) + "\n");
            }

            // 값 출력
            bw.flush();
        }
    }
}