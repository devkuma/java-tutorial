package com.devkuma.basic.stream;

import java.util.Arrays;
import java.util.List;

public class StreamForEach {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        numbers.stream()
                .map(x -> x + 3) // 4를 더한다.
                .filter(x -> x % 2 == 0) // 짝수만 필터링한다.
                .limit(3) // 3개까지만 가져온다.
                .forEach(System.out::println);
    }
}
