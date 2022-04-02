package com.devkuma.algorithum.programing.recursion;

public class GcdRecursion {

    public int gcd(int m, int n) {
        if(n == 0) {
            return m;
        }
        return gcd(n,  m % n);
    }

    public static void main(String[] args) {
        GcdRecursion recursion = new GcdRecursion();
        int result = recursion.gcd(30, 7);
        System.out.println(result); // 1
    }
}
