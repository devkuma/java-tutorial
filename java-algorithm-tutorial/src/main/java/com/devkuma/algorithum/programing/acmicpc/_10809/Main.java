package com.devkuma.algorithum.programing.acmicpc._10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            // 갑 입력: 알파벳 소문자로만 이루어진 단어 S
            final String s = br.readLine();

            // 초기값(-1) 입력
            int[] alphabet = new int[26];
            for (int i = 0; i < alphabet.length; i++) {
                alphabet[i] = -1;
            }

            // 단어에 포함되어 있는 경우에는 처음 등장하는 위치 찾기
            for (int i = 0; i < s.length(); i++) {
                int index = s.charAt(i) - 97; // a ~ z (소문자): 97 ~ 122
                if (alphabet[index] == -1) {
                    alphabet[index] = i;
                }
            }

            // 결과 출력
            for (int i = 0; i < alphabet.length; i++) {
                System.out.print(alphabet[i] + " ");
            }
            System.out.println();
        }
    }
}