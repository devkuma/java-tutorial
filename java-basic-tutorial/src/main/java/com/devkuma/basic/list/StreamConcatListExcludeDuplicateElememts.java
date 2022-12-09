package com.devkuma.basic.list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamConcatListExcludeDuplicateElememts {
    public static void main(String[] args) {
        // 문자열 리스트
        List<String> strList1 = Arrays.asList("devkuma", "araikuma", "kimkc", "jiwoo");
        List<String> strList2 = Arrays.asList("devkuma", "araikuma", "kimkc");

        // Stream을 사용하여 Java 목록을 합친다.
        List<String> newStrList = Stream.concat(strList1.stream(), strList2.stream())
                                        .distinct() // 중복 제외
                                        .collect(Collectors.toList());
        System.out.println(newStrList);

        // 숫자 리스트
        List<Integer> intList1 = Arrays.asList(5, 4, 3, 2, 1);
        List<Integer> intList2 = Arrays.asList(1, 2, 3, 4);

        // Stream을 사용하여 Java 목록을 합친다.
        List<Integer> newIntList = Stream.concat(intList1.stream(), intList2.stream())
                                         .distinct() //중복 제외
                                         .sorted(Comparator.naturalOrder()) // 오름차순 정렬
                                         .collect(Collectors.toList());

        System.out.println(newIntList);
    }
}