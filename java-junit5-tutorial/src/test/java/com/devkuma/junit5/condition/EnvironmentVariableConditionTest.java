package com.devkuma.junit5.condition;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

public class EnvironmentVariableConditionTest {

    @Test
    @EnabledIfEnvironmentVariable(named = "JAVA_HOME", matches = ".*\\\\AdoptOpenJDK\\\\.*")
    void test1() {
        System.out.println("enabled if AdoptOpenJDK");
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "JAVA_HOME", matches = ".*\\\\OpenJDK\\\\.*")
    void test2() {
        System.out.println("enabled if OpenJDK");
    }

    @Test
    @DisabledIfEnvironmentVariable(named = "JAVA_HOME", matches = ".*\\\\AdoptOpenJDK\\\\.*")
    void test3() {
        System.out.println("disabled if AdoptOpenJDK");
    }

    @Test
    @DisabledIfEnvironmentVariable(named = "JAVA_HOME", matches = ".*\\\\OpenJDK\\\\.*")
    void test4() {
        System.out.println("disabled if OpenJDK");
    }
}
