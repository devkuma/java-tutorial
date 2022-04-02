package com.devkuma.algorithum.programing.acmicpc._2741;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ) {
            // 1부터 N까지 입력할 변수 선언
            String n = br.readLine();
            int length = Integer.parseInt(n);

            // 반복문을 사용해서 i부터 N까지 bw에 입력
            for (int i = 1; i <= length; i++) {
                bw.write(i + "\n");
            }

            // 값 출력
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
