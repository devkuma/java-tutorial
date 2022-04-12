package com.devkuma.algorithum.programing.acmicpc._4344;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))
        ) {

            // 테스트 케이스의 개수
            int c = Integer.parseInt(br.readLine());

            for (int i = 0; i < c; i++) {

                StringTokenizer input = new StringTokenizer(br.readLine(), " ");

                // 학생의 수
                int n = Integer.valueOf(input.nextToken());

                // N명의 점수
                int[] scores = new int[n];

                // 점수 합산과 n명의 점수를 저장
                int sum = 0;
                for (int j = 0; j < n; j++) {
                    int score = Integer.valueOf(input.nextToken());
                    scores[j] = score;
                    sum += score;
                }

                // 평균
                float avg = (float) sum / (float) n;

                // 평균을 넘는 학생 수
                int highCount = 0;
                for (int j = 0; j < n; j++) {
                    if (avg < scores[j]) {
                        highCount++;
                    }
                }

                // 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력
                bw.write(String.format("%.3f%%\n", (((float) highCount / n) * 100)));
            }

            bw.flush();
        }
    }
}