package com.devkuma.junit5.extention;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.List;

@ExtendWith(MyParameterResolver.class)
class MyParameterResolverTest {

    @BeforeEach
    void beforeEach(int i) {
        System.out.printf("beforeEach(i=%d)%n", i);
    }

    @TestFactory
    List<DynamicNode> dynamicTest(String string) {
        return List.of(DynamicTest.dynamicTest("DynamicTest", () -> System.out.printf("dynamicTest(string=%s)%n", string)));
    }

    @Test
    void test1(String string, double d, int i) {
        System.out.printf("test1(string=%s, d=%f, i=%d)%n", string, d, i);
    }

    @Nested
    class NestedClass {

        @Test
        void test2(double d) {
            System.out.printf("test2(d=%f)%n", d);
        }
    }

    @AfterEach
    void afterEach() {
        System.out.println("-----------------------------------------");
    }
}