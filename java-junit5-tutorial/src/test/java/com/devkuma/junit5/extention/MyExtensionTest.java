package com.devkuma.junit5.extention;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

//@ExtendWith(MyExtension.class)
public class MyExtensionTest {

    @Test
    @ExtendWith(MyExtension.class)
    void test1() {
        System.out.println("  test1()");
    }

    @Test
    void test2() {
        System.out.println("  test2()");
    }
}