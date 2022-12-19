package com.devkuma.junit5.parallel;

import org.junit.jupiter.api.*;

public class ParallelTest3 {

    @Nested
    class StandardNestedTest {

        @Test
        void test1() {
            printThread("StandardNestedTest.test1()");
        }

        @Test
        void test2() {
            printThread("StandardNestedTest.test2()");
        }
    }

    @Nested
    @TestInstance(TestInstance.Lifecycle.PER_CLASS)
    //@Execution(ExecutionMode.CONCURRENT)
    class PerClassTest {

        @Test
        void test1() {
            printThread("PerClassTest.test1()");
        }

        @Test
        void test2() {
            printThread("PerClassTest.test2()");
        }
    }

    @Nested

    @TestMethodOrder(MethodOrderer.MethodName.class)
    //@Execution(ExecutionMode.CONCURRENT)
    class OrderedTest {

        @Test
        void test1() {
            printThread("OrderedTest.test1()");
        }

        @Test
        void test2() {
            printThread("OrderedTest.test2()");
        }
    }

    private static void printThread(String test) {
        String name = Thread.currentThread().getName();
        System.out.printf("%s@%s%n", test, name);
    }
}
