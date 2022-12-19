package com.devkuma.junit5.assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AssertThrowsTest {

    void setNumber(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("number must be greater than 0.");
        }
    }

    @Test
    void test() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> setNumber(-5)
        );
        String message = exception.getMessage();
        assertEquals("number must be greater than 0.", message);
    }
}
