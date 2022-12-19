package com.devkuma.junit5.repeated;

import org.junit.jupiter.api.RepeatedTest;

public class RepeatedMethodTest {

    @RepeatedTest(3)
    void test() {
        System.out.println("test");
    }

}
