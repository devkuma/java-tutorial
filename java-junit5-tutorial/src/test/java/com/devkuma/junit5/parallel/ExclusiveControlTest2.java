package com.devkuma.junit5.parallel;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.api.parallel.ResourceAccessMode;
import org.junit.jupiter.api.parallel.ResourceLock;

@Execution(ExecutionMode.CONCURRENT)
public class ExclusiveControlTest2 {

    @Test
    @ResourceLock(value = "lock", mode = ResourceAccessMode.READ_WRITE)
    void test1() throws Exception {
        process("test1(READ_WRITE)");
    }

    @Test
    @ResourceLock(value = "lock", mode = ResourceAccessMode.READ)
    void test2() throws Exception {
        process("test2(READ)");
    }

    @Test
    @ResourceLock(value = "lock", mode = ResourceAccessMode.READ)
    void test3() throws Exception {
        process("test3(READ)");
    }

    private void process(String name) throws Exception {
        System.out.println("begin " + name);
        Thread.sleep(500);
        System.out.println("end " + name);
    }
}
