package com.devkuma.junit5.extention;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.concurrent.TimeUnit;

@ExtendWith(MyStopwatch.class)
class MyStopwatchTest {
    @Test
    void test1() throws Exception {
        TimeUnit.MILLISECONDS.sleep(200);
    }

    @Test
    void test2() throws Exception {
        TimeUnit.MILLISECONDS.sleep(400);
    }

    @Test
    void test3() throws Exception {
        TimeUnit.MILLISECONDS.sleep(600);
    }
}
