package com.devkuma.mockito;

import static org.mockito.AdditionalAnswers.answer;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.function.Function;

import org.junit.jupiter.api.Test;
import org.mockito.stubbing.Answer1;

public class StubbingTest {

    @Test
    void testAnswer1() {
        Function<String, String> mock = mock(Function.class);

        Answer1<String, String> answer1 = arg -> {
            System.out.println("arg = " + arg);
            return "world";
        };

        when(mock.apply("hello")).thenAnswer(answer(answer1));

        System.out.println("mock.apply(hello) = " + mock.apply("hello"));
        System.out.println("mock.apply(hey)   = " + mock.apply("hey"));
    }
}
