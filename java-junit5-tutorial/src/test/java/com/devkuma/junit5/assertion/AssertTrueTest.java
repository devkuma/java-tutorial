package com.devkuma.junit5.assertion;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AssertTrueTest {

    @Test
    void trueTest() {
        boolean a = true;

        assertTrue(a);
    }

    @Test
    void arithmeticTrue() {
        int a = 3;
        int b = 10;

        assertTrue(a > b, "a가 b보다 커야 한다.");
    }
}
