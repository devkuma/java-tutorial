package com.devkuma.basic.stream;

import java.util.stream.Collectors;

public class Stream1 {

    public static void main(String[] args) {
        String input = "1Ca2Adf34eB342";

        String output = input.chars()
                .mapToObj(ch -> (char) ch)// Stream<Character>
                .sorted()
                .filter(ch -> !Character.isDigit(ch))
                .map(Object::toString)
                .collect(Collectors.joining());

        System.out.println(output);
    }
}
