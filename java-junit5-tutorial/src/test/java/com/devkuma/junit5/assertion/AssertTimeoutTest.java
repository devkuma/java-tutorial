package com.devkuma.junit5.assertion;

import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import org.junit.jupiter.api.Test;

public class AssertTimeoutTest {

    @Test
    void timeoutTest() {
        assertTimeout(Duration.ofMillis(100), () -> {
            Thread.sleep(300);
        });
    }
}
