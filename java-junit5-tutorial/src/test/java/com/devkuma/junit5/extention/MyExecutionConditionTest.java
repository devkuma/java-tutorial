package com.devkuma.junit5.extention;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.List;

@ExtendWith(MyExecutionCondition.class)
class MyExecutionConditionTest {

    @BeforeEach
    void beforeEach() {
        System.out.println("beforeEach()");
    }

    @Test
    void dog() {
        System.out.println("  dog()");
    }

    @Test
    void cat() {
        System.out.println("  cat()");
    }

    @Nested
    class NestedClass {

        @Test
        void cow() {
            System.out.println("  cow()");
        }
    }

    @TestFactory
    List<DynamicNode> testFactory() {
        return List.of(
                DynamicTest.dynamicTest("DynamicTest1", () -> System.out.println("  dynamicTest1")),
                DynamicTest.dynamicTest("DynamicTest2", () -> System.out.println("  dynamicTest2"))
        );
    }
}