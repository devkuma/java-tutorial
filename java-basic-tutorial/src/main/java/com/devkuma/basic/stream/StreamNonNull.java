package com.devkuma.basic.stream;

import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamNonNull {

    public static void main(String[] args) {

        String front = "abc";
        String middle = null;
        String end = "ghi";

        String output = Stream.of(front, middle, end)
                .filter(Objects::nonNull)
                .collect(Collectors.joining());

        System.out.println(output);
    }
}
