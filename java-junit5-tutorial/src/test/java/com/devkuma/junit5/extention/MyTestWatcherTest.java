package com.devkuma.junit5.extention;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

@ExtendWith(MyTestWatcher.class)
class MyTestWatcherTest {

    @Test
    void testSuccessful() {
        System.out.println("testSuccessful()");
        assertEquals(10, 10);
    }

    @Test
    void testFailed() {
        System.out.println("testFailed()");
        assertEquals(10, 20);
    }

    @Test
    @Disabled("REASON")
    void testDisabled() {
        System.out.println("testDisabled()");
    }

    @Test
    void testAborted() {
        System.out.println("testAborted()");
        assumeTrue(false, "test abort");
    }
}
