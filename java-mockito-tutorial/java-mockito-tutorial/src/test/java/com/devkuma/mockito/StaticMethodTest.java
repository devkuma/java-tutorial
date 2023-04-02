package com.devkuma.mockito;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class StaticMethodTest {

    @Test
    void test() {
        System.out.println("Hoge.hello() = " + Hoge.hello("before"));

        try (MockedStatic<Hoge> mocked = Mockito.mockStatic(Hoge.class)) {
            mocked.when(() -> Hoge.hello("test")).thenReturn("mocked");

            System.out.println("Hoge.hello() = " + Hoge.hello("test"));

            mocked.verify(() -> Hoge.hello("test"));
        }

        System.out.println("Hoge.hello() = " + Hoge.hello("after"));
    }

    public static class Hoge {
        public static String hello(String arg) {
            return "world (arg=" + arg + ")";
        }
    }
}