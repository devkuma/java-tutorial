package com.devkuma.algorithum.programing.acmicpc._1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer input = new StringTokenizer(br.readLine(), " ");

            double max = Integer.MIN_VALUE;
            double[] scores = new double[n];
            for (int i = 0; i < n; i++) {
                double score = Double.parseDouble(input.nextToken());
                if (score > max) {
                    max = score;
                }
                scores[i] = score;
            }

            double sum = 0;
            for (int i = 0; i < n; i++) {
                sum += scores[i] / max * 100;
            }

            System.out.println(sum/n);
        }
    }
}
