package com.devkuma.algorithum.programing.acmicpc._2577;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            // 갑 입력
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            int c = Integer.parseInt(br.readLine());

            // 3개 수를 곱한 결과
            String m = String.valueOf(a * b * c);

            int[] counts = new int[10];
            for (int i = 0; i < m.length(); i++) {
                int num = Integer.parseInt(String.valueOf(m.charAt(i)));
                counts[num]++;
            }

            // 값 출력
            for(int count : counts) {
                System.out.println(count);
            }
        }
    }
}