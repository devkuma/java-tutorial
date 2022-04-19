package com.devkuma.algorithum.programing.acmicpc._2675;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ) {
            // 반복횟수 n을 입력 받는다.
            int n = Integer.parseInt(br.readLine());

            // 반복문을 사용해서 i부터 N까지 bw에 입력
            for (int i = 0; i < n; i++) {
                String[] input = br.readLine().split(" ");
                final int r = Integer.parseInt(input[0]);
                final String s = input[1];

                for (int j = 0; j < s.length(); j++) {
                    for (int x = 0; x < r; x++) {
                        bw.write(s.charAt(j));
                    }
                }
                bw.write("\n");
            }

            // 값 출력
            bw.flush();
        }
    }
}

