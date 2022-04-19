package com.devkuma.algorithum.programing.acmicpc._1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            // 입력
            String input = br.readLine();

            // 알파벳 수를 카운트한다.
            int[] alphabet = new int[26];
            for (int i = 0; i < input.length(); i++) {
                //char c = Character.toUpperCase(input.charAt(i));
                //alphabet[c - 65]++;
                char c = input.charAt(i);
                if (c >= 'a')
                    alphabet[c - 'a']++;
                else
                    alphabet[c - 'A']++;
            }

            // 많이 나온 알바벳을 구한다.
            char output = 0;
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < alphabet.length; i++) {

                if(max < alphabet[i]) {
                    max = alphabet[i];
                    output = (char) (i + 'A');
                } else if(max == alphabet[i]) {
                    output = '?';
                }
            }

            // 출력
            System.out.println(output);
        }
    }
}