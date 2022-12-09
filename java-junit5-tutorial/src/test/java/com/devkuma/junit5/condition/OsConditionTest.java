package com.devkuma.junit5.condition;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class OsConditionTest {

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void test1() {
        System.out.println("enabled on windows");
    }

    @Test
    @EnabledOnOs(OS.MAC)
    void test2() {
        System.out.println("enabled on mac");
    }

    @Test
    @DisabledOnOs(OS.WINDOWS)
    void test3() {
        System.out.println("disabled on windows");
    }

    @Test
    @DisabledOnOs(OS.MAC)
    void test4() {
        System.out.println("disabled on mac");
    }
}
