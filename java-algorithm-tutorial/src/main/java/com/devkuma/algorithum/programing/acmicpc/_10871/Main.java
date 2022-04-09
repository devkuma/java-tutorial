package com.devkuma.algorithum.programing.acmicpc._10871;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ) {
            // 갑 입력
            StringTokenizer input1 = new StringTokenizer(br.readLine(), " ");
            final int n = Integer.parseInt(input1.nextToken()); // 반복횟수 n
            final int x = Integer.parseInt(input1.nextToken()); // 주어진 x

            // n만 반복해서 x보다 작은 수를 찾는다.
            StringTokenizer input2 = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < n; i++) {
                int a = Integer.parseInt(input2.nextToken());
                if (a < x) {
                    bw.write(a + " ");
                }
            }

            // 값 출력
            bw.flush();
        }
    }
}
