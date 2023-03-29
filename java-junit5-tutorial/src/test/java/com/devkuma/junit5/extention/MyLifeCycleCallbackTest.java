package com.devkuma.junit5.extention;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.*;


@ExtendWith(MyLifeCycleCallback.class)
class MyLifeCycleCallbackTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("  beforeAll()");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("      beforeEach()");
    }

    @Test
    void test() {
        System.out.println("          test()");
    }

    @AfterEach
    void afterEach() {
        System.out.println("      afterEach()");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("  afterAll()");
    }
}