package com.devkuma.mockito;

import org.junit.jupiter.api.Test;
import org.mockito.DoNotMock;

import static org.mockito.Mockito.mock;

public class DoNotMockTest {

    @Test
    void test() {
        mock(Hoge.class);
    }

    @DoNotMock
    public static class Hoge {
    }
}