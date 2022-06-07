package com.devkuma.basic.stream;

public class StreamSum {

    public static void main(String[] args) {
        String input = "1Ca2Adf9";

        int sum = input.chars()
                .filter(Character::isDigit)
                .map(a -> Character.digit(a, 10))
                .sum();

        System.out.println(sum); // 1 + 2 + 3
    }
}
