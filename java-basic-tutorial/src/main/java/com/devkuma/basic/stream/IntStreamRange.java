package com.devkuma.basic.stream;

import java.util.stream.IntStream;

public class IntStreamRange {

    public static void main(String[] args) {
        System.out.println("range:");
        IntStream.range(0, 10).forEach(System.out::println);

        System.out.println("rangeClosed:");
        IntStream.rangeClosed(0, 10).forEach(System.out::println);

        System.out.println("sum:");
        System.out.println(IntStream.range(0, 10).sum());

        System.out.println("max:");
        System.out.println(IntStream.range(0, 10).max());

        System.out.println("min:");
        System.out.println(IntStream.range(0, 10).min());

        System.out.println("average:");
        System.out.println(IntStream.range(0, 10).average());
    }
}
