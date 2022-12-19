package com.devkuma.junit5.parallel;

import org.junit.jupiter.api.Test;

public class ParallelTest2 {

    @Test
    void test1() {
        printThread("test1()");
    }

    @Test
    void test2() {
        printThread("test2()");
    }

    private static void printThread(String test) {
        String name = Thread.currentThread().getName();
        System.out.printf("%s@%s%n", test, name);
    }
}