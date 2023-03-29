package com.devkuma.junit5.extention;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;

public class MyLifecycleMethodExecutionExceptionHandlerTest {
    @Nested
    class InnerClass1 {

        @Test
        @DisplayName("일반적인 라이프사이클 메서드에서 예외가 throw 된 경우")
        void test() {
            System.out.println("InnerClass1");
        }
    }

    @Nested
    @ExtendWith(MyLifecycleTestExecutionExceptionHandler.class)
    class InnerClass2 {

        @Test
        @DisplayName("TestExecutionExceptionHandler 는 라이프사이클 메소드로 슬로우 된 예외에 대해서 어떻게 동작할까?")
        void test() {
            System.out.println("InnerClass2");
        }
    }

    @Nested
    @ExtendWith(MyLifecycleMethodExecutionExceptionHandler.class)
    class InnerClass3 {

        @Test
        @DisplayName("라이프사이클 메소드로 throw 된 예외를 LifecycleMethodExecutionExceptionHandler 로 잡았을 경우")
        void test() {
            System.out.println("InnerClass3");
        }
    }

    @Nested
    @ExtendWith(MyLifecycleMethodExecutionExceptionHandler.class)
    class InnerClass4 {

        @BeforeEach
        void beforeEach(TestInfo testInfo) {
            throw new RuntimeException("beforeEach@" + simpleClassName(testInfo));
        }

        @Test
        @DisplayName("라이프사이클 메소드로 throw 된 예외를 LifecycleMethodExecutionExceptionHandler 로 잡지 않은 경우")
        void test() {
            System.out.println("InnerClass4");
        }
    }

    @AfterEach
    void afterEach(TestInfo testInfo) {
        throw new RuntimeException("afterEach@" + simpleClassName(testInfo));
    }

    static String simpleClassName(TestInfo testInfo) {
        return testInfo.getTestClass().map(Class::getSimpleName).orElse("<empty>");
    }
}