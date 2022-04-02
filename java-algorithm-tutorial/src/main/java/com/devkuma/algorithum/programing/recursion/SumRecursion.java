package com.devkuma.algorithum.programing.recursion;

public class SumRecursion {

    public int sum(int n) {
        if(n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        SumRecursion recursion = new SumRecursion();
        int result = recursion.sum(10);
        System.out.println(result); // 55
    }
}
