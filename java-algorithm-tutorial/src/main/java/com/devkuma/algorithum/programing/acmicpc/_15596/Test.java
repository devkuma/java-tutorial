package com.devkuma.algorithum.programing.acmicpc._15596;

public class Test {
    long sum(int[] a) {
        long ans = 0;

        for (int i : a) {
            ans += i;
        }
        // Arrays.stream(a).sum();

        return ans;
    }
}

