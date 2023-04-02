package com.devkuma.junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BeforeAfter {

    @Test
    void testMethod1() {
        System.out.println("@Test method1 executed");
    }

    @Test
    void testMethod2() {
        System.out.println("@Test method1 executed");
    }

    @BeforeAll
    static void runOnceBeforeAllTests() {
        System.out.println("@BeforeAll executed \n");
    }


    @AfterAll
    static void runOnceAfterAllTests() {
        System.out.println("@AfterAll executed");
    }

    @BeforeEach
    void runBeforeEveryTest() {
        System.out.println("@BeforeEach executed");
    }

    @AfterEach
    void runAfterEveryTest() {
        System.out.println("@AfterEach executed \n");
    }

}
