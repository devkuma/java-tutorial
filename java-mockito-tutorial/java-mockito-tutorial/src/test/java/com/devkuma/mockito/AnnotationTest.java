package com.devkuma.mockito;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

public class AnnotationTest {

    @Mock
    List<String> mock;
    @Spy
    List<String> spy = new ArrayList<>();
    @Captor
    ArgumentCaptor<String> captor;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void test() {
        when(mock.get(0)).thenReturn("mocked");
        System.out.println("mock.get(0) = " + mock.get(0));

        spy.add("hello");
        spy.add("world");
        doReturn("spied").when(spy).get(0);
        System.out.println("spy.get(0) = " + spy.get(0));
        System.out.println("spy.get(1) = " + spy.get(1));

        verify(spy, atLeastOnce()).add(captor.capture());
        System.out.println("captor.getAllValues() = " + captor.getAllValues());
    }
}