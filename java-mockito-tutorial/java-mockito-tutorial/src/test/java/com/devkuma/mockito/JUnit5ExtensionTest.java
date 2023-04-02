package com.devkuma.mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Map;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class JUnit5ExtensionTest {
    @Mock
    List<String> mockList;

    @Test
    void test() {
        when(mockList.get(0)).thenReturn("mocked");
        System.out.println("mockList.get(0) = " + mockList.get(0));
    }

    @Test
    void testMethodArgument(@Mock Map<String, String> mockMap) {
        when(mockMap.get("hello")).thenReturn("mocked");
        System.out.println("mockMap.get(hello) = " + mockMap.get("hello"));
    }
}
