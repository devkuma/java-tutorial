package com.devkuma.algorithum.programing.acmicpc._2309;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        int sum = 0;
        int[] arr = new int[9];
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            for(int i= 0; i < 9;i++){
                arr[i] = Integer.parseInt(br.readLine());
                sum += arr[i];
            }
        }

        Arrays.sort(arr);

        boolean exit = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length; j++) {
                if (sum - arr[i] - arr[j] == 100) {
                    for (int y = 0; y < arr.length; y++) {
                        if(arr[i] == arr[y] || arr[j] == arr[y]) {
                            continue;
                        }
                        System.out.println(arr[y]);
                    }
                    exit =true;
                    break;
                }
            }
            if (exit) {
                break;
            }
        }
    }
}
