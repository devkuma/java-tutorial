package com.devkuma.algorithum.programing.acmicpc._3052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer input = new StringTokenizer(br.readLine(), " ");

            double a = Integer.parseInt(input.nextToken());
            double b = Integer.parseInt(input.nextToken());
            double v = Integer.parseInt(input.nextToken());

            System.out.println((int) Math.ceil((v - a) / (a - b)) + 1);
        }
    }
}
