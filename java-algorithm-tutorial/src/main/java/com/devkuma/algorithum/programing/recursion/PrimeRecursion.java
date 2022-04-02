package com.devkuma.algorithum.programing.recursion;

public class PrimeRecursion {

    boolean hasDivisor(int n, int i) {
        if (i == n) {
            return false;
        }
        if (n % i == 0) {
            return true;
        }
        return hasDivisor(n, i + 1);
    }

    boolean isPrime(int n) {
        if (n == 1) {
            return false;
        } else if (n == 2) {
            return true;
        } else {
            return !hasDivisor(n, 2);
        }
    }

    public static void main(String[] args) {
        PrimeRecursion recursion = new PrimeRecursion();
        boolean result1 = recursion.isPrime(7);
        System.out.println(result1); // true

        boolean result2 = recursion.isPrime(4);
        System.out.println(result2); // true
    }

}
