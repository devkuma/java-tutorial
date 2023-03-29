package com.devkuma.junit5.extention;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(MyCloseableResourceExtension.class)
public class MyCloseableResourceExtensionTest {
    @Test
    void test1() throws Exception {
        System.out.println("test1()");
    }

    @Test
    void test2() throws Exception {
        System.out.println("test2()");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("afterAll()");
    }
}
