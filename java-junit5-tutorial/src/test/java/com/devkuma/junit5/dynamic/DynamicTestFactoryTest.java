package com.devkuma.junit5.dynamic;

import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.TestFactory;

import java.util.List;

import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class DynamicTestFactoryTest {
    @TestFactory
    List<DynamicNode> testFactory() {
        return List.of(
                dynamicTest("Test1", () -> System.out.println("Dynamic Test1!!")),
                dynamicTest("Test2", () -> System.out.println("Dynamic Test2!!"))
        );
    }
}
