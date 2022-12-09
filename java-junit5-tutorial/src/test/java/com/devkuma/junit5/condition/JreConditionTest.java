package com.devkuma.junit5.condition;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;

public class JreConditionTest {
    @Test
    @EnabledOnJre(JRE.JAVA_11)
    void test1() {
        System.out.println("enabled on java 11");
    }

    @Test
    @EnabledOnJre(JRE.JAVA_17)
    void test2() {
        System.out.println("enabled on java 17");
    }

    @Test
    @DisabledOnJre(JRE.JAVA_11)
    void test3() {
        System.out.println("disabled on java 11");
    }

    @Test
    @DisabledOnJre(JRE.JAVA_17)
    void test4() {
        System.out.println("disabled on java 17");
    }
}
