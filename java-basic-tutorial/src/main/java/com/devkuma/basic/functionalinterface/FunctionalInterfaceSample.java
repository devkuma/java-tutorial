package com.devkuma.basic.functionalinterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceSample {

    public static void main(String[] args) {
        System.out.println("-- Supplier --");
        Supplier<String> supplier = () -> "Hello World!";
        System.out.println(supplier.get());

        System.out.println("-- Consumer --");
        Consumer<String> consumer = (str) -> System.out.println(str.split(" ")[0]);
        consumer.andThen(System.out::println).accept("Hello World!");

        System.out.println("-- Function --");
        Function<String, Integer> function = str -> str.length();
        int length = function.apply("Hello World!");
        System.out.println(length);

        System.out.println("-- Predicate --");
        Predicate<String> predicate = (str) -> str.equals("Hello World!");
        boolean test = predicate.test("Hello World!");
        System.out.println(test);
    }
}
