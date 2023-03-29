package com.devkuma.junit5.meta.annotaion;

import org.junit.jupiter.api.Test;

@MyParameterResolverExtension
class MyParameterResolverTest {

    @Test
    void test1(String testMethodName) {
        System.out.println("[test1] testMethodName=" + testMethodName);
    }

    @Test
    void test2(String testMethodName) {
        System.out.println("[test2] testMethodName=" + testMethodName);
    }
}