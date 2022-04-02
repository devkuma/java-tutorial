package com.devkuma.algorithum.programing.recursion;

public class FibonacciRecursion {

    public int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        FibonacciRecursion recursion = new FibonacciRecursion();
        int result = recursion.fibonacci(10);
        System.out.println(result); // 55
    }
}

