package com.devkuma.algorithum.programing.acmicpc._1110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            // 주어진 숫자
            final int n = Integer.parseInt(br.readLine());

            int newNum = n;
            int count = 0;
            do {
                int num1 = (newNum / 10); // 첫번째 자리수
                int num2 = newNum % 10; // 두번째 자리수

                int sum = num1 + num2;
                int sum2 = sum % 10; // 합한 것에 두번째 자리수

                newNum = (num2 * 10) + sum2; // 새로운 수

                count++;
            } while (n != newNum);

            // 결과 출력
            System.out.println(count);
        }
    }
}