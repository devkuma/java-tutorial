package com.devkuma.junit5.extention;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

public class MyRegisterExtensionTest {
    @RegisterExtension
    static MyRegisterExtension classField = new MyRegisterExtension("classField");
    @RegisterExtension
    MyRegisterExtension instanceField = new MyRegisterExtension("instanceField");

    @BeforeAll
    static void beforeAll() {
        System.out.println("beforeAll()");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("beforeEach()");
    }

    @Test
    void test1() {
        System.out.println("test1()");
    }
}
