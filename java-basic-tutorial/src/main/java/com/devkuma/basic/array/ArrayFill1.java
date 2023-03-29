package com.devkuma.basic.array;

import java.util.Arrays;

public class ArrayFill1 {
    public static void main(String args[]) {

        int[] arr = new int[5];

//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = 10;
//        }

        Arrays.fill(arr, 10);
        System.out.println(Arrays.toString(arr));
    }
}
