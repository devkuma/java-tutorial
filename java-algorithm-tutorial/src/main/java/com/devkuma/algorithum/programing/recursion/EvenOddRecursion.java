package com.devkuma.algorithum.programing.recursion;

public class EvenOddRecursion {

    boolean isEven(int n) {
        if (n == 0) {
            return true;
        }
        return isOdd(n-1);
    }

    boolean isOdd(int n) {
        if (n == 0) {
            return false;
        }
        return isEven(n-1);
    }

    public static void main(String[] args) {
        EvenOddRecursion recursion = new EvenOddRecursion();

        System.out.println(recursion.isEven(8)); // true
        System.out.println(recursion.isEven(9)); // false
        System.out.println(recursion.isOdd(8)); // false
        System.out.println(recursion.isOdd(9)); // true
    }
}
