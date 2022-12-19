package com.devkuma.junit5.dynamic;

import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

public class DynamicLifeCycleTest {

    @BeforeEach
    void beforeEach() {
        System.out.println("beforeEach()");
    }

    @TestFactory
    List<DynamicNode> testFactory() {
        System.out.println("  testFactory()");
        return List.of(
                dynamicTest("Test1", () -> System.out.println("    Dynamic Test1!!")),
                dynamicTest("Test2", () -> System.out.println("    Dynamic Test2!!"))
        );
    }

    @Test
    void test() {
        System.out.println("  test()");
    }

    @AfterEach
    void afterEach() {
        System.out.println("afterEach()");
    }
}
