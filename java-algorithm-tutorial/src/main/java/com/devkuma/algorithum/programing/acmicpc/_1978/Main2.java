package com.devkuma.algorithum.programing.acmicpc._1978;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {
    public static void main(String[] args) throws IOException {

        // 에라토스테네스의 체를 만든다.
        boolean[] prime = new boolean[1001]; // 소수판별 배열 선언
        prime[0] = true;
        prime[1] = true;
        for (int i = 2; i <= Math.sqrt(1000); i++) {
            if (prime[i] == true)
                continue;
            for (int j = i * i; j < 1001; j = j + i)
                prime[j] = true;
        }

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            // 입력
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            // 반복하면서 에라토스테네스의 체에 포함되었는지 찾는다.
            int count = 0;
            for (int i = 0; i < n; i++) {
                int a = Integer.parseInt(st.nextToken());
                if (prime[a] == false) {
                    count++;
                }
            }

            // 출력
            System.out.println(count);
        }
    }
}
