package com.devkuma.junit5.parallel;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@Execution(ExecutionMode.CONCURRENT)
public class ParallelTest1 {
    @BeforeAll
    static void beforeAll() {
        printThread("beforeAll()");
    }

    @BeforeEach
    void beforeEach(TestInfo testInfo) {
        String name = testInfo.getDisplayName();
        printThread("  " + name + ":beforeEach()");
    }

    @Test
    void test1() {
        printThread("    test1()");
    }

    @Test
    void test2() {
        printThread("    test2()");
    }

    @AfterEach
    void afterEach(TestInfo testInfo) {
        String name = testInfo.getDisplayName();
        printThread("  " + name + ":afterEach()");
    }

    @AfterAll
    static void afterAll() {
        printThread("afterAll()");
    }

    private static void printThread(String test) {
        String name = Thread.currentThread().getName();
        System.out.printf("%s@%s%n", test, name);
    }
}
