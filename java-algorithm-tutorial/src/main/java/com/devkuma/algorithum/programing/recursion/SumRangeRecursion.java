package com.devkuma.algorithum.programing.recursion;

public class SumRangeRecursion {

    int sumRange(int a, int b) {
        if (a == b) {
            return a;
        }
        return sumRange(a, b - 1) + b;
    }

    public static void main(String[] args) {
        SumRangeRecursion recursion = new SumRangeRecursion();
        int result = recursion.sumRange(1, 5);
        System.out.println(result); // 6
    }
}