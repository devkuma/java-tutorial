package com.devkuma.algorithum.programing.recursion;

public class MaxArrayRecursion {

    // 입력 받은 배열 a에서 개수가 n까지의 최대값을 구한다.
    public static int max(int[] a, int n) {
        int x;
        if (n == 1) {
            return a[0];
        } else {
            x = max(a, n - 1);
        }

        if (x > a[n - 1]) {
            return x;
        }
        return a[n - 1];
    }

    public static void main(String[] args) {
        int arr[] = {0, 80, 60, 40, 20, 100};
        System.out.println(max(arr, 3));
    }
}
