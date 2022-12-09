package com.devkuma.junit5.condition;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;

public class SystemConditionTest {

    @Test
    @EnabledIfSystemProperty(named = "java.vendor", matches = "AdoptOpenJDK")
    void test1() {
        System.out.println("enabled if AdoptOpenJDK");
    }

    @Test
    @EnabledIfSystemProperty(named = "java.vendor", matches = "Oracle.*")
    void test2() {
        System.out.println("enabled if Oracle");
    }

    @Test
    @DisabledIfSystemProperty(named = "java.vendor", matches = "AdoptOpenJDK")
    void test3() {
        System.out.println("disabled if AdoptOpenJDK");
    }

    @Test
    @DisabledIfSystemProperty(named = "java.vendor", matches = "Oracle.*")
    void test4() {
        System.out.println("disabled if Oracle");
    }
}
