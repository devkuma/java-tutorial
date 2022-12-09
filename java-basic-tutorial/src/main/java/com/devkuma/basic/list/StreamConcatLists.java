package com.devkuma.basic.list;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamConcatLists {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("devkuma", "araikuma", "kimkc", "jiwoo");
        List<String> list2 = Arrays.asList("yun", "kim", "kuma");

        // Stream 을 사용하여, 목록을 합한다.
        List<String> newList = Stream.concat(list1.stream(), list2.stream())
                                      .collect(Collectors.toList());

        System.out.println(newList);
    }
}
