package com.devkuma.junit5.extention;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.List;

@ExtendWith(MyTestInstanceFactory.class)
class MyTestInstanceFactoryTest {

    @Test
    void test() {
        System.out.println("MyTestInstanceFactoryTest.test() [" + this.hashCode() + "]");
    }

    @Nested
    class NestedClass {

        @Test
        void test() {
            System.out.println("MyTestInstanceFactoryTest.NestedClass.test() [" + this.hashCode() + "]");
        }
    }

    @TestFactory
    List<DynamicNode> testFactory() {
        return List.of(
                DynamicTest.dynamicTest("DynamicTest1", () -> System.out.println("MyTestInstanceFactoryTest.dynamicTest1() [" + this.hashCode() + "]")),
                DynamicTest.dynamicTest("DynamicTest2", () -> System.out.println("MyTestInstanceFactoryTest.dynamicTest2() [" + this.hashCode() + "]"))
        );
    }
}