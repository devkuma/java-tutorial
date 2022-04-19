package com.devkuma.algorithum.programing.acmicpc._5622;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            // 입력
            String input = br.readLine();

            int sum = 0;
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);

                if ('A' <= c && c <= 'C') { // ABC = 2
                    sum += 3;
                } else if ('D' <= c && c <= 'F') { // DEF = 3
                    sum += 4;
                } else if ('G' <= c && c <= 'I') { // GHI = 4
                    sum += 5;
                } else if ('J' <= c && c <= 'L') { // JKL = 5
                    sum += 6;
                } else if ('M' <= c && c <= 'O') { // MNO = 6
                    sum += 7;
                } else if ('P' <= c && c <= 'S') { // PQRS = 7
                    sum += 8;
                } else if ('T' <= c && c <= 'V') { // TUV = 8
                    sum += 9;
                } else if ('W' <= c && c <= 'Z') { // WXYZ = 9
                    sum += 10;
                }
            }

            // 출력
            System.out.println(sum);
        }
    }
}