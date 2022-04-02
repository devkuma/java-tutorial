package com.devkuma.algorithum.programing.acmicpc._2439;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            // 반복 횟수를 입력
            int input = Integer.parseInt(br.readLine());

            // 출력한 스페이스를 입력한 만큰 만든다.
            String space = "";
            for (int i = 0; i < input - 1; i++) {
                space = space + " ";
            }
            // 별 출력
            String star = "";
            for (int i = 0; i < input; i++) {
                star = star + "*";
                System.out.println(space.substring(0, space.length() - i) + star);
            }
        }
    }
}