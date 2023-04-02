package com.devkuma.mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;

public class HelloMockitoTest {

    @Test
    void test() {
        List<String> mock = mock(List.class);

        when(mock.get(0)).thenReturn("Hello Mockito!");

        System.out.println(mock.get(0));
    }
}
