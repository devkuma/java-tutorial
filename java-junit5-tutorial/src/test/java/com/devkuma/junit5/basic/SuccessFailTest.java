package com.devkuma.junit5.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SuccessFailTest {

    @Test
    void success() {
        Assertions.assertEquals(10, 10);
    }

    @Test
    void fail() {
        Assertions.assertEquals(10, 8);
    }
}
