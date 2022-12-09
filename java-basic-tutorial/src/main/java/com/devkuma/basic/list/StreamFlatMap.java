package com.devkuma.basic.list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMap {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("devkuma", "araikuma", "kimkc", "jiwoo");
        List<String> list2 = Arrays.asList("yun", "kim", "kuma");

        //Stream.flatMap 을 사용하여, 목록을 합한다.
        List<List<String>> outer = Arrays.asList(list1, list2);
        List<String> newList = outer.stream()
                                    .flatMap(lst -> lst.stream())
                                    .collect(Collectors.toList());

        System.out.println(newList);
    }
}