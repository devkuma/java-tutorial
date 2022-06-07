package com.devkuma.basic.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPeek {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4);

        List<Integer> result = numbers.stream()
                .peek(v -> System.out.println("From stream: " + v)) // 처음 소비한 요소를 출력

                .map(v -> v + 3)
                .peek(v -> System.out.println("Mapped value: " + v)) // map 실행 후 결과를 출력

                .filter(v -> v % 2 == 0)
                .peek(v -> System.out.println("Filtered value: " + v)) // filter 실행 후 결과를 출력

                .limit(3)
                .peek(v -> System.out.println("limited value: " + v)) // limit 실행 후 결과를 출력

                .collect(Collectors.toList());

        System.out.println(result);
    }
}
