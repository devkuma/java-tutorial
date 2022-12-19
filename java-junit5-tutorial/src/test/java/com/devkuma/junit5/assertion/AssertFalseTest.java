package com.devkuma.junit5.assertion;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class AssertFalseTest {

    @Test
    void falseTest() {
        boolean a = true;

        assertFalse(a);
    }

    @Test
    void arithmeticFalse() {
        int a = 3;
        int b = 10;

        assertFalse(a > b, "a가 b보다 커지 말아야 한다.");
    }
}