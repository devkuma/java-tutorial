package com.devkuma.algorithum.programing.acmicpc._8958;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());

            int[] sums = new int[n];
            for (int i = 0; i < n; i++) {
                String oxLine = br.readLine();

                int sum = 0;
                int score = 1;
                for(int j=0; j < oxLine.length(); j++) {
                    char ox = oxLine.charAt(j);
                    if (ox == 'O') {
                        sum += score;
                        score++;
                    } else {
                        score = 1;
                    }
                }
                sums[i] = sum;
            }

            // 결과 출력
            for (int sum : sums) {
                System.out.println(sum);
            }
        }
    }
}