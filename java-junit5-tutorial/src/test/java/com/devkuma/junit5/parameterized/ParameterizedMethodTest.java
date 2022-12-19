package com.devkuma.junit5.parameterized;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParameterizedMethodTest {
    private static Stream provideBooleanValues() {
        return Stream.of(
                Arguments.of(true, true),
                Arguments.of(true, false),
                Arguments.of(false, true),
                Arguments.of(false, false)
        );
    }

    @ParameterizedTest
    @MethodSource("provideBooleanValues")
    void testBooleanValues(boolean expectedBool, boolean actualBool) {
        assertEquals(expectedBool, actualBool);
    }
}
