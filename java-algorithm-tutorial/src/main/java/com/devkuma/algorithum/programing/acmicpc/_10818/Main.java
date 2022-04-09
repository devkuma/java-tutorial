package com.devkuma.algorithum.programing.acmicpc._10818;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            // 갑 입력
            int n = Integer.parseInt(br.readLine());
            StringTokenizer nums = new StringTokenizer(br.readLine(), " ");

            // 최솟값, 최댓값 구하기
            int a = Integer.parseInt(nums.nextToken());

            int min = a;
            int max = a;
            for (int i = 1; i < n; i++) {
                a = Integer.parseInt(nums.nextToken());

                if (a > max) {
                    max = a;
                } else if (a < min) {
                    min = a;
                }
            }

            // 값 출력
            System.out.println(min + " " + max);
        }
    }
}
