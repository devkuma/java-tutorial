package com.devkuma.algorithum.programing.acmicpc._2908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            // 입력
            String[] input = br.readLine().split(" ");

            int a = Integer.parseInt(new StringBuffer(input[0]).reverse().toString());
            int b = Integer.parseInt(new StringBuffer(input[1]).reverse().toString());

            // 출력
            if(a > b) {
                System.out.println(a);
            } else {
                System.out.println(b);
            }
        }
    }
}
