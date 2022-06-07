package com.devkuma.basic.stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMap1 {

    public static void main(String[] args) {
        List<List<String>> alphabets = Arrays.asList(Arrays.asList("a", "b", "c"), Arrays.asList("d", "e", "f"));

        List<String> result = alphabets.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        System.out.println(result);
    }

}
