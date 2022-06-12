package com.devkuma.algorithum.programing.acmicpc._1759;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static int L;
    static int C;
    static char[] chars;
    static char[] keys;

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            StringTokenizer input = new StringTokenizer(br.readLine(), " ");
            L = Integer.parseInt(input.nextToken());
            C = Integer.parseInt(input.nextToken());

            input = new StringTokenizer(br.readLine(), " ");

            chars = new char[C];
            for (int i = 0; i < C; i++) {
                chars[i] = input.nextToken().charAt(0);
            }
        }

        // 정렬
        Arrays.sort(chars);

        keys = new char[L];

        cypherText(0, 0);
    }

    private static void cypherText(int start, int index) {
        if (index == L) {
            int mo = 0;
            int ja = 0;

            for (char x : keys) {
                if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
                    mo++;
                } else {
                    ja++;
                }
            }

            if (mo >= 1 && ja >= 2) {
                System.out.println(keys);
            }

            return;
        }


        for (int i = start; i < C; i++) {
            keys[index] = chars[i];
            cypherText(i + 1, index + 1);
        }
    }
}