package com.devkuma.mockito;

import org.junit.jupiter.api.Test;
import org.mockito.MockedConstruction;

import static org.mockito.Mockito.mockConstruction;
import static org.mockito.Mockito.when;

public class MockConstructorTest {

    @Test
    void test() {
        System.out.println("new Hoge().hello() = " + new Hoge().hello());

        try (MockedConstruction<Hoge> mocked = mockConstruction(Hoge.class)) {
            Hoge mock = new Hoge();

            when(mock.hello()).thenReturn("mocked");

            System.out.println("mock.hello() = " + mock.hello());
        }

        System.out.println("new Hoge().hello() = " + new Hoge().hello());
    }

    public static class Hoge {
        public String hello() {
            return "world";
        }
    }
}
