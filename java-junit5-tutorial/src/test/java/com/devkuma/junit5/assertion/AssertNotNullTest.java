package com.devkuma.junit5.assertion;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class AssertNotNullTest {

    @Test
    void fail() {
        String name = null;

        assertNotNull(name, "name is not null");
    }

    @Test
    void success() {
        String name = "kimkc";

        assertNotNull(name, "name is not null");
    }
}
