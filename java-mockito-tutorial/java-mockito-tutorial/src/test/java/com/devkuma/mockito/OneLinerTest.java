package com.devkuma.mockito;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class OneLinerTest {
    List<String> mock = when(mock(List.class).get(0)).thenReturn("mocked").getMock();

    @Test
    void test() {
        System.out.println("mock.get(0) = " + mock.get(0));
    }
}