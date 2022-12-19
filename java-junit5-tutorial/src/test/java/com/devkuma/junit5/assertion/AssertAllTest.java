package com.devkuma.junit5.assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertAllTest {

    @Test
    void basicTest() {
        String name = null;

        assertNotNull(name, "name is not null");
        assertEquals(1, 2);
    }

    @Test
    void allTest() {
        final String name = null;

        assertAll(
                () -> assertNotNull(name, "name is not null"),
                () -> assertEquals(1, 2)
        );
    }
}
