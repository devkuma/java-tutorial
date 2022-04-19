package com.devkuma.algorithum.programing.acmicpc._10757;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            // 입력
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            BigInteger a = new BigInteger(st.nextToken());
            BigInteger b = new BigInteger(st.nextToken());

            // 결과 출력
            System.out.println(a.add(b));
        }
    }
}
