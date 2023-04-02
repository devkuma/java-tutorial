package com.devkuma.mockito;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.argThat;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatcher;
import org.mockito.stubbing.Answer;

public class WhenTest {
    @Test
    void test() {
        List<String> mock = mock(List.class);

        when(mock.get(0)).thenReturn("hello");
        when(mock.get(1)).thenReturn("world");

        System.out.println("mock.get(0) = " + mock.get(0));
        System.out.println("mock.get(0) = " + mock.get(0));
        System.out.println("mock.get(0) = " + mock.get(0));
        System.out.println("mock.get(1) = " + mock.get(1));
        System.out.println("mock.get(2) = " + mock.get(2));

        when(mock.get(1)).thenReturn("Override");
        System.out.println("mock.get(1) = " + mock.get(1));
    }

    @Test
    void testConsecutiveCalls() {
        List<String> mock = mock(List.class);

        when(mock.get(0)).thenReturn("one", "two", "three");

        System.out.println("mock.get(0) = " + mock.get(0));
        System.out.println("mock.get(0) = " + mock.get(0));
        System.out.println("mock.get(0) = " + mock.get(0));
        System.out.println("mock.get(0) = " + mock.get(0));
    }

    @Test
    void testThrowException() {
        List<String> mock = mock(List.class);

        when(mock.get(0)).thenThrow(new RuntimeException("test"));

        try {
            mock.get(0);
        } catch (Throwable e) {
            System.out.println("e = " + e);
        }
    }

    @Test
    void testConsecutiveThrowException() {
        List<String> mock = mock(List.class);

        when(mock.get(0)).thenThrow(
                new RuntimeException("one"),
                new NullPointerException("two"),
                new IllegalArgumentException("three")
        );
        try {
            mock.get(0);
        } catch (Throwable e1) {
            System.out.println("e1 = " + e1);
        }
        try {
            mock.get(0);
        } catch (Throwable e2) {
            System.out.println("e2 = " + e2);
        }
        try {
            mock.get(0);
        } catch (Throwable e3) {
            System.out.println("e3 = " + e3);
        }
        try {
            mock.get(0);
        } catch (Throwable e4) {
            System.out.println("e4 = " + e4);
        }
    }

    @Test
    void testConsecutiveThrowAndReturn() {
        List<String> mock = mock(List.class);

        when(mock.get(0))
                .thenReturn("one")
                .thenThrow(new RuntimeException("two"))
                .thenReturn("three");

        System.out.println("mock.get(0) = " + mock.get(0));
        try {
            mock.get(0);
        } catch (Throwable e) {
            System.out.println("e = " + e);
        }
        System.out.println("mock.get(0) = " + mock.get(0));
    }

    @Test
    void testAnyArgumentMatch() {
        List<String> mock = mock(List.class);

        when(mock.get(anyInt())).thenReturn("test");

        System.out.println("mock.get(0) = " + mock.get(0));
        System.out.println("mock.get(1) = " + mock.get(1));
        System.out.println("mock.get(2) = " + mock.get(2));
    }

    @Test
    void testStubbingMultipleArgumentsMethod_invalidCase() {
        BiFunction<String, String, String> mock = mock(BiFunction.class);

        when(mock.apply("hello", anyString())).thenReturn("mocked");

        System.out.println(mock.apply("hello", "world"));
    }

    @Test
    void testStubbingMultipleArgumentsMethod_validCase() {
        BiFunction<String, String, String> mock = mock(BiFunction.class);

        when(mock.apply(eq("hello"), anyString())).thenReturn("mocked");

        System.out.println(mock.apply("hello", "world"));
    }

    @Test
    void testCustomArgumentMatcher() {
        Function<String, String> mock = mock(Function.class);

        ArgumentMatcher<String> isFoo = arg -> arg.equals("hello");

        when(mock.apply(argThat(isFoo))).thenReturn("HELLO!!!");

        System.out.println("mock.apply(hello) = " + mock.apply("hello"));
        System.out.println("mock.apply(hey) = " + mock.apply("hey"));
    }

    @Test
    void testAnswer() {
        Function<String, String> mock = mock(Function.class);

        Answer<String> answer = invocation -> {
            System.out.println("arguments = " + Arrays.toString(invocation.getArguments()));
            return "world";
        };

        when(mock.apply("hello")).thenAnswer(answer);

        System.out.println("mock.apply(hello) = " + mock.apply("hello"));
        System.out.println("mock.apply(hey)   = " + mock.apply("hey"));
    }

    @Test
    void testReturnVoid() {
        Runnable mock = mock(Runnable.class);

        doThrow(new RuntimeException("test")).when(mock).run();

        try {
            mock.run();
        } catch (Throwable e) {
            System.out.println("e = " + e);
        }
    }
}
