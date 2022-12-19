package com.devkuma.junit5.assertion;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AssertEqualsTest {

    @Test
    void basicTest() {
        assertEquals(1, 2);
    }

    @Test
    void numberTest() {
        assertEquals(1, 2, "숫자 비교");
    }

    @Test
    void stringTest() {
        assertEquals("abc", "ABC", "문자 비교");
    }
}
