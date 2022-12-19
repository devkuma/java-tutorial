package com.devkuma.junit5.assertion;

import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class AssertNullTest {

    @Test
    void fail() {
        String name = null;

        assertNull(name, "name is null");
    }

    @Test
    void success() {
        String name = "kimkc";

        assertNull(name, "name is null");
    }
}

