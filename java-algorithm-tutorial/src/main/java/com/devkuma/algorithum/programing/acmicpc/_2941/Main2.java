package com.devkuma.algorithum.programing.acmicpc._2941;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            // 입력
            String str = br.readLine();

            String[] chars = new String[]{"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

            for (String c : chars) {
                str = str.replace(c, "_");
            }

            // 출력
            System.out.println(str.length());
        }
    }
}