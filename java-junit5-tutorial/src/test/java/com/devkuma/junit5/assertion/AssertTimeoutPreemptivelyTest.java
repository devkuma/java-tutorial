package com.devkuma.junit5.assertion;

import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

import java.time.Duration;

import org.junit.jupiter.api.Test;

public class AssertTimeoutPreemptivelyTest {

    @Test
    void timeoutTest() {
        assertTimeoutPreemptively(Duration.ofMillis(100), () -> {
            Thread.sleep(300);
        });
    }
}
