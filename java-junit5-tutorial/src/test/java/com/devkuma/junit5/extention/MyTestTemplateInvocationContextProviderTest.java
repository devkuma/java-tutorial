package com.devkuma.junit5.extention;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(MyTestTemplateInvocationContextProvider.class)
class MyTestTemplateInvocationContextProviderTest {

    @TestTemplate
    void test1() {
        System.out.println("test1()");
    }

    @TestTemplate
    void test2() {
        System.out.println("test2()");
    }

    @Test
    void test3() {
        System.out.println("test3()");
    }
}