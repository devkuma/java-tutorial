package com.devkuma.algorithum.programing.acmicpc._4375;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            String str = null;
            while ((str = br.readLine()) != null) {
                final int n = Integer.parseInt(str);

                int x =1;
                for (int i = 1; ; i++) {
                    x = x % n;
                    x = x * 10 + 1;
                    if (x == 1) {
                        System.out.println(i);
                        break;
                    }
                }
            }
        }
    }
}