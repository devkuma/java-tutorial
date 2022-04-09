package com.devkuma.algorithum.programing.acmicpc._10951;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        try (
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                // 합치는 값을 받는다.
                String[] input = line.split(" ");
                final int a = Integer.parseInt(input[0]);
                final int b = Integer.parseInt(input[1]);

                bw.write((a + b) + "\n");
            }

            // 값 출력
            bw.flush();
        }
    }
}
