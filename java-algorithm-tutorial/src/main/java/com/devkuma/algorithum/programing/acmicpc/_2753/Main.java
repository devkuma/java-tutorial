package com.devkuma.algorithum.programing.acmicpc._2753;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int input = Integer.parseInt(br.readLine());

            // 윤년은 연도가 4의 배수이면서, 100의 배수가 아닐 때 또는 400의 배수일 때이다.
            if (input % 4 == 0 && (input % 100 != 0 || input % 400 == 0)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}