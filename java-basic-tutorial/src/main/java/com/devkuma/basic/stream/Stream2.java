package com.devkuma.basic.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream2 {
    public static void main(String[] args) {
        List<Integer> numberArray1 = Arrays.asList(1, 2);
        List<Integer> numberArray2 = Arrays.asList(3, 4, 5);

        List<int[]> pairs = numberArray1.stream()
                .flatMap(i -> numberArray2.stream()
                        .map(j -> new int[]{i, j}))
                .collect(Collectors.toList());

        for (int[] a : pairs) {
            System.out.println(Arrays.toString(a));
        }
    }
}
