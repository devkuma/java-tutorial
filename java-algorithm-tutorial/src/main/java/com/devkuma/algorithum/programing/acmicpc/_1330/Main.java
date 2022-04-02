package com.devkuma.algorithum.programing.acmicpc._1330;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            // a와 b의 값을 입력
            String[] input = br.readLine().split(" ");

            // 두 수를 비교하기 위한 변수 선언
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            // a와 b의 값을 비교하여 c를 구함
            String c;
            if (a > b)
                c = ">";
            else if (a < b)
                c = "<";
            else
                c = "==";

            // c를 출력
            System.out.print(c);
        }
    }
}