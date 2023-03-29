package com.devkuma.junit5.extention;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(MyTestInstancePostProcessor.class)
class MyTestInstancePostProcessorTest {

    @Test
    void test1() {
        System.out.println("test1() [" + this.hashCode() + "]");
    }

    @Test
    void test2() {
        System.out.println("test2() [" + this.hashCode() + "]");
    }
}