package com.devkuma.mockito;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MockFinalClassTest {

    @Test
    void test() {
        FinalClass mock = mock(FinalClass.class);

        when(mock.hello()).thenReturn("mocked");

        System.out.println("mock.hello() = " + mock.hello());
    }

    public static final class FinalClass {
        public String hello() {
            return "world";
        }
    }
}
