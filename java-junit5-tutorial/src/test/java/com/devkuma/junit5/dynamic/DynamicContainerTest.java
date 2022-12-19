package com.devkuma.junit5.dynamic;

import static org.junit.jupiter.api.DynamicContainer.dynamicContainer;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.List;

import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.TestFactory;

public class DynamicContainerTest {

    @TestFactory
    List<DynamicNode> testFactory() {
        return List.of(
                dynamicContainer("Dynamic Container 1", List.of(
                        dynamicTest("Test 1-1", () -> System.out.println("Dynamic Test 1-1.")),
                        dynamicContainer("Dynamic Container 1-1", List.of(
                                dynamicTest("Test 1-1-1", () -> System.out.println("Dynamic Test 1-1-1.")),
                                dynamicTest("Test 1-1-2", () -> System.out.println("Dynamic Test 1-1-2."))
                        ))
                )),
                dynamicContainer("Dynamic Container 2", List.of(
                        dynamicTest("Test 2-1", () -> System.out.println("Dynamic Test 2-1.")),
                        dynamicTest("Test 2-2", () -> System.out.println("Dynamic Test 2-2."))
                ))
        );
    }
}
