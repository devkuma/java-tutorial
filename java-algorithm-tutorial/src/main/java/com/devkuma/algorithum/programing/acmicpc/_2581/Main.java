package com.devkuma.algorithum.programing.acmicpc._2581;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int m = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            int sum = 0;
            int min = Integer.MAX_VALUE;
            for (int i = m; i <= n; i++) {
                if (isPrime(i)) {
                    sum += i;
                    if (min > i) {
                        min = i;
                    }
                }
            }
            if (sum == 0) {
                System.out.println(-1);
            } else {
                System.out.println(sum);
                System.out.println(min);
            }
        }
    }

    private static boolean isPrime(int num) {
        if (num == 1) // 1은 소수x
            return false;

        //for (int i = 2; i < num; i++) { // 모든 경우를 다 확인
        //for (int i = 2; i <= num/2; i++) { // 해당 숫자의 절반까지만 확인
        for (int i = 2; i * i <= num; i++) { // 제곱근을 이용한 방법
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}