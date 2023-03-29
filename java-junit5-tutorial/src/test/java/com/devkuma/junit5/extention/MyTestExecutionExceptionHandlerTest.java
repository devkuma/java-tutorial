package com.devkuma.junit5.extention;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MyTestExecutionExceptionHandler.class)
class MyTestExecutionExceptionHandlerTest {

    @Test
    void success() {
        System.out.println("success()");
        assertEquals(10, 10);
    }

    @Test
    void fail() {
        System.out.println("fail()");
        assertEquals(10, 20);
    }

    @Test
    void throwsIOException() throws Exception {
        System.out.println("throwsIOException()");
        throw new IOException("test");
    }

    @Test
    void throwsNullPointerException() {
        System.out.println("throwsNullPointerException()");
        throw new NullPointerException("test");
    }

    @Test
    void throwsIllegalStateException() {
        System.out.println("throwsIllegalStateException()");
        throw new IllegalStateException("test");
    }
}