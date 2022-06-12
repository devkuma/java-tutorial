package com.devkuma.algorithum.programing.acmicpc._10430;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            StringTokenizer input = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(input.nextToken());
            int b = Integer.parseInt(input.nextToken());
            int c = Integer.parseInt(input.nextToken());

            System.out.println((a + b) % c);
            System.out.println(((a % c) + (b % c)) % c);
            System.out.println((a * b) % c);
            System.out.println(((a % c) * (b % c)) % c);
        }
    }
}
