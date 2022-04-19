package com.devkuma.algorithum.programing.acmicpc._1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());
            int count = 0;
            for (int i = 0; i < n; i++) {
                int a = Integer.parseInt(st.nextToken());
                if (isPrime(a)) {
                    count++;
                }
            }

            System.out.println(count);
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