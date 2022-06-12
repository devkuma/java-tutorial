package com.devkuma.algorithum.programing.acmicpc._1037;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer nums = new StringTokenizer(br.readLine(), " ");

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for(int i = 0; i < n; i++) {
                int num  = Integer.parseInt(nums.nextToken());
                if(num > max) max = num;
                if(num < min) min = num;
            }
            System.out.println(max * min);

        }
    }
}
