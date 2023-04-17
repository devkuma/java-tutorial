package com.devkuma.basic.collection.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ConvertArrayToSet1 {
    public static void main(String[] args) {
        String[] arr = { "a", "b", "c", "d" };

        Set<String> set = new HashSet<>(Arrays.asList(arr));

        System.out.println(set);
    }
}
