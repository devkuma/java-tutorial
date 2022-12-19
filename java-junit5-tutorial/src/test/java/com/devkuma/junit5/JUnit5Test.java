package com.devkuma.junit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class JUnit5Test {
    @Test
    void success() {
        Assertions.assertEquals(3, 3);
    }

    @Test
    void fail() {
        Assertions.assertEquals(3, 5);
    }

    static class StaticTest {
        @Test
        void success() {
            Assertions.assertEquals(3, 3);
        }

        @Test
        void fail() {
            Assertions.assertEquals(3, 5);
        }
    }

    class InnerTest {
        @Test
        void success() {
            Assertions.assertEquals(3, 3);
        }

        @Test
        void fail() {
            Assertions.assertEquals(3, 5);
        }
    }
}