package com.devkuma.junit5.basic;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DisabledTest {
    @Test
    void test1() {
        System.out.println("test1()");
    }

    @Test
    @Disabled
    void test2() {
        System.out.println("test2()");
    }
}
