package com.devkuma.algorithum.programing.acmicpc._14681;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            // 갑 입력
            final int x = Integer.parseInt(br.readLine());
            final int y = Integer.parseInt(br.readLine());

            int q = 0;
            if(x >= 0) {
                if(y >= 0) {
                    q = 1;
                } else {
                    q = 4;
                }
            } else {
                if(y >= 0) {
                    q = 2;
                } else {
                    q = 3;
                }
            }

            // 결과 출력
            System.out.println(q);
        }
    }
}
