package com.devkuma.junit5.parallel;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.api.parallel.ResourceLock;

@Execution(ExecutionMode.CONCURRENT)
public class ExclusiveControlTest {
    static int n = 0;

    @Test
    @ResourceLock("lock")
    void test1() throws Exception {
        process("test1");
    }

    @Test
    @ResourceLock("lock")
    void test2() throws Exception {
        process("test2");
    }

    @Test
    @ResourceLock("lock")
    void test3() throws Exception {
        process("test3");
    }

    private void process(String name) {
        System.out.println("begin " + name);
        for (int i = 0; i < 10000; i++) {
            n++;
        }
        System.out.println("end " + name);
    }

    @AfterAll
    static void afterAll() {
        System.out.println("n = " + n);
    }
}