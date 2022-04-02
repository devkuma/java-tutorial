package com.devkuma.algorithum.programing.acmicpc._9498;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            // 점수 입력
            int input = Integer.parseInt(br.readLine());

            // 점수에 따른 시험 성적을 구함
            String result;
            if (input >= 90)
                result = "A";
            else if (input >= 80)
                result = "B";
            else if (input >= 70)
                result = "C";
            else if (input >= 60)
                result = "D";
            else
                result = "F";

            // 시험 성적 출력
            System.out.print(result);
        }
    }
}
